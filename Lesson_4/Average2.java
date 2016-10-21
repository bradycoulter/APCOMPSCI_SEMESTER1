import java.util.Scanner;
public class Average2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Average2 calc = new Average2();
		Average2 form = new Average2();
		System.out.println("Please enter number 1:");
		double num1 = kb.nextDouble();
		System.out.println("Please enter number 2:");
		double num2 = kb.nextDouble();
		System.out.println("Please enter number 3:");
		double num3 = kb.nextDouble();
		double avg = calc.calcAvg(num1, num2, num3);
		form.print(avg);
	}
	
	public static double calcAvg(double num1, double num2, double num3)
	{
		return ((num1+num2+num3)/3);
	}
	
	public static void print(double avg)
	{
		System.out.printf("The average of your three numbers is %.5f", avg);
	}
}
