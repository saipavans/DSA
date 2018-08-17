package queues;

public class TestSimulation {
	
	private static CircularQueue<Integer> numbers = new LinkedCircularQueue<Integer>();

	public static void main(String[] args) {
		
		System.out.println("Initially, queue empty ?: " + numbers.isEmpty());
		
		numbers.enqueue(87);
		numbers.enqueue(85);
		numbers.enqueue(97);
		numbers.rotate(); // We rotate the Circular queue now instead of dequeueing 87 from front and enqueueing 87 at the back.
		numbers.enqueue(65);
		numbers.enqueue(67);
		
		
		System.out.println("Dequeueing elements one by one ...");
		while (!numbers.isEmpty()) {
			System.out.println (numbers.dequeue());
		}
		
	}

}
