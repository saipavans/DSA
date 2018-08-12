package recursion.binarysearch;

public class ArrayLookUp {
	
	private static boolean binarySearch(int[] data, int target, int low, int high){
		
		if (low < 0 || high >= data.length || low > high) {
			throw new IllegalArgumentException(low + " " + high);
		} 
		
		if (data[low] > target || data[high] < target || (high == low && target != data[high])) {
			/* Conditions explained: (In either of these 3, there is no possibility of target being inside data within range.
			 1) target is lower than the least number in the sorted array in given range
			 2) target is higher than the highest number in the sorted array in the given range
			 3) Range narrows to one index and target is not present in that particular index 
			 */
			return false;
		}
		
		int mid = (low + high)/2;
		
		if (target == data[mid]) { // Base case to exit recursion
			return true;
		} else if (target > data[mid]) {
			return binarySearch(data, target, mid + 1, high);
		} else if (target < data[mid] ) {
			return binarySearch(data, target, low, mid -1);
		}
		
		return false;
		
		
	}

	public static void main(String[] args) {
		
		int[] sortedArray = {4,6,8,9,11,13,56,78,98,770,1000};

		System.out.println("Looking up '8' in the entire array: " + binarySearch(sortedArray, 8 , 0, sortedArray.length-1));
		System.out.println("Looking up '8' in the array after index 4: " + binarySearch(sortedArray, 8 , 4, sortedArray.length-1));
		System.out.println("Looking up '18' in the array after index 4: " + binarySearch(sortedArray, 18 , 4, sortedArray.length-1));
		System.out.println("Looking up '118' in the entire array: " + binarySearch(sortedArray, 118 , 0, sortedArray.length-1));

	}

}
