import javax.swing.JOptionPane;

public class ParseInt
{
	public static void main (String[] args)
	{
		String sNum = JOptionPane.showInputDialog( null, "enter a number");
		
		System.out.println( sNum );
		
		try 
		{
			int num = Integer.parseInt( sNum );
			System.out.println( sNum );
		}
		catch (NumberFormatException exc)
		{
			System.out.println("\"" +sNum + "\" is not a number");
		}
		
		
	}
}