public class SmartTurtleTenSquares
{
	public static void main( String[] args )
	{
		SmartTurtle pins = new SmartTurtle();
		pins.makeBigSquare();
		pins.move(0, 60);
		pins.makeBigSquare();
		pins.move(0, 60);
		pins.makeBigSquare();
		pins.move(0, 60);
		pins.makeBigSquare();
		pins.move(90, 90);
		pins.move(90, 70);
		pins.makeBigSquare();
		pins.move(0, 60);
		pins.makeBigSquare();
		pins.move(0, 60);
		pins.makeBigSquare();
		
		/*SmartTurtle alec	= new SmartTurtle();
		alec.swingAround( 64 );
		alec.move( 90, 60 );
		alec.makeBigSquare();*/
	}
}