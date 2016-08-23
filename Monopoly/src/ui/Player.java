package ui;

/**
 * The abstract class for the Player
 * 
 * @author Isaiah Smoak
 * @author Zachary Jones
 */

import java.awt.Point;
import java.io.IOException;

public abstract class Player {
	/* The name of the player */
	public String name;
	/* Current Game */
	public Game game;
	/* high scores */
	
	/**
 	 * Constructor of the Player class
	 */
	public Player() {
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public Game getCurrentGame() {
		return game;
	}
	
	public void setCurrentGame(Game game) {
		this.game = game;
	}
	
	/**
	 * Make move method for the players
	 * 
	 * @return The point where the move was made
	 * @throws IOException
	 */
	public abstract Point makeMove() throws IOException;
	
	/**
	 * Shows the score of the player
	 */
	public void showScore() {
		
	}
	
	/**
	 * Getter method for the name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter method for the name
	 * 
	 * @param name The name of the player
	 */
	public void setName(String name) {
		this.name = name;
	}

}
