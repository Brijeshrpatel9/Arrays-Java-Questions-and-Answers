public class NextPalindrome {
	
	public static void main(String argv[])
	{
		System.out.println("Next Palindrome Number: " +nextpalindrome(345676) + "\n"); 
		// Even Length + not greater than == Logic: 345+1 = 346 and reverse 643 so number ==== 346643  
		System.out.println("Next Palindrome Number: " +nextpalindrome(135321)+ "\n"); 
		// Even Length + greater than == Logic: 135 reverse 531 > 321 so number ==== 135531
		
		System.out.println("Next Palindrome Number: " +nextpalindrome(3451676)+ "\n"); 
		// Odd Length + not greater than == Logic: 3451 +1 = 3452 and reverse of 345= 543 so number ==== 3452543  
		System.out.println("Next Palindrome Number: " +nextpalindrome(1354321)+ "\n"); 
		// Odd Length + greater than == Logic: 1354 +  reverse of 135 = 531 so number ==== 1354531
		
		/*
		 * Let the integers' digit be abcdef. 
		 * As number of digits are even we will divide it in two parts, abc and def. 
		 * Now we reverse first part and it becomes cba. if cba is greater than def then abccba is the answer. 
		 * If it is smaller we increment the first part and it becomes (abc+1)=suppose xyz, so the answer would be xyzzyx.
		 * 

			Now let's check what happens when number of digits are odd. 
			Let the integer be abcdefg. We divide it into 3 parts. abc, d, efg. if cba is greater than efg then the answer is abcdcba. 
			If it is smaller then abcd is incremented by 1. Suppose (abcd+1)=wxyz. Then the answer is wxyzyxw.
		 */
	}

	public static int nextpalindrome(int num)
	{
		System.out.println("Entered Number is: " + num);
		return nextpalindrome(num, true);
	}

	public static int nextpalindrome(int num, boolean firstTime)
	{
		String numberString = Integer.toString(num);
		int leftEndIndex = -1;
		int rightStartIndex = -1;
		boolean isOdd = (numberString.length()%2 == 1);
		
		if(isOdd)
		{
			leftEndIndex = numberString.length()/2;
			rightStartIndex = leftEndIndex +1;
		}
		else
		{
			leftEndIndex = rightStartIndex = numberString.length()/2;
		}
		
		String leftHalf = numberString.substring(0, leftEndIndex);
		String rightHalf = numberString.substring(rightStartIndex);
		
		String leftReversed = new StringBuffer(leftHalf).reverse().toString();
		String palindrome = null;
		
		if(Integer.parseInt(leftReversed)> Integer.parseInt(rightHalf) || !firstTime)
		{
			if(isOdd)
			{
				palindrome = leftHalf + numberString.charAt(leftEndIndex) + leftReversed;
			}
			else
				palindrome = leftHalf + leftReversed;
			return Integer.parseInt(palindrome);
		}
		else
		{
			if(isOdd)
			{
				String leftEndMiddle = leftHalf + numberString.charAt(leftEndIndex);
				int leftIncremented = Integer.parseInt(leftEndMiddle) + 1;
				return nextpalindrome(Integer.parseInt(leftIncremented + rightHalf), false);
			}
			else
			{
				int leftIncremented = Integer.parseInt(leftHalf) + 1;
				return nextpalindrome(Integer.parseInt(leftIncremented + rightHalf), false);
			}
		}
	}
}
