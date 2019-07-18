public class TimeTest
{
	public static void main(String[] args)
	{
		Time time1 = new Time( 15, 25 );
		Time time2 = new Time( 11, 55);
		Time time3 = time1.add( time2 );
		
		System.out.println( time1 );
		System.out.println( time2 );
		System.out.println( time3 );
		
		//printTime( 4, 132, 75 );
		
	}
	
	/* private static void printTime( int hours, int mins, int secs )
	{
		int actSecs  = secs;
		int actMins  = mins;
		int actHours = hours;
		
		actMins = actMins + actSecs / 60;
		actSecs = actSecs % 60;
		actHours = actMins + actMins / 60;
		actMins = actMins % 60;
		actHours = actHours % 24;
		
		System.out.println( actHours + ":" + actMins + ":" + actSecs );
		
	} */
}