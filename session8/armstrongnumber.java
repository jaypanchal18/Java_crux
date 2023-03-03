package session8;

public class armstrongnumber {

	public static void main(String[] args) {
		
		int n = 40;
		if(isarmstrong(n)== true)
		{
			System.out.println("this is a good number");
		}
		else
		{
			System.out.println("this is not a good number");
		}
	

	}
	
	public static boolean isarmstrong(int n)
	{
		int temp = n;
		int ans = 0;
		int digits = countdigits(n);
		while(temp != 0)
		{
			int rem = temp % 10;
			ans = ans + (int)Math.pow(rem, digits);
			temp = temp/10;
		}
		if(ans==n)
			return true;
		return false;
		
	}
	public static int countdigits(int n)
	{
		
		int digits = 0;
		
		
		while(n!=0)
		{
			n= n/10;
			digits++;
		}
		return digits;
		
		
		
	}
	

}
