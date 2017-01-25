import java.util.Scanner;
public class treeDeg60
{
	static String word;
	static int stop, start;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Please enter a word: ");
		String word = kb.nextLine();
		stop = word.length();
		start = 0;
		tree(word, stop, start);
	}
	
	public static void tree(String word, int stop, int start)
	{
		if (start <= stop)
		{
			System.out.printf("%13s\n"," " + word.substring(0, start));
			start++;
			tree(word, stop, start);
		}
	}
}