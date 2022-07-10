package bridgelabz.com;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long num = scanner.nextLong();
		System.out.println("Original Number " + num);
		
		long StoreReverseNumber = 0;
		
		while(num != 0) 
		{
			long digit = num % 10;
			StoreReverseNumber = StoreReverseNumber *10 + digit;
			num /= 10;
		}
		System.out.println("Original number after Reversed: " + StoreReverseNumber);	
	}
}
