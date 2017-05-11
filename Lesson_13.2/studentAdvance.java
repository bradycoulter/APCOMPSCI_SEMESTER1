public class studentAdvance extends advance
{
	public studentAdvance()
	{
		super();
	}
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice() + "\nStudent ID required" + "\n";
	}
}