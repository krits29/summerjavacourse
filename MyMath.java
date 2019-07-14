public class MyMath
{
	public int add (int a, int b)
	{
		return a + b;
		
	}

	public static void main (String[] args)
	{
		MyMath plus = new MyMath();
		int result = 0;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		result = plus.add(a, b);
		System.out.println (result);
	}
}
