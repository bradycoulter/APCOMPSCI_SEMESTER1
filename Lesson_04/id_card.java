import java.util.Scanner;

public class id_card
{
	public static void main(String[]args)
	{
		id_card form = new id_card();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String fname = kb.nextLine();
		
		System.out.println("Enter your last name:");
		String lname = kb.nextLine();
		
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		
		System.out.println("Enter the school site:");
		String school = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		
		System.out.println("***********************************");
		form.format(school, year);
		form.format(fname, lname);
		form.format(title, subject);
		System.out.println("\n***********************************");
	}
	public void format(String item1, String item2)
	{
		System.out.printf("\n* %13s %17s *", item1, item2);
	}
	
}