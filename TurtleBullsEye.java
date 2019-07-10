import edu.uweo.javaintro.tools.Turtle;

public class TurtleBullsEye
{
	public static void main( String[] args )
	{
		Turtle bull = new Turtle();
		bull.switchTo( Turtle.RED );
		bull.fillCircle(128 );
		bull.switchTo( Turtle.YELLOW );
		bull.fillCircle( 96 );
		bull.switchTo( Turtle.BLUE );
		bull.fillCircle( 64 );
		bull.switchTo( Turtle.BLACK );
		bull.fillCircle( 32 );
	}
}