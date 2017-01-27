import java.util.Scanner;

public class distanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		
		int x1 = kb.nextInt();
		
		System.out.println("Enter y1: ");
		
		int y1 = kb.nextInt();
		
		System.out.println("Enter x2: ");
		
		int x2 = kb.nextInt();
		
		System.out.println("Enter y2: ");
		
		int y2 = kb.nextInt();
		
		distance object = new distance(x1, y1, x2, y2);
		
		System.out.println("The distance is: " + object.getDistance());
		
		System.out.println("Enter x1: ");
		
		x1 = kb.nextInt();
		
		System.out.println("Enter y1: ");
		
		y1 = kb.nextInt();
		
		System.out.println("Enter x2: ");
		
		x2 = kb.nextInt();
		
		System.out.println("Enter y2: ");
		
		y2 = kb.nextInt();
		object.setValues(x1, y1, x2, y2);
		System.out.println("The distance is: " + object.getDistance());
	}
}