package FourRowSolitaire;

public class ChangeAppearanceDriver {

	public static void main(String[] args) {
		FourRowSolitaire newGame = new FourRowSolitaire();
		ChangeAppearance testA = new ChangeAppearance(newGame, newGame.getDeckNumber(), newGame.getBackgroundNumber());
		
		//Varies output on close
		System.out.println(testA.getDeckNumber());
		System.out.println(testA.getBackgroundNumber());
		
	}

}
