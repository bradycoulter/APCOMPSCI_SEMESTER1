import java.util.Scanner;
public class ex_04
{	

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);	
		
		System.out.println("Please enter a number:");
		int num = kb.nextInt();
		System.out.println("Please enter the desired size of your table");
		int table = kb.nextInt();
		System.out.println ("\n  X |  Y");
		for (int i = 1; i <= table; i++)
		{
		System.out.printf("%2d | %2d\n", i, i*num);	
		}
	}	
		
}