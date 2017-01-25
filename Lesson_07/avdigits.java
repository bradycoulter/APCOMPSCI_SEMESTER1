import java.util.Scanner;
public class avdigits
{
	static int number, num;
	static double average = 0;
	static int digits = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number:");
		number = kb.nextInt();
		avDigits();
		System.out.println("The average of the digits " + number + " is " + average + "!");
	}
	public static void avDigits()
	{
		int num = number;
		while (num > 0)
		
		{
			digits++;
			average += (num % 10);
			num = num/10;
		}
		average = average/digits;
	}
}