
package session7;

public class decitobinary {
	
  public static void main(String[] args) {
	  
	  int n = 300;
	  int mult = 1;
	  int ans  = 0;
	  
	  while(n>0)
	  {
		  int rem = n%2;
		  ans  = ans +(rem * mult);
		  n = n/2;
		  
		  mult = mult * 10;
		  
	  }
	  
	  System.out.println(ans);
	  
  }

}
