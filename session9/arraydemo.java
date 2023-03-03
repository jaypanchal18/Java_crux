package session9;

import java.util.Scanner;

public class arraydemo {

	public static void main(String[] args) {
		
		int []arr = new int[5];
		
		Scanner scan  = new Scanner(System.in);
		
		for(int i = 0;i<arr.length;i++) {
		arr[i] = scan.nextInt();
		}
		display(arr);

	}
	
	public static void display(int[]arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println("the " + i + "th element is :" + arr[i]);
		}
		
		
	}
	
	
	

}
