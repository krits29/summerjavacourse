import edu.uweo.javaintro.tools.Vic;

public class VicDemo
{
	public static void main( String[] args )
	{
		Vic.reset( args );
		Vic one	= new Vic();
		Vic two	= new Vic();
		
		one.moveOn();
		two.moveOn();
		
		one.backUp();
		two.takeCD();
		
		one.putCD(); 
		
		Vic.say("Wow");
	}
}