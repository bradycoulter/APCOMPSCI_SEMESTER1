import java.util.Random;

public class Exercise_01
{
	public static void main(String[]args)
	{
		
		Random rand = new Random();
		int proll = rand.nextInt(6)+1;
		int croll = rand.nextInt(6)+1;
		
		String winner = rollDice(proll, croll);
		System.out.println("You rolled a " + proll);
		System.out.println("Computer rolled a " + croll);
		System.out.println("The winner is " + winner);
		
	}
	public static String rollDice(int proll, int croll)
	{
		String winner = "";
		
		if (proll > croll)
			winner = "Player";
		if (croll > proll)
			winner = "Computer";
		if (proll == croll)
			winner = "nobody";
		
		return winner;
	}
}