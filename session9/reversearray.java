package session9;

public class reversearray {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		display(arr);
		System.out.println("  ");
		
		int [] ans = reverse(arr);
		display(ans);
	}
	

	// for just array display
	public static void display(int[]arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(" " + arr[i]);
		}
	
		
	}
	
	// for reverse the array
	public static int[] reverse(int[] arr)
	
	{
		int[] ans = new int[arr.length];
		int ansidx = 0;
		int arridx = arr.length-1;
		while(ansidx < ans.length)
		{
			ans[ansidx] = arr[arridx];
			ansidx++;
			arridx--;
			
		}
		return ans;
	}

}
