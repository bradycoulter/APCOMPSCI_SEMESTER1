import java.util.Scanner;
public class compound_interest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		compound_interest calcC = new compound_interest();
		compound_interest form = new compound_interest();
		System.out.println("Please enter the rate.");
		double rate = kb.nextDouble();
		System.out.println("Please enter the principal.");
		double princpl = kb.nextDouble();
		System.out.println("Please enter the years the loan is for.");
		double time = kb.nextDouble();
		System.out.println("Please enter the number of times the loan is compounded.");
		double number = kb.nextDouble();
		double payment = calcC.calcPayment(rate, princpl, number, time);
		form.print(payment);
		
		
	}
	
	public static double calcPayment(double r, double p, double n, double t)
	{
		return (p * (Math.pow(1+r/n, n*t))/(12*t));
	}
	
	public static void print(double payment)
	{
		System.out.printf("Your monthly payment will be %.2f ", payment);
	}
}