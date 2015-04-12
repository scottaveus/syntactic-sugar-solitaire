package FourRowSolitaire;

public class ColumnDriver 
{
    private static void testEmptyPile()
    {
        Card nullCard = null;
        Card invalidCard = new Card("Spades", 11, 1, 11); // Jack of Spades
        Card validCard = new Card("Hearts", 13, 1, 13); // King of Hearts
        
        Column col = new Column();
        
        // Null card
        try
        {
            Card resultCard = col.push(nullCard);
            
            System.out.println(resultCard.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println("Attempting to push null card resulted in NullPointerException");
        }
        
        // Invalid card
        try
        {
            Card resultCard = col.push(invalidCard);
            
            System.out.println(resultCard.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println("Attempting to push invalid card resulted in NullPointerException");
        }
        
        // Valid card
        try
        {
            Card resultCard = col.push(validCard);
            
            System.out.println(resultCard.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println("Attempting to push valid card resulted in NullPointerException");
        }
    }
    
    private static void testNonEmptyPile()
    {
        Column col = new Column();
        Card startCard = new Card("Hearts", 13, 1, 13); // King of Hearts
        col.push(startCard);

        Card nullCard = null;
        Card invalidCard = new Card("Spades", 11, 1, 11); // Jack of Spades
        Card validCard = new Card("Spades", 12, 1, 12); // Queen of Spades

        
        // Null card
        try
        {
            Card resultCard = col.push(nullCard);
            
            System.out.println(resultCard.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println("Attempting to push null card resulted in NullPointerException");
        }
        
        // Invalid card
        try
        {
            Card resultCard = col.push(invalidCard);
            
            System.out.println(resultCard.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println("Attempting to push invalid card resulted in NullPointerException");
        }
        
        // Valid card
        try
        {
            Card resultCard = col.push(validCard);
            
            System.out.println(resultCard.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println("Attempting to push valid card resulted in NullPointerException");
        }
    }
    
    private static void testValidMove()
    {
        Column emptyCol = new Column();
        Card validCard = new Card("Hearts", 13, 1, 13); // King of Hearts
        boolean result;
        
        result = emptyCol.isValidMove(validCard);
        
        if (result == true)
        {
            System.out.println("Passing King of Hearts to empty pile is a VALID move");
        }
        else
        {
            System.out.println("Passing King of Hearts to empty pile is an INVALID move");
        }
    }
    
    private static void testInvalidMove()
    {
        Column col = new Column();
        Card validCard = new Card("Hearts", 13, 1, 13); // King of Hearts
        Card invalidCard = new Card("Spades", 1, 1, 1); // Ace of Spades
        boolean result;
        
        col.push(validCard);
        result = col.isValidMove(invalidCard);
        
        if (result == true)
        {
            System.out.println("Passing Ace of Spades to pile is a VALID move");
        }
        else
        {
            System.out.println("Passing Ace of Spades to pile is an INVALID move");
        }
        
    }
    
    public static void main(String[] args)
    {
        testEmptyPile();
        testNonEmptyPile();
        testValidMove();
        testInvalidMove();
    }

}
