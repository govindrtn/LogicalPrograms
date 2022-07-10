package bridgelabz.com;

import java.util.Scanner;

public class PerfactNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter A number :  ");
		int num = scanner.nextInt();
	
		
		int factorSum = 0;
		
		for (int i = 1 ; i <= num/2 ; i++) 
		{
			if (num % i == 0) 
			{
				factorSum = factorSum + i ;
			}
		}
		if (factorSum == num ) 
		{
			System.out.println("it is a perfact number");
		}
		else 
		{
			System.out.println("It is not a Perfact Number");
		}
	}

}
