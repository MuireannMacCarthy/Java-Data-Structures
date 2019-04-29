package stackImplementations;

public class PCQ3L {
	
	public static void main(String[] args) {
		LinkedStack l = new LinkedStack();
		System.out.println(l);
		l.push("Ireland");
		System.out.println(l);
		l.pop();
		System.out.print(l);
		l.push("england");
		System.out.println(l);
		l.pop();
		System.out.println(l);
		l.push("Wales");
		System.out.println(l);
		l.pop();
		System.out.println(l);
		l.push("Scotland");
		System.out.println(l);
		l.pop();
		System.out.println(l);
		l.push("France");
		System.out.println(l);
		l.push("Germany");
		System.out.println(l);
	}

}
