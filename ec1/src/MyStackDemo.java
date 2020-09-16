public class MyStackDemo {

	private static final int NUMBER_OF_LETTERS = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String element;
		// create an ArrayList stack
		MyStack<String> stack = new MyStack<String>();

		// add elements to the ArrayList stack using push method
		System.out.println("Adding 3 characters to the stack...");
		stack.push("A");
		stack.push("B");
		stack.push("C");

	/*	System.out.println(" stack = " + stack);
		System.out.println(" stack size = " + stack.size());

		// empty the ArrayList stack (clear the stack)
		System.out.println("\nEmptying the stack...");
		stack.clear();
		System.out.println(" stack = " + stack);
		System.out.println(" stack size = " + stack.size());

		// add 26 random strings to the ArrayList stack
		System.out.print("\nAdding "+ NUMBER_OF_LETTERS +" random characters to the empty stack... \n ");
		for (int i=0; i<NUMBER_OF_LETTERS; i++) {
			System.out.print(stack.push(Character.toString(RandomCharacter())));
			if (i<NUMBER_OF_LETTERS-1) System.out.print(", ");
		}

		System.out.println("\n stack = " + stack);
		System.out.println(" stack size = " + stack.size());

		// remove stack element without checking stack size
		System.out.println("\nRemoving (pop) stack elements without checking stack size (throws exception)...");
		System.out.println(" stack = " + stack + ", size is " + stack.size());

		// pop stack last element
		System.out.println("  popping \"" + stack.pop() + "\" from the stack");
		System.out.println(" stack = " + stack + ", size is " + stack.size());

		// continue popping from stack until exception encountered
		for (int i=0; i<NUMBER_OF_LETTERS; i++) {
			try {
				element = stack.pop();
				if (element != null) {
					System.out.println("  popping \"" + element + "\" from the stack");
					System.out.println(" stack = " + stack + ", size is " + stack.size());
				}
			} catch (Exception e) {
				System.err.println("Error!");
				System.err.println(e);
			}
		} 

		// empty the ArrayList stack (clear the stack)
		System.out.println("\nEmptying the stack...");
		stack.clear();
		System.out.println(" stack = " + stack);
		System.out.println(" stack size = " + stack.size());
		
		// verify if the stack is empty
		System.out.println("\nVerifying if the stack is empty...");
		System.out.println("Is the stack empty? " + stack.empty());
		
		// attempt to peek into an empty stack (throws exception)
		System.out.println("\nAttempting (peek) into an empty stack (throws exception)...");
		stack.peek();
		
		// add 26 random strings to the ArrayList stack
		System.out.print("\nAdding "+ NUMBER_OF_LETTERS +" random characters to the empty stack... \n ");
		for (int i=0; i<NUMBER_OF_LETTERS; i++) {
			System.out.print(stack.push(Character.toString(RandomCharacter())));
			if (i<NUMBER_OF_LETTERS-1) System.out.print(", ");
		}

		System.out.println("\n stack = " + stack);
		System.out.println(" stack size = " + stack.size());

		// verify if the stack is empty
		System.out.println("\nVerifying if the stack is empty...");
		System.out.println("Is the stack empty? " + stack.empty());
		
		// remove stack element checking stack size
		System.out.println("\nRemoving (pop) stack elements while checking stack size...");
		System.out.println(" stack = " + stack + ", size is " + stack.size());
		
		// pop stack last element
		System.out.println("  popping \"" + stack.pop() + "\" from the stack");
		System.out.println(" stack = " + stack + ", size is " + stack.size());
		
		while (stack.size()>0) {
				System.out.println("  popping \"" + stack.pop() + "\" from the stack");
				System.out.println(" stack = " + stack + ", size is " + stack.size());
		} 
		
		System.out.println("\nDone \"popping\" the stack."
				+ "\n stack = " + stack + ", size is " + stack.size());
		
		System.out.println("\n\nEnd of Program \"MyStackDemo\"");*/
	}

	// method for generating a random char
	private static char RandomCharacter() {

		Math.random();
		double randomNumber;

		randomNumber = (Math.random() * 26 + 'A');

		return (char) randomNumber;
	}
}
