import javax.swing.JOptionPane;
import edu.uweo.javaintro.tools.Turtle;

public class JOptionTest
{
	public static void main ( String[] args )
	{
		//NameInstanceVariables noma = new NameInstanceVariables();
		
		//noma.setFirstName("Kriti");
		//System.out.println(noma.getFirstName());
		
		//noma.setLastName("Sharma");
		//System.out.println(" ");
		//System.out.println(noma.getLastName());
		
		//Dog woofer = new Dog();
		//Poodle yipper = new Poodle();
		//woofer.showMessage("Feed me! ");
		//yipper.showMessage("I'm going to bite you ");
		//bark( yipper );
		
		//BoxTurtle box = new BoxTurtle (128);
		//Turtle.sleep(1000);
		//BoxTurtle boxy = new BoxTurtle(64, Turtle.RED);
		
		//Person zilla = new Person("George", "Washington");
		//System.out.println(zilla);
		
		ImportantPerson peep1 =  new ImportantPerson();
		ImportantPerson peep2 =  new ImportantPerson( "George", "Washington");
		ImportantPerson peep3 =  new ImportantPerson( "George", "Washington", "June 10");
		System.out.println( "peep1 " + peep1);
		System.out.println( "peep2 " + peep2);
		System.out.println( "peep3 " + peep3);
		
		peep1.setName( "Tom", "Jefferson", "May 15"); 
		
	}
	
	/* private static void bark( Dog param )
	{
		param.showMessage("bark");
	} */
}