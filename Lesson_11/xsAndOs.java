import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class xsAndOs
{
	public static void main(String[]args)
	{
		String [][] xAndO = new String[4][4];
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO.length; j++)
			{
				int picknumbert = (int)(Math.random()*100)+1;
				if(picknumbert >= 51)
				{
					xAndO [i][j] = "x";
					
				}
				else
				{
					xAndO [i][j] = "o";
				}
			}
			
			
				
		}
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO.length; j++)
				System.out.print(xAndO[i][j] + "\t");
			System.out.println(" ");
				
		}
	}
}