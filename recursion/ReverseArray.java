package recursion;

import java.util.Arrays;

public class ReverseArray {
	
	private static <E> void reverseArray(E[] anyArray, int fromIndex, int tillIndex) {
		if (fromIndex < tillIndex) {
			
			E temp = anyArray[tillIndex];
			anyArray[tillIndex] = anyArray[fromIndex];
			anyArray[fromIndex] = temp;
			
			reverseArray(anyArray, fromIndex+1, tillIndex-1);
		}
		
	}

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		String[] strArray = {"1", "2", "3", "4", "5"};

		reverseArray(intArray, 0, intArray.length-1);
		reverseArray(strArray, 0, 2);

		
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(strArray));

	}

}
