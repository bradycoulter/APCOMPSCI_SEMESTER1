import java.lang.Math.*;
public class distance
{
	private int X1, Y1, X2, Y2;
	private double distance;
	public distance()
	{
		X1 = 0;
		Y1 = 0;
		X2 = 0;
		Y2 = 0;
		distance = 0;
	}
	
	public distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		X1 = xOne;
		Y1 = yOne;
		X2 = xTwo;
		Y2 = yTwo;
		distance = 0;
	}
	
	public void setValues(int xOne, int yOne, int xTwo, int yTwo)
	{
		X1 = xOne;
		Y1 = yOne;
		X2 = xTwo;
		Y2 = yTwo;
		distance = 0;
	}
	
	public double getDistance()
	{
		distance = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		return distance;
	}
}