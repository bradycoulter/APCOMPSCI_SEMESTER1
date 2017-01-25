import java.util.Scanner;

public class ex_04
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
		
		System.out.printf("Your BMI is %.2f | ", bmi);
		
		calcCondish(bmi);
	}
	public static void calcCondish(double bmi)
	{
		if (bmi < 18.5)
			System.out.println("Your condition is underweight!");
		else if (bmi < 25)
			System.out.println("Your condition is Normal!");
		else if (bmi < 30)
			System.out.println("Your condition is Overweight!");
		else if (bmi < 35)
			System.out.println("Your condition is Obese!");
		else if (bmi < 40)
			System.out.println("Your condition is Very Obese!");
		else 
			System.out.println("Your condition is Morbidly Obese!");
			
		
	}
}