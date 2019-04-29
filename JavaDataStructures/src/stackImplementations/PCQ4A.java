package stackImplementations;

public class PCQ4A {
	
	public static void main(String[] args) {
		Student s1 = new Student(01020304, "Rem Collier");
		Student s2 = new Student(01020305, "David Leonard");
		Student s3 = new Student(01020306, "Joe Carthy");
		Student s4 = new Student(01020307, "John Dunnion");
		Student s5 = new Student(0102030, "Michela Bertolotto");
		Student s6 = new Student(0102030, "Fintan Costello");
		Student s7 = new Student(01020310, "Henry McLoughlin");
		Student s8 = new Student(01020311, "Damian Dalton");
		
		ArrayStack<Student> a = new ArrayStack<Student>();
		System.out.println(a);
		a.push(s1);
		System.out.println(a);
		a.push(s2);
		System.out.println(a);
		a.push(s3);
		System.out.println(a);
		a.push(s4);
		System.out.println(a);
		a.push(s5);
		System.out.println(a);
		a.push(s6);
		System.out.println(a);
		a.push(s7);
		System.out.println(a);
		a.push(s8);
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.pop();
		System.out.println(a);
		a.pop();
		System.out.println(a);
	}

}
