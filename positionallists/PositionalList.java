package positionallists;

/**
 * 
 * @author saipavansuresh
 * An interface for positional Lists
 * @param <E>
 */
public interface PositionalList<E> {

	/** Returns the number of elements in the list */
	int size();
	
	/** Returns True if the list is Empty */
	boolean isEmpty();
	
	/** Returns the first position in the list or null if the list is empty */
	Position<E> first();
	
	/** Returns the last position in the list or null if the list is empty */
	Position<E> last();
	
	/** Returns the position immediately before the postion p or null if the p sent as argument is first */
	Position<E> before(Position<E> p) throws IllegalArgumentException;
	
	/** Returns the position immediately after the postion p or null if the p sent as argument is last */
	Position<E> after(Position<E> p) throws IllegalArgumentException;
	
	/** Inserts the element e at the front of the list and returns its position */
	Position<E> addFirst(E e);
	
	/** Inserts the element e at the back of the list and returns its position */
	Position<E> addLast(E e);
	
	/** Inserts the element e before the postion (p) and returns its position */
	Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;
	
	/** Inserts the element e after the postion (p) and returns its position */
	Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
	
	/** Replaces the element stored in the position p with e and returns the replaced element */
	E set(Position<E> p, E e) throws IllegalArgumentException;
	
	/** Removed the element stored in the position p and returns it*/
	E remove(Position<E> p) throws IllegalArgumentException;


	
}
