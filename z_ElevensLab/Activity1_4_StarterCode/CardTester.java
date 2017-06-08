/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		{
        Card card1 = new Card("Clubs", "2", 2);
        Card card2 = new Card("Clubs", "2", 2);
        Card card3 = new Card("Diamonds", "King", 13);
        System.out.println(card3.toString());
        System.out.println("card 1 & card 2: " + card2.matches(card1));
        System.out.println("card 2 & card 3: " + card2.matches(card3));
	}
	}
}
