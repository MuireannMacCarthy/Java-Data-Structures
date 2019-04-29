package queueDeque;


public class Nodes<E> {
	
	// initialize variables for the elements and the link in the linked list
			E elem;
			Nodes<E> next;
			Nodes<E> previous;
			
			// default constructor with no arguments
			public Nodes() {
				elem = null;
				next = null;
				previous = null;
			}
			
			// constructor with arguments
			public Nodes(E elem, Nodes<E> next, Nodes<E> previous) {
			this.elem = elem;
			this.next = next;
			this.previous = previous;
			
			}
			
			// method that sets the item node equal to users input
			public void setElem(E input) {
				elem = input;
			}
			
			// method that sets next item in list equal to users input
			public void setNext(Nodes<E> newNext) {
				next = newNext;
			}
			
			// method that sets the previous item in list to users input
			public void setPrevious(Nodes<E> newPrevious) {
				previous = newPrevious;
			}
			
			// method that gets the previous item in the list
			public Nodes<E> getPrevious() {
				return previous;
			}
			
			// method that gets the next item in the list
			public Nodes<E> getNext() {
				return next;
			}
			
			
			// method that returns the value of an item in the list
			public E getElement() {
				return elem;
			}
			
			// method to return representation of instance of object
			public String toString() {
			return elem.toString();
			}

}
