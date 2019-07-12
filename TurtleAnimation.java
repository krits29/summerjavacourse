import edu.uweo.javaintro.tools.Turtle;

public class TurtleAnimation
{
	public static void main( String [] args )
	{
		Turtle toots	= new Turtle();
		
		
		toots.switchTo( Turtle.GREEN );
		toots.fillCircle( 60 ); 
		Turtle.sleep( 500 );
		toots.move(0, 128);
		toots.switchTo( Turtle.BLUE );
		toots.fillCircle( 60 );
		toots.switchTo( Turtle.GREEN );
		toots.fillCircle( 60 ); 
		Turtle.sleep( 500 );
		toots.move(0, -128);
		toots.switchTo( Turtle.BLUE );
		toots.fillCircle( 60 );
		
	}
}