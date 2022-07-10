package bridgelabz.com;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = scanner.nextInt();
		
		int firstTerm = 0;
		int secondTerm = 1;
		
		for (int i = 1; i <= num; i++) {
			
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
			System.out.println(firstTerm + "  ");
		}
	}
}
