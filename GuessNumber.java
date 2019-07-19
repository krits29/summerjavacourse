import java.util.Random;
import javax.swing.JOptionPane;

public class GuessNumber extends BasicGame
{
	private Random rand;
	private int secretNumber;
	private int usersNumber;
	
	//constructor 
	public GuessNumber()
	{
		rand = new Random();
	}
	
	//Override 
	public void askUsersFirstChoice()
	{
		secretNumber = 35 ; //rand.nextInt( 100 ) + 1;
		askUsersNextChoice();
	}
	
	public void askUsersNextChoice()
	{
		String prompt = "Enter a number between 1 and 100";
		String input = JOptionPane.showInputDialog( null, prompt);
		if (input == null || input.equals(""))
		{
			usersNumber = -1;
		}
		else
		{
			usersNumber = Integer.parseInt( input );
		}
	}
	
	//override
	public boolean shouldContinue()
	{
		int diff = Math.abs( usersNumber - secretNumber ); // Math.abs computes the absolute value of a number
		//boolean rval = usersNumber !=secretNumber;
		if (diff < 0)
		{
			diff = -diff;
		}
		
		boolean rval = diff > 2;
		return rval;
	}
	
	//override
	public void showUpdatedStatus()
	{
		String msg = null;
		if (usersNumber < secretNumber )
		{
			msg = "Too low";
		}
		else
		{
			msg = "Too high";
		}
		JOptionPane.showMessageDialog( null, msg );
	}
}