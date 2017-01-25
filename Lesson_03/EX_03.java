import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of your prism?");
		
		int l = kb.nextInt();
		
		kb.nextLine();
		
		System.out.println("What is the height of your prism?");
		
		int h = kb.nextInt();
		
		kb.nextLine();
		
		System.out.println("What is width of your prism?");
		
		int w = kb.nextInt();
		
		int v = (l * w * h);
		
		System.out.println("The volume of your rectangular prism is " + v + " m^3");
		
	}
}