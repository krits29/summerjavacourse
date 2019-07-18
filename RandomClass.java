import java.util.Random;

public class RandomClass
{
	public static void main( String[] args )
	{
		Random randy = new Random();
		
		System.out.println( randy.nextInt() );
		System.out.println( randy.nextInt() );
		System.out.println( randy.nextInt() );

		System.out.println( randy.nextInt( 4 ) );
		System.out.println( randy.nextInt( 4 ) );
		System.out.println( randy.nextInt( 4 ) );
		System.out.println( randy.nextInt( 4 ) );
	}
}