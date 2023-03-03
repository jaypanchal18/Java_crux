package session8;

public class functiondemo2 {

	public static void main(String[] args) {
		
		System.out.println(sum(90,10));
		System.out.println(sum(4.5f,6.2f));
		System.out.println(sum(23,43,65));

	}
	
	public static int sum(int a, int b)  // here int a and int b is parameters.
	{ 
		int sum = a + b;
		return sum;
		
	}
	public static float sum(float a, float b) // for floating value
	{
		return a + b;
	}
	public static int sum(int a, int b, int c) // for sum of 3 numbers
	{
		int sum = a + b + c;
		return sum;
	}


}
