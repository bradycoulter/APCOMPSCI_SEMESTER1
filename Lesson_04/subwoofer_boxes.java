import java.util.Scanner;
public class subwoofer_boxes
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		subwoofer_boxes volume = new subwoofer_boxes();
		System.out.println("Please enter the height.");
		double height = kb.nextDouble();
		System.out.println("Please enter the length.");
		double length = kb.nextDouble();
		System.out.println("Please enter the width.");
		double width = kb.nextDouble();
		double vol = volume.calcVol(height, length, width);
		System.out.println("The subwoofer box volume is " + vol);
		
		
	}
	
	public static double calcVol(double h, double l, double w)
	{
		return ((h*l*w)/1728);
	}
}