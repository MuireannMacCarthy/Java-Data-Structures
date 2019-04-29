package runningTimes;

public class C4 {

	 public static void main(String[] args) {
		 // initializing variable runningTime
		 double runningTime = 0;
		// calling the method difference 5 times and printing its result
		 for(int i = 0; i <5; i++) {
			 long start = System.currentTimeMillis(); // getting start time
			 System.out.println(difference(5, 8));
			 long end = System.currentTimeMillis(); // getting end time
			 runningTime += end-start; //calculate total running time
		 }
		 //getting average running time
		 runningTime = runningTime / 5;
		 System.out.println("duration is " + runningTime);

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
