package stackImplementations;

public class PCQ1A {
	
	public static void main(String[] args) {
		ArrayStack<Integer> a = new ArrayStack<Integer>();
		System.out.println(a);
		a.push(15);
		System.out.println(a);
		a.push(20);
		System.out.println(a);
		a.push(5);
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.push(17);
		System.out.println(a);
		a.push(12);
		System.out.println(a);
		a.pop();
		System.out.print(a);
		a.push(7);
		System.out.println(a);
		a.push(13);
		System.out.println(a);
		a.push(2);
		System.out.println(a);
	}

}
