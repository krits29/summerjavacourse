import javax.swing.JOptionPane;

public class JOptionInput
{
	public static void main ( String[] args )
	{
		String text = JOptionPane.showInputDialog(null, "enter your name");
		if (text == null)
		{
			JOptionPane.showMessageDialog(null, "Be that way");
		}
		else if (text.equals(""))
		{
			JOptionPane.showMessageDialog(null, "you don't know what your name is???");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "your name is " + text);
		}
	}
}
