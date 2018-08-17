package lists;

import queues.Deque;

public class DoublyLinkedList<E> implements Deque<E> {
	
	private DoublyNode<E> head = null;
	private DoublyNode<E> tail = null;
	private int size = 0;
	
	public DoublyLinkedList() {
		// Creating two dummy nodes for head and tail
		head = new DoublyNode<E>(null, null, null);
		tail = new DoublyNode<E>(null, head, null);
		head.setNext(tail);

	}
	
	// Returns the number of elements in the list
	public int size() {
		return size;
	}
	
	// Returns true if the list is empty
	public boolean isEmpty() {
		return size == 0;
	}
	
	// Returns the first element without removing it.
	public E first() {
		return head.getNext().getElement();
	}
	
	// Returns the last element without removing it.
	public E last() {
		return tail.getPrev().getElement();
	}
	
	// Adds a new element in between the given nodes.
	private void addBetween(E element, DoublyNode<E> nextNode, DoublyNode<E> prevNode) {
		DoublyNode<E> newNode = new DoublyNode<E>(element, nextNode, prevNode);
		prevNode.setNext(newNode);
		nextNode.setPrev(newNode);
		size++;
	}
	
	// Removes the given node from the list and returns it.
	private E remove(DoublyNode<E> node) {
		
		DoublyNode<E> prevToDelNode = node.getPrev();
		DoublyNode<E> nextToDelNode = node.getNext();
		prevToDelNode.setNext(nextToDelNode);
		nextToDelNode.setPrev(prevToDelNode);
		size--;
		
		return node.getElement();
	}
	
	// Adds a new element to the start of the list
	public void addFirst(E element) {
		addBetween(element, head.getNext(), head);
	}
	
	// Adds a new element to the end of the list
	public void addLast(E element) {
		addBetween(element, tail, tail.getPrev());
	}
	
	// Removes and returns the first element of the list
	public E removeFirst(){
		return size == 0 ? null : remove(head.getNext());
	}
	
	// Removes and returns the last element of the list
	public E removeLast(){
		return size == 0 ? null : remove(tail.getPrev());
	}
	
	
}
