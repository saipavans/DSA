package lists;

public class TestSimulation {
	
	
	
	public static void main(String[] args) {
		
		SinglyLinkedList singlyList = new SinglyLinkedList();
		System.out.println("Size of Singly Linked List: " + singlyList.size());
		
		singlyList.addFirst(1);
		singlyList.addFirst(2);
		singlyList.addLast(3);
		System.out.println("Size of Singly Linked List: " + singlyList.size());

		int removedInt = (int) singlyList.removeFirst();
		System.out.println("The following element was removed: " + removedInt);
		System.out.println("Size of Singly Linked List: " + singlyList.size());
		
		removedInt = (int) singlyList.removeFirst();
		System.out.println("The following element was removed: " + removedInt);
		System.out.println("Size of Singly Linked List: " + singlyList.size());
		
		removedInt = (int) singlyList.removeFirst();
		System.out.println("The following element was removed: " + removedInt);
		System.out.println("Size of Singly Linked List: " + singlyList.size());
	
	}

}
