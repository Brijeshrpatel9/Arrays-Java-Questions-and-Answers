import java.util.Arrays;

public class RotateKTimes
{
 public static void main(String[] args)
 {
  int[] array =
  { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
  printArray(array);
  rotateLeftKTimes(array, 3);
  printArray(array);
 }

 private static void rotateLeftKTimes(int[] array, int k)
 {
  reverse(array, 0, array.length - 1);
  System.out.println(Arrays.toString(array));
  reverse(array, 0, array.length - k - 1);
  System.out.println(Arrays.toString(array));
  reverse(array, array.length - k, array.length - 1);
  System.out.println(Arrays.toString(array));
 }

 private static void reverse(int[] array, int i, int j)
 {
  while (i < j)
  {
   int temp = array[i];
   array[i] = array[j];
   array[j] = temp;
   i++;
   j--;
  }
 }

 private static void printArray(int[] array)
 {
  for (int i : array)
   System.out.print(i + ",");
  System.out.println();

 }
}
/*
Problem

Rotate an array k times to its left.

Solution

Reverse the whole array, Then reverse the part 0 to n-k and n-k+1 to n.
*/
