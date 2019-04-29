package runningTimes;

public class B10 {
	 public static void main(String[] args) {
		 // Initializing test cases for int n, q and int array A
		 int n = 4;
		 int[] A = {3, 7, 8, 5};
		 int q = 8;
		 // calling the method LinearSearch with A, n and q as parameters
		 System.out.println(LinearSearch(A, n, q));
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
