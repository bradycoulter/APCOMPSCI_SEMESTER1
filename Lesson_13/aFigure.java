public class aFigure
{
	public aFigure()
	{
		super();
	}
	
	public bill(String n)
	{
		super(n);
	}
	
	public String getType()
	{
		return aFigure;
	}
	
	public String toString()
	{
		return "aFigure: " + aFigure + "\n" +
				super.toString();
	}
}