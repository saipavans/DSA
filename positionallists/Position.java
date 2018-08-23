package positionallists;

public interface Position<E> {

	/**
	 * Returns the element stored in this position
	 * @return The element stored here in this position
	 * @throws IllegalStateException if the position is no longer valid
	 */
	E getElement() throws IllegalStateException;
}
