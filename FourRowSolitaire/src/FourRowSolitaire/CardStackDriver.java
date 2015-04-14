package FourRowSolitaire;

public class CardStackDriver {

	
	public static void testAdd() 
	{
		try
		{
			Card a = new Card("Hearts", 13, 1, 13);
			CardStack stack1 = new CardStack();
			stack1.addCard(a);
			System.out.println("Card A added");
		}
		catch (Exception e)
		{
			System.out.println ("Error adding a: " + e.getMessage());
		}
		
		try
		{
			Card a = new Card("Hearts", 11, 1, 11), b = new Card("Hearts", 12, 1, 12), c = new Card("Hearts", 13, 1, 13);
			CardStack stackA = new CardStack(), stackB = new CardStack();
			
			stackA.addCard(a);
			stackA.addCard(b);
			stackA.addCard(c);
			
			stackB.addStack(stackA);
			System.out.println("Stack A added to Stack B");
			System.out.println(stackB.getBottom());
		}
		catch (Exception e)
		{
			System.out.println ("Error adding stacks: " + e.getMessage());
		}
	}
	
	public static void testPush()
	{
		try
		{
			Card a = new Card("Hearts", 11, 1, 11);
			CardStack stackA = new CardStack();
			
			Card temp = stackA.push(a);
			System.out.println(stackA.getStack(temp));
		}
		catch (Exception e)
		{
			System.out.println ("Error pushing card: " + e.getMessage());
		}
		
		try
		{
			Card a = new Card("Hearts", 11, 1, 11), b = new Card("Hearts", 12, 1, 12), c = new Card("Hearts", 13, 1, 13);
			CardStack stackA = new CardStack(), stackB = new CardStack();
			
			stackA.addCard(a);
			stackA.addCard(b);
			stackA.addCard(c);
			
			CardStack temp = stackB.push(stackA);
			System.out.println(temp.getStack(0));
		}
		catch (Exception e)
		{
			System.out.println ("Error pushing stack: " + e.getMessage());
		}
	}
	
	public static void testPopAndPeek()
	{
		Card a = new Card("Hearts", 11, 1, 11), b = new Card("Hearts", 12, 1, 12), c = new Card("Hearts", 13, 1, 13);
		CardStack stackA = new CardStack(), stackB = new CardStack();
		System.out.println(stackA.peek());
		
		stackA.addCard(a);
		stackA.addCard(b);
		stackA.addCard(c);
		
		CardStack temp = stackB.pop(stackA);
		System.out.println(temp.peek());
	}
	
	
	public static void TestAvailableCards()
	{
		Card a = new Card("Hearts", 11, 1, 11), b = new Card("Hearts", 12, 1, 12), c = new Card("Hearts", 13, 1, 13);
		Column stackA = new Column();
		CardStack stackB = new CardStack();
		
		stackA.addCard(a);
		stackB.addCard(a);
		stackA.addCard(b);
		stackB.addCard(b);
		stackA.addCard(c);
		stackB.addCard(c);
		
		System.out.println(stackA.getAvailableCards());
		System.out.println(stackB.getAvailableCards());
	}
	
	/*public static void TestValidCard()
	{
		Card a = new Card("Hearts", 13, 1, 13), b = new Card("Spades", 12, 1, 12), c = new Card("Hearts", 11, 1, 11);
		CardStack stackA = new CardStack();
		
		stackA.addCard(a);
		stackA.addCard(b);
		stackA.addCard(c);

	}*/
	
	
	public static void main(String[] args) {
		
		testAdd();
		testPush();
		testPopAndPeek();
		TestAvailableCards();
		
	}

}

