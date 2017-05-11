public abstract class ticket
{
	private double price;
	private int serialNo;
	public ticket()
	{
		serialNo = (int)(Math.random() * 10000000);
	}
	public int getSerialNo()
	{
		return serialNo;
	}
	public abstract double getPrice();
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}