import edu.uweo.javaintro.tools.Vic;

public class VicPrivateLoopertest
{
	public static void main (String[] args)
	{
		Vic.reset (args);
		VicPrivateLooper loopy = new VicPrivateLooper();
		//loopy.fillOddSlots();
		
		if (loopy.seesAllFilled())
		{
			Vic.say ("loopy sees all filled");
		}
		else 
		{
			Vic.say ("loopy sad");
		}
		
	}
}