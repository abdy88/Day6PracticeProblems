package bl.com.day6practiceproblems;

import java.util.Scanner;

public class CouponNumber {


	public static boolean isPresent(int a[], int num) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of random digits required in the unique coupon");
		int num = sc.nextInt();
		
		int RandomNo = 0;
		int arr[] = new int[num];
		
		boolean ret;

		for (int i = 0; i < arr.length; i++) {
			RandomNo=(int)(Math.random() * 7 + 1);
			ret = isPresent(arr, RandomNo);
			if (ret != true) {
				arr[i] = RandomNo;
			} else {
				i--;
			}
		}
		
		
		
		 
			System.out.println("The random numbers generated are ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(" " + arr[i]);
			}
			
	}
		
		
		
}
		
		
		
		
