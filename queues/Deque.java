package queues;


/**
 * 
 * @author saipavansuresh
 *
 * Interface for double Ended queue where elements could be inserted and 
 * removed at both ends.
 */
public interface Deque<E> {

	int size();
	
	boolean isEmpty();
	
	void enqueue(E e);
	
	E first();
	
	E last();
	
	void addFirst(E e);
	
	void addLast(E e);
	
	E removeFirst();
	
	E removeLast();
}
