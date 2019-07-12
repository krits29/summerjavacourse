import edu.uweo.javaintro.tools.Vic;

public class SmartVicMovingAround
{
	public static void main( String[] args )
	{
		Vic.reset( args );
		SmartVic 	slots = new SmartVic();
		slots.move2();
		slots.moveTake();
		slots.move2();
		slots.putCD();
		
	}
}