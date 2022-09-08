package bl.com.day6practiceproblems;
import java.util.Scanner;


public class ReverseNumber {
	
	
	
	
	public static void main(String[] args) {
	

		
		
	reverse();
	
	
	}
	
	
	
	static void reverse()
	
	
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");

		int num=sc.nextInt();
		
		
		
		int rev=0;
		int rem;
		
		while (num >0)
			
		{
			rem=num%10;
			rev=(rev*10) + rem;
			num=num/10;
			
			
		}
		
		System.out.println("reverse of the entered number is :" + rev );
		
		
		
	}
			
	
	
	
	
	
	
	

}
