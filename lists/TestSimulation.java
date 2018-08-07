package lists;

public class TestSimulation {
	
	
	
	public static void main(String[] args) {
		
		// Testing Singly Linked List
		
		SinglyLinkedList<Integer> singlyList = new SinglyLinkedList<Integer>();
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
		
		
		
		// Testing Circularly Linked List
		
		CircularlyLinkedList<Integer> circularList = new CircularlyLinkedList<Integer>();
		System.out.println("Size of Circular Linked List: " + circularList.size());
		
		circularList.addFirst(4);
		circularList.addFirst(3);
		circularList.addFirst(2);
		circularList.addFirst(1);
		circularList.addLast(5);
		System.out.println("Size of Circular Linked List: " + circularList.size());
		System.out.println("First Element: " + circularList.first());
		System.out.println("Last Element: " + circularList.last());
		System.out.println("Rotating ..."); 
		circularList.rotate();
		System.out.println("First Element: " + circularList.first());
		System.out.println("Last Element: " + circularList.last());
		System.out.println("Removing First Element: " + circularList.removeFirst());
		System.out.println("Size of Circular Linked List: " + circularList.size());		
		System.out.println("First Element: " + circularList.first());
		System.out.println("Last Element: " + circularList.last());
	
	}

}
