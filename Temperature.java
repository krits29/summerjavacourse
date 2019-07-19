import java.util.Random;

public class Temperature
{
	private double Celsius;
	private double Fahrenheit;

/* 	public Temperature()
	{
		Celsuis = "none";
	} */
	
	public Temperature( double temp )
	{
		Celsius = temp;
	}
	
	public Temperature( double temp, String scale)
	{
		if (scale.substring(0,1).equals("C"))
		{
			Celsius = temp;
		}
		else
		{
			Celsius = FahrenheitToCelsius( temp );
		}
	}
	
	public static double FahrenheitToCelsius( double Fahrenheit )
	{
		double Celsius = (Fahrenheit - 32) * 5.0 / 9.0;
		return Fahrenheit;
	}
	
	public static double CelsiusToFahrenheit( double Celsius )
	{
		double Fahrenheit = ((Celsius * 9.0 / 5.0) + 32.0);
		return Celsius;
	}
	
	public double getCelsius()
	{
		return Celsius;
	}
	
	public double getFahrenheit()
	{
		return Fahrenheit;
	}	
	
	public double setCelsius( double temp )
	{
		this.Celsius = Celsius;
		return Celsius;
	}
	
	public double setFahrenheit( double temp )
	{
		this.Fahrenheit = Fahrenheit;
		//Celsius = FarhenheitToCelsius( temp );
		return Fahrenheit;
	}
	
}