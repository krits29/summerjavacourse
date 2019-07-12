import edu.uweo.javaintro.tools.Vic;

public class VicDowner extends Vic
{
	public void downShift()
	{
		if(seesSlot())
		{
			if(seesCD())
			{
				takeCD();
				moveOn();
				if(seesSlot())
				{
					if(!seesCD())
						putCD();
				}
			}
		}
	}
	
}