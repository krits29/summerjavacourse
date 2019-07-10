import edu.uweo.javaintro.tools.Vic;

public class SmartVic extends Vic
{
	public void moveTake()
	{
		moveOn();
		takeCD();
	}
	
	public void backPut()
	{
		backUp();
		putCD();
	}
	public void move2()
	{
		moveOn();
		moveOn();
	}
}