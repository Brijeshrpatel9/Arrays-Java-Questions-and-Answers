
public class MovesZerosToRight {

	public static void main(String argv[])
	{
		int[] arr = {0,5,2,0,4,8,6,0,3};
		moveZeroToRight(arr);
		for(int num: arr)
			System.out.print(num + ", ");
		System.out.println();
	}
	static void moveZeroToRight(int[] Array)
	{
		int start = 0;
		int end = Array.length -1;
		while(start < end)
		{
			if(Array[start] == 0 && Array[end] != 0)
			{
				int temp = Array[start];
				Array[start] = Array[end];
				Array[end] = temp;
				start++;
				end--;
			}
			else
			{
				if(Array[start]!= 0)
					start++;
				if(Array[end] == 0)
					end--;
			}
		}
	}
	
}
