package lists;

public class TestSimulation {
	
	
	
	public static void main(String[] args) {
		
		// Testing Singly Linked List
		
		SinglyLinkedList<Integer> singlyList = new SinglyLinkedList<Integer>();
		System.out.println("Size of Singly Linked List: " + singlyList.size());
		
		singlyList.addFirst(2);
		singlyList.addFirst(1);
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
		
		
		
		// Testing equivalence
		
		singlyList.addFirst(2);
		singlyList.addFirst(1);
		singlyList.addLast(3);
		
		SinglyLinkedList<Integer> anotherSinglyList = new SinglyLinkedList<Integer>();
		SinglyLinkedList<String> yetAnotherSinglyList = new SinglyLinkedList<String>();

		anotherSinglyList.addFirst(3);
		anotherSinglyList.addFirst(2);
		anotherSinglyList.addFirst(1);
		
		yetAnotherSinglyList.addFirst("3");
		yetAnotherSinglyList.addFirst("2");
		yetAnotherSinglyList.addFirst("1");
		
		System.out.println("** Equivlance Testing **");
		System.out.println(singlyList.equals(anotherSinglyList));
		System.out.println(singlyList.equals(yetAnotherSinglyList));
		
		
		// Testing Circularly Linked List
		
		CircularlyLinkedList<Integer> circularList = new CircularlyLinkedList<>();
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
		
		
		// Testing 	Doubly Linked List
		
		DoublyLinkedList<String> doublyList = new DoublyLinkedList<String>();
		System.out.println("Size of Doubly Linked List: " + doublyList.size());
		
		doublyList.addFirst("2");
		doublyList.addFirst("1");
		doublyList.addLast("3");
		System.out.println("Size of Doubly Linked List: " + doublyList.size());

		String removedString = (String) doublyList.removeFirst();
		System.out.println("The following element was removed: " + removedString);
		System.out.println("Size of Doubly Linked List: " + doublyList.size());
		//doublyList.display();
		
		removedString = (String) doublyList.removeFirst();
		System.out.println("The following element was removed: " + removedString);
		System.out.println("Size of Doubly Linked List: " + doublyList.size());
		
		removedString = (String) doublyList.removeFirst();
		System.out.println("The following element was removed: " + removedString);
		System.out.println("Size of Doubly Linked List: " + doublyList.size());
		

	
	}

}
