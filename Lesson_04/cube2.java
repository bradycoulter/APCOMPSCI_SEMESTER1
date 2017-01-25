import java.util.Scanner;
public class cube2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		cube2 calc = new cube2();
		cube2 form = new cube2();
		System.out.println("Please enter the side length:");
		double side = kb.nextDouble();
		double sa = calc.calcSa(side);
		form.print(sa);
	}
	
	public static double calcSa(double side)
	{
		return (Math.pow(side, 2)*6);
	}
	
	public static void print(double sa)
	{
		System.out.printf("The surface area of your cube is %.5f ", sa);
	}
}
