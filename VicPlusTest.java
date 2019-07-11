import edu.uweo.javaintro.tools.Vic;

public class VicPlusTest
{
	public static void main (String[] args)
	{
		Vic.reset(args);
		VicPlus pluto	= new VicPlus();
		
		/*if(pluto.canTakeCD())
			Vic.say("can take CD");
		else 
			Vic.say("Elephant");
		
		if ( pluto.seesSlot())
			pluto.moveOn();
		if(pluto.hasNoSlot())
			Vic.say("no Slot");
		else
			Vic.say("unicorn");
		
		if (pluto.canPutCD())
			Vic.say("can put CD");
		elseVic.say("pig");*/
		
		pluto.toLastSlot();
	}
}