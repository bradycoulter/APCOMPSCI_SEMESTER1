import java.util.Scanner;
public class GMC implements Location
{
	private double X, Y;
	public GMC()
	{
		X = 0;
		Y = 0;
	}
	public GMC(double x, double y)
	{
		X = 0;
		Y = 0;
		move(x, y);
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	public void move(double x, double y)
	{
		X+=x;
		Y+=y;
	}
	public double[] getLoc()
	{
		double [] loc = new double[2];
		loc[0] = X;
		loc[1] = Y;
		return loc;
	}
}