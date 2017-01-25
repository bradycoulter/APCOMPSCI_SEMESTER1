import java.util.Scanner;
public class findTheZs
{	
	static String [] words;
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		System.out.println("For the words... ");
		printArray();
		System.out.println();
		System.out.println("Only " + hasZs(words) + "contains the letter z.");
	}
	
	public static void fillArray()
	{
		System.out.println("Please enter 5 words... ");
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < words.length; i++)
			words[i] = kb.next();
	}
	
	public static void printArray()
	{
		for (String word : words)
		{
			System.out.printf(word + " ");
		}
	}
	
	public static String hasZs(String[] words)
	{
		String Z = "";
		for (String word: words)
		{
			if( word.indexOf("z") > 0)
			{
				Z += word + " ";
			}
		}
		return Z;
	}
}