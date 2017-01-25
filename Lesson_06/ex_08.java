public class ex_08
{
	public static void main(String[]args)
	{
		Sing("Na", 4);
		Sing("Na", 4);
		Sing("Hey", 3);
		Sing("Goodbye!", 1);
	}
	
	public static void Sing(String lyric, int times)
	{
		for (int i = 1; i <= times; i++)
		{
			System.out.print(lyric + " ");
		}
		System.out.println();
	}
}