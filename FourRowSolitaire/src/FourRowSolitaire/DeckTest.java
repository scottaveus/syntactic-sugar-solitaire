package FourRowSolitaire;
import java.util.LinkedList;

public class DeckTest {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		Deck test = new Deck(1);
		test.getDeck();
		test.shuffle();
		
		for (Card card:test.getDeck())
			System.out.println(card.getNumber() + " of " + card.getSuit());
		System.out.println();
		
		list.add(1);
		list.add(15);
		list.add(32);
		list.add(6);
		
		test.getDeck(list);
		
		for (Card card:test.getDeck()){
			System.out.println(card.getNumber() + " of " + card.getSuit());
			list.pop();
		}
		System.out.println();
		
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		test.getDeck(list);
		
		for (Card card:test.getDeck()){
			System.out.println(card.getNumber() + " of " + card.getSuit());
			list.pop();
		}
		
		list.add(999);
		list.add(999);
		list.add(999);
		list.add(999);
		test.getDeck(list);
		
		for (Card card:test.getDeck()){
			System.out.println(card.getNumber() + " of " + card.getSuit());
			list.pop();
		}
		
			


		


	}

}
