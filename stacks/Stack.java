package stacks;

public interface Stack<E> {

	/**
	 * *Returns the number of elements in the stack
	 * @return size of the stack
	 */
	int size();
	
	/**
	 * Check if the stack is empty
	 * @return true if the stack is empty, false otherwise
	 */
	boolean isEmpty();
	
	/**
	 * Inserts an element to the top of the stack
	 * @param e The element to be inserted
	 */
	void push(E e);
	
	/**
	 * Returns the top most element of the stack without removing it
	 * @return Top most element of the stack (or null if empty)
	 */
	E top();
	
	
	/**
	 * Removes and returns the top most element of the stack
	 * @return The top most element removed (or null if empty)
	 */
	E pop();
	
	
	
}
