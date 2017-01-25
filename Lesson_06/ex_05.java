import java.util.Scanner;
public class ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the number you want to count by: ");
		int countby = kb.nextInt();
		System.out.println("Please enter the number you want to count up to: ");
		int countup = kb.nextInt();
		for(int i = countby; i <= countup; i+=countby)
			System.out.print(i + " ");
	}
}