package com.jayashree.java;
/**
 * 
 * @author jayashreedas
 *
 */

// this class contains account details 
public class BankAccount {
	private int balance = 1000;
	
	public int getBalance() {
		return balance ;
	}
	
	
	public void withDraw(int amount) {
		balance = balance - amount ;
	}
	
	
}
