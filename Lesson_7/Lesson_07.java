import java.util.Scanner;
public class Lesson_07
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = kb.nextInt();
		while(number > 0)
		{
			System.out.println(number % 10);
			number/=10;
		}
	}
}