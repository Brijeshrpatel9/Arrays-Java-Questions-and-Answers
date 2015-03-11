
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
