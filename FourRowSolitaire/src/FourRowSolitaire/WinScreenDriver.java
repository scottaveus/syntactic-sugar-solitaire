package FourRowSolitaire;

public class WinScreenDriver {
	
	public static void main( String[] args)
	{
		//WinScreen uses a random number generator to choose sounds
		//For loop executes to attempt to use all random numbers 0-3
		for(int n = 0; n < 10; n++)
		{
			WinScreen x = new WinScreen(1, 1);
			x = null;
		}
		
		for(int n = 0; n < 10; n++)
		{
			WinScreen x = new WinScreen(0, 1);
			x = null;
		}
		
		System.exit(0);
		
	}
}
