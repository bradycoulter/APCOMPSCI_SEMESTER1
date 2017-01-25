import java.util.Scanner;

public class RudeAi
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.nextLine();
		System.out.println(name + " is a stupid name loser.");
		
		System.out.println("How old are you, " + name + "?");
		
		
		
		int age = kb.nextInt();
		System.out.println("Wow " + name + "!" + " You look much older than " + age + ".");
		
		System.out.println("What do you like to do for fun?");
		
		kb.nextLine();
		
		String hobby = kb.nextLine();
		
		System.out.println("Wow, that's really lame. Only losers like to " + hobby + ".");
		
		System.out.println("What kind of music do you like " + name + "?");
		
		String music = kb.nextLine();
		
		System.out.println("Really! " + music + " is the worst.");
		
		System.out.println("How many siblings do you have, " + name + "?");
		
		int sib = kb.nextInt();
		
		System.out.println(sib + "? Wow, I feel bad for them.");
		
		
		
		System.out.println("What do you want to be when you grow up?");
		
		kb.nextLine();
		
		String job = kb.nextLine();
		
		System.out.println(job + "? Don't you need to be smart to be a " + job + "?");
		
		System.out.println("So " + name + " you're " + age + ", you like to " + hobby + ", listen to " + music + ", and have " + sib + " siblings.");
		
		System.out.println("Good luck trying to become a " + job + ".");
		
		System.out.println("I'm only joking " + name + ". I think you'd make a great " + job + ".");
		
		
		
	}
}