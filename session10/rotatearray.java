package session10;

public class rotatearray {

	public static void main(String[] args) {
		
		 
		 int[] arr = {1,2,3,4,5,6,7};
		 int k = 5;
		 reverse(arr,0,arr.length-1);
		 reverse(arr,0,k-1);
		 reverse(arr,k,arr.length-1);
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i] + " ");
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
