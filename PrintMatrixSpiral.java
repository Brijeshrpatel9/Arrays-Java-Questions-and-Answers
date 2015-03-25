

public class PrintMatrixSpiral
{
 public static void main(String[] args)
 {
  

  int[][] matrix =
  {
  { 3, 4, 5, 6, 2, 5 },
  { 2, 4, 6, 2, 5, 7 },
  { 2, 5, 7, 8, 9, 3 },
  { 2, 4, 7, 3, 5, 8 },
  { 6, 4, 7, 3, 5, 7 } };
  
  int[][] smallMatrix =
	  {
	  { 1, 2, 3, 4 },
	  { 10, 11, 12, 5 },
	  { 9, 8, 7, 6 }};
	
  System.out.println("Spiral Matrix: ");
  printSpiral(matrix);
  System.out.println();
  System.out.println("Using Smaller Element: ");
  printSpiral(smallMatrix);
 }

 public static void printSpiral(int[][] matrix)
 {
  printSpiral(matrix, 0);
 }

 private static void printSpiral(int[][] matrix, int depth)
 {
	 if(matrix == null && matrix.length ==0)
		 return;
	 
	 int row = matrix.length;
	 int col = matrix[0].length;
	 
	 if(2*depth > Math.min(row,col))
		 return;
	 
	 for(int i = depth; i < col - depth - 1; ++i)
	 {
		 System.out.print(matrix[depth][i] + ", ");
	 }
	 for(int i = depth; i < row-depth-1; ++i)
	 {
		 System.out.print(matrix[i][col-depth-1] + ", ");
	 }
	 for(int i = row-depth; i>depth;--i)
	 {
		 System.out.print(matrix[row-depth-1][i]+ ", ");
	 }
	 for(int i = row-depth-1; i>depth;--i)
	 {
		 System.out.print(matrix[i][depth]+ ", ");
	 }
	 printSpiral(matrix,++depth);
	 
  }
}
