package bridgelabz.com.junit;

import java.util.Scanner;

public class MonthlyPayment {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter year :");
		long year = scanner.nextLong();
		
		System.out.println("Enter Principal Ammount :");
		double principleAmmount = scanner.nextDouble();
		
		System.out.println("Enter rate of Percentage :");
		double rate = scanner.nextDouble();
		
		System.out.println(monthlyPayment(year ,principleAmmount , rate));
		
		
	}
	public static int monthlyPayment(long year , double principleAmmount , double rate) {
		
		double r = rate / (12 * 100);
		double n = -1 * 12 * year;
		double payment = (principleAmmount * r ) / (1 - Math.pow((1 + r), n));
		
		return (int)payment;
	}


}
