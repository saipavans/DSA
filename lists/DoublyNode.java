package lists;

public class DoublyNode<E> {
	
	private E element;
	private DoublyNode<E> next = null;
	private DoublyNode<E> prev = null;
	
	public DoublyNode(E element, DoublyNode<E> next, DoublyNode<E> prev){
		this.element = element;
		this.next = next;
		this.prev = prev;
	}
	
	public E getElement() {
		return element;
	}
	
	public void setElement(E element) {
		this.element = element;
	}
	
	public DoublyNode<E> getNext() {
		return next;
	}
	
	public DoublyNode<E> getPrev() {
		return prev;
	}
	
	public void setNext(DoublyNode<E> next) {
		this.next = next;
	}	
	
	public void setPrev(DoublyNode<E> prev) {
		this.prev = prev;
	}	

}
