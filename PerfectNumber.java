package bl.com.day6practiceproblems;

import java.util.Scanner;

public class PerfectNumber {

	
	
	
	
	
	public static void main(String[] args) {
	
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check if its Perfect number :");
		int num1=sc.nextInt();
		
		int sum=0;
		
		for (int i=1;i<num1;i++)
		{
			
			if(num1%i==0)
			{
				System.out.println("divisor = " + i);
				sum= sum+i;
			}
		}
		
		System.out.println("Sum of all divisors is :" + sum);
		
		if (sum==num1)
		{
			System.out.println( num1 + " is a Perfect number");
			
			}
		
		else
		{
			System.out.println(num1 + " is not a Perfect number");
			
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
