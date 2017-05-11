public class Toyota implements Location
{
	private double[] loc;
	public Toyota()
	{
		loc = new double[2];
	}
	public Toyota(String xy)
	{
		loc = new double[2];
		String[] split = xy.split(", ");
		move((Double.parseDouble(split[0])), (Double.parseDouble(split[1])));
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	public void move(double x, double y)
	{
		loc[0]+=x;
		loc[1]+=y;
	}
	public double[] getLoc()
	{
		double[] locat = loc;
		return loc;
	}
}