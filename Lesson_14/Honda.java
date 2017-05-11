public class Honda implements Location
{
	private double X, Y;
	public Honda()
	{
		X = 0;
		Y = 0;
	}
	public Honda(double[] xy)
	{
		X = 0;
		Y = 0;
		move(xy[0], xy[1]);
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