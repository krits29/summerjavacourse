import edu.uweo.javaintro.tools.Vic;

public class StringsCompareTo
{
	public static void main (String[] args)
	{
		analyze( "Zulu", "Albatross" );
		analyze( "Market", "market" );
		analyze( "200", "30");
		analyze( "400", "40");
	}
	
	private static void testGuess( String str1, String str2 )
	{
		int result = str1.compareTo(str2);
		String relation = null;
		if (result == 0)
		{
			relation = "equals";
		}
		else if (result < 0)
		{
			relation = "less than";
		}
		else
		{
			relation = "greater than";
		}
	}
}