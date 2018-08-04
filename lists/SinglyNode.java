package lists;

public class SinglyNode<E> {
	
	private E element;
	private SinglyNode<E> next;
	
	public SinglyNode(E element, SinglyNode<E> next){
		this.element = element;
		this.next = next;
	}
	
	public E getElement() {
		return element;
	}
	
	// NOTE: We do not require setter for element as we set it in the constructor

	public SinglyNode<E> getNext() {
		return next;
	}
	
	public void setNext(SinglyNode<E> next) {
		this.next = next;
	}	
	
}
