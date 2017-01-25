import java.util.Scanner;
public class rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		rectangle calc = new rectangle();
		rectangle form = new rectangle();
		System.out.println("Please enter the length:");
		l = kb.nextDouble();
		System.out.println("Please enter the height:");
		w = kb.nextDouble();
		calc.calcPerim(l, w);
		form.print(perimeter);
	}
	
	public static void calcPerim(double l, double w)
	{
		perimeter = (2 * l + 2 * w);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("The perimeter of your rectangle is %.5f ", perimeter);
	}
}
