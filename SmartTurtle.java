import edu.uweo.javaintro.tools.Turtle;

public class SmartTurtle extends Turtle
{
	
	public void makeSmallSquare()
	{
		paint( 90, 10 );
		paint( 90, 10 );
		paint( 90, 10 );
		paint( 90, 10 );
	}
	
	public void makeBigSquare()
	{
		paint( 90, 40 );
		paint( 90, 40 );
		paint( 90, 40 );
		paint( 90, 40 );
	}
	
	public void makeHexagon()
	{
		paint(0, 30);
		paint(60, 30);
		paint(60, 30);
		paint(60, 30);
		paint(60, 30);
		paint(60, 30);
	}
} 
