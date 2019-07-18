import java.util.Random;

public class GuessNumber extends BasicGame
{
	private Random rand;
	private int secretNumber;
	private int usersNumber;
	
	public GuessNumber()
	{
		rand = new Random();
	}
	
	//Override 
	public void askUsersFirstChoice();
	{
		secretNumber = rand.nextInt( 100 ) + 1;
		askUsersNextChoice();
	}
}