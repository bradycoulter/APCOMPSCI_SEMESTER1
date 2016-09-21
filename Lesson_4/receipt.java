import java.util.Scanner;

public class receipt
{
	public static void main(String[]args)
	{
		receipt form = new receipt();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1");
		String item1 = kb.nextLine();
		
		System.out.println("Please enter the price;");
		float price1 = kb.nextFloat();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
	}
	public void format(String item, float price)
	{
		System.out.printf("\n%17s %10.2f", item, price);
	}
	
}