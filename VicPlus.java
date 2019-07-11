import edu.uweo.javaintro.tools.Vic;

public class VicPlus extends Vic
{
	public void removeAllCDs()
	{
		while (seesSlot())
		{
			if(seesCD())
				takeCD();
				moveOn();
		}
	}
	
	public void toLastSlot()
	{
		while (seesSlot())
		{
			moveOn();
		}
	}
	
	public boolean hasNoSlot()
	{
		return !seesSlot();
	}
	public boolean canTakeCD()
	{
		/* boolean rval	= false;
		if( seesSlot() && seesCD() )
				rval = true;
			return rval; */
		return seesSlot() && seesCD();
	}
	
	public boolean canPutCD()
	{
		boolean rval = false;
		if (seesSlot())
			if(!seesCD())
				rval = true;
		return rval;
	}
	
	public void putNextAvailable()
	{
		if(!seesCD())
		{
			putCD();
		}
		else
		{
			moveOn();
			putCD();
		}
	}
	
	public void putNextAvailableOrig()
	{
		if(canPutCD())
			putCD();
		else
		{
			if(seesSlot())
			{
				moveOn();
			}
		}
	}
}