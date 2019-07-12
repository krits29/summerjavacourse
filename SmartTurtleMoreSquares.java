public class SmartTurtleMoreSquares
{
	public static void main( String[] args )
	{
		SmartTurtle nerd = new SmartTurtle();
		nerd.makeBigSquare();
		nerd.move(0, 50);
		nerd.makeBigSquare();
		
		SmartTurtle nerdy = new SmartTurtle();
		nerdy.move( 90, 25);
		nerdy.move( 90, 25);
		nerdy.makeSmallSquare();
		nerdy.move( 180, 60 );
		nerdy.move( -90, 25);
		nerdy.move( 180, 25);
		nerdy.makeSmallSquare();
	}
}