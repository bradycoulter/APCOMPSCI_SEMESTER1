import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height?");
		
		double h = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("What is your weight?");
		
		double w = kb.nextDouble();
		
		double hh = (h * h);
		
		double bmi = (w / hh * 703);
		
		System.out.println(bmi);
	}
}