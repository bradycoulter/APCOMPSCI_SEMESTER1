import java.util.Scanner;

public class ex_06
{
	static String userguess, passguess, username, password;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		username = "user1";
		password = "pass123";
		System.out.println("Please enter your username: ");
		userguess = kb.nextLine();
		System.out.println("Please enter your password: ");
		passguess = kb.nextLine();
		passCheck(username, password);
	}
	public static void passCheck(String username, String password)
	{
		if (userguess.equals(username) && passguess.equals(password))
			System.out.println("You are granted access!");
		else
			if(userguess.equals(username))
			{
				System.out.println("Your password is incorrect! Please try again.");
				passCheck(username, password);
			}
			else if(passguess.equals(password))
			{
				System.out.println("Your username is incorrect! Please try again.");
				passCheck(username, password);
			}
			else
			{
				System.out.println("Your username and password are incorrect! Please try again.");
				passCheck(username, password);
			}

	}
}