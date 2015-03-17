import java.util.Arrays;


public class LeastDifferenceInArray {

	public static void main(String argv[])
	{
		int[] arr = {45,67,321,489,90,38,815,572,99,18};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int mindiff = Integer.MAX_VALUE;
		for(int i = 0; i < (arr.length-1); ++i)
		{
			int diff = Math.abs(arr[i] - arr[i+1]);
			if(diff < mindiff)
				mindiff = diff;
		}
		System.out.println("Least Diffrence between any two elements of Array: " + mindiff);
	}
}
/*
Problem

Find the least difference between any two elements of an integer array.

Solution

First we can sort the elements of the array. Then we can iterate over the array and find difference between consecutive elements. 
The least of them would be the least differences between any two elements of the array. 
The complexity will be O(nlogn) because of the sorting step.
*/
