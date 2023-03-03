package session7;

import java.util.Scanner;

public class binarytooctal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// int n = 11111;
		System.out.println("enter binary :");
		int n = sc.nextInt();
		int mult  =1;
		
		int ans = 0;
		
		while(n>0)
		{
			int rem = n % 8;
			
			ans = ans + (rem * mult);
			
			n = n/8;
			mult = mult * 2 ;
			
		}
		System.out.println(ans);

	}

}
