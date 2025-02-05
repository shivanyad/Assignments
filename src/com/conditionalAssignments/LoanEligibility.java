package com.conditionalAssignments;

public class LoanEligibility {

	public static void main(String[] args) {

	
		  // Customer details
		
		    String customerName = "John Doe";
		    int creditScore = 720;
		    double income = 55000.0;
		    boolean isEmployed = true;
		    double debtToIncomeRatio = 35.0;
		        
		  // Loan eligibility check
		    
		    if (creditScore > 750) {
	            System.out.println(customerName + " is automatically approved for the loan.");
	        } 
		    else if (creditScore >= 650) {
	            if (income >= 50000 && isEmployed && debtToIncomeRatio < 40) 
	             {
	                System.out.println(customerName + " is approved for the loan.");
	             } 
	        else {
	                System.out.println(customerName + " is denied the loan.");
	             }
	        } 
		    else {
	            System.out.println(customerName + " is denied the loan.");
	             }
	    }
	}
		    
		

		
	


