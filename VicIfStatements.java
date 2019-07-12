import edu.uweo.javaintro.tools.Vic;

public class VicIfStatements
{
	public static void main( String[] args )
	{
		Vic.reset( args );
		Vic.say("An appropriate message");
		Vic seq1	= new Vic();
		Vic seq2	= new Vic();
		if (Vic.stackHasCD())
		{
			if(seq2.seesSlot())
			{
				seq2.moveOn();
				if(seq2.seesSlot())
				{
					seq2.moveOn();
					if (seq2.seesSlot())
					{
						seq2.putCD();
						if(Vic.stackHasCD())
						{
							seq2.moveOn();
							if(seq2.seesSlot())
								seq2.putCD();
						}
					}
				}	

			}
		}
	}
}