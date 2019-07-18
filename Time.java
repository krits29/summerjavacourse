public class Time
{
	int hour = 0;
	int min = 0;
	
	public Time( int hour, int min )
	{
		this.hour = hour;
		this.min = min;
	}
	
	// this is called a copy constructor
	// the value of the new object will be copied from the parameter
	public Time( Time time )
	{
		this.hour = time.hour;
		this.min = time.min;
	}
	
	//overriding Object.toString()
	public String toString()
	{
		String sHour = hour < 10 ? "0" : "";
		String sMin = min < 10? "0" : "";
		String time = sHour + hour + sMin + min;
		if (hour < 10)
		{
			time = "0" + time;
		}
		return time;
	}
	
	public Time add( Time toAdd )
	{
		int newHour = toAdd.hour + this.hour;
		int newMin  = toAdd.min + this.min;
		
		newHour = newHour + newMin / 60;
		newMin = newMin % 60;
		newHour = newHour % 24;
		
		// hour = this.hour + toAdd.hour
		// new Min = this.min + toAdd.min
		Time result = new Time( newHour, newMin );
		return result;
	}
	
	/* public Time add(Time that)
	{
		String aHour = hour;
		String aMin = min;
		String time = aHour + hour + aMin + min;
		if ((aHour + hour) > 24)
		{
			time = aHour + hour - 24 + aMin + min;
		}
	} */
}









//     |\  | -----       ------   ----- |     |  -----   ----- |       |
//     | \ ||     |     |______  |      |_____| |     | |     ||       |
//     |  \||_____|      ______| |_____ |     | |_____| |_____||_____  O
