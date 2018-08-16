package stacks;

public class ArrayStack<E> implements Stack<E> {

	private static final int DEFAULT_SIZE = 1000;
	private E[] data = null;
	private int top = -1 ; // Empty stack
	
	public ArrayStack(int size) {
		data = (E[]) new Object[size]; // as generic arrays cannot be created
	}
	
	public ArrayStack() {
		this(DEFAULT_SIZE);
	}
	
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() { 
		return top == -1;
	}
	
	public void push(E e) {
		
		if (size() == data.length) {
			throw new IllegalStateException("Stack is already full");
		}
		
		data[++top] = e;
	}
	
	public E top() {
		
		if (isEmpty()) {
			return null;
		}
		
		return data[top];
	}
	
	public E pop() {
		
		if (isEmpty()) {
			return null;
		}
		
		E poppedElement = data[top];
		data[top] = null; 
		top--;
		
		return poppedElement;
	}
}
