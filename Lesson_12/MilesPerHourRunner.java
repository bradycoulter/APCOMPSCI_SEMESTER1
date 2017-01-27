import java.util.Scanner;

public class MilesPerHourRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter distance: ");
		
		int distance = kb.nextInt();
		
		System.out.println("Enter hours: ");
		
		int hours = kb.nextInt();
		
		System.out.println("Enter minutes: ");
		
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + object.getMPH() + " mph");
		
		System.out.println("Enter distance: ");
		
		distance = kb.nextInt();
		
		System.out.println("Enter hours: ");
		hours = kb.nextInt();
		System.out.println("Enter minutes: ");
		minutes = kb.nextInt();
		object.setValues(distance, hours, minutes);
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + object.getMPH() + " mph");
	}
}