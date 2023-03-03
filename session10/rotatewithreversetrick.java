package session10;

public class rotatewithreversetrick {
 public static void main(String[] args) {
	
	 
	 int[] arr = {1,8,9,2,3,8,5,6,5,7,4,5,6};
	 reverse(arr,3,9); // function call
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.print(arr[i] + " ");
	 }
	 
}
 
 
 public static void reverse(int[] arr,int lo, int hi) {
		int i = lo;
		int j = hi;
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		
	}
 
   
}
