import java.util.Scanner;

public class RudeAi
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.nextLine();
		System.out.println("That's a stupid name loser.");
		
		System.out.println("How old are you?");
		
		
		
		int age = kb.nextInt();
		System.out.println("Wow! You look much older than " + age + ".");
		
		System.out.println("What do you like to do for fun?");
		
		kb.nextLine();
		
		String hobby = kb.nextLine();
		
		System.out.println("Wow, that's really lame.");
		
	}
}