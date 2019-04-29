package runningTimes;

public class B4 {
	
	 public static void main(String[] args) {
		 // calling the method difference and printing its result
		 System.out.println(difference(5, 8));
		 }
	 
	 	// method that calculates the difference between two ints
		 public static int difference(int a, int b) {
			 
		 if(a>b) {
			 return a - b; // if a > b return a - b
		 }
		 else {
			 return b - a; // if b > a return b - a
		 }
		 }


}
