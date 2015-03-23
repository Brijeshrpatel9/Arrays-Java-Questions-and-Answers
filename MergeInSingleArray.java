import java.util.Arrays;


public class MergeInSingleArray {

	public static void main(String argv[])
	{
		int M = 10;
		int N = 12;
		int[] a = new int[M+N];
		int[] b = new int[N];
		fillSortedElement(a,M);
		fillSortedElement(b,N);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		merge(a,b, M, N);
		System.out.println(Arrays.toString(a));
	}
	public static void merge(int[] a, int[] b, int M, int N)
	{
		int index = M + N -1;
		int i = M-1;
		int j = N-1;
		while(true)
		{
			if(a[i] > b[j])
			{
				a[index--] = a[i--];
			}
			else
			{
				a[index--] = b[j--];
			}
			if(j<0)
				break;
			if(i<0)
			{
				while(index >= 0)
				{
					a[index] = b[index];
					index--;
					
				}
				break;
			}
		}
	
		
	}
	private static void fillSortedElement(int a[], int fillCount)
	{
		a[0] = (int)(Math.random() *5);
		for(int k = 1; k < fillCount; ++k)
		{
			a[k] = a[k-1] + (int)(Math.random()*5);
		}
	}
}
