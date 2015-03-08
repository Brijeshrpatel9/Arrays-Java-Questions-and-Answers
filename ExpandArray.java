
public class ExpandArray {

	public static void main(String argv[])
	{
		char[] array = "a3b2c4d1e1f0g11                                        ".toCharArray();
		expand(array);
		for(char ch: array)
			System.out.print(ch);
				
	}
	public static void expand(char array[])
	{
		expand(array,0,0); 
	}
	public static void expand(char array[], int startReading, int startWriting)
	{
		char ch = array[startReading++];
		System.out.println(ch);
		int count = 0;
		if(ch == ' ')
			return;
		while(Character.isDigit(array[startReading]))
		{
			count = count * 10 + array[startReading] - 48;
			System.out.println(count);
			startReading++;
		}
		expand(array, startReading, startWriting + count);
		for(int i = 0; i < count; ++i)
		{
			array[startWriting + i] = ch;
			System.out.println(array[startWriting + i]);
		}
			
	}
}
