import java.util.Scanner;
public class inventoryRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the manufacturer: ");
		String man = kb.next();
		System.out.println("Please enter the name: ");
		String name = kb.next();
		
		System.out.println("Do you want to the category and price?");
		String choice = kb.next();
		if(choice.equals("no"))
		{
			inventory object = new inventory(man, name);
			System.out.println(object);
		}
		else
		{
			System.out.println("Please enter the category: ");
			String cat = kb.next();
			System.out.println("Please enter the price: ");
			int price = kb.nextInt();
			inventory object2 = new inventory(man, name, cat, price);
			System.out.println(object2);
		}
	}
}