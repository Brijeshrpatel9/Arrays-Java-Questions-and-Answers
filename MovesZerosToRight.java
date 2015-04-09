
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
/*
Problem

You are given an integer array which contains some zeros. 
Move the zeros to the right side of the array with minimum number of swaps. 
The order of the original array can be destroyed.

Solution

We can do this in at most n/2 swaps. We move one index from left to right side and another from right to left side. 
If we get a non zero number at right index and zero in the left index then we swap the numbers. 
If in the right side we get a zero we just move the pointer to the left side and if we get a non zero in 
the left index then we move it to the right side. 
We continue this process till the two pointers meet.
*/
