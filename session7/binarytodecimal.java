package session7;

public class binarytodecimal {

	public static void main(String[] args) {
		
		int n = 111111;
		int mult = 1;
		int ans  = 0;
		
		while(n>0)
		{
			int rem = n % 10;
			ans = ans + (rem * mult);
			n = n/10;
			mult = mult*2;
		}

			System.out.println(ans);
	}

}
