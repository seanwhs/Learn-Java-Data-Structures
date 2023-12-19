// Java program to Illustrate Working of TreeSet 
// https://www.geeksforgeeks.org/treeset-in-java-with-examples/
package learn.set;


import java.util.*; 

// Main class 
class TreeSetExample { 

	// Main driver method 
	public static void main(String[] args) 
	{ 
		// Creating a Set interface with reference to 
		// TreeSet 
		Set<String> ts1 = new TreeSet<>(); 

		// Elements are added using add() method 
		ts1.add("B"); 
		ts1.add("Z"); 
		ts1.add("J"); 
		ts1.add("J"); //ignored. Set does not allow duplicates
		ts1.add("A"); 
		ts1.add("C"); 

		// Duplicates will not get insert 
		ts1.add("C"); 

		// Elements get stored in default natural 
		// Sorting Order(Ascending) 
		System.out.println(ts1); 
	} 
}

