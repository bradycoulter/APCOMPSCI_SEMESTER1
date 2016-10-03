import java.util.Scanner;
public class compound_interest
{
	public static void main(String[]args)
	{
		compound_interest form = new compound_interest();
		double rate = kb.nextDouble();
		double princpl = kb.nextDouble();
		double time = kb.nextDouble();
		double number = kb.nextDouble();
		calcPayment();
		System.out.println("your monthly payment will be " + payment(rate, princpl, number, time));
		
		
	}
	
	public double calcPayment(double rate, double princpl, double number, double time)
	{
		return princpl * (Math.pow(1+rate/number, rate*time));
	}
}