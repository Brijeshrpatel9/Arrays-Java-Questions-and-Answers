public class ArraySumExceptCurrentElement {

	public static void main(String agrv[])
	{
		int[] array = {3,1,4,5,3,4,12,3};
		int[] result = new int[array.length];
		int i = 0;
		int sum = 0;
	
		while(i < array.length)
		{
			int temp = array[i];
			result[i++] = sum;
			sum += temp;
		}
		i--;
		System.out.println(i);
		sum = 0;
		while(i >= 0)
		{
			int temp = array[i];
			result[i--] += sum;
		
			sum += temp;
		}
		for(int j=0; j < array.length; j++)
		{
			System.out.println("Sum of array except " + j + " th element: " + result[j] );
		}
	}
}

/*
Problem

Replace an array element a(i) with sum(a)-a(i) without using the '-' operator. Where sum(a)=a(0)+a(1)+...+a(n)

Solution

First we will add the numbers from left to right and place it to a new array in such a way so that each element of the 
new array e(i)=a(0)+a(1)+...+a(i-1). Then we will do the same thing from right to left. 
In this way the ith element will include all the elements from its left and right but not the element a(i). 
As we are always doing a sum we don't need a '-' operator.
*/
