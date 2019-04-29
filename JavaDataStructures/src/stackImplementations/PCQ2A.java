package stackImplementations;

public class PCQ2A {
	
	public static void main(String[] args) {
		ArrayStack<String> a = new ArrayStack<String>();
		System.out.println(a);
		a.push("e");
		System.out.println(a);
		a.push("s");
		System.out.println(a);
		a.push("c");
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.push("u");
		System.out.println(a);
		a.push("a");
		System.out.println(a);
		a.pop();
		System.out.print(a);
		a.push("o");
		System.out.println(a);
		a.push("t");
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.push("h");
		System.out.println(a);
	}

}
