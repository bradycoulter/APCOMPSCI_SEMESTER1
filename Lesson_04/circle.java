import java.util.Scanner;
public class circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		circle calc = new circle();
		circle form = new circle();
		System.out.println("Please enter the radius:");
		r = kb.nextDouble();
		calc.calcArea(r);
		form.print(area);
	}
	
	public static void calcArea(double r)
	{
		area = (Math.pow(r, 2)*3.14);
	}
	
	public static void print(double area)
	{
		System.out.printf("The surface area of your circle with a radius of " + r + " is %.5f ", area);
	}
}
