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
		boolean incomeInteger = true;
		boolean expenseInteger = true;
		boolean incomePositive = true;
		boolean expensePositive = true;
		boolean balancePositive = true;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Monthly Budgeting Software\n");
		System.out.println("What is your Monthly Income?");
		try {
			
			monthlyIncome= sc.nextDouble();
		}
		
		catch (Exception e) {
			
			System.out.println("Invalid Entry");
		}
		method2(monthlyIncome);

	}
	
	
	
	
	
	public static void method2(double a) {
		
		if (a< 0)
			System.out.println("Invalid Input");
	}
	
	


}
