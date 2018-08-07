package lists;

public class DoublyLinkedList<E> {
	
	private DoublyNode<E> head = null;
	private DoublyNode<E> tail = null;
	private int size = 0;
	
	public DoublyLinkedList() {
		// Creating two dummy nodes for head and tail
		head = new DoublyNode<E>(null, tail, null);
		tail = new DoublyNode<E>(null, null, head);
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
	
	// Adds a new element at the index given.
	public void addFirst(int index, E element) {
		
	}
	
	// Removes element at the index specified.
	public void remove(int index) {
		
	}
	
	

	
}
