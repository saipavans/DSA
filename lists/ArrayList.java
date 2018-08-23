package lists;

// TODO: Shrink an array after certain remove operations.

public class ArrayList<E> implements List<E> {
	
	private static int DEFAULT_CAPACITY = 16;
	private E[] data = null;
	private int size = 0;
	
	
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E get(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Not a valid index: " + i);
		}
		//System.out.println(i + ";d" + data[i]);
		return data[i];
	}

	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Not a valid index: " + i);
		}
		
		E updatedElement = data[i];
		data[i] = e;
		
		return updatedElement;
	}

	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i > size) {
			throw new IndexOutOfBoundsException("Not a valid index: " + i);
		}
		
		if(size == data.length) {
			resize(2 * data.length); // Automatically resize when full.
		}
		
		if ((size-i) == 0) { 
			data[i] = e;
			size++;
			return; // Inserting at the end, so no need to slide other elements to the right
		}
		
		E temp = data[i];
		data[i] = e;
		
		for (int j = i+1; j< size; j++) {
			E buffer = data[j];
			data[j] = temp;
			temp = buffer;
		}
		
		data[size++] = temp;
		
	}

	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Not a valid index: " + i);
		}
		
		E removedElement = data[i];
		
		for (int j = i; j < size-1; j++) { // j = size -1 => removing last element. Hence no need to shift left.
			data[j] = data[j+1];
		}
		
		data[size-1] = null; // Make it eligible for GC
		size--;
		return removedElement;
	}
	
	private void resize(int newCapacity) {
		@SuppressWarnings("unchecked")
		E[] newDataArray = (E[]) new Object[newCapacity];
		
		for (int i = 0; i < data.length; i++) {
			newDataArray[i] = data[i]; // Copying array contents
		}
		
		data = newDataArray; // making the old array eligible for GC
	}

}
