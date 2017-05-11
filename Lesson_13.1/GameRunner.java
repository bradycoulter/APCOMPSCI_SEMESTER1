public class GameRunner
{
	public static void main(String[]args)
	{
		playstation ps3 = new playstation("Playstation 3");
		System.out.println(ps3);
		System.out.println();
		
		xBox xbox360 = new xBox("XBox 360");
		System.out.println(xbox360);
		System.out.println();
		
		PC pc = new PC("PC");
		System.out.println(pc);
	}
}