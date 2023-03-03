package session7;

public class star {

	public static void main(String[] args) {

		// star print

		int n = 5;
		int row = 1;
		int nst = 1;


		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
			nst++;

		}

	}

}
