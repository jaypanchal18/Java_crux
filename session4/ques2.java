package session4;

import java.util.Scanner;

public class ques2 {

	public static void main(String[] args) {
		
		// triangle pattern
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter number");
		int n = scan.nextInt();
		
		
		//int n = 10;	
		int row = 1;   // number of row
		int nst = 1;   // number of star
		
		while(row <= n) {
			int cst = 1;  // current star
			while(cst <= nst)
			{
				System.out.print("* ");
				cst = cst +1; // current star increase
			}
			System.out.println();
			row = row +1;
			nst  = nst + 1;
		}
		
	}

}
