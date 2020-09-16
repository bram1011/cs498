import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Collections;
import java.util.Comparator;

public class MyStack<E> {

	// generic ArrayList stack
	private ArrayList<E> list;

	// Constructor
	public MyStack() {
		list = new ArrayList<E>();
	}

	// Test if stack is empty
	public boolean empty() {
		if (list.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	// Empty the stack
	public void clear() {
		list = new ArrayList<E>();
	}

	// Push an element to the stack
	public E push(E elt) {
		list.add(elt);
		return elt;
	}

	// Pop an element off the stack
	public E pop() {
		return list.remove(list.size() - 1);
	}

	// Peek at top of the stack
	public E peek() {
		try {
			if (empty()) {
				throw new EmptyStackException();
			}
			return list.get(list.size() - 1);
		} catch (EmptyStackException e) {
			System.err.println("\nError: \'peek\' attempted on an empty stack - exception caught!");
			e.printStackTrace();
		}
		return null;

	}

	public void sortStack() {
		Comparator<E> compareE = new Comparator<E>(){
			@Override
			public int compare(E e1, E e2) {
				// return e1.compareTo(e2);
				String e1String = e1.toString();
				String e2String = e2.toString();
				return e1String.compareTo(e2String);
			}
		};

		Collections.sort(list, compareE);
	}

	// Return the size of stack
	public int size() {
		return list.size();
	}

	// toString override method
	@Override
	public String toString() {
		return list.toString();
	}

}