package positionallists;

import java.util.Iterator;
import java.util.NoSuchElementException;

import fundamentals.nodes.DoublyNode;

public class LinkedPositionalList<E> implements PositionalList<E> {
	
	private static class Node<E> extends DoublyNode<E> implements Position<E> {

		public Node(E element, Node<E> next, Node<E> prev) {
			super(element, next, prev); // Required since there is no default constructor in the base class.
		}
		
		@Override
		public E getElement() throws IllegalStateException {
			if (this.getNext() == null)
				throw new IllegalStateException(); // This position is not valid anymore
			return super.getElement();
		}
		
	} // End of the Nested Class

	
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	public LinkedPositionalList() {
		head = new Node<E>(null, null, null);
		tail = new Node<E>(null, null, head);
		head.setNext(tail);
	}
	
	
	private Position<E> position(Node<E> node) {
		if (node == tail || node == head) {
			return null; // To prevent sentinels (dummy nodes) from exposure.
		}
		return node; // Reference to the node is actually the position
	}
	
	private Node<E> node(Position<E> p) throws IllegalArgumentException{
		
		// Also p could be null if it is one of the sentinel nodes which would again throw the exception below
		if (! (p instanceof Node)) { // Because p could also be an instance of another derived class of Position instead of node
			throw new IllegalArgumentException("p is not a valid Node"); 
		} 
		
		Node<E> node = (Node<E>) p; // safe to cast
		
		if (node.getNext() == null) {
			throw new IllegalArgumentException("p is no longer in the list");
		}
		
		return node;
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Position<E> first() {
		return position((Node<E>)head.getNext()); // Casting is needed because head.getNext() gives reference of type DoublyNode
	}

	@Override
	public Position<E> last() {
		return position((Node<E>)tail.getPrev());	}

	@Override
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		Node<E> node = node(p); // to validate
		return position((Node <E>) node.getPrev());
	}

	@Override
	public Position<E> after(Position<E> p) throws IllegalArgumentException {
		Node<E> node = node(p); // to validate
		return position((Node <E>) node.getNext());
	}
	
	private Position<E> addBetween(E e, Node<E> prev, Node<E> next) { // NOTE: the prev and next order here is diff from Node's constructor
		Node<E> newNode = new Node<E>(e, next, prev);
		prev.setNext(newNode);
		next.setPrev(newNode);
		size++;
		return position(newNode);
	}

	@Override
	public Position<E> addFirst(E e) {
		return addBetween(e, head, (Node<E>) head.getNext());
	}

	@Override
	public Position<E> addLast(E e) {
		return addBetween(e, (Node<E>) tail.getPrev(), tail);
	}

	@Override
	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = node(p);
		return addBetween(e, (Node<E>) node.getPrev(), node);
	}

	@Override
	public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = node(p);
		return addBetween(e, node, (Node<E>) node.getNext());	}

	@Override
	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = node(p);
		E replacedElement = node.getElement();
		node.setElement(e);
		return replacedElement;
	}

	@Override
	public E remove(Position<E> p) throws IllegalArgumentException {
		Node<E> node = node(p);
		Node<E> prevNode = (Node<E>) node.getPrev();
		Node<E> nextNode = (Node<E>) node.getNext();
		
		prevNode.setNext(nextNode);
		nextNode.setPrev(prevNode);
		size--;
		
		// Making old node eligible for GC
		E removedElement = node.getElement();
		node.setElement(null);
		node.setNext(null);
		node.setPrev(null);
		
		return removedElement;
	}
	
	
	private class PositionalListIterator implements Iterator<Position<E>> {
		
		private Position<E> cursor = first(); // Position of next element to be iterated over
		private Position<E> recent = null; // Position already iterated

		@Override
		public boolean hasNext() {
			return cursor != null; // As sentinel nodes have position as null
		}

		@Override
		public Position<E> next() throws NoSuchElementException {
			if (cursor == null) {
				throw new NoSuchElementException("End of iteration");
			}
			recent = cursor;
			cursor = after(recent);
			return recent;
		}
		
		public void remove() throws IllegalStateException {
			if (recent == null) {
				throw new IllegalStateException("Nothing to remove");
			}
			LinkedPositionalList.this.remove(recent);
			// WRONG! recent = before(cursor);
			recent = null; // As we don't want to allow remove again until next is called again.
		}
		
	} // End of Nested class
	
	private class PositionalListIterable implements Iterable<Position<E>> {

		@Override
		public Iterator<Position<E>> iterator() {
			return new PositionalListIterator();
		}
		
		public Iterable<Position<E>> positions() {
			return new PositionalListIterable();
		}
		
	}
	
	
	private class ElementIterator implements Iterator<E> {
		Iterator<Position<E>> posIterator = new PositionalListIterator();

		@Override
		public boolean hasNext() {
			return posIterator.hasNext();
		}

		@Override
		public E next() {
			return posIterator.next().getElement();
		}
		
		public void remove() {
			posIterator.remove();
		}
	}
	
	
	public Iterator<E> iterator() {
		return new ElementIterator();
	}

}
