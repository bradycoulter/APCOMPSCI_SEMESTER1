import java.util.Scanner;
public class humanRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your hair color: ");
		String hair = kb.nextLine();
		System.out.println("Please enter your eye color: ");
		String eyes = kb.nextLine();
		System.out.println("Please enter your skin type: ");
		String skin = kb.nextLine();
		
		human object = new human(hair, eyes, skin);
		
		System.out.println("My info......");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		System.out.println();
		
		System.out.println("Please enter a friend's hair color: ");
		hair = kb.nextLine();
		System.out.println("Please enter a friend's eye color: ");
		eyes = kb.nextLine();
		System.out.println("Please enter a friend's skin type: ");
		skin = kb.nextLine();
		
		human object2 = new human(hair, eyes, skin);
		
		System.out.println("Your friend's info......");
		System.out.println("Hair: " + object2.getHair());
		System.out.println("Eyes: " + object2.getEyes());
		System.out.println("Skin: " + object2.getSkin());
		
	}
}