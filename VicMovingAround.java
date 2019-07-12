import edu.uweo.javaintro.tools.Vic;

public class VicMovingAround
{
	public static void main( String[] args )
	{
		Vic.reset( args );
		Vic me = new Vic();
		
		/* EXAMPLE 3
		me.moveOn();
		me.moveOn();
		me.takeCD();
		me.backUp();
		me.backUp();
		me.putCD();
		*/
		
		/* EXAMPLE 2
		me.putCD();
		me.moveOn();
		me.putCD();
		me.moveOn();
		me.putCD();
		*/
		
		me.moveOn();
		me.moveOn();
		me.takeCD();
		me.backUp();
		me.backUp();
		me.putCD();
		me.moveOn();
		me.takeCD();
		me.moveOn();
		me.putCD();
		me.backUp();
		me.backUp();
		me.takeCD();
		me.moveOn();
		me.putCD();
		
	}
}