import javax.swing.JOptionPane;

public class BasicGame
{
	private String secretWord = "duck";
	private String usersGuess = "none";
	
	public void playOneGame()
	{
		askUsersFirstChoice();
		while (shouldContinue())
		{
			showUpdatedStatus();
			askUsersNextChoice();
		}
		showFinalStatus();
	}
	
	public void playManyGames()
	{
		int again = 0;
		do
		{
			playOneGame();
			again = JOptionPane.showConfirmDialog( null, "again?");
		}while (again == JOptionPane.YES_OPTION);
	}
	
	public void askUsersFirstChoice()
	{
		usersGuess = JOptionPane.showInputDialog( null, "guess the word");
	}
	
	public void askUsersNextChoice()
	{
		askUsersFirstChoice();
	}
	
	public boolean shouldContinue()
	{
		boolean rval = !usersGuess.equals( secretWord );
		return rval;
	}
	
	public void showUpdatedStatus()
	{
		String msg = "That was wrong. Hint: it quacks!";
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void showFinalStatus()
	{
		String msg = "That was right! Congrats!";
		JOptionPane.showMessageDialog(null, msg);
	}
}