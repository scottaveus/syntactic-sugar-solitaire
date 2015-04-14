package FourRowSolitaire;
import java.awt.Point;

public class SingleCellTest {
	
	public void testPush(){
		try{
			SingleCell test = new SingleCell();
			test.push(new Card("Hearts",13,1,13));
			test.push(new Card("Null",0,0,0));
			
		}
		catch(Exception e){
			System.out.print("test failed.");
		}
		
	}
	public void testGetCardLocation(){
		try{
			SingleCell test = new SingleCell();
			test.push(new Card("Hearts",13,1,13));
			test.getCardAtLocation(new Point(0,0));
			
		}
		catch(Exception e){
			System.out.print("test failed.");
		}
		
	}
	public void isValidMove(){
		try{
			SingleCell test = new SingleCell();
			test.push(new Card("Diamonds",4,6,2));
			test.isValidMove(new Card("Spades",3,2,3));
			test.isValidMove(new CardStack());
			
		}
		catch(Exception e){
			System.out.print("test failed.");
		}
	}

	public static void main(String[] args) {
		SingleCellTest test = new SingleCellTest();
		test.testPush();
		test.testGetCardLocation();
		test.isValidMove();


	}

}
