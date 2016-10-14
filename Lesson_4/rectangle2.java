import java.util.Scanner;
public class rectangle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		rectangle2 calc = new rectangle2();
		rectangle2 form = new rectangle2();
		System.out.println("Please enter the length:");
		double l = kb.nextDouble();
		System.out.println("Please enter the height:");
		double w = kb.nextDouble();
		double perimeter = calc.calcPerim(l, w);
		form.print(perimeter);
	}
	
	public static double calcPerim(double l, double w)
	{
		return (2 * l + 2 * w);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("The perimeter of your rectangle is %.5f ", perimeter);
	}
}
