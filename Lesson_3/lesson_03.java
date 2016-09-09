import java.util.Scanner;
public class lesson_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("How old are you? ");
		
		int age = kb.nextInt();
		System.out.println(age + " is old");
		
		kb.nextLine();
		
		System.out.println("What are you doing tonight?");
		String doing = kb.nextLine();
		
		System.out.println(doing + " is for savages!");
	}
}