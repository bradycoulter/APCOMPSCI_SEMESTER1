import java.util.Scanner;

public class Lesson_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter number one: ");
		int one = kb.nextInt();
		System.out.println("Please enter number two: ");
		int two = kb.nextInt();
		
		boolean even = (one + two) % 2 == 0;
		
		if (even)
			System.out.println("Your number " + (one + two) + " is even!");
		if (!even)
			System.out.println("Your number " + (one + two) + " is odd!");
	}
}