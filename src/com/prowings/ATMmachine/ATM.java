package com.prowings.ATMmachine;

import java.util.Scanner;

public class ATM {
	
	float Balance;
	int PIN = 2525;
	
	public void checkpin() {
		
		System.out.println("Enter Your PIN");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		
		if(enteredpin==PIN) {
			menu();
		
		}else {
			System.out.println("Enter a valid PIN");
			
		}
	}
	
	public void menu() {
		
		System.out.println("Enter Your Choice: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Maney");
		System.out.println("3. Deposit Maney");
		System.out.println("4. Exit");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
		if(opt == 1) {
			checkBalance();
		}else if(opt==2) {
			withdrawManey();
		}
		else if(opt==3) {
			depositMoney();
		}
		else if(opt==4) {
			return;
		}
		else {
			System.out.println("Enter a valid choice");
		}
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + Balance);
		menu();
	}
	
	public void withdrawManey() {
		System.out.println("Enter Amount to Withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance = Balance - amount;
			System.out.println("Money Withdraw Successfully");
		}
		
		menu();
	}
	
	public void depositMoney() {
		System.out.println("Enter the Amount");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Mony Deposited Successfully");
		menu();
	}

}
