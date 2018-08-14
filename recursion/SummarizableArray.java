package recursion;

public class SummarizableArray {
	// Note that we cannot extend util.Arrays as it's constructor is private. Therefore a subclass can be created only by inner class.
	
	private static int summarizeArray(int [] data, int n) {
		// Returns the sum of first n elements of the integer array.
		
		if (n < 0 && n > data.length) {
			throw new IllegalArgumentException();
		}
		
		if (data.length == 0 || n == 0 ) {
			return 0;
		} else {
			if (n == 1){
				return data[0];
			} else {
				return data[n- 1] + summarizeArray(data, n-1);
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		int[] testArray = {1,3,5,7,9};
		
		System.out.println("Sum of all the elements: " + summarizeArray(testArray, testArray.length));
		System.out.println("Sum of first three elements: " + summarizeArray(testArray, 3));

	}

}
