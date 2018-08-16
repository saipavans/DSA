package recursion;

import java.util.Arrays;

import stacks.ArrayStack;

public class ReverseArray {
	
	private static <E> void reverseArray(E[] anyArray, int fromIndex, int tillIndex) {
		if (fromIndex < tillIndex) {
			
			E temp = anyArray[tillIndex];
			anyArray[tillIndex] = anyArray[fromIndex];
			anyArray[fromIndex] = temp;
			
			reverseArray(anyArray, fromIndex+1, tillIndex-1);
		}
		
	}
	
	private static <E> void reverseArrayUsingStack(E[] anyArray, int fromIndex, int tillIndex) {
		// TODO: Sanitize index inputs
		
		int length = tillIndex - fromIndex + 1;
		
		ArrayStack<E> tempArrayStack = new ArrayStack<E>(length);
		
		for (int i = 0; i < length; i++) {
			tempArrayStack.push(anyArray[i]);
		}
		
		for (int i = 0; i < length; i++) {
			anyArray[i] = tempArrayStack.pop();
		}
	}

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		String[] strArray = {"1", "2", "3", "4", "5"};

		reverseArray(intArray, 0, intArray.length-1);
		reverseArray(strArray, 0, 2);

		reverseArrayUsingStack(intArray, 0, intArray.length-1);
		reverseArrayUsingStack(strArray, 0, 2);
		
		// Reversing twice should NOT change int and str arrays
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(strArray));

	}

}
