package queues;

import lists.SinglyLinkedList;

public class LinkedQueue<E> implements Queue<E> {
	
	private SinglyLinkedList<E> queue = new SinglyLinkedList<E>();

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
