public abstract class toy
{
	private String name;
	private int count;
	
	public toy
	{
		this.name = "";
		this.count = 1;
	}
	public toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	
	public abstract getType();
	{
		
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
}