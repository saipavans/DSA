package stacks.arraystack;

import stacks.Stack;

public class TestSimulation {

	private static Stack<Integer> numbers = new LinkedStack<Integer>();
	
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
