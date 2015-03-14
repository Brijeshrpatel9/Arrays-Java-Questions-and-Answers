
public class LargestSumSubArray {

	public static void main(String argv[])
	{
		int[] A = { 4, 3, -5, 0, 6, -8, 12, 3, -9, 2, 5, 8, -3, 4, 8, 0, 3, -3, -5, -9, 4, 2 };
		maxSumSubarray(A);
		
	}
	public static void maxSumSubarray(int A[])
	{
		int currentSum = 0;
		int currentStart = 0;
		int currentEnd = 0;
		int maxSum = 0;
		int maxStart = 0;
		int maxEnd = 0;
		while(currentEnd != A.length)
		{
			currentSum += A[currentEnd];
			if(currentSum > maxSum)
			{
				maxSum = currentSum;
				maxStart = currentStart;
				maxEnd = currentEnd;
			}
			if(currentSum <= 0)
			{
				currentStart = currentEnd + 1;
				currentSum = 0;
			}
			currentEnd++;
		}
		System.out.println("Maximum Sum: " + maxSum);
		System.out.println("Indexes (" + maxStart + ", " + maxEnd + ")");
	}
}

