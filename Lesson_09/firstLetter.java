import java.util.Scanner;
public class firstLetter
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		System.out.println("The first letters of your words are: ");
		first(words);
	}
	public static void first(String[] words)
	{
		for(String word : words)
		{
			System.out.println(word.charAt(0));
		}
	}
}