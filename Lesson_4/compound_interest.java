import java.util.Scanner;
public class compound_interest
{
	public static void main(String[]args)
	{
		compound_interest interest = new compound_interest();
		rate = kb.nextDouble;
		princpl = kb.nextDouble;
		time = kb.nextDouble;
		number = kb.nextDouble;
		double inte = interest.calcInt;
		System.out.println("your monthly payment will be " + interest(rate, princpl, number, time));
	}
	
	public double interest(double r, double p, double n, double t)
	{
		return p * (Math.pow(1+r/n, r*t));
	}
}