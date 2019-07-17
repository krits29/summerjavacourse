import javax.swing.JOptionPane;

public class JOptionEqualStrings
{
	public static void main ( String[] args )
	{
		String phrase1 = JOptionPane.showInputDialog(null, "type in a word or a phrase");
		String phrase2 = JOptionPane.showInputDialog(null, "type in another word or phrase");
		
		if (phrase1.equals("") || phrase2.equals(""))
		{
			JOptionPane.showMessageDialog(null, "Stop fooling around. Try again.");
		}
		else if(phrase1.equals(phrase2))
		{
			JOptionPane.showMessageDialog(null, "they're equal");
		}
		else if(!phrase1.equals(phrase2))
		{
			JOptionPane.showMessageDialog(null, "they're different");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Whoops. Something went wrong");
		}
	}
}
