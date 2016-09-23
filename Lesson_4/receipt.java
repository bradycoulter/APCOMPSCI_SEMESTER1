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
		double price1 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Please enter item 2");
		String item2 = kb.nextLine();
		
		System.out.println("Please enter the price");
		double price2 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Please enter item 3");
		String item3 = kb.nextLine();
		
		System.out.println("Please enter the price");
		double price3 = kb.nextDouble();
		
		String subtot = "Subtotal";
		
		double subtotal1 = price1 + price2 + price3;
		
		String t = "Tax";
		
		double tax = subtotal1 / 12.5;
		
		String tot = "Total";
		
		double total = subtotal1 + tax;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("\n");
		form.format(subtot, subtotal1);
		form.format(t, tax);
		form.format(tot, total);
		System.out.println("\n__________________________________________");
		System.out.println("* Thank you for your support *");
	}
	public void format(String item, double price)
	{
		System.out.printf("\n * %17s" + ": ......." + "%10.2f", item, price);
	}
	
}