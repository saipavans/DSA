package stacks.arraystack;

public class TestSimulation {

	private static ArrayStack<Integer> numbers = new ArrayStack<Integer>(5);
	
	public static void main(String[] args) {
		
		System.out.println("Initially, stack empty ?: " + numbers.isEmpty());
		
		numbers.push(87);
		numbers.push(85);
		numbers.push(97);
		numbers.push(65);
		numbers.push(67);
		
		
		System.out.println("Popping elements one by one ...");
		while (!numbers.isEmpty()) {
			System.out.println (numbers.pop());
		}
		
		

	}

}
