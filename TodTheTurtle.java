import edu.uweo.javaintro.tools.Turtle;
import edu.uweo.javaintro.tools.Turtlet;

public class TodTheTurtle extends Turtle
{
	public static void main ( String[] args )
	{
		TodTheTurtle tod = new TodTheTurtle();
		tod.paint( 45, 128 );
	}
	
	public TodTheTurtle()
	{
		switchTo(Turtle.RED);
		fillCircle(32);
		Turtle.sleep(800);
		switchTo(Turtle.BLACK);
		fillCircle(32);
	}
	
	// Signature: paint( double, double )
	//overrides paint ( double, double )
	
	public Turtlet paint(double angle, double distance)
	{
		super.paint( angle, distance );
		say("Happy");
		return this;
	}
}