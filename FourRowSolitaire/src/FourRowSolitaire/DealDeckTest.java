package FourRowSolitaire;
/**
 * @author Tommy
 *
 */
public class DealDeckTest {
	
	
	
	public void testReset(){
		try{
		DiscardPile discard = new DiscardPile(1);
		DealDeck test = new DealDeck(discard, 3);
		test.reset();
		}
		catch(Exception e){
			System.out.println("Test failed.");
		}
		
		
	}
	public void testUndone(){
		DiscardPile discard = new DiscardPile(1);
		DealDeck test = new DealDeck(discard, 1);
		// test.undone(); - nope lmao this is private i tried curse you matt stephen
		
	}
	public void testGetDeckThroughs(){
		
		try{
		DiscardPile discard = new DiscardPile(1);
		DealDeck test = new DealDeck(discard, 1);
		System.out.println(test.getDeckThroughs());
		DealDeck test2 = new DealDeck(discard, 1);
		test2.setDeckThroughs(3);
		System.out.println(test2.getDeckThroughs());
		}
		catch(Exception e){
			System.out.println("Test failed.");
		}
		
		
	}
	public void testPop(){
		try{
		DiscardPile discard = new DiscardPile(1);
		Card testCard = new Card("Spades",1,1,1);
		discard.add(testCard);
		DealDeck test = new DealDeck(discard, 1);
		test.pop();
		}
		catch(Exception e){
			System.out.println("Test failed.");
		}
		
		
	}
	public void testHasDealsLeft(){
		
		try{
		DiscardPile discard = new DiscardPile(1);
		Card testCard = new Card("Spades",1,1,1);
		discard.add(testCard);
		DealDeck test = new DealDeck(discard, 1);
		System.out.println(test.hasDealsLeft());
		}
		catch(Exception e){
			System.out.print("Test failed.");
		}
		
	}
	public void testPeek(){
		
		try{
		DiscardPile discard = new DiscardPile(1);
		Card testCard = new Card("Spades",1,1,1);
		discard.add(testCard);
		DealDeck test = new DealDeck(discard, 1);
		System.out.println(test.peek());
		}
		catch(Exception e){
			System.out.println("Test failed.");
		}
		
		
	}
	public void testIsValidMove(){
		
		try{
		DiscardPile discard = new DiscardPile(1);
		Card a = new Card("Hearts", 11, 1, 11), b = new Card("Hearts", 12, 1, 12), c = new Card("Hearts", 13, 1, 13);
		DealDeck test = new DealDeck(discard, 1);
		CardStack stackA = new CardStack(), stackB = new CardStack();
		
		stackA.addCard(a);
		stackA.addCard(b);
		stackA.addCard(c);
		stackB.addStack(stackA);
		
		test.isValidMove(stackB);
		}
		catch(Exception e){
			System.out.println("Test failed.");
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DealDeckTest test = new DealDeckTest();
		test.testGetDeckThroughs();
		test.testHasDealsLeft();
		test.testIsValidMove();
		test.testPeek();
		test.testPop();
		test.testReset();



	}

}
