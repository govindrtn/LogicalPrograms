package bridgelabz.com.junit;

import java.util.Scanner;

public class TemparatureConversion {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("1 ---> Fahrenheit to Celsius ");
		 System.out.println("2 --->  Celsius to Fahrenheit");
		 
		 int choice = scanner.nextInt();		 
		 
		 switch (choice) 
		 {
		 	case 1:
		 		System.out.println("Enter Fahrenheit : ");
		 		double fahrenheit = scanner.nextDouble();
		 		double celsius = (fahrenheit-32) * 5/9;
		 		System.out.println("Conversion of Fahrenheit to Celsius " + celsius);
		 		break;
		 	case 2:
		 		System.out.println("Enter Celsius : ");
		 		celsius = scanner.nextDouble();
		 		fahrenheit = (celsius * 9/5)+ 32;
		 		System.out.println("Conversion of Fahrenheit to Celsius " + fahrenheit );
		 		break;
		 	default:
		 		System.out.println("something Went Wrong");
		 }
	}
}
