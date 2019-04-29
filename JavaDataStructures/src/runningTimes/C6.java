package runningTimes;
import java.util.Random;

public class C6 {
	
	 public static void main(String[] args) {
		 //initializing variable runningTime
		 double runningTime = 0;
		
		 // creating variable for random generator and initializinf array and int n
		 Random generator = new Random();
		 int[] A = new int[1000000];
		 int n = 4;
		 
		 // generating random numbers for the Array A and populating A with these numbers
		 for(int i = 0; i<A.length; i++) {
				A[i] = generator.nextInt();
			}
			 
		 // loop to allow method to be called 5 times
			 for(int i = 0; i < 5; i ++) {
				 // getting start time
				 long start = System.currentTimeMillis();
				 System.out.println(MinValueIndex(A, n));
				 // getting end time
				 long end = System.currentTimeMillis();
				 // calculating total running time from start and end time
				 runningTime += end-start;
			 }
			 // getting average running time
			 runningTime = runningTime / 5;
			 System.out.println(A.length + "," + runningTime);
			 
		 }
	 
	 	
		 public static int MinValueIndex(int[] A, int n) {
		 int minValueIndex = 0;
		 for(int k = 1; k <= n-1; k++) {
			 System.out.println("k is " + k);
			 System.out.println("A[minValueIndex] is "+ A[minValueIndex]);
			 System.out.println("A[k] is " + A[k]);
			 System.out.println("minValueIndex is " + minValueIndex);
			 if(A[minValueIndex] > A[k]) {
				 minValueIndex = k;
			 }
		 }
		 System.out.println("output");
		 return minValueIndex;
		 }

}
