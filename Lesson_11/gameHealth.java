import java.util.Scanner;

public class gameHealth
{
	static int bulletCount;
	static int HEALTHLOAD = 6;
	static int healthCount;
	static String[] health;
	static Scanner kb = new Scanner(System.in);
	
	public static void main (String[]args)
	{
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		
		while(!turn.equals("Q") && healthCount>0)
		{
			System.out.println("Your Turn. Hit Enter when Ready: ");
			turn = kb.next();
			damage = (int)(Math.random()*2)+1;
			amount = (int)(Math.random()*2)+1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!!!"); //feels really bad
		//https://i.redd.it/hrtb6dxa447y.jpg
	}
	public static String takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount -= amount;
			return "Taking  " + amount + " damage";
		}
		else
		{
			if(healthCount + amount < HEALTHLOAD)
			{
				healthCount += amount;
			}
			else
			{
				healthCount = HEALTHLOAD;
			}
		}
		return "Power up " + amount;
	}
	public static void printClip()
	{
		String output = "Health:\t";
		for(int i = 0; i< HEALTHLOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = " [] ";
			}
			output = output + health[i];
		}
		System.out.println(output);
	}
}