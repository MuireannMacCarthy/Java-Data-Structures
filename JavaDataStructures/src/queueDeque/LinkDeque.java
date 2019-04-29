package queueDeque;

public class LinkDeque<E> implements Deque<E> {
	
	// initializing variables for size and nodes for the front and back of the list
	int size;
	Nodes<E> front;
	Nodes<E> rear;
	
	// method that returns the size of the list
	@Override
	public int size() {
		return size;
	}

	// method that returns true if the list is empty
	@Override
	public boolean isEmpty() {
		return(size == 0);
	}

	// method that returns first element from the queue
	@Override
	public E getFirst() throws EmptyDequeException {
		if(!isEmpty()) {
			return front.getElement();
		}
		else {
			throw new EmptyDequeException("Queue is empty");
		}
	}

	// method that returns the last element from the queue
	@Override
	public E getLast() throws EmptyDequeException {
		if(!isEmpty()) {
			return rear.getElement();
		}
		else {
			throw new EmptyDequeException("Queue is empty");
		}
	}

	// method that adds element to the beginning of the queue
	@Override
	public void addFirst(E element) {
		// declare new node called node
		Nodes<E> node = new Nodes<E>();
		// set the value of element node to the argument element
		// set the next item in list after node as the front
		node.setElem(element);
		node.setNext(front);
		// if the front is empty then assign the value of node to the rear
		if(front == null) {
			rear = node;
		}
		else {
			front.setPrevious(node);
		}
		// the front is assigned the value of the node and the size is incremented
		front = node;
		size++;
		
	}


	// method that adds element to the end of the queue
	@Override
	public void addLast(E element) {
		// declare new node called node
		Nodes<E> node = new Nodes<E>();
		// set the value of node in list to the argument element
		node.setElem(element);
		// set the previous to node as the rear
		node.setPrevious(rear);
		// if the rear is empty assign the front the value of node
		if(rear == null) {
			front = node;
		}
		else {
			rear.setNext(node);
		}
		// assign the value of node to the rear and increment the size
		rear = node;
		size++;
	}
	
	
	// method that removes the first element from the queue
	@Override
	public E removeFirst() throws EmptyDequeException {
		if(!isEmpty()) {
			// declare node firstElement as the next element from the front
			Nodes<E> firstElement = front.getNext();
			// if the firstelement is not empty set the previous to null
	        if(firstElement != null) {
	        	firstElement.setPrevious(null);
	        }
	        else {
	        	rear = null;
	        }
	        // make first element the new front and decrement the list
	        front = firstElement;
	        size --;
			return (E) firstElement;
		}
		else {
			throw new EmptyDequeException("Empty queue");
		}
	}
	

	// method that removes the last element from the queue
	@Override
	public E removeLast() throws EmptyDequeException {
		if(!isEmpty()) {
			// declare lastElement as the previous element to the current rear
			Nodes<E> lastElement = rear.getPrevious();
			// if the lastElement is not empty then set the next item as null
	        if(lastElement != null) {
	        	lastElement.setNext(null);
	        }
	        else {
	        	front = null;
	        }
	        // make the new rear the lastElement and decrement size
	        rear = lastElement;
	        size --;
	        return (E) lastElement;
			
		}
		else {
			throw new EmptyDequeException("Empty Queue");
		}
	}	
	
	// toString method that returns representation of an instance of the object
	public String toString() {
		Nodes<E> item = front;
		String output = " ";
		while(item != null) {
			output+= item.getElement() + " ";
			item = item.getNext();
			
		}
		return " " + output;
	}
	


}
