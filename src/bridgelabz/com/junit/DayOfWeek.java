package bridgelabz.com.junit;

import java.util.Scanner;

public class DayOfWeek {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Day : ");
		int day = scanner.nextInt();
		
		System.out.println("Enter Month : ");
		int month = scanner.nextInt();
		
		System.out.println("Enter Year : ");
		int year = scanner.nextInt();
		
		if (day >= 1 && day <= 31 || month >= 1 && month <= 12) 
		{
			int y = year - (14 - month) / 12;
			int x = y + y / 4 - y / 100 + y / 400;
			int m = month + 12 * ((14 - month) / 12) - 2;
			int d = (day + x + 31 * m / 12) % 7;
			
			switch (d) 
			{
				case 0:
					System.out.println("Day is Sunday");
					break;
				case 1:
					System.out.println("Day is Monday");
					break;
				case 2:
					System.out.println("Day is Tuseday");
					break;
				case 3:
					System.out.println("Day is Wednesday");
					break;
				case 4:
					System.out.println("Day is Thursday");
					break;
				case 5:
					System.out.println("Day is Friday");
					break;
				case 6:
					System.out.println("Day is Saturday");
					break;
			}
		}
	}
}
