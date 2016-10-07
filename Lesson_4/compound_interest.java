import java.util.Scanner;
public class compound_interest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		compound_interest form = new compound_interest();
		double rate = kb.nextDouble();
		double princpl = kb.nextDouble();
		double time = kb.nextDouble();
		double number = kb.nextDouble();
		double payment = payment.calcPayment(rate, princpl, number, time);
		System.out.println("your monthly payment will be " + payment);
		
		
	}
	
	public double calcPayment(double r, double p, double n, double t)
	{
		return p * (Math.pow(1+r/n, r*t));
	}
}