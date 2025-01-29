package com.oopsAssignments;

// EmpGroups class that stores and prints employee data

public class EmpGroups {


	    // Arrays to store employee names and IDs
	
	    String[] employeeNames = new String[3];
	    int[] employeeIds = new int[3];

	    // Method to load data from Employees class
	    
	    public void loadData(Employees employees) {
	        for (int i = 0; i < employees.names.length; i++) {
	            employeeNames[i] = employees.names[i];
	            employeeIds[i] = employees.ids[i];
	        }
	    }

	    // Method to print employee data
	    
	    public void printEmployeeData() {
	        for (int i = 0; i < employeeNames.length; i++) {
	            System.out.println("Employee Name: " + employeeNames[i] + ", Employee ID: " + employeeIds[i]);
	        }
	    }
	}

