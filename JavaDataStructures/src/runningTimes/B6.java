package runningTimes;

public class B6 {

	 public static void main(String[] args) {
		 // initializing variable n and creating array A
		 int[] A = {6, 4, 5, 3};
		 int n = 4;
		 // calling method MinValueIndex passing A and n as parameters
		 System.out.println(MinValueIndex(A, n));
		 }
	 
	
		 public static int MinValueIndex(int[] A, int n) {
		// initializing minValueIndex
		 int minValueIndex = 0;
		 for(int k = 1; k <= n-1; k++) {
			 System.out.println("k is " + k);
			 System.out.println("A[minValueIndex] is "+ A[minValueIndex]);
			 System.out.println("A[k] is " + A[k]);
			 System.out.println("minValueIndex is " + minValueIndex);
			 if(A[minValueIndex] > A[k]) {
				 // if position minValueIndex in array A is greater than position K in the same index
				 // reassign minValueIndex to k
				 minValueIndex = k;
			 }
		 }
		 System.out.println("output");
		 return minValueIndex;
		 }
}
