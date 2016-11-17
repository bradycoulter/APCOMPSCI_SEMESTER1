import java.util.Scanner;

public class ex_06
{
	static String userguess;
	static String passguess;
	public static void main(String[]args)
	{
		String username = "user1";
		String password = "pass123";
		System.out.println("Please enter your username: ");
		String userguess = kb.nextLine();
		System.out.println("Please enter your password: ");
		passguess = kb.nextLine();
		passCheck(username, password);
	}
	public static void passCheck(String username, String password)
	{
		if (userguess.equals(username))
			if (passguess.equals(password))
				System.out.println("You are granted access!");
			else
				System.out.println("Your password is incorrect! Please try again");
				passCheck(username, password);
	}
}