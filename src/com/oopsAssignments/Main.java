package com.oopsAssignments;

// Main class to run the program

public class Main {

	public static void main(String[] args) {

		
	// Create instances of Employees and EmpGroups
		      
		Employees employees = new Employees();
		EmpGroups empGroups = new EmpGroups();

    // Load employee data from Employees class to EmpGroups class
		        
		empGroups.loadData(employees);

	// Print the employee data
		        
		empGroups.printEmployeeData();
	 }
		
}


