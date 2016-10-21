import java.util.Scanner;
public class cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		cube calc = new cube();
		cube form = new cube();
		System.out.println("Please enter the side length:");
		side = kb.nextDouble();
		calc.calcSa(side);
		form.print(sa);
	}
	
	public static void calcSa(double side)
	{
		sa = (Math.pow(side, 2)*6);
	}
	
	public static void print(double sa)
	{
		System.out.printf("The surface area of your cube with sides " + side + " in length is %.5f ", sa);
	}
}
