public class TemperatureTest
{
	public static void main(String[] args)
	{
		Temperature temp1 = new Temperature( 54 );
		Temperature temp2 = new Temperature( 32 );
		System.out.println( "temperature 1 = " + temp1.getCelsius() + " C");
		System.out.println( "temperature 2 = " + temp2.getCelsius() + " C"); 
	}
}