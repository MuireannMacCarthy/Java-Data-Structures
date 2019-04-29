package stackImplementations;

import java.util.EmptyStackException;

public class ArrayStack<E> {
	
	
	// initializing size, top, n and empty array of generic type
	int N;
	E[] Array;
	private int top;
	int size = 0;
	
	
	
	// creating default constructor with no args
	public ArrayStack() {
		N = 10;
		top = -1;
		Array = (E[]) new Object[N];
	}
	
	// default constructor that takes in size of array as parameter
	public ArrayStack(int newN) {
		N = newN;
		top = -1;
		Array = (E[]) new Object[N];
	}
	
	// method that checks whether stack is empty
	public boolean isEmpty() {
		// if the array length is 0 return false
		if(Array.length == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	// method that removes last pushed element from stack
	public Object pop() throws EmptyStackException{

		if(isEmpty()) {
			// get element that points to top of stack, decrease top of stack size and size
			// return element that is popped
			Object popped = Array[top];
			top = top - 1;
			size --;
			return popped;
		}
		else {
			System.out.println("cannot pop empty stack");
			return " ";
		}
		
	}
	
	// method that pushes element of type e onto stack
	public void push(E element) {
		if(top == N-1) {
			// checking to make sure array is not full
			System.out.println("array is full ");
		}
		else {
			// increment top
			// insert element into array at position top
			// increment size variable
			top += 1;
            Array[top] = element;
            size ++;
		}
	}
	
	
	// method that returns top element of stack
	public E top() throws EmptyStackException{
		// make variable equal to top element of stack and return
		E topElement = Array[top];
		return topElement;
	}
	
	// method that returns the current size of stack
	public int size() {
		return size;
	}
	
	
	// toString method to return representation of object instance
	public String toString() {
		String output = "";
		int size = size();
		int i = 0;
		output += "Array size " + size + "\t";
		while(i <= top) {
			E element = Array[i];
			output += element + " ";
			i++;
		}
		return output;
	}
	
}
