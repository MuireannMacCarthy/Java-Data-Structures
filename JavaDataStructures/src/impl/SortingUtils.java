package impl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


import core.List;
// remember to use ASCI for last one (string) radix
// so get the ascii values of the letters in the string and put each letter in corresponding bucket
// e.g. if the asci value for a is 69 then it will go in 69
// for last two need to do whole thing in outer while loop
import core.Position;


public class SortingUtils {
	@SuppressWarnings("unchecked")
	
	
	public static void singleDigitBucketSort(List<Integer> list) {
		List<Integer>[] buckets = (List<Integer>[]) Array.newInstance(List.class, 10);
		
		while (!list.isEmpty()) {
			int value = list.remove(list.first()); 	
			if (value < 0 || value > 9) throw new UnsortableException("The list contains an invalid value: " + value);
			if (buckets[value] == null) {
				buckets[value] = new LinkedList<Integer>();
			}
			buckets[value].insertLast(value); //buckets[4] += 4
		}
		
		for (int i=0; i < buckets.length; i++) {
			if (buckets[i] != null) {
				while (!buckets[i].isEmpty()) {
					list.insertLast(buckets[i].remove(buckets[i].first()));
				}
			}
		}
	}

	// method to sort a list using bucket sort algorithm which takes a limet and upper limit for sort
	public static void integerBucketSort(List<Integer> list, int lower, int upper) {
		// creating a list of buckets of size = to the upper limit
		List<Integer>[] buckets = (List<Integer>[]) Array.newInstance(List.class, upper);
		
		// creating a while loop that will run until the list is empty
		while (!list.isEmpty()) {
			// removing the first item from the list and assigning it to a variable called value
			int value = list.remove(list.first());
			// if the value is less than the lower limit or more than the upper limit thrown an exception
			if (value < lower || value > upper) throw new UnsortableException("The list contains an invalid value: " + value);
			if (buckets[value] == null) {
				// if the bucket at position value has not already been initialised, initialise it
				buckets[value] = new LinkedList<Integer>();
			}
			// insert the value into the bucket at position value
			buckets[value].insertLast(value);
		}
			
		// for loop that iterates through the whole bucket
		for (int i=0; i < buckets.length; i++) {
			// if the bucket at position i is not equal to null
			if (buckets[i] != null) {
				// while the bucket at position i is not empty
				while (!buckets[i].isEmpty()) {
					// remove items from bucket at position i and insert into list
					list.insertLast(buckets[i].remove(buckets[i].first()));
				}
			}
		}
		
	}
	
	// method that sorts a list of integers using radix bucket sort algorithm, numbers can have only amount of significant digits <= parameter digits
	public static void integerRadixSort(List<Integer> list, int digits) {
		// creating a list of buckets of size 10
		List<Integer>[] buckets = (List<Integer>[]) Array.newInstance(List.class, 10);
			
		// creating variable x and loop that continues while x is less than digits
		int x = 0;
		while(x < digits) {
			// creating loop while the list is empty
			while (!list.isEmpty()) {
				// remove the first element from the list
				int value = list.remove(list.first());
				// code to get the location of least significant digit
				int power = (int) Math.pow(10, x);
				int intermediateDigit = value / power;
				int digit = intermediateDigit % 10;
				// if the least significant digit is < 0 or > 9 throw an exception
				if (digit < 0 || digit > 9) throw new UnsortableException("The list contains an invalid value: " + digit);
				// if the bucket at digits location is null
				if (buckets[digit] == null) {
					// initialize the bucket
					buckets[digit] = new LinkedList<Integer>();
				}
				// insert value into bucket at position digit
				buckets[digit].insertLast(value);
			}
				
			// for loop to iterate through bucket
			for (int i=0; i < buckets.length; i++) {
				// if bucket at position i is null
				if (buckets[i] != null) {
					// while loop to continue until buckets at position i is empty
					while (!buckets[i].isEmpty()) {
						// remove the first element from the bucket at position i and insert into list
						list.insertLast(buckets[i].remove(buckets[i].first()));
					}
				}
			}
			// increment x to prevent infinite while loop
			x++;
		}
	}
	
