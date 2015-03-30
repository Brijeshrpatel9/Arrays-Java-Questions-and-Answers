
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
