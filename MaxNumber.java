import java.util.*;

// Some of the Important Methods related to String and Character:
/*
String[] split(String regex) 
Splits this string around matches of the given regular expression.

String[] split(String regex, int limit) 
Splits this string around matches of the given regular expression.

char[] toCharArray() 
Converts this string to a new character array.

String toString()
This object (which is already a string!) is itself returned.

String to char ----- StringObject.toCharArray();
char array to string --- String.valueOf(charArray);

Reverse String:
String output = new StringBuffer(StingObject).reverse().toString();
*/

public class MaxNumber {

	public static void main(String argv[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		System.out.println("Entered Number: " + s);
		
		// String to char Array
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		
		// Char array to string
		String op = String.valueOf(ch);
		//	System.out.println(op);
		
		// Reverse the string
		String output = new StringBuffer(op).reverse().toString();
		System.out.println("Maximum Number that can be formed: " + output);
		
		//Using for loop we can reverse the string
		
		System.out.println("Maximum Number that can be formed (Using for loop): ");
		for(int i = ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
			
		}
	}
}
