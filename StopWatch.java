package bl.com.day6practiceproblems;

import java.util.Scanner;

public class StopWatch 
{
	long startTimer=0;
	long stopTimer=0;
	long elapsed;
	
	//to start timer
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
	}
	
	// to stop timer
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);
	}
	
	public long getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	
	public static void main(String[] args)
	{
		StopWatch obj=new StopWatch();
	
		System.out.println("Press '1' to Start Time: ");
		Scanner sc = new Scanner(System.in);
		int userinput=sc.nextInt();
		
		if(userinput==1) {
			obj.start();
		}
		else
		{System.out.println("invalid input");}

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		int userinput2=sc.nextInt();
		
		if(userinput2==2) {
			obj.stop();
		}
		else
		{System.out.println("invalid input");}

	

		long l=obj.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:" + l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec ");
	}
}