import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Strings
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String [][] words = new String[4][4];
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words.length; j++)
				words[i][j] = kb.next();
				
		}
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words.length; j++)
				System.out.print(words[i][j] + " ");
			System.out.println(" ");
				
		}
	}
}