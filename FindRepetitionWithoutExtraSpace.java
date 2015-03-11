
public class FindRepetitionWithoutExtraSpace {
	
	public static void main(String argv[])
	{
		int[][] A = {{8,12,13,16,17,22,24,29},
			    {4,8,14,16,18,23},
			    {33,36,37,44,95,126},
			    {5,7,15,18}};
		System.out.println("Repeated Numbers: ");
		findRepetition(A);
		
	}
	public static void findRepetition(int[][] A)
	{
		int index[] = new int[A.length];
		int frontNumber[] = new int[A.length];
		int length[] = new int[A.length];
		
		for(int i=0; i<A.length;++i)
		{
			length[i] = A[i].length;
		}
		boolean modified = true;
		while(modified)
		{
			modified = false;
			for(int i=0; i<A.length; ++i)
			{
				if(index[i] < length[i])
				{
					modified = true;
					frontNumber[i] = A[i][index[i]]; 
				}
				else
				{
					frontNumber[i] = Integer.MAX_VALUE;
				}
			}
			int min = frontNumber[0];
			int minindex = 0;
			for(int i=1; i< A.length; ++i)
			{
				if(frontNumber[i] == min)
				{
					if(frontNumber[i] != Integer.MAX_VALUE)
					{
						System.out.println(frontNumber[i]);
						
					}
					index[i]++;
				}
				else if(frontNumber[i] < min)
				{
					min = frontNumber[i];
					minindex = i;
				}
			}
			index[minindex]++;
		}
	}
}
