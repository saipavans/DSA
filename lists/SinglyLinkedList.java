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
		SinglyNode<E> newElement = new SinglyNode<E>(element, head);
		head = newElement;
		if (size == 0){
			tail = head;
		}
		size += 1;
	}
	
	// Adds a new element at the end of the list
	public void addLast(E element){
		if (isEmpty()){
			addFirst(element); // When size is 0, add Last means Add first
			return; // To avoid NPE after the if block because tail is not set when size is 0.
		}
		
		SinglyNode<E> newElement = new SinglyNode<E>(element, null);
		tail.setNext(newElement);
		tail = newElement;
		if (size == 0){
			head = tail;
		}
		size += 1;
	}
	
	// Removes a new element at the start of the list and returns it.
	public E removeFirst(){
		if (size == 0){
			return null;
		}
		E elementRemoved = head.getElement();
		head = head.getNext();
		size -= 1;
		return elementRemoved;
	}
	
	public boolean equals(Object o) {
		
		if (o == null) {
			return false; // Because this object is not null
		} 
		
		if (this.getClass() != o.getClass()) {
			return false; // Both the objects belong to diff class 
		}
		
		SinglyLinkedList otherObject = (SinglyLinkedList) o; // This is safe to do at this point
		
		if (size != otherObject.size){ 
			// NOTE: Size of other object can still be used even though it is private because,
			// It is still being used inside the same SinglyLinkedList class to which it was declared as private.
			return false;
		}
		
		SinglyNode thisNode = this.head;
		SinglyNode otherNode = otherObject.head;
		
		while( thisNode != null) {
			if (thisNode.getElement().equals(otherNode.getElement())) {
				thisNode = thisNode.getNext();
				otherNode = otherNode.getNext();
			} else {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	
	
	
	
	

}
