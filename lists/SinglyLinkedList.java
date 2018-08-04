package lists;

public class SinglyLinkedList<E> {

	private SinglyNode<E> head = null;
	private SinglyNode<E> tail = null;
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
		return head == null ? null : head.getElement();
	}
	
	// Returns the last element without removing it.
	public E last(){
		return tail == null ? null : tail.getElement();
	}
	
	// Adds a new element at the start of the list
	public void addFirst(E element){
		
	}
	
	// Adds a new element at the end of the list
	public void addLast(E element){
		
	}
	
	// Removes a new element at the start of the list
	public void removeFirst(){
		
	}
	
	
	
	
	
	
	

}
