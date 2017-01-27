import java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double MPH;
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		MPH = 0;
	}
	
	public MilesPerHour(int d, int hrs, int mins)
	{
		distance = d;
		hours = hrs;
		minutes = mins;
		MPH = 0;
	}
	
	public void setValues(int d, int hrs, int mins)
	{
		distance = d;
		hours = hrs;
		minutes = mins;
		MPH = 0;
	}
	
	public double getMPH()
	{
		MPH = Math.round(distance / (hours + minutes / 60.0));
		return MPH;
	}
}