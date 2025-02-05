package com.conditionalAssignments;

import java.util.*;

public class BankTransactions {

	public static void main(String[] args) {

		// Transaction amounts (positive for credit, negative for debit)
		
        int[] transactions = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};
        
        // Variables to track results
        
        int creditCount = 0, debitCount = 0, creditTotal = 0, debitTotal = 0, suspiciousCount = 0;
        int balance = 0;
        
        // Loop through transactions
        
        for (int transaction : transactions) {
            if (transaction > 0) {
                creditCount++;
                creditTotal += transaction;
                balance += transaction;
                if (transaction > 10000) {
                    suspiciousCount++;
                    System.out.println("Suspicious credit transaction with Amount: " + transaction);
                }
            } else {
                debitCount++;
                debitTotal += Math.abs(transaction);       // Debit amounts are negative, use absolute value
                balance += transaction;
                if (Math.abs(transaction) > 10000) {
                    suspiciousCount++;
                    System.out.println("Suspicious debit transaction with Amount: " + Math.abs(transaction));
                }
            }
        }
        
      
        System.out.println("Total number of credit transactions: " + creditCount);
        System.out.println("Total number of debit transactions: " + debitCount);
        System.out.println("Total amount credited: " + creditTotal);
        System.out.println("Total amount debited: " + debitTotal);
        System.out.println("Remaining balance: " + balance);
        System.out.println("Total suspicious transactions: " + suspiciousCount);
    }
}