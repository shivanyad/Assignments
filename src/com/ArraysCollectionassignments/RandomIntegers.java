package com.ArraysCollectionassignments;

public class RandomIntegers {

	public static void main(String[] args) {

		        // Create an array with the given 10 Random Integers
		
		        int[] numbers = {10, 90, 80, 50, 40, 45, 65, 80, 95, 5};
		        
		        // Print the array (optional, for reference)
		        
		        System.out.print("Array: ");
		        
		        for (int num : numbers) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		        
		        // Sum the 3rd (index 2) and 5th (index 4) values
		        
		        int sum = numbers[2] + numbers[4];
		        
		        // Output the result
		        
		        System.out.println("Sum of 3rd and 5th values: " + sum);
		    }
		

	}


