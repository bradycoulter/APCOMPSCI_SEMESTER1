public class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = "null";
		this.serialNo = 1;
	}
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random()*10000000);
	}
	public String getPlatform()
	{
		return this.platform;
	}
	
	public int getSerialNo()
	{
		return this.serialNo;
	}
}