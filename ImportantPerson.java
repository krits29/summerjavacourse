import javax.swing.JOptionPane;

public class ImportantPerson extends Person
{
	private String birthday;
	private String firstName;
	private String lastName;
		
	public ImportantPerson()
	{
		birthday = "none";
	}
	
	public ImportantPerson( String first, String last )
	{
		super( first, last );
		birthday = "none";
	}
	
	public ImportantPerson( String first, String last, String birth)
	{
		setFirstName( first );
		setLastName( last );
		setBirthday( birth );
	}
	
	public void setBirthday( String birthday )
	{
		this.birthday = birthday;
	}
	
	public String getBirthday()
	{
		return birthday;
	}
	
	public void setName( String first, String last, String birthday )
	{
		setFirstName( first);
		setLastName ( last );
		setBirthday( birthday );
	}
	
	public String toString()
	{
		String name = super.toString() + ": " + birthday;
		return name;
	}
	
	public void getName( String first, String last, String birthday)
	{
		first = firstName;
		last = lastName;
	}
}
