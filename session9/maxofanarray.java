package session9;

public class maxofanarray {

	public static void main(String[] args) {
		
		int[] arr = {10,60,90,800 ,30};
		System.out.println("max value is : " + max(arr));
		System.out.println("Min value is :" + min(arr));
		

	}
	
	
	public static int max (int[]arr)
	{
		int ans = 0;
		for(int i = 0; i<arr.length;i++)
		{
		if(arr[i]>ans)
		{
			ans = arr[i];
		}
		
		}
		return ans;
	}
	
	public static int min (int[]arr)
	{
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length;i++)
		{
		if(arr[i] < ans)
		{
			ans = arr[i];
		}
		
		}
		return ans;
	}

}
