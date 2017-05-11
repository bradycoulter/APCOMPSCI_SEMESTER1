public class ticketDriver
{
	public static void main(String[]args)
	{
		advance Rick = new advance();
		advance Beth = new advance(11);
		studentAdvance Morty = new studentAdvance();
		walkUp Jerry = new walkUp();
		
		System.out.println(Rick);
		System.out.println(Beth);
		System.out.println(Morty);
		System.out.println(Jerry);
	}
}