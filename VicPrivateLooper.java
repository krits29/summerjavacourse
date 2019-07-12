import edu.uweo.javaintro.tools.Vic;

public class VicPrivateLooper extends Vic
{
	public void clearSlotsToStack()
	{
		String firstPos = getPosition();
		while (seesSlot())
		{
			if (seesCD())
			{
				takeCD();
			}
			moveOn();
		}
		backUpTo(firstPos);
	}
	
	public boolean seesAllFilled()
	{
		String firstPos = getPosition();
		while (seesSlot() && seesCD())
		{
			moveOn();
		}
		
		boolean result = !seesSlot();
		backUpTo (firstPos);
		return result;
	}
	
	public void fillOddSlots()
	{
		String pos = getPosition();
		while ( seesSlot() && stackHasCD() )
		{
			putCD();
			moveOn();
		if ( seesSlot() );
		{
			moveOn();
		}
		}
		backUpTo( pos );
	}
	
	public void fillSlots()
	{
		String pos = getPosition();
		while(seesSlot())
		{
			putCD();
			moveOn();
		}
		//backUpTo(firstPos);
	}
	
	private void backUpTo (String pos)
	{
		while (!pos.equals(getPosition()))
		{
				backUp();
		}
	}

}