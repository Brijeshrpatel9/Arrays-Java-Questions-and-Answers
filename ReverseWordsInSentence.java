public class ReverseWordsInSentence {

	
	public static void main(String argv[])
	{
		String str = "My Name is Brijesh";
		System.out.println("Original sentence is: " + str);
		String result = reverseWords(str);
		System.out.println("Reversed Sentence: " + result);
				
	}
	public static String reverseWords(String str)
	{
		char[] ch = str.toCharArray();
		reverse(ch, 0, ch.length -1);
		//System.out.println(ch);
		int wordStart = 0;
		int wordEnd = 0;
		while(wordEnd < ch.length)
		{
			if( ch[wordEnd] ==' ')
			{
				reverse(ch,wordStart, wordEnd);		
				//System.out.println(ch);
				wordStart = wordEnd + 1;
			}
			wordEnd++;
		}	
		reverse(ch, wordStart, wordEnd - 1);
		System.out.println(ch);
		return new String(ch); 
		
	}
	public static void reverse(char[] ch, int i, int j)
	{
		
		while(i<j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
	}

}
