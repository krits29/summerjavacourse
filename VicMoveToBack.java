import edu.uweo.javaintro.tools.Vic;

public class VicMoveToBack

{
public static void main (String[] args)
	{
		Vic.reset( args );
		Vic tim = new Vic();
		
		String pos = tim.getPosition();
		
		while (tim.seesSlot())
		{
			tim.moveOn();
		}	
		
		while (!tim.getPosition().equals(pos))
		{
			tim.backUp();
			if(tim.seesCD())
			{
				tim.takeCD();
			}
		}
		
		while (tim.seesSlot())
		{
			tim.moveOn();
		}
		
		while (!tim.getPosition().equals(pos))
		{
			tim.backUp();
			if(tim.seesSlot())
			{
				tim.putCD();
			}
		}
	}
	
}