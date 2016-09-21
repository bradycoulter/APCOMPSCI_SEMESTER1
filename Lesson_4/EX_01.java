import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		EX_01 form = new EX_01();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1");
		String item1 = kb.nextLine();
		
		System.out.println("Please enter the price;");
		float price1 = kb.nextLine();
		
		format(item1, price1);
	}
	public void format(String item, float price)
	{
		System.out.printf("\n%16s %10.2f", item, price);
	}
	
}