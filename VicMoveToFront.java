import edu.uweo.javaintro.tools.Vic;

public class VicMoveToFront

{
	public static void main (String[] args)
	{
		Vic.reset( args );
		Vic tim = new Vic();
		
		String pos = tim.getPosition();
		
		while (tim.seesSlot())
		{
			if(tim.seesSlot())
			{
				tim.takeCD();
			}
			tim.moveOn();
		}	
		
		while (!tim.getPosition().equals(pos))
		{
			tim.backUp();
		}
		
		while (Vic.stackHasCD())
		{
			tim.putCD();
			tim.moveOn();
		}
	} 
	
	
}