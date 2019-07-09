import edu.uweo.javaintro.tools.Turtle;

public class FirstTurtle
{
	public static void main( String [] args )
	{
		Turtle tutt		= new Turtle();
		tutt.paint(45, 128);
		tutt.paint(-45, 256);
		tutt.paint(-135, 256);
		tutt.move(-45, 128);
		tutt.paint(-90, 64);
		tutt.swingAround(64); 
	}
}