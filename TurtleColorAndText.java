import edu.uweo.javaintro.tools.Turtle;

public class TurtleColorAndText
{
	public static void main( String [] args )
	{
		Turtle toots	= new Turtle();
		toots.switchTo( Turtle.RED );
		toots.swingAround (50);
		//toots.fillCircle( 64 );
		
		toots.switchTo( Turtle.BLUE );
		toots.fillBox(40, 50);
		
		toots.switchTo(Turtle.BLACK);
		toots.say("Turtles are cool");
		
		
		
	}
}