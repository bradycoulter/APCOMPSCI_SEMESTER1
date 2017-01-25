import java.util.Scanner;
public class Digitadder
{
	static int number, num;
	static int sum = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number:");
		number = kb.nextInt();
		addDigits();
		System.out.println("The sum of the number " + number + " is " + sum + "!");
	}
	public static void addDigits()
	{
		int num = number;
		while (num > 0)
		
		{
			sum += (num % 10);
			num = num/10;
		}
	}
}