import edu.uweo.javaintro.tools.Vic;

public class VicShifterTest
{
	public static void main( String[] args )
	{
		Vic.reset( args );
		Shifter shifty = new Shifter();
		shifty.shiftThreeToFive();
	}
}