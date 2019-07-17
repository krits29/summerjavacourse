import edu.uweo.javaintro.tools.Turtle;
import java.awt.Color;

public class BoxTurtle extends Turtle
{
	public BoxTurtle(int side)
	{
		fillBox(side, side);
	}
	
	
	//overloads BoxTurtle( int )
	public BoxTurtle(int side, Color color)
	{
		switchTo( color );
		fillBox(side, side);
	}
}