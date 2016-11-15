import java.util.Scanner;
public class lesson_6
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 1; i <= 5; i++)
			System.out.print(i + " ");
		for(int i = 5; i >= 1; i--)
			System.out.print(i + " ");
		for(int i = 2; i <= 10; i+=2)
			System.out.print(i + " ");
		String word = "crosscountry";
		System.out.println(word.length());
		System.out.println(word.indexOf("country"));
		System.out.println(word.substring(1,4));
	}
}