import java.util.ArrayList;
public class satellite
{
   public static void main(String[]args)
   {
       ArrayList<car> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));


       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (car l : locate)
       {
           printout += "\nNew Location: " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (car l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }


       System.out.println(printout);
	   System.out.println("==========================");
	   for (car object: locate)
	   {
			double one = (int)(Math.random() * 100) + 1;
			double two = (int)(Math.random() * 100) + 1;
			object.move(one, two);
			printout+= "\nAfter " + object.getID() + " Moved: (" + one + " , " + two + ")";
			printout+= "\nNew Location: " + ": (" + getLocation(object.getLoc()) + ")";
			
	   }
	   printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


	   for (car object: locate)
	   {
			printout += "\nDistance for " + object.getID() + ": (" + getDistance(object.getLoc(), home)+ ")";
	   }
	   System.out.println(printout);
	   

   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}