import edu.uweo.javaintro.tools.Vic;

public class Shifter extends Vic
{
	public void shiftThreeToFive()
	{
		if (seesSlot())
		{
			moveOn();//position 2
			if (seesSlot())
			{
				moveOn();//position 3
				if(seesSlot())
				{
					if (seesCD())
					{
						takeCD();
						moveOn();//position 4
						if (seesSlot())
						{
							moveOn(); //position 5
							if(seesSlot())
								putCD();
						}
					}
				}
			}
		}
	}
}