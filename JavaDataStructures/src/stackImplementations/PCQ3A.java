package stackImplementations;

public class PCQ3A {

	public static void main(String[] args) {
		ArrayStack<String> a = new ArrayStack<String>();
		System.out.println(a);
		a.push("Ireland");
		System.out.println(a);
		a.pop();
		System.out.print(a);
		a.push("england");
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.push("Wales");
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.push("Scotland");
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.push("France");
		System.out.println(a);
		a.push("Germany");
		System.out.println(a);
	}
}
