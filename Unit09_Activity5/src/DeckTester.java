/**
 * This is a class that tests the Deck class.
 */
import java.util.*;;
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//String[] one = new String[] {"Garage", "Bed"};
		List<String> one = new ArrayList<String> ();
		one.add("Garage");
		one.add("Bed");
		//String[] two = new String[] {"Dog", "Cat"};
		List<String> two = new ArrayList<String> ();
		two.add("Dog");
		two.add("Cat");
		//int[] three = new int[] {1, 2};
		List<Integer> three = new ArrayList<Integer> ();
		three.add(1);
		three.add(2);
		three.add(3);
		Deck a = new Deck(one, two, three);
		System.out.println(a.deal());
		a.deal();
		a.deal();
		System.out.println(a.size());
		a.deal();
		System.out.println(a.isEmpty());
		Deck b = new Deck(two, one, three);
		System.out.println(b.deal());
		System.out.println(b.isEmpty());
		//Deck c = new Deck(new String[] {"Queen", "King"}, new String[] {"Clubs", "Hearts", "Spades"}, new int[] {1, 2});
		//c.deal();
		//System.out.println(c.deal());
		Deck d = new Deck(two, one, three);
		d.shuffle();
		System.out.println(d.deal());
	}
}
