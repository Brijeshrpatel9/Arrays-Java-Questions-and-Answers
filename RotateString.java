public class RotateString {

	public static void main(String argv[])
	{
		String s1 = "rotation";
		String s2 = "tionrota";
		System.out.println("Can we formed String 2 using String 1? ");
		System.out.println(isRotateString(s1,s2));
	}
	public static boolean isRotateString(String s1, String s2)
	{
		String str = s1+ s1;
		return str.contains(s2) && s1.length() == s2.length();
	}
}
/*
Problem

Given two string find whether one string can be formed by rotating another string.

Solution

Suppose string b is to be formed by rotating string a. 
We concatenate string a with string a. then find for substring b in that concatenation.
*/
