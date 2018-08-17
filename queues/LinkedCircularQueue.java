package queues;

import lists.CircularlyLinkedList;

public class LinkedCircularQueue<E> implements CircularQueue<E> {
	
	private CircularlyLinkedList<E> queue = new CircularlyLinkedList<E>();


	@Override
	public void rotate() {
		queue.rotate();
	}

	@Override
	public int size() {
		return queue.size();
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public void enqueue(E e) {
		queue.addLast(e);
	}

	@Override
	public E first() {
		return queue.first();
	}

	@Override
	public E dequeue() {
		return queue.removeFirst();
	}

}
