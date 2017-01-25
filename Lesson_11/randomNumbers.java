import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class keepComposites
{
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		
		System.out.println(nums);
		removePrimes(nums);
		System.out.println(nums);
	}
	public static int gFactor(int numberts)
	{
		for(int i = 2; i < numberts; i++)
		{
			if(numberts%i==0)
			{
				return 1;
			}
		}
		return 0;
	}
	public static void removePrimes(ArrayList<Integer>nums)
	{
		for(int i = 0; i < nums.size(); i++)
		{
			if(gFactor(nums.get(i)) == 0)
			{
				nums.remove(i);
				i--;
			}
		}
	}
}