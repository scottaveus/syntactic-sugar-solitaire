package FourRowSolitaire;

public class AcePileDriver 
{
    private static void testSetAndGetSuit()
    {
        String suitString = "Hearts";
        
        AcePile ap = new AcePile(suitString);
        
        String suit = ap.getSuit();
        
        System.out.println("You tried: " + suitString);
        System.out.println("getSuit(): " + suit);
        
        if (suit.equals(suitString))
        {
            System.out.println("MATCH");
        }
    }
    
    private static void testEmptyPile()
    {
        String suitString = "Spades";
        
        AcePile ap = new AcePile(suitString);
        
        Card aceCard = new Card("Spades", 1, 1, 1);
        
        // Ace of Spades
        try
        {
            ap.push(aceCard);
            
            System.out.println("Pushing Ace of " + suitString + " successful");
        }
        catch (NullPointerException e)
        {
            System.out.println("Attempting to push Ace of " + suitString + " resulted in NullPointerException");
        }
    }
    
    private static void testNonEmptyPile()
    {
        String suitString = "Spades";
        
        AcePile ap = new AcePile(suitString);
        
        Card aceCard = new Card("Spades", 1, 1, 1);
        
        ap.push(aceCard);
        
        Card twoCard = new Card("Spades", 2, 2, 2);
        
        // 2 of Spades
        try
        {
            ap.push(twoCard);
            
            System.out.println("Pushing 2 of " + suitString + " successful");
        }
        catch (NullPointerException e)
        {
            System.out.println("Attempting to push 2 of " + suitString + " resulted in NullPointerException");
        }
    }
    
    private static void testValidMove()
    {
        // Test valid move
        String suitString = "Spades";
        
        Card sameSuit = new Card(suitString, 2, 2, 2);
        
        AcePile ap = new AcePile(suitString);
        
        boolean result;
        result = ap.isValidMove(sameSuit);
        
        if (result == true)
        {
            System.out.println("Valid move");
        }
        
        else
        {
            System.out.println("Invalid move");
        }
        
        // Test valid move with nonempty pile
        
        Card aceCard = new Card(suitString, 1,1,1);
        Card nextCard = new Card(suitString, 2,2,2);
        
        ap.push(aceCard);
        
        result = ap.isValidMove(nextCard);
        
        if (result == true)
        {
            System.out.println("Valid move");
        }
        
        else
        {
            System.out.println("Invalid move");
        }
        
        // Test invalid move
        Card badsuit = new Card("Hearts", 3, 3, 3);
        
        result = ap.isValidMove(badsuit);
        
        if (result == true)
        {
            System.out.println("Valid move");
        }
        
        else
        {
            System.out.println("Invalid move");
        }
        
        // Test invalid stack move
        CardStack stack = new CardStack();
        
        result = ap.isValidMove(stack);
        
        if (result == true)
        {
            System.out.println("Valid move");
        }
        
        else
        {
            System.out.println("Invalid move");
        }
    }
    
    private static void testPoint()
    {
        AcePile ap = new AcePile("Hearts");
        
        try
        {
            Card resultCard = ap.getCardAtLocation(0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args)
    {
        testSetAndGetSuit();
        testEmptyPile();
        testNonEmptyPile();
        testValidMove();
        testPoint();
    }
}
