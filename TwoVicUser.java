import edu.uweo.javaintro.tools.Vic;

public class TwoVicUser extends Vic
{
	public boolean hasAsManySlotsAs( Vic parm )
	{
		String pos = getPosition();
		while (seesSlot() && parm.seesSlot())
		{
			moveOn();
			parm.moveOn();
		}
		boolean result = !seesSlot() && !parm.seesSlot();
		
		while (!pos.equals( getPosition()))
		{
			backUp();
			parm.backUp();
		}
		
		return result;
	}
	
	public void moveToCorrespondingSlot( Vic param )
	{
		String pos = getPosition();
		while (seesSlot() && param.seesSlot())
		{
			if (seesCD())
			{
				takeCD();
				param.putCD();
			}
			moveOn();
			param.moveOn();
		}
		while (!pos.equals( getPosition()))
		{
			backUp();
			param.backUp();
		}
	}	
	
	public boolean isAtOneGivenPosition( String pos1, String pos2 )
	{
		String pos = getPosition();
		boolean result = false;
		if (pos.equals( pos1 ) || pos.equals( pos2 ))
		{
			result = true;
		}
		
		return result;
	}
	
}