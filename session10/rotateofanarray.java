package session10;

public class rotateofanarray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		rotate(arr,3);
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
			
	}
	
	public static void rotate(int[]arr,int k)
	{
		k = k % arr.length;			//anticlockwise
		
		for(int times = 0; times<k;times++)
		{
			int save = arr[arr.length-1];
			for(int i = arr.length-1;i>=1;i--)
			{
				arr[i] = arr[i-1];
			}
			arr[0] = save;
		}

		
	}

}
