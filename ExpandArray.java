/* Problem

You are given a character array like this a3b1c1d1e4f0g11. 
You will have to expand the array by repeating the characters denoted by the following numbers. 
For example the above character array will be expanded to aaabcdeeeeggggggggggg. 
The given array will have more than enough trailing spaces such that you can modify the array in place.

Solution

We will solve this by recursion. Our first reading location and writing location is 0. 
As we find a3 we know that this will take 3 spaces. But if we write it now it will override b. 
So we know from a3 that next write will begin from 4th position and reading will start from 3rd position. 
So we call this recursive function to read from 3rd position and write it from 4th position. 
Then after the recursive function returns, we write the first 3 positions. 
The recursion ends when we find space character in the reading position.
*/
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
