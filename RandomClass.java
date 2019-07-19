import java.util.Random;

public class RandomClass
{
	public static void main( String[] args )
	{
		Random randy = new Random();
		
		System.out.println((int)Math.random() * 100); //we want a number between 0 and 100. below we will cast it	
		System.out.println((int)Math.random() * 100);
		System.out.println((int)Math.random() * 100);
		System.out.println((int)Math.random() * 100);
		System.out.println((int)Math.random() * 100);
		System.out.println((int)Math.random() * 100);
		System.out.println((int)Math.random() * 100);
		System.out.println((int)Math.random() * 100);
		
		/* System.out.println( randy.nextInt( 21 ) + 30 );
		System.out.println( randy.nextInt( 21 ) + 30 );
		System.out.println( randy.nextInt( 21 ) + 30 );
		System.out.println( randy.nextInt( 21 ) + 30 );
		System.out.println( randy.nextInt( 21 ) + 30 ); */
		
		
		/* System.out.println( randy.nextInt() );
		System.out.println( randy.nextInt() );
		System.out.println( randy.nextInt() );

		System.out.println( randy.nextInt( 4 ) );
		System.out.println( randy.nextInt( 4 ) );
		System.out.println( randy.nextInt( 4 ) );
		System.out.println( randy.nextInt( 4 ) ); */
	}
}