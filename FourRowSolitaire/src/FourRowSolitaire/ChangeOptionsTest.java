package FourRowSolitaire;

import javax.swing.*;

public class ChangeOptionsTest {
	
	public static void main(String[] args){
		
		JFrame parent = new JFrame();
		ChangeOptions test = new ChangeOptions(parent,1,1,1,1,1);
		
		// Check to see if every option updates properly
		System.out.println("Draw Count: " + test.getDrawCount());
		System.out.println("Timer: " + test.getTimer());
		System.out.println("Animation: " + test.getAnimation());
		System.out.println("Sounds: " + test.getSounds());
		System.out.println("Difficulty: " + test.getDifficulty());
		
		test = new ChangeOptions(parent,2,2,2,2,2);
		
		// Check to see if every option updates properly
		System.out.println("Draw Count: " + test.getDrawCount());
		System.out.println("Timer: " + test.getTimer());
		System.out.println("Animation: " + test.getAnimation());
		System.out.println("Sounds: " + test.getSounds());
		System.out.println("Difficulty: " + test.getDifficulty());
		
		test = new ChangeOptions(parent,3,3,3,3,3);
		
		// Check to see if every option updates properly
		System.out.println("Draw Count: " + test.getDrawCount());
		System.out.println("Timer: " + test.getTimer());
		System.out.println("Animation: " + test.getAnimation());
		System.out.println("Sounds: " + test.getSounds());
		System.out.println("Difficulty: " + test.getDifficulty());
		
		
		
		
		
		
		
	}
	
	

}