	// method that takes list of strings and sorts them in lexographic order, each string can have no more than parameter digits amount of chars
	public static void stringRadixSort(List<String> list, int digits) {	
		List<String>[] buckets = (List<String>[]) Array.newInstance(List.class, 150);
		
		
		// while loop that continues until digits becomes 0
		while(digits >= 0) {
			// while loop that continues until the list is empty
			while (!list.isEmpty()) {
				// removing first string in list and assigning to variable value
				String value = list.remove(list.first());
				// creating variable len and assigning the value of the length of the remove string value
				int len = value.length();
				// if the length of string is greater than digits
				if(len > digits) {
					// initialize variable position
					int position;
					if(digits == 0) {
						// if the digits is equal to make the position equal to digits
						position = digits;
					}
					else {
						// else make the position equal to digits - 1
						position = digits - 1;
					}
					// assign the character at position "position" to the variable ch
					char ch = value.charAt(position);
					// create variable asci that is equal to ch cast to int value
					int asci = (int) ch;
					// if last character in string is not a letter throw exception error message
					if (asci < 65 || asci > 123) throw new UnsortableException("The list contains an invalid value: " + ch);
					// if bucket at position asci is empty initialize
					if (buckets[asci] == null) {
						buckets[asci] = new LinkedList<String>();
					}
					// inserting the string value into the bucket at position asci
					buckets[asci].insertLast(value);
	
				}
				// else if the string length is less than digits
				else {
					// if buckets at position 0 is equal to null then initialize
					if (buckets[0] == null) {
						buckets[0] = new LinkedList<String>();
					}
					// insert value into buckets at position 0
					buckets[0].insertLast(value);
				}
			}
			// decrement digits to prevent infinite loop
			digits--;
			
			// create for loop that iterates through buckets for its whole length
			for (int i=0; i < buckets.length; i++) {
				// if the buckets at position i is not equal to null
				if (buckets[i] != null) {
					// while the bucket at position i is not empty
					while (!buckets[i].isEmpty()) {
						// remove the first item from the bucket at position i and insert into list
						list.insertLast(buckets[i].remove(buckets[i].first()));
					}
				}
			}
			
		}
	
	}
	
	
	public static void main(String[] args) {
	
		ibsTest();
		System.out.println();
		irsTest();
		System.out.println();
		srsTest();
		
		
	}
	
	
	
	// method to test the integerBucketSort method
	public static void ibsTest() {
		// initializing a list of integers of siz 500
		List<Integer> listy = new ArrayList<Integer>(250);
		// for loop to run 250 times
		for(int i = 0; i< 250; i++) {
			// generate random number between 50 and 250
			int randomno = ThreadLocalRandom.current().nextInt(50, 250);
			// inserting random number into the list
			listy.insertFirst(randomno);
		}
		
		// printing out unsorted list
		System.out.println("unsorted list " + listy);
		// sending list to integerBucketSort method with lower and upper limit to sort
		SortingUtils.integerBucketSort(listy, 50, 250);
		// printing the list after sorting
		System.out.println("sorted list "+ listy);
		
	}
	
	// method to test the integerRadixSort method
	public static void irsTest() {
		// initializing a list of integers, size 500 called listy
		List<Integer> listy = new ArrayList<Integer>(250);
		// creating for loop to run 250 times
		for(int i = 0; i< 250; i++) {
			// generating a random number between 50 and 251
			int randomno = ThreadLocalRandom.current().nextInt(50, 250 + 1);
			// inserting random number into the list
			listy.insertFirst(randomno);
		}
		
		// printing out the unsorted list
		System.out.println("unsorted list is " + listy);
		// sending the list and max number of significant numbers, 3 to the intgerRadixSort method
		SortingUtils.integerRadixSort(listy, 3);
		// printing the list after sorting
		System.out.println("sorted list is "+ listy);
	}
	
	// method to test the stringRadixSort method
	public static void srsTest() {
		// initializing a list of strings, size 10 called listy
		List<String> listy = new ArrayList<String>(10);
		// inserting strings into the list
		listy.insertLast("The");
		listy.insertLast("big");
		listy.insertLast("black");
		listy.insertLast("cat");
		listy.insertLast("sat");
		listy.insertLast("on");
		listy.insertLast("the");
		listy.insertLast("beautiful");
		listy.insertLast("brown");
		listy.insertLast("mat");
		// printing out the unsorted list
		System.out.println("unsorted list " + listy);
		// sending the list and number max length of string(10) to the stringRadixSort method
		SortingUtils.stringRadixSort(listy, 10);
		// printing the list after sorting
		System.out.println("sorted list " + listy);
	}
}
