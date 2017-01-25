import java.util.Scanner;

public class ex_03
{
	public static void main(String[]args)
	{
		ex_03 calc = new ex_03();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your math grade?");
		String math = kb.nextLine();
		
		System.out.println("What is your science grade?");
		String science = kb.nextLine();
		
		System.out.println("What is your history grade?");
		String history = kb.nextLine();
		
		System.out.println("What is your English grade?");
		String english = kb.nextLine();
		
		System.out.println("What is your Spanish grade?");
		String spanish = kb.nextLine();
		
		System.out.println("What is your PE grade?");
		String PE = kb.nextLine();
		
		System.out.println("What is your Art grade?");
		String art = kb.nextLine();
		
		double gpoints = calcPoints(math) + calcPoints(science) + calcPoints(history) + calcPoints(english) + calcPoints(spanish) + calcPoints(PE) + calcPoints(art);
		System.out.printf("Your GPA is %.2f", gpoints / 7);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("F"))
			return 0.0;
		
		return 0.0;
	}
}
