package session3;

import java.util.*;

public class gradecard {

	public static void main(String[] args) {
		
	/*int a = 100;
		
		if(a>=90)
		{
			System.out.println("you will get A+ ");
		}
		else if(a>=80)
		{
			System.out.println("you will get A");
		}
		else if(a>=70)
		{
			System.out.println("You will get  B+");
		}
		else if(a>=60)
		{
			System.out.println("you will get  B");
		}
		else if(a>=50)
		{
			System.out.println("you will get c+");
		}
		else if(a>=40)
		{
			System.out.println("you will get C");
		}
		else
		{
			System.out.println("you are fail");
		}
		
		*/
		Scanner scan = new Scanner(System.in);   //Scanner package for User INPUT
	
		System.out.println("Enter A Number");
		int b = scan.nextInt();
	//	int b = 100;                                 // grade card using else_if statement.
		if(b <= 100 && b>=90 )
		{
			System.out.println("A+");
		}
		else if(b <= 90 && b >= 80)
		
			System.out.println("A");
		
		else if(b <= 80 && b >= 70)
			System.err.println("B+");
		
		else if(b <= 70 && b >= 60)
			System.out.println("B");
		
		else if(b <= 60 && b >= 50)
			System.out.println("C+");

		else if(b <= 50 && b >= 40)
			System.out.println("C");
		
		else if(b < 40 && b >= 0)
			System.out.println("F");
		
		else
			System.out.println("wrong input");
		
			
		
	}

}
