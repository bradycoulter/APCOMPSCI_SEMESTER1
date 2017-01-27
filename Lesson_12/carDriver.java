import java.util.Scanner;
public class carDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your desired paint color: ");
		String paint = kb.nextLine();
		System.out.println("Please enter your desired interior: ");
		String interior = kb.nextLine();
		System.out.println("Please enter your desired engine: ");
		String engine = kb.nextLine();
		System.out.println("Please enter your desired tires: ");
		String tires = kb.nextLine();
		
		car object = new car(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint: " + object.getPaint());
		System.out.println("Interior: " + object.getInterior());
		System.out.println("Engine: " + object.getEngine());
		System.out.println("Tires: " + object.getTires());
	}
}