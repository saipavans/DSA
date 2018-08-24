package lists;

import java.util.Iterator;

public class TestSimulation {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>(2);
		
		for (int i = 0; i < 4; i++) {
			numberList.add(i,i);
		}
		
		displayArrayList(numberList);
		
		System.out.println("Making changes ... "); 
		numberList.add(0, 1);
		numberList.set(1, 1);
		numberList.remove(3);
		displayArrayList(numberList);

	}
	
	private static void displayArrayList(ArrayList<Integer> arrayList) {
		Iterator<Integer> it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
