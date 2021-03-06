
public class KthLargestSortedMatrix {

	public static void main(String argv[])
	{
		int[][] matrix =
			  {{ 5, 7, 8, 9 },
			  { 6, 9, 10, 13 },
			  { 7, 11, 12, 15 },
			  { 8, 13, 16, 17 } };
		int result = findKthLargest(matrix,4);
		System.out.println("Largest Element at Kth Position:" + result);
		
		
		int smallest = findKthLargest(matrix,matrix[matrix.length-1][matrix[0].length-1]);
		System.out.println("Smallest Element: " + smallest);
		
		/*
		int largest1st = findKthLargest(matrix,matrix[0][0]);
		System.out.println("1st Largest Element" + largest1st);
		*/
	}
	
	public static int findKthLargest(int[][] matrix, int k)
	{
		for(int i = 0; i < k-1; i++)
			reArrange(matrix, matrix.length-1, matrix.length -1);
		return matrix[matrix.length - 1][matrix[0].length - 1];
		
	}
	public static void reArrange(int[][] matrix, int row, int col)
	{
		int newRow = 0;
		int newCol = 0;
		if(row == 0 && col == 0)
		{
			matrix[row][col] = Integer.MIN_VALUE;
			return;
		}
		else if(row == 0)
		{
			newRow = row;
			newCol = col - 1;
		}
		else if(col == 0)
		{
			newRow = row - 1;
			newCol = col;
		}
		else if(matrix[row][col-1] > matrix[row-1][col])
		{
			newRow = row;
			newCol = col-1;
		}
		else
		{
			newRow = row - 1;
			newCol = col;
		}
		matrix[row][col] = matrix[newRow][newCol];
		reArrange(matrix,newRow,newCol);
	}
}
/*
Problem

Given a 2d array or matrix which is sorted by its rows and columns. Find the kth largest element from this matrix.

Solution

We will first try to find out the solution of the problem of rearranging the matrix. 
If one element is removed from the matrix, how can we rearrange the matrix so that the original properties of the matrix 
remain same, that is, sorted by its rows and columns. 
As the matrix is sorted by rows and columns, take any element, 
its top and left element will be less than the element and right and bottom element will be greater than the element. 
lets assume the element is a. If a is removed from the matrix, 
we will check left and top. Let us assume left is greater than top. If we put left in place of a, 
left<a and a<right => left<right, which maintains the row wise sorting.
as a > left, bottom > a => bottom > left
and we already assumed that left>top
So these two equation proves that column wise sorting is also maintained. 
Similar equations will arise if top  is greater than left and we replace the vacant place with top. 
So we can replace the removed element with the greater of top and left. 
and then continue the process to the next removed place till there is nothing more to remove. 
So this rearrange occurs in an N*M matrix in O(N+M) complexity.

Now to solve the original problem we just remove the right, bottom element k times and rearrange after every removal. 
As the right, bottom element is highest in the matrix, after removing k-1 times we can find the kth largest element 
in that position.

The total complexity will become O(K(M+N))
In an N*N matrix it is O(K(2N)) = O(KN)
*/