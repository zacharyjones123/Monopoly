package ui;

/**
 * The abstract class for the Player
 * 
 * @author Isaiah Smoak
 * @author Zachary Jones
 */

import java.awt.Point;
import java.io.IOException;

public class Player {
	/* The name of the player */
	public String name;
	/* amount of money */
	public int money;
	/* File name of pic */
	public String filename;
	
	/**
 	 * Constructor of the Player class
	 */
	public Player() {
		this.name = "";
		this.money = 1500;
		this.filename = "";
	}
	
	public Player(String name, int money, String filename) {
		this.name = name;
		this.money = money;
		this.filename = filename;
	}
	
	/**
	 * Getter method for the name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public String getFilename() {
		return filename;
	}
	
	/**
	 * Setter method for the name
	 * 
	 * @param name The name of the player
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}

}
