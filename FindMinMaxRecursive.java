
public class FindMinMaxRecursive {

	
	public static void main(String argv[])
	{
		int A[] = {8, 35, 45, 3, 9, 24, 58, 98, 74, 36, 87, 36};
		MinMax result = findMinMaxRecursive(A,0, A.length-1);
		System.out.println("Minimum: " + result.min);
		System.out.println("Maximum: " + result.max);
	}
	public static MinMax findMinMaxRecursive(int[] A, int i, int j)
	{
		if(i>j)
			return null;
		if(i == j)
			return new MinMax(A[i], A[i]);
		else
		{
			MinMax left;
			MinMax right;
			left = findMinMaxRecursive(A, i, (i+j)/2);
			right = findMinMaxRecursive(A, ((i+j)/2) + 1, j);
			if(left == null)
				return right;
			else if(right == null)
				return left;
			else
			{
				return new MinMax(Math.min(left.min, right.min), Math.max(left.max, right.max));
			}
		}	
	}
}
class MinMax
{
	public int min;
	public int max;
	
	public MinMax(int min, int max)
	{
		this.max = max;
		this.min = min;
	}
}

/*
 To find the largest and smallest among 3 numbers, we need 3 comparisons in worst case and 2 comparisons in best case. 
 The average case is 2.5. So for 3 numbers we need total 5 comparisons in worst case and 4.5 in average case. 
 So in worst case comparisons per number is 1.6 and average case 1.5. Similarly we can derive that the worst case comparison is never less than 1.5. 
 and best and average case is equal in case of taking numbers in pair.

Divide and conquer method
In this approach we are dividing the list in two parts, each part is recursively providing the min and max 
of that part and then two min max are compared to decide the ultimate min and max. 
Recursively when the array is reduced to only a single element then the element itself become min and max.

*/
