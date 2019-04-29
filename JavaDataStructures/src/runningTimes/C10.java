package runningTimes;

import java.util.Random;

public class C10 {

	 public static void main(String[] args) {
		 // initializing runningTime variable
		 double runningTime = 0;
		 // Initializing test cases for int n, q and int array A
		 int n = 4;
		 int[] A = new int[2000000];
		 int q = 8;
		 // initializing random number generator
		 Random generator = new Random();
		 
		 // creating random numbers and populate Array A with these numbers
		 for(int i = 0; i<A.length; i++) {
				A[i] = generator.nextInt();
			}
		 
		 // calling the method LinearSearch with A, n and q as parameters
		 for(int i = 0; i<5; i++) {
			 // get start time
			 long start = System.currentTimeMillis();
			 System.out.println(LinearSearch(A, n, q));
			 // get end time
			 long end = System.currentTimeMillis();
			 // calculating running time from start and end time
			 runningTime += end-start;
		 }
		 // getting average running time
		 runningTime = runningTime / 5;
		 System.out.println(A.length + "," + runningTime);

		 }
	 
	 	// method that searches for the index in an array that holds the value q
		 public static int LinearSearch(int[] A, int n, int q) {
			// initialize index to 0 
			int index = 0;
			System.out.println("index is " + index);
			//while index is less than n and A[index] is not equal to q
			while(index < n && A[index] != q) {
				// increment index by 1
				index += 1;
				System.out.println("index is " + index);
				System.out.println("A[index] is " + A[index]);
			}
		 
			// if index if equal to n return -1, else return the index
			if(index == n) {
				return -1;
			}
			else {
				return index;
			}
				
		 }
}
