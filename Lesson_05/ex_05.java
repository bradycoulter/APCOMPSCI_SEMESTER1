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
			System.out.println("You decide to run on the streets in the city. While you are running on the streets, you come to a T intersection. Do you (1) go left, or (2) got to the right");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{
				System.out.println("You decide to go left at the T intersection. As you are running, you have to cross the road. While the red hand is up on the crosswalk, you see that there is nobody going. Do you (1) cross the street, or (2) wait for the crosswalk sign to change.");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
					System.out.println("You decide that you won't waste your time and begin to cross the street. Unfortunately, there was a car around that you didn't see. He doesn't see you either and hits you. You're season is over. Good job!");
				else
					System.out.println("You decide to play it safe and wait. While you do end up interupting your run, you don't get hit by the car that came speeding through the intersection. Way to go!");
			}
			else
			{
				System.out.println("You decide to go to the right. After 20 minutes, you come across a tunnel. The tunnel looks really cool, and you want to explore it. Do you (1) go into the tunnel, or (2) decide to keep going?");
				int choice4 = kb.nextInt();
				if (choice4 == 1)
				{
					System.out.println("You decide to explore the tunnel. It turns out that the tunnel is a sewer. While exploring you see a shark in the water of the sewer. Do you (1) attempt to ride the shark, or (2) run past the shark?");
					int choice5 = kb.nextInt();
					if (choice5 == 1)
					{
						System.out.println("You walk over to the shark and begin to mount it. The shark lets you mount it, and then it zips you around the whole sewer. You have tons of fun and are very pleased with yourself for your bravery. Smart decision-making!");
					}
					else
					{
						System.out.println("You attempt to run past the shark. The shark is insulted that you wouldn't even say hi, so it eats you. Good job!");
					}
				}
				else
				{
					System.out.println("You decide that your run is to important to get sidetracked exploring a tunnel. After all, it's likely just a sewage tunnel. Halfway through the run, you think it is a good idea to go ten miles instead of eight. Do you (1) go ten miles, or (2) go eight miles?");
					int choice6 = kb.nextInt();
					if (choice6 == 1)
					{
						System.out.println("You decide to got ten miles. You're feeling really good on the run. That is until you tear your ACL at mile nine because you went too far. Oh well, there's always next season.");
					}
					else
					{
						System.out.println("You only go eight miles. You feel very good and do not injure yourself in anyway. The next week you have a good race. Way to go!");
					}
				}
			}
		}
		else
		{
			System.out.println("You decide to run in a local park. While you're running you come to a fork. One path runs along a river, while the other leads to a trail in the woods. Do you (1) pick the river trail, or (2) pick the wooded trail?");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{
				System.out.println("You decide to run along the river. While you are running along the river, you see a shark. Do you attempt (1) pet the shark, or (2) run past the shark");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("You approach the shark and start to pet it. The shark doesn't like that. The shark eats you. Good going!");
				}
				else
				{
					System.out.println("You decide that trying to pet the shark would be a stupid idea, and continue on your run. You enjoy the run and have fun running along the peaceful river.");
				}
			}
			else
			{
				System.out.println("You decide to run along the trail in the woods. While running along the trail, you come to a fallen tree. You can either go (1) under or (2) over the tree. Which do you choose?");
				int choice4 = kb.nextInt();
				if (choice4 == 1)
				{
					System.out.println("You decide to go under the tree. You safely make it past the tree and continue along your run. You enjoy the peaceful run in the secluded woods and feel rejuvenated!");
				}
				else
				{
					System.out.println("You decide jump over the tree. Unfortunately you have a one inch vertical and end up tripping over the tree and breaking your ankle. Your season is over. Better luck next year.");
				}
			}
		}
	}	
}