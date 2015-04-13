package FourRowSolitaire;

public class SolitaireBoardDriver 
{
    public static void main(String[] args)
    {
        SolitaireBoard board = new SolitaireBoard();
        
        board.createBoard(null);
        
        board.newGame(0);
        
        board.setAppearance(0, 0);
        
        board.getDrawCount();
        
        board.setDrawCount(0);
        
        board.getNewDrawCount();
        
        board.setNewDrawCount(0);
        
        board.getDeckNumber();
        
        board.setDeckNumber(0);
        
        board.getBackgroundNumber();
        
        board.setBackgroundNumber(0);
        
        board.getTimerNextGameStatus();
        
        board.getTimerStatus();
        
        board.setTimerStatus(0);
        
        board.getWinAnimationStatus();
        
        board.setWinAnimationStatus(0);
        
        board.getWinSoundsStatus();
        
        board.setWinSoundsStatus(0);
        
        board.getDifficulty();
        
        board.setDifficulty(0);
        
        board.getNewDifficulty();
        
        board.setNewDifficulty(0);
        
        board.setDeckThroughs(0);
        
        board.undoMove();
        
        board.getHint();
        
        
    }

}
