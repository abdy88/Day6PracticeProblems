package bl.com.day6practiceproblems;

import java.util.Scanner;

public class PrimeNumber {
	
	
	
		public static void main(String[] args) {
		
			
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number to check if its a prime number :");
			int num1=sc.nextInt();
			
			primeNumber(num1);
		
		
		
		}

	
	
	
	
	
			static void primeNumber(int num1)
			{
				
				int flag =0;
				if (num1%2==0)
				{
					System.out.println(num1 + " is not a prime number ");
					
				}
				
				else
				{
					for(int i=2;i<num1;i++)
					{
						if(num1%i==0)
						{
							flag=0;
							System.out.println(num1 + " is not a prime number ");
						break;
						}
						
						else if (num1%i!=0)
						{
							flag=1;	
						}
						
					}
						if(flag==1)
						{
							System.out.println(num1 + " is a prime number");
							
						}
					
					
				}
				
				
				
				
				
				
				
			}
	
	
	
	

}




