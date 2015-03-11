
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
