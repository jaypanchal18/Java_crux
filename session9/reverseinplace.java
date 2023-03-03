package session9;

public class reverseinplace {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		display(arr);
		System.out.println(" ");
		reverse(arr);
		display(arr);

	}
	
	
	// for display array 
	public static void display(int[]arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(" " + arr[i]);
		}
	
		
	}
	
	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length-1;
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
