package bl.com.day6practiceproblems;


import java.util.Scanner;


public class FibonacciSeries {

	
	public static void main(String[] args) {
		
		int i=0;
		int j=1;
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of number for which fibonacci series to be found");
		int count=sc.nextInt();
		
		System.out.println("Fibonacci series  of first " + count + " numbers :");
		
		System.out.println("k=" + i);
		System.out.println("k=" + j);
		
		
		
		for(int n=3;n<=count;n++)
			
		{
			int k=j+i;
			System.out.println("k=" + k);
			i=j;
			j=k;
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
