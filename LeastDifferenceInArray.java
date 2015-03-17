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
