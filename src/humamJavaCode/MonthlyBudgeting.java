package humamJavaCode;

import java.util.Scanner;

public class MonthlyBudgeting {

	public static void main(String[] args) {
		
		double monthlyIncome = 0;
		double rent = 0;
		double food = 0;
		double transpo = 0;
		double entertain = 0;
		double misc = 0;
		double totalExpenses = 0;
		double balance = 0;
		double yearlySavings = 0;
		boolean expenseInteger = true;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Monthly Budgeting Software\n");
		System.out.println("What is your Monthly Income?");
		try {
			
			monthlyIncome= sc.nextDouble();
		}
		
		catch (Exception e) {
			
			System.out.println("Invalid Entry");
			sc.next();
			return;
		}
		expenseInteger = positiveInt(monthlyIncome);
		if (expenseInteger == true) {
			
		}
		else {
			System.out.println("Invalid Entry");
			return;
		}
		
		System.out.println("How much do you pay for rent every month?");
		try {
			
			rent = sc.nextDouble();
		}
		
		catch (Exception e1) {
			
			System.out.println("Invalid Entry");
			sc.next();
			return;
		}
		
		expenseInteger = positiveInt(rent);
		if (expenseInteger == true) {
			
		}
		else {
			System.out.println("Invalid Entry");
			return;
		}
		
		System.out.println("How much do you pay for food every month?");
		
		try {
			
			food = sc.nextDouble();
		}
		
		catch (Exception e2) {
			
			System.out.println("Invalid Entry");
			sc.next();
			return;
		}
		
		expenseInteger = positiveInt(food);
		if (expenseInteger == true) {
			
		}
		else {
			System.out.println("Invalid Entry");
			return;
		}
		
		System.out.println("How much do you pay for transportation every month?");
		try {
			
			transpo = sc.nextDouble();
		}
		
		catch (Exception e3) {
			
			System.out.println("Invalid Entry");
			sc.next();
			return;
		} 
		
		expenseInteger = positiveInt(transpo);
		if (expenseInteger == true) {
			
		}
		else {
			System.out.println("Invalid Entry");
		}
		
		System.out.println("How much do you pay for entertainmnet every month?");
		try {
			
			entertain = sc.nextDouble();
			
		}
		
		catch (Exception e4) {
			
			System.out.println("Invalid Entry");
			sc.next();
			return;
		}
		
		expenseInteger = positiveInt(entertain);
		if (expenseInteger == true) {
			
		}
		else {
			System.out.println("Invalid Entry");
			return;
		}
		
		System.out.println("How much do you pay for ____ every month?");
		try {
			
			misc = sc.nextDouble();
		}
		
		catch (Exception e5) {
			
			System.out.println("Invalid Entry");
			sc.next();
			return;
		}
		
		expenseInteger = positiveInt(misc);
		if (expenseInteger == true) {
			
		}
		else {
			System.out.println("Invalid Entry");
			return;
		}
		
		
		totalExpenses = rent + food + transpo + entertain + misc;
		balance = monthlyIncome - totalExpenses;
		
		expenseInteger = positiveInt(balance);
		if(expenseInteger == true) {
			yearlySavings = balance * 12;
			System.out.println("Your monthly income is: $" + monthlyIncome);
			System.out.println("Your balance is: $" + balance);
			System.out.println("You are saving $" + Math.abs(balance) + " every month");
			System.out.println("You are saving $" + Math.abs(yearlySavings) + " every year");
		}
		else {
			System.out.println("Your monthly income is: $" + monthlyIncome);
			System.out.println("Your balance is: $" + balance);
			System.out.println("You overspent by: $" + Math.abs(balance));
		}

	}
	
	
	
	
	
	public static boolean positiveInt(double a) {
		
		if (a >=  0)
			return true;
		else
			return false;
	}



}
