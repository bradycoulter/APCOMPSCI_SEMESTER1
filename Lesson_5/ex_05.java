import java.util.Scanner;

public class ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Running Adventure Game 2016. It's early in the morning and you decide to go for a run. Where do you run, (1) The beach, (2) the streets, or (3) a park? ");
		int choice = kb.nextInt();
		if (choice == 1)
		{
			System.out.println("You decide to go for a run on the beach. You arrive at Torrey Pines State Beach at around 8 A.M. As you are running, you come across a surfer laying in the sand. Do you (1) stop to help him, or (2) keep on running");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{
				System.out.println("Being the good samaritan that you are, you decide to help the man. You walk over to the man and wake him. Unfortunately for you, the whole thing was a setup, and the man attempts to mug you. Do you (1) Give him you're expensive GPS running watch, or (2) attempt to run away?");
				int choice3 = kb.nextInt();
					if (choice3 == 1)
						System.out.println("You give the man your GPS running watch and he lets you go on your way. You decide to just turn back there and cut the run short. While you're sad that you lost your watch, you are happy that you ended up safe in the end.");
					else
						System.out.println("Realizing that you're a runner, you decide to run away from the man. You sprint for about 15 seconds before you lose the man. You are tired, but happy that you are safe and didn't have to part with any of your possessions. You continue running and end up running your longest run that day.");
			}
			else
			{
				System.out.println("You decide that somebody else will help the man, and that you cannot afford to stop your run. As you continue along the beach, you see a shark washed up on the beach. Do you (1) walk up to the shark to try and touch it, or (2) keep on running?");
				int choice4 = kb.nextInt();
				if (choice4 == 1)
				{
					System.out.println("You decide to approach the shark. Realizing that the shark is in pain, you come to the conclusion that you must do something to save its life. Do you (1) push the shark back into the water yourself, or (2) call an animal rescue service?");
					int choice5 = kb.nextInt();
					if (choice5 == 1)
					{
						System.out.println("You push the shark into the ocean and it starts swimming. Then it eats you. Good job!");
					}
					else
					{
						System.out.println("You ask to borrow a beachgoer's phone and call an animal rescue service. The animal rescue service successfully places the shark back into the water. Congratulations, you're a hero!");
					}
				}
				else
				{
					System.out.println("Once again, you decide not to jeopardize your run. After you finish your run, you feel like going in the water to cooldown. Do you (1) go in the water, or (2) decide to stretch instead?");
					int choice6 = kb.nextInt();
					if (choice6 == 1)
					{
						System.out.println("You go into the water and have loads of fun! That is, until you pull a calf muscle. You should've stretched. Now you can't run for 2 weeks due to your injury. Good job!");
					}
					else
					{
						System.out.println("You decide to skip the water and instead stretch. You become very limber and have a good race performance the next week. Way to go!");
					}
				}
			}
		}
		else if (choice == 2)
		{
			System.out.println(" Do you (1) stop to help him, or (2) keep on running");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{
				System.out.println("Being the good samaritan that you are, you decide to help the man. You walk over to the man and wake him. Unfortunately for you, the whole thing was a setup, and the man attempts to mug you. Do you (1) Give him you're expensive GPS running watch, or (2) attempt to run away?");
				int choice3 = kb.nextInt();
					if (choice3 == 1)
						System.out.println("You give the man your GPS running watch and he lets you go on your way. You decide to just turn back there and cut the run short. While you're sad that you lost your watch, you are happy that you ended up safe in the end.");
					else
						System.out.println("Realizing that you're a runner, you decide to run away from the man. You sprint for about 15 seconds before you lose the man. You are tired, but happy that you are safe and didn't have to part with any of your possessions. You continue running and end up running your longest run that day.");
			}
			else
			{
				System.out.println("You decide that somebody else will help the man, and that you cannot afford to stop your run. As you continue along the beach, you see a shark washed up on the beach. Do you (1) walk up to the shark to try and touch it, or (2) keep on running?");
				int choice4 = kb.nextInt();
				if (choice4 == 1)
				{
					System.out.println("You decide to approach the shark. Realizing that the shark is in pain, you come to the conclusion that you must do something to save its life. Do you (1) push the shark back into the water yourself, or (2) call an animal rescue service?");
					int choice5 = kb.nextInt();
					if (choice5 == 1)
					{
						System.out.println("You push the shark into the ocean and it starts swimming. Then it eats you. Good job!");
					}
					else
					{
						System.out.println("You ask to borrow a beachgoer's phone and call an animal rescue service. The animal rescue service successfully places the shark back into the water. Congratulations, you're a hero!");
					}
				}
				else
				{
					System.out.println("Once again, you decide not to jeopardize your run. After you finish your run, you feel like going in the water to cooldown. Do you (1) go in the water, or (2) decide to stretch instead?");
					int choice6 = kb.nextInt();
					if (choice6 == 1)
					{
						System.out.println("You go into the water and have loads of fun! That is, until you pull a calf muscle. You should've stretched. Now you can't run for 2 weeks due to your injury. Good job!");
					}
					else
					{
						System.out.println("You decide to skip the water and instead stretch. You become very limber and have a good race performance the next week. Way to go!");
					}
				}
			}
		}		
	}	
}