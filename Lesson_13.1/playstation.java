public class playstation extends Console
{
	public playstation()
	{
		super();
	}
	public playstation(String n)
	{
		super(n);
	}
	public String getPlatform()
	{
		return "PlayStation";
	}
	public String getController()
	{
		return "PS DualShock 3";
	}
	public String toString()
	{
		return super.toString();
	}
}