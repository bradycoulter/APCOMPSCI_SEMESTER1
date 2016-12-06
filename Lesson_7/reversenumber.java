import java.util.Scanner;
public class reversenumber
{
	static int number, num;
	static int rev = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your number:");
		number = kb.nextInt();
		reverse();
		System.out.println("The number " + number + " reversed is " + rev + "!");
	}
	public static void reverse()
	{
		int num = number;
		while (num > 0)
		
		{
			rev *= 10;
			rev += (num % 10);
			num = num/10;
		}
	}
}