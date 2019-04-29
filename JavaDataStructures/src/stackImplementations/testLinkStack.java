package stackImplementations;

public class testLinkStack {
	
    public static void main(String[] args) {
		LinkedStack s = new LinkedStack();
		System.out.println(s);
		s.push("A");
		System.out.println(s);
		s.push("B");
		System.out.println(s);
		s.push("C");
		System.out.println(s);
		s.pop();
		System.out.println(s);

}

}
