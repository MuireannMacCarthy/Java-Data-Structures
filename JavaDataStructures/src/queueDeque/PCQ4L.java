package queueDeque;

public class PCQ4L {
	public static void main(String[] args) throws EmptyDequeException {
		LinkDeque<String> d = new LinkDeque<String>();
		System.out.println(d);
		d.addFirst("Ireland");
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
		d.addLast("England");
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
		d.addLast("Wales");
		System.out.println(d);
		d.addFirst("Scotland");
		System.out.println(d);
		d.addLast("France");
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
		d.addLast("Germany");
		System.out.println(d);
		
	}

}
