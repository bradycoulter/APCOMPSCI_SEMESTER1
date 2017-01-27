public class user
{
	static private String fName;
	static private String lName;
	static private String avatar;
	private int userID;
	
	//public user()
	//{
		//fName = "";
		//lName = "";
		//avatar = "";
		//userID = 0;
	//}
	
	public user(String f, String l)
	{
		fName = f;
		lName = l;
		avatar = " ";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public user(String f, String l, String a)
	{
		fName = f;
		lName = l;
		avatar = a;
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public void setValues(String f, String l, String a)
	{
		fName = f;
		lName = l;
		avatar = a;
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + fName +
                           "\nLast Name: " + lName +
                           "\nAvatar: " + avatar +
                           "\nUser ID#: " + userID;
	}
}