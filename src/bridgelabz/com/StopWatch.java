package bridgelabz.com;

import java.util.Scanner;

public class StopWatch {
	
	private static long startStopWatch(int startClick) 
	{
		long startTime = 0;
		if(startClick == 1) 
		{ 
			long miles = System.currentTimeMillis();
			long seconds = (miles / 1000);
			startTime = seconds;
			System.out.println(startTime);
		}
		return startTime;
	}
	
	private static void endStopWatch(long startTime , int endClick ) {
		if (endClick == 2) 
		{
			long miles = System.currentTimeMillis();
			long seconds = (miles / 1000);
			long elapsedTime = seconds - startTime;
			System.out.println("ElapsedTime in seconds---> " + elapsedTime +" Sec" );
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 1 to start StopWatch : ");
		int startClick = scanner.nextInt();
		
		System.out.println("Enter 2 to Stop StopWatch : ");
		int endClick = scanner.nextInt();
		
		long startTime = startStopWatch(startClick);
		endStopWatch(startTime , endClick );
		
	}

}
