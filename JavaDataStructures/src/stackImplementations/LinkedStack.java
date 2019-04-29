package stackImplementations;

import java.util.EmptyStackException;

public class LinkedStack {

	public class Node {
		
		// initialize variables for the elements and the link in the linked list
		Object elem;
		Node next;
		Node previous;
		
		public Node() {
			elem = null;
			next = null;
			previous = null;
		}
		
		public Node(Object elem, Node next, Node previous) {
		this.elem = elem;
		this.next = next;
		this.previous = previous;
		
		}
		
		public void setElem(Object input) {
			elem = input;
		}
		
		public void setNext(Node newNext) {
			next = newNext;
		}
		
		public void setPrevious(Node newPrevious) {
			previous = newPrevious;
		}
		
		public Node getPrevious() {
			return previous;
		}
		
		public Node getNext() {
			return next;
		}
		
		public Object getElement() {
			return elem;
		}
		
		// method to return representation of instance of object
		public String toString() {
		return elem.toString();
		}
		
		}

	// initializing variables for size of stack and top of node
	int size;
	Node top;
	
	// default constructor that takes no arguments
	public LinkedStack() {
	top = null;
	size = 0;
	}
	
	// constructor that takes arguments
	public void push(Object o) {
		 Node node = new Node(o);
		 node.next = top;
		 top = node;
		 size++;
		}
	
	// method that pops that last entered element from stack
		public Object pop() throws EmptyStackException {
			// create a variable to hold popped element
			Node popped = top;
			top = top.next;
			popped.next = null;
			// decrement size to show stack decreasing
			size --;
			return popped.elem;				
		}
		
		
		// method that returns the top element in stack
		public Object top() throws EmptyStackException {
			return top.elem;
		}
		
		
		// method that returns the size of stack
		public int size() {
			return size;
		}
		
		
		// method that checks whether stack is empty
		public boolean isEmpty() {
			return(top == null);
		}
		
		
		// method that prints representation of the instance of object
		public String toString() {
		 String output = " ";
		 Node node = top;
		 while (node != null) {
		 output = node.elem.toString() + " " + output;
		 node = node.next;
		 }
		 return " " + size + " \t " + output;
		}
}
