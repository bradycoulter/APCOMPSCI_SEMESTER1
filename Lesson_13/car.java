public class car
{
	public car()
	{
		super();
	}
	
	public car(String n)
	{
		super(n);
	}
	
	public String getType()
	{
		return car;
	}
	
	public String toString()
	{
		return "car: " + car + "\n" +
				super.toString();
	}
}