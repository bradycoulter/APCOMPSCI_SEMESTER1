public class advance extends ticket
{
	private int daysLeft;
	public advance()
	{
		super();
		daysLeft = 0;
	}
	public advance(int d)
	{
		super();
		daysLeft = d;
	}
	public double getPrice()
	{
		if(daysLeft >= 10)
			return 30.00;
		else return 40.00;
	}
}