package queues;

public interface Queue<E> {
	
	int size();
	
	boolean isEmpty();
	
	/** Inserts an element at the end of the queue*/
	void enqueue(E e);
	
	/** Returns the first element without removing it */
	E first();
	
	/** Removes and returns the first element of the queue */
	E dequeue();

}
