package stacks;

import lists.SinglyLinkedList;

public class LinkedStack<E> implements Stack<E> {

	private SinglyLinkedList<E> linkedList= new SinglyLinkedList<E>();

	public int size() {
		return linkedList.size();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	public void push(E element) {
		linkedList.addFirst(element); // Adding in the front and removing from the front of the list (LIFO)
	}
	
	public E pop() {
		return linkedList.removeFirst();
	}
	
	public E top() {
		return linkedList.first(); // Top is the first element
	}
	
	
}
