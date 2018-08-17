package lists;

/**
 * 
 * @author saipavansuresh
 * Simplified version of java.util.List interface.
 * @param <E>
 */
public interface List<E> {

	/** Returns the number of elements in this list */
	int size();
	
	/** Returns true when the list is empty, false otherwise. */
	boolean isEmpty();
	
	/** Returns the element at index i without removing it. */
	E get(int i) throws IndexOutOfBoundsException;
	
	/** Updates the element at index i with e and returns the updated element. */
	E set(int i, E e) throws IndexOutOfBoundsException;
	
	/** Inserts a new element at index i and moving all subsequent elements to right ( add one index) */
	void add(int i, E e) throws IndexOutOfBoundsException;
	
	/** Removes and returns the element at index i, moving all subsequent elements to left (decrease one index) */
	void remove(int i) throws IndexOutOfBoundsException;
	
}
