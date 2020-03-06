/**
 * This class provides a convenient way to test shuffling methods.
 */
import java.util.*;
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 3;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 10;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		//int[] values1 = new int[VALUE_COUNT];
		List<Integer> values1 = new ArrayList<Integer>();
		//for (int i = 0; i < values1.length; i++) {
		for (int i = 0; i < VALUE_COUNT; i ++) {
			values1.add(i);
			//values1[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			values1 = perfectShuffle(values1);
			System.out.print("  " + j + ":");
			//for (int k = 0; k < values1.length; k++) {
				//System.out.print(" " + values1[k]);
			//}
			System.out.print(values1);
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		//int[] values2 = new int[VALUE_COUNT];
		List<Integer> values2 = new ArrayList<Integer>();
		//for (int i = 0; i < values2.length; i++) {
		for (int i = 0; i < VALUE_COUNT; i ++) {
			//values2[i] = i;
			values2.add(i);
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			values2 = selectionShuffle(values2);
			System.out.print("  " + j + ":");
			/*for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}*/
			System.out.print(values2);
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	/*
	public static int[] perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** 
		int k = (values.length + 1)/2;
		int count = 0;
		int[] shuffled = new int[values.length];
		for (int i = 0; i < k; i ++) {
			shuffled[count] = values[i];
			count += 2;
		}
		count = 1;
		for (int i = k; i < values.length; i++) {
			shuffled[count] = values[i];
			count += 2;
		}
		return shuffled;

		
		
	}
	*/
	public static List<Integer> perfectShuffle(List<Integer> values) {
		int k = (values.size() + 1)/2;
		int count = 0;
		List<Integer> shuffled = new ArrayList<Integer>(values);
		for (int i = 0; i < k; i = i + 1) {
			shuffled.set(count,  values.get(i));
			count += 2;
		}
		count = 1;
		for (int i = k; i < values.size(); i ++) {
			shuffled.set(count, values.get(i));
			count += 2;
		}
		return shuffled;
	}
	// */
	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	/*public static int[] selectionShuffle(int[] values) {
		int k = values.length;
		int pos;
		int temp;
		for (int i = 0; i < k; i ++) {
			pos = (int) Math.floor((k*Math.random()));
			temp = values[i];
			values[i] = values[pos];
			values[pos] = temp;
		}
		return values;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
	//}
	public static List<Integer> selectionShuffle(List<Integer> values) {
		int k = values.size();
		int pos;
		int temp;
		for (int i = 0; i < k; i ++) {
			pos = (int) Math.floor((k*Math.random()));
			temp = values.get(i);
			values.set(i, values.get(pos));
			values.set(pos, temp);
		}
		return values;
		}
	}

