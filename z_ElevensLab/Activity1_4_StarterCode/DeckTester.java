/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	String[] rank1 = {"7", "King", "10"};
	String[] suits1 = {"diamonds", "clubs", "hearts",};
	int[] pv1 = {7, 13, 10};
	
	String[] rank2 = {"3", "Queen", "Jack"};
	String[] suits2 = {"diamonds", "clubs", "hearts",};
	int[] pv2 = {3, 12, 11};
	String[] rank3 = {"Ace", "Two", "Three", "Four"};
	String[] suits3 = {"diamonds", "clubs", "hearts", "spades"};
	int[] pv3 = {1, 2, 3, 4};
	
	Deck deck1 = new Deck(rank1, suits1, pv1);
	Deck deck2 = new Deck(rank2, suits2, pv2);
	Deck deck3 = new Deck(rank3, suits3, pv3);
	
	System.out.println(deck1);
	System.out.println(deck2);
	System.out.println(deck3);
	deck3.shuffle();
	System.out.println(deck3);
	}
}
