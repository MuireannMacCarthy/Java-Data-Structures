package stackImplementations;

public class Student {
	
	// initializing student number and student name variables
	int studentNumber;
	String studentName;
	
	// default constructor that takes no arguments
	public Student() {
		studentNumber = 0;
		studentName = "None";
	}
	
	// constructor that takes a number and name as arguments
	public Student(int number, String name) {
		studentNumber = number;
		studentName = name;
	}

	// toString method that prints a representation of the an instance of the object
	public String toString() {
		String output = " ";
		output += " #: " + studentNumber + " name: " + studentName;
		return output;
	}
}
