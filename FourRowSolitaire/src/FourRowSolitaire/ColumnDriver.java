package FourRowSolitaire;

public class ColumnDriver 
{
    public static void main(String[] args)
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

}
