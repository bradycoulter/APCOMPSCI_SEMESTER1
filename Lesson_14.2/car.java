public class car implements Location
{
	double[] loc;
	public final int ID = (int)(Math.random() * 10000000);
	
	public car()
	{
		loc = new double[2];
	}
	public int getID()
	{
		return  ID;
	}
	
	public void move(double x, double y)
	{
		loc[0]+=x;
		loc[1]+=y;
	}
	
	public double[] getLoc()
	{
		double[] locat = loc;
		return locat;
	}
}