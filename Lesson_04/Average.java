import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Average calc = new Average();
		Average form = new Average();
		System.out.println("Please enter number 1:");
		num1 = kb.nextDouble();
		System.out.println("Please enter number 2:");
		num2 = kb.nextDouble();
		System.out.println("Please enter number 3:");
		num3 = kb.nextDouble();
		calc.calcAvg(num1, num2, num3);
		form.print(avg);
	}
	
	public static void calcAvg(double num1, double num2, double num3)
	{
		avg = ((num1+num2+num3)/3);
	}
	
	public static void print(double avg)
	{
		System.out.printf("The average of your three numbers is %.5f", avg);
	}
}
