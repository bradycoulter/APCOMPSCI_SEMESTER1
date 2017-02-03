import java.util.ArrayList;

public class countingMachine
{
	public static void main(String[]args)
	{
		ArrayList<money> inventory = new ArrayList<money>();
		inventory.add(new coin("Penny", "2.5g", 00.01));
		inventory.add(new coin("nickel", "5.0g", 00.05));
		inventory.add(new coin("dime", "2.268g", 00.10));
		inventory.add(new coin("quarter", "5.670g", 00.25));
		inventory.add(new bill("One", "Washington", 01.00));
		inventory.add(new bill("Five", "Lincoln", 05.00));
		inventory.add(new bill("Ten", "Hamilton", 10.00));
		inventory.add(new bill("Twenty", "Jackson", 20.00));
		inventory.add(new bill("Hundred", "Franklin", 100.00));
		
		for(money x : inventory)
		{
			System.out.println(x);
		}
	}
}