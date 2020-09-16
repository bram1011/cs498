import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class MyStackTest {


	@Test 
	public void testPush()
	   {
		MyStack<String> stack = new MyStack<String>();
	      stack.push ("hello");
	      stack.push ("world");
	      assertEquals (stack.peek(), "world");
	   }
	
	@Test
	public void testEmpty() {
		MyStack<String> stack = new MyStack<String>();
		assertEquals(stack.empty(), true);
		stack.push("test");
		assertEquals(stack.empty(), false);
	}

	@Test
	public void testClear() {
		MyStack<String> stack = new MyStack<String>();
		stack.push("test");
		stack.clear();
		assertEquals(stack.empty(), true);
	}

	@Test
	public void testPop() {
		MyStack<String> stack = new MyStack<String>();
		stack.push("hello");
		stack.push("world");
		assertEquals(stack.pop(), "world");
	}

	@Test
	public void testPeek() {
		MyStack<String> stack = new MyStack<String>();
		stack.push("hello");
		stack.push("world");
		assertEquals(stack.peek(), "world");
	}

	@Test
	public void testSize() {
		MyStack<String> stack = new MyStack<String>();
		stack.push("test");
		assertEquals(stack.size(), 1);
	}

	@Test
	public void testSort() {
		MyStack<String> stack = new MyStack<String>();
		stack.push("z");
		stack.push("a");
		stack.push("w");
		stack.sortStack();
		MyStack<String> expected = new MyStack<String>();
		expected.push("a");
		expected.push("w");
		expected.push("z");
		
		assertEquals(stack.pop(), expected.pop());
		assertEquals(stack.pop(), expected.pop());
		assertEquals(stack.pop(), expected.pop());
	}
}
