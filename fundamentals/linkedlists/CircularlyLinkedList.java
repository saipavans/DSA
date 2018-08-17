package fundamentals.linkedlists;

import fundamentals.nodes.SinglyNode;

public class CircularlyLinkedList<E> {
	
	private SinglyNode<E> tail = null; // NOTE: Head in this case is implicitly next of tail node
	private int size = 0;
	
	// Returns the number of elements in the list
	public int size() {
		return size;
	}
	
	// Returns true if the list is empty
	public boolean isEmpty(){
		return size == 0;
	}
	
	// Returns the first element without removing it.
	public E first(){
		return size == 0 ? null : tail.getNext().getElement();
	}
	
	// Returns the last element without removing it.
	public E last(){
		return size == 0 ? null : tail.getElement();
	}
	
	
	// Adds a new element at the start of the list
	public void addFirst(E element){
		SinglyNode<E> newElement = new SinglyNode<E>(element, null);
		if (size == 0){ // List was empty before adding
			tail = newElement;
			tail.setNext(tail);
		} else{
			newElement.setNext(tail.getNext());
			tail.setNext(newElement);
		}
		size += 1;
	}
	
	// Adds a new element at the end of the list
	public void addLast(E element){
		addFirst(element);
		if (size > 1){ // List was non empty before adding
			tail = tail.getNext();
		}
	}
	
	// Removes a new element at the start of the list and returns it.
	public E removeFirst(){
		if (size == 0){
			return null;
		}
		E elementRemoved = first();
		tail.setNext(tail.getNext().getNext());
		size -= 1;
		return elementRemoved;
	}
	
	// Rotate the first node to the back of the list
	public void rotate(){
		if (size > 0){ // Note: When size is 1, nothing happens
			tail = tail.getNext();
		}
	}
}
