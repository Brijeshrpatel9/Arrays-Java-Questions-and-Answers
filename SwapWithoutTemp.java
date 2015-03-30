
public class SwapWithoutTemp {

	public static void main(String argv[])
	{
		int a = 7;
		int b = 4;
		System.out.println("a and b before swap: a is " + a + " b is " + b);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("a and b after swap: a is " + a + " b is " + b);
		
	}
}
/*
Problem

Swap two integers without using a temp variable.

Solution


We will use some excellent property of XOR to solve this. 
If we xor two numbers then the result will give you back the original numbers when again xor ed with the other number. 
So if ANS=A XOR B then ANS XOR A = B and ANS XOR B = A.

*/
