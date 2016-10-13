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
		int l = kb.nextInt();
		System.out.println("Please enter the height:");
		int w = kb.nextInt();
		int perimeter = calc.calcPerim(l, w);
		form.print(perimeter);
	}
	
	public static void calcPerim(double l, double w)
	{
		perimeter = (2 * l + 2 * w);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("%.5f", perimeter);
	}
}
