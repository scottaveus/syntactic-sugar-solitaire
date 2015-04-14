package FourRowSolitaire;

import java.awt.Point;
import java.awt.Graphics;
/**
 * 
 */

/**
 * @author Tommy
 *
 */
public class DiscardPileTest {

    public void testSetDrawCount()
    {
    	try{
    	DiscardPile test = new DiscardPile(1);
    	test.setDrawCount(2);
    	test.setDrawCount(1);
    	test.setDrawCount(0);
    	}
    	catch(Exception e){
    		System.out.println("Test failed: DrawCount");
    	}
    	

    }

    public void testGetNumViewableCards()
    {
    	
    	try{
    		DiscardPile test = new DiscardPile(3);
    		test.getNumViewableCards();
    		
    	}
    	catch(Exception e){
    		System.out.print("Test failed: GetNumCards");
    	}

    }

    public void testSetView()
    {
    	try{
    		DiscardPile test = new DiscardPile(3);
    		test.setView(5);
    		
    	}
    	catch(Exception e){
    		System.out.print("Test failed: SetView");
    	}

    }

    public void testAddCard()
    {
    	try{
    		DiscardPile test = new DiscardPile(5);
    		test.addCard(new Card("Hearts",13,1,13));
    		test.addCard(new Card("Null",0,0,0));
    		
    	}
    	catch(Exception e){
    		System.out.print("Test failed: addCard");
    	}

    }

    public void testAddStack()
    {
    	

    	try{
    		DiscardPile test = new DiscardPile(3);
    		Card a = new Card("Hearts", 11, 1, 11), b = new Card("Hearts", 12, 1, 12), c = new Card("Hearts", 13, 1, 13);
    		CardStack stackA = new CardStack(), stackB = new CardStack();
    		
    		stackA.addCard(a);
    		stackA.addCard(b);
    		stackA.addCard(c);
    		
    		stackB.addStack(stackA);
    		test.addStack(stackA);
    		
    	}
    	catch(Exception e){
    		System.out.print("Test failed: addStack");
    	}

    }

    public void testPush()
    {
    	try{
    		DiscardPile test = new DiscardPile(5);
    		test.push(new Card("Hearts",13,1,13));
    		test.push(new Card("Null",0,0,0));
    		
    	}
    	catch(Exception e){
    		System.out.print("Test failed: testPush");
    	}
    	

    }

    public void testPop()
    {
    	try{
    		DiscardPile test = new DiscardPile(5);
    		test.push(new Card("Hearts",13,1,13));
    		test.push(new Card("Null",0,0,0));
    	
    		Card a = new Card("Hearts", 11, 1, 11), b = new Card("Hearts", 12, 1, 12), c = new Card("Hearts", 13, 1, 13);
    		CardStack stackA = new CardStack(), stackB = new CardStack();
    		
    		stackA.addCard(a);
    		stackA.addCard(b);
    		stackA.addCard(c);
    		test.push(stackA);
    		
    		test.isValidMove(new Card("Null",0,0,0));
    		test.isValidMove(stackA);
    		test.pop();
    		test.pop();
    		test.undoPop();
    		test.undoPop();
    		
    		
    		
    	}
    	catch(Exception e){
    		System.out.print("Test failed: testPop.");
    	}


    }
    
 // can't get this to work
    public void testPaint(){
    	
    	try{
    		DiscardPile test = new DiscardPile(3);
    		Graphics graphics; 
    		//test.paint(graphics);
    		
    		
    	}
    	catch(Exception e){
    		System.out.print("Test failed: paint");
    	}
    	
    	
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DiscardPileTest test = new DiscardPileTest();
		test.testAddCard();
		test.testAddStack();
		test.testGetNumViewableCards();
		test.testPop();
		test.testPush();
		test.testSetDrawCount();
		test.testSetView();

	}

}
