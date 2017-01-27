import java.util.Scanner;

public class gameGun
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String [] clip;
	static Scanner kb = new Scanner(System.in);
	
	public static void main (String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new String [CLIPSIZE];
		
		resetClip();
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String action = kb.nextLine();
			if(action.equals("R"))
			{
				reload();
			}
			if(action.equals("S"))
			{
				System.out.println(shoot());
			}
			printClip();
		}
		System.out.println("Out of Bullets!!");
		//https://i.reddituploads.com/5640925808b6440c9c4d7a9f33f6afea?fit=max&h=1536&w=1536&s=60f136832248b49c70c92f3d33c95a57
	}
	public static void resetClip()
	{
		for(int i = 0; i < CLIPSIZE; i++)
			clip[i] = "[]";
	}
	public static String shoot()
	{
		if (shotCount > 0)
		{
			clip[shotCount-1] = "[]";
			shotCount--;
			return "Boom!!!";
		}
		else
		{
			return "Reload!!!";
		}
	}
	public static void reload()
	{
		
		if(bulletCount >= CLIPSIZE)
		{
				bulletCount -= CLIPSIZE;
				shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = "Bullets: \t" + bulletCount + "\nClip;\t";
		for (int i = 0; i < CLIPSIZE; i++)
		{
			output = output + clip[i];
		}
		System.out.println(output);
	}
}