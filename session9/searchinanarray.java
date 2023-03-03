package session9;

public class searchinanarray {

	public static void main(String[] args) {
		
		int item = 800;
		int[] arr = {10,60,90,800 ,30};
		
		System.out.println("index is : " + (search(arr,item)));
		
	}
	
	
	public static int search(int[]arr,int item)
	{
		
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i] == item) {
				return i;
			}
			
		}
		return -1;
	}
	

}
