import javax.swing.JOptionPane;

public class Person
{
	private String firstName;
	private String lastName;
	
	public Person()
	{
		firstName = "none";
		lastName = "none";
	}
	
	public Person (String firstName, String LastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName( String name )
	{
		firstName = name;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName( String name )
	{
		firstName = name;
	}

	public String getLastName()
	{
		return firstName;
	}

	public String toString()
	{
		String str = lastName + ", " + firstName;
		return str;
	} 

}