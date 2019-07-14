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

	public void fillOneSlot()
	{
		if (seesSlot() && !seesCD())
		{
			moveOn();
		}		

		while (seesSlot() && seesCD())
		{
			moveOn();
		}
			putCD();
			Vic.say("Found next available slot and put a CD");
	}
	
	public void toLastSlot()
	{
		while (seesSlot())
		{
			moveOn();
		}
		backUp();
	}
	
	public boolean lastIsFilled()
	{
		boolean result = true;
		
		while (seesSlot())
		{
			moveOn();
		}
		backUp();
		
		if (seesCD())
		{
			Vic.say ("last slot is filled");
		}
		else
		{
			Vic.say ("last slot is open");
		}
		
		return result;
	}
	
	public boolean goToFirstEmpty()
	{
		while (seesSlot() && seesCD())
		{
			moveOn();
		}
		
		Vic.say("at first empty slot");
		
		boolean result = seesSlot();
		return result;
	}
	
	public boolean goToFirstFilled()
	{
		while (seesSlot() && !seesCD())
		{
			moveOn();
		}
		
		Vic.say("at first filled slot");
		
		boolean result = seesSlot();
		return result;
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
	
	public void fillFirstEmptySlot()
	{
		String pos = getPosition(); //remembers the original position
		
		while (seesCD())
		{
			moveOn();
		}
		putCD();
		
		while (!getPosition().equals(pos))
		{
			backUp();
		}
	
	}
	
	public void fillLastEmptySlot()
	{
		String position = getPosition();
		
		while (seesSlot())
		{
			moveOn();
		}
		backUp();
		
		
		while ( seesCD() && !getPosition().equals(position))
		{
			backUp();
		}
		
		if (!seesCD())
		{
			putCD();
		}
		
		while (!position.equals(getPosition()))
		{
			backUp();
		}
	}
	
	
	public boolean goToLastCD()
	{
		boolean result = false;
		String pos = getPosition();
		while (seesSlot())
		{
			if (seesCD())
			{	
				result = true;
				pos = getPosition();
			}
			moveOn();
		}
		
		while (!getPosition().equals(pos))
		{
			backUp();
		}
		
		return result;
	}
	
	public boolean hasSomeFilledSlot()
	{
		String pos = getPosition();
		
		while (seesSlot() && !seesCD())
		{
			moveOn();
		}
		
		boolean result = seesSlot();
		while (!getPosition().equals(pos))
		{
			backUp();
		}
		
		return result;
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
	
	public void takeOneBefore()
	{
		backUp();
		while (!seesCD()) //! means opposite, in this case it means 'not'
		{
			backUp();
		}
		takeCD();
		
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
