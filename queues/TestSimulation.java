package queues;

public class TestSimulation {
	
	private static Queue<Integer> numbers = new LinkedQueue<Integer>();

	public static void main(String[] args) {
		
		System.out.println("Initially, queue empty ?: " + numbers.isEmpty());
		
		numbers.enqueue(87);
		numbers.enqueue(85);
		numbers.enqueue(97);
		numbers.dequeue();
		numbers.enqueue(87);
		numbers.enqueue(65);
		numbers.enqueue(67);
		
		
		System.out.println("Dequeueing elements one by one ...");
		while (!numbers.isEmpty()) {
			System.out.println (numbers.dequeue());
		}
		
	}

}
