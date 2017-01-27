import java.util.Scanner;
public class userRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fName = kb.next();
		System.out.println("Please enter your last name: ");
		String lName = kb.next();
		
		System.out.println("Do you want to use a public avatar?");
		String choice = kb.next();
		if(choice.equals("no"))
		{
			user pH1 = new user(fName, lName);
			System.out.println(pH1);
		}
		else
		{
			System.out.println("Please enter your avatar: ");
			String avatar = kb.next();
			user pH2 = new user(fName, lName, avatar);
			System.out.println(pH2);
		}
	}
}