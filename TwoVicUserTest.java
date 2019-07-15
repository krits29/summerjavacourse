import edu.uweo.javaintro.tools.Vic;

public class TwoVicUserTest
{
	public static void main ( String[] args )
	{
		Vic.reset(args);
		TwoVicUser vicky = new TwoVicUser();
		Vic timmy = new Vic();
		
		/*if ( vicky.hasAsManySlotsAs( timmy ))
		{
			Vic.say("same # of slots");
		}
		else
		{
			Vic.say("different # of slots");
		} */
		
		/* String vicPos1 = vicky.getPosition();
		vicky.moveOn();
		String vicPos2 = vicky.getPosition();
		
		vicky.moveOn();
		if (vicky.isAtOneGivenPosition( vicPos1, vicPos2 ))
		{
			Vic.say("at one of the positions");
		}
		else
		{
			Vic.say("ooops");
		} */
		
		vicky.moveToCorrespondingSlot(timmy);
		
		for (; timmy.seesSlot(); timmy.moveOn())
		{
			//nothing
		}
		
	} 
	
	private static void goToEnd( Vic param )
		{
			for (; param.seesSlot() ;)
			{
				param.moveOn();
			}
		}
	
}