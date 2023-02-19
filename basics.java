package session2;

public class basics {

	public static void main(String[] args) {
//		System.out.println("Hello World ");
//		System.out.println("i'm Jay");
//		System.out.println("it is a rainy day");  //println ln is used for space
//		int a = 10;
//		int b = 5;
//		int add = a + b;
//		int sub = a - b;
//		int multi = a * b;
//		int div = a / b;
//		int mod = a % b;
//		System.out.println("The sum is " +add);
//		System.out.println("The sub is " +sub);
//		System.out.println("The multi is " +multi);
//		System.out.println("The div is " +div);
//		System.out.println("The mod is " +mod); // for reminder
//		add += 100; // or u can use add = add + 100;
//		System.out.println(add);
		
//		Simple interest program
		int p = 1000;
		int r = 6;
		int t = 2;
		int si = (p*r*t)/100;
		System.out.println("Simple intrest is " +si);
		
//		greatest number 
		int a = 40;
		int b = 50;
		int c = 30;
		int d = 30;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);  // == for checking(check krega ki value a or b ki same h ya nahi)
		System.out.println(c==d);
		System.out.println(c!=d); // != same nahi 
		
		
// 		odd even program
		int x = 9;
		if(x%2==0)
		{
			System.out.println("number is even ");
		}
		else
		{
			System.out.println("number is odd ");
		}
		
		

//		if condition program		
		int  marks = 100;
		if(marks >= 90)
			System.out.println("you will get a chocolate");
		else
		{
			System.out.println("you will not get a chocolate");
		}
		
//		greater of 2 value		
		int w = 10;
		int q = 20;
		
		if(w>q)
		{
			System.out.println(w);
		}
		else
		{
			System.out.println(q);
		}

		
//		check number negative
		int m = -10;
		if(m>0)
		{
			System.out.println( "m is +");
		}
		else
		{
			System.out.println(" m is -");
		}
		
//		print hello world 10 times
		int h;
		for(h = 1; h <= 10; h++)
		{
			System.out.println("Hello World");
		}
		
	
		
			
	}

}
