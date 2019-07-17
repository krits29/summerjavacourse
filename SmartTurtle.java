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
	
	public void SpiralAnimation()
	{
		for(int val = 0; val < 40; val++)
		{
			switchTo( Turtle.GREEN );
			fillCircle( 60 ); 
			Turtle.sleep( 200 );
			move(0, 30);
			move(10, 15);
			move(25, 5);
			switchTo( Turtle.BLUE );
			fillCircle( 60 );
			Turtle.sleep( 200 );
			move(0, 30);
			move(10, 15);
			move(25, 5);
		}
	}
	
	public void BoxSpiral()
	{		
		for(int inx = 0; inx < 80; inx++)
		{
			paint(90, (inx * 8));
			Turtle.sleep( 200 );
		}
	}
} 
