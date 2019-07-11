import edu.uweo.javaintro.tools.Vic;

public class IfElseStatements
{
	public static void main (String [] args)
	{
		Vic.reset(args);
		/*Vic test = new Vic();
		if (Vic.stackHasCD())
			Vic.say("has CD");
		else
			Vic.say("horse");*/
		
		Vic test = new Vic();
		if(test.seesSlot())
		{
			test.putCD();
			test.moveOn();
		}
		else{
			test.takeCD();
		}
		
		VicDowner downee = new VicDowner();
		downee.downShift();
	}
}