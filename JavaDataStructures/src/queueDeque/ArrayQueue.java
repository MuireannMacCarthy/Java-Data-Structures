package queueDeque;



public class ArrayQueue<E> implements Queue<E> {
	// intializing variables for array, array size, front and back of array and a size variable to keep track
	// of amount of items in array
	int N;
	E[] Array;
	private int front;
	private int rear;
	int size = 0;
	
	// creating default constructor with no args
		public ArrayQueue() {
			N = 10;
			front = -1;
			rear = -1;
			Array = (E[]) new Object[N];
		}
		
		// default constructor that takes in size of array as parameter
		public ArrayQueue(int newN) {
			N = newN;
			front = -1;
			rear = -1;
			Array = (E[]) new Object[N];
		}
		
		// returns true if the array is empty, i.e. if rear is -1 and front is -1
		public boolean isEmpty() {
			return (rear == -1 && front == -1);
			
		}			
		
		// returns the front element in the Array
		public E front() throws EmptyQueueException{
			if(front == -1) {
				throw new EmptyQueueException("Queue is empty");
			}
			else {
				E frontElement = Array[front];
				return frontElement;
			}
			
		}
	

		// returns the variable size that keeps track of amount of items in array
		public int size() {
			return size;
		}

		
		// enqueues item at the back of the array
		@Override
		public void enqueue(E element) {
			// if the queue is empty increment the rear and front
			if(isEmpty()) {
				rear++;
				front++;
			}
			// add the argument element into the rear position of the array
			// incrememt the position rear and size
	            Array[rear] = (E) element;
	            size ++;
	            rear ++;
			
		}
		
		

		// removes item from the front of the array
		@Override
		public E dequeue() throws EmptyQueueException {
			if(isEmpty()) {
				throw new EmptyQueueException("Empty Queue");
			}
			else{
				// create variable dequeued equal to front element of array
				E dequeued = Array[front];
				// make front element of array equal to null
				Array[front] = null;
				// increment front, decrement size and return dequeued
				front ++;
				size --;
				return dequeued;
			}
			
		}
		
		// toString method to return representation of object instance
		public String toString() {
			String output = "";
			int size = size();
			int i = 0;
			output += " " + size + "\t";
			while(i <= rear) {
				E element = Array[i];
				output += element + " ";
				i++;
			}
			return output;
		}


}
