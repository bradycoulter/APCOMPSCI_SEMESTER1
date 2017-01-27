public class inventory
{
	static private String man;
	static private String name;
	static private String cat;
	private int UPC, price;
	
	//public user()
	//{
		//fName = "";
		//lName = "";
		//avatar = "";
		//userID = 0;
	//}
	
	public inventory(String m, String n)
	{
		man = m;
		name = n;
		UPC = (int)(Math.random() * 10000000) + 1;
	}
	public inventory(String m, String n, String c, int p)
	{
		man = m;
		name = n;
		cat = c;
		price = p;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	public String toString()
	{
		return "Item Info...\nItem name: " + name + 
							"\nItem manufactorer: " + man + 
							"\nItem category: " + cat + 
							"\nItem price: " + price + 
							"\nItem UPC#: " + UPC;
	}
}