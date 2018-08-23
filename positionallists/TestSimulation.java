package positionallists;

public class TestSimulation {

	public static void main(String[] args) {
		LinkedPositionalList<Integer> numberList = new LinkedPositionalList<Integer>();
		
		Position<Integer> recentlyAddedPosition = numberList.addFirst(0);
		for (int i = 1; i < 4; i++) {
			recentlyAddedPosition = numberList.addAfter(recentlyAddedPosition, i);
		}
		
		displayArrayList(numberList);
		
		numberList.remove(recentlyAddedPosition); // Removing last element
		recentlyAddedPosition = numberList.addLast(5);
		numberList.addBefore(recentlyAddedPosition, 4);
		displayArrayList(numberList);



	}
	
	private static void displayArrayList(LinkedPositionalList<Integer> pList) {
		Position<Integer> p = pList.first();
		while(p != null) {
			System.out.println(p.getElement());
			p = pList.after(p);
		}
	}
}
