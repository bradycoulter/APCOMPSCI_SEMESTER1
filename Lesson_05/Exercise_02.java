import java.util.Scanner;

public class Exercise_02
{
	public static void main(String[]args)
	{
		Exercise_02 form = new Exercise_02();
		Exercise_02 calc = new Exercise_02();
		
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
		
		kb.nextLine();
		
		System.out.println("Please enter item 4");
		String item4 = kb.nextLine();
		
		System.out.println("Please enter the price");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		
		double discount = calc.calcDisc(subtotal);
		
		double tax = subtotal / 12.5;
		
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		System.out.println("\n");
		form.format("subtotal ", subtotal);
		form.format("discount ", discount);
		form.format("tax ", tax);
		form.format("total ", total);
		System.out.println("\n__________________________________________");
		System.out.println("	* Thank you for your support *");
	}
	
	public static double calcDisc(double subtotal)
	{
		if (subtotal >= 2000)
			return subtotal * .15;
		return 0.0;
	}
	public void format(String item, double price)
	{
		System.out.printf("\n * %17s" + ": ......." + "%10.2f", item, price);
	}
	
}