public class lab_02
{
	public static void main(String[]args)
	{
		int x = 5;
		int y = 10;
		int multprod = x * y;
		
		System.out.println("5 multiplied by 10 is " + multprod);
		
		String name = "ethan yeh";
		int num = 1234;
		String street = " Carboard Box In the Canyon Ct";
		int zip = 92130;
		String loc = " San Diego, CA";
		
		System.out.println(name);
		System.out.println(num + street);
		System.out.println(zip + loc);
		
		int l = 3;
		int w = 7;
		int h = 9;
		int sarea = 2 * l * w + 2 * w * h + 2 * l * h;
		
		System.out.println("The surface area of your rectangle is " + sarea);
		
	}
}