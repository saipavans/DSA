package queues;

public class ArrayQueue<E> implements Queue<E> {
	
	private static final int DEFAULT_CAPACITY = 1000;
	
	private E[] data = null;
	private int size = 0;
	private int front = 0; // Dequeue at front and Enqueue at the rear
	
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public ArrayQueue() {
		this(DEFAULT_CAPACITY);
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(E element) {
		
		if (size == data.length) {
			throw new IllegalStateException("Queue is full");
		}
		
		int rear = (front + size) % data.length; // Modulo the capacity to make the array circular
		data[rear] = element;
		size++;
	}
	
	public E first() {
		if (isEmpty()) {
			return null;
		}
		return data[front];
	}
	
	public E dequeue() {
		if (isEmpty()) {
			return null;
		}
		
		E removedElement = data[front];
		data[front] = null; // Making it eligible for GC
		front = (front + 1) % data.length;
		size--;
		return removedElement;
	}
	
	
}
