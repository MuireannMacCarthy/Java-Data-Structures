package stackImplementations;

public class PCQ2L {

	public static void main(String[] args) {
		LinkedStack l = new LinkedStack();
		System.out.println(l);
		l.push("e");
		System.out.println(l);
		l.push("s");
		System.out.println(l);
		l.push("c");
		System.out.println(l);
		l.pop();
		System.out.println(l);
		l.push("u");
		System.out.println(l);
		l.push("a");
		System.out.println(l);
		l.pop();
		System.out.print(l);
		l.push("o");
		System.out.println(l);
		l.push("t");
		System.out.println(l);
		l.pop();
		System.out.println(l);
		l.push("h");
		System.out.println(l);
	}
}
