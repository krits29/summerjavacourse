import javax.swing.JOptionPane;

public class JOptionConfirm
{
	public static void main ( String[] args )
	{
		String message = "are you sure?";
		int result = JOptionPane.showConfirmDialog( null, message );
		
		if (result == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "All data will be lost");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Whatever");
		}
	}
}
