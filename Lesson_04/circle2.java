import java.util.Scanner;
public class circle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		circle2 calc = new circle2();
		circle2 form = new circle2();
		System.out.println("Please enter the radius:");
		double r = kb.nextDouble();
		double area = calc.calcArea(r);
		form.print(area);
	}
	
	public static double calcArea(double r)
	{
		return (Math.pow(r, 2)*3.14);
	}
	
	public static void print(double area)
	{
		System.out.printf("The surface area of your circle is %.5f ", area);
	}
}
