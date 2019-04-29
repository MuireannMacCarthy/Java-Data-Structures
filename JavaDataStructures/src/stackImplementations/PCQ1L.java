package stackImplementations;

public class PCQ1L {
	
	public static void main(String[] args) {
		LinkedStack l = new LinkedStack();
		System.out.println(l);
		l.push(15);
		System.out.println(l);
		l.push(20);
		System.out.println(l);
		l.push(5);
		System.out.println(l);
		l.pop();
		System.out.println(l);
		l.push(17);
		System.out.println(l);
		l.push(12);
		System.out.println(l);
		l.pop();
		System.out.print(l);
		l.push(7);
		System.out.println(l);
		l.push(13);
		System.out.println(l);
		l.push(2);
		System.out.println(l);
	}

}
