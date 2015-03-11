
public class LargestPalindromeIterative {

	
	public static void main(String argv[])
	{
		String s = "abccbabacbcacba";
		String result = findLargestPalindrome(s);
		System.out.println(result);
	}
	static String findLargestPalindrome(String s)
	{
		int centers = 2*s.length() - 1;
		int radii = s.length() - 1;
		
		int maxCenter = 0;
		int maxRadius = 0;
		
		for(int center = 0; center < centers; ++center)
		{
			for(int radius = 0; radius < radii; ++radius)
			{
				if(center - radius < 0 || center + radius >= centers)
					break;
				else if((center + radius) % 2 == 1)
					continue;
				else if(s.charAt((center + radius)/2) != s.charAt((center - radius)/2))
					break;
				else
				{
					if(radius > maxRadius)
					{
						maxCenter = center;
						maxRadius = radius;
					}
				}
			}
		}
		return s.substring((maxCenter - maxRadius)/2, (maxCenter + maxRadius)/2 + 1);
	}
}
/* Problem

A string is called palindrome when it is same while reading character by character from left side or right side. 
Given any arbitrary string find out the largest substring in it which is a palindrome.

Brute force

A string of length n has O(n^2) substring. 
This is because startIndex can vary from 0 to n and endIndex can vary from startIndex to n. 
Now to check whether each of these substrings is a palindrome or not we need to have O(n) operation. 
So overall complexity would be O(n^3).

Better Solution

We will use iterative approach to solve this problem in O(n^2) time complexity using constant amount of extra space. 
What we will improve upon the brute force is the time to check whether the chosen substring is a palindrome or not. 
Instead of a O(n) time to check for palindrome we will check it in O(1) time. This will be done by using information 
gathered during choosing the substring. 
We will always chose a substring for palindrome check which has an inner palindrome just under the peripheral. 
So when we check the characters of two ends we can conclusively say whether the complete substring is a palindrome or not. 
For doing so we will chose a substring of length one which is axiomatically palindrome. Then we will grow out radially. 
At any point if we find a non palindrome we will stop that center and move to the next center. For even number of letters 
we need to chose center as the gap between two letters. For this we have chosen total 2n-1 centers to check for. 
While finding palindrome whenever a radius of palindrome is greater than previously stored maximum we will update the 
center and radius for largest palindrome.

*/
