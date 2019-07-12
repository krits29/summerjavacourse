import edu.uweo.javaintro.tools.Turtle;

public class TurtleHouse
{
	public static void main( String [] args )
	{
		Turtle tutt		= new Turtle();
		tutt.paint(90, 150);
		tutt.paint(-90, 200);
		tutt.paint(-90, 150);
		tutt.paint(-90, 200);
		tutt.paint(-180, 75);
		tutt.paint(90, 60);
		tutt.paint(-90, 45);
		tutt.paint(-90, 60);
		tutt.move(90, 20);
		tutt.move(90, 80);
		tutt.paint(0, 30);
		tutt.paint(-90, 40);
		tutt.paint(-90, 30);
		tutt.paint(-90, 40);
		tutt.move(0, 85);
		tutt.paint(0, 40);
		tutt.paint(-90, 30);
		tutt.paint(-90, 40);
		tutt.paint(-90, 30);
		
	}
}