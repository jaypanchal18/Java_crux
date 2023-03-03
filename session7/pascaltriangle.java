package session7;

public class pascaltriangle {

	public static void main(String[] args) {
		
		int n = 5;
		int row = 0;
		int nst = 0;


		while (row <= n)
		{
			int val = 1; // for pascal
			int cst = 0;
			while (cst <= nst)
			{
				System.out.print(val + " ");
				val = ((val)*(row-cst))/(cst+1); // formula for pascal triangle 
				cst++;
			}
			System.out.println();
			row++;
			nst++;

		}
		

	}

}
