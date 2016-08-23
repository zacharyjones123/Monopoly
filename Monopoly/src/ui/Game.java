package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public abstract class Game {
	
	public final static Color saddleBrown = new Color(139, 69, 19);
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	
	/* The height of the end frame */
	public final static int END_FRAME_HEIGHT = 150;
	/* The width of the end frame */
	public final static int END_FRAME_WIDTH = 500;
	
	private int frameHeight;
	private int frameWidth;
	private int minFrameHeight;
	private int minFrameWidth;
	private int maxFrameHeight;
	private int maxFrameWidth;
	private JFrame gameFrame;
	private JPanel gamePanel;
	private Player players[];
	private int playerNum;
	
	public Game(String gameTitle,
			String gameIcon,
			JFrame gameFrame,
			JPanel gamePanel,
			int frameHeight,
			int frameWidth,
			int minFrameHeight,
			int minFrameWidth,
			int playerNum)
		{
		this.frameHeight = frameHeight;
		this.frameWidth = frameWidth;
		this.minFrameHeight = minFrameHeight;
		this.minFrameWidth = minFrameWidth;
		this.players = new Player[2];
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu0 = new JMenu("Games");
		menu0.setName("Games");
		JMenuItem menuItem01 = new JMenuItem("TicTacToe",
                new ImageIcon("icons/ticTacToeIcon.gif"));
		menuItem01.setName("TicTacToe");
		menu0.add(menuItem01);
		JMenuItem menuItem02 = new JMenuItem("ConnectFour",
                new ImageIcon("icons/connectFour.png"));
		menuItem02.setName("Connect4");
		menu0.add(menuItem02);
		JMenuItem menuItem03 = new JMenuItem("Hangman",
                new ImageIcon("icons/hangman.png"));
		menuItem03.setName("Hangman");
		menu0.add(menuItem03);
		JMenuItem menuItem04 = new JMenuItem("Pong",
                new ImageIcon("icons/pong.png"));
		menuItem04.setName("Pong");
		menu0.add(menuItem04);
		JMenuItem menuItem05 = new JMenuItem("Snake",
                new ImageIcon("icons/snake.png"));
		menuItem05.setName("Snake");
		menu0.add(menuItem05);
		JMenuItem menuItem06 = new JMenuItem("BrickBreaker",
                new ImageIcon("icons/brickBreaker.png"));
		menuItem06.setName("BrickBreaker");
		menu0.add(menuItem06);
		JMenuItem menuItem07 = new JMenuItem("TriviaGame",
                new ImageIcon("icons/triviaGame.png"));
		menuItem07.setName("TriviaGame");
		menu0.add(menuItem07);
		JMenuItem menuItem08 = new JMenuItem("WordWhomp",
                new ImageIcon("icons/wordWhomp.png"));
		menuItem08.setName("WordWhomp");
		menu0.add(menuItem08);
		
		JMenu menu1 = new JMenu("Player");
		menu1.setName("Player");
		JMenuItem menuItem11 = new JMenuItem("Name");
		menuItem11.setName("Name");
		menu1.add(menuItem11);
		JMenuItem menuItem12 = new JMenuItem("Awards");
		menuItem12.setName("Awards");
		menu1.add(menuItem12);
		JMenuItem menuItem13 = new JMenuItem("Data");
		menuItem13.setName("Data");
		menu1.add(menuItem13);
		JMenuItem menuItem14 = new JMenuItem("HighScores");
		menuItem14.setName("HighScores");
		menu1.add(menuItem14);
		JMenuItem menuItem15 = new JMenuItem("Trophies");
		menuItem15.setName("Trophies");
		menu1.add(menuItem15);
		
		JMenu menu2 = new JMenu("Load");
		menu2.setName("Load");
		JMenuItem menuItem21 = new JMenuItem("Game1");
		menuItem21.setName("Game1");
		menu2.add(menuItem21);
		JMenuItem menuItem22 = new JMenuItem("Game2");
		menuItem22.setName("Game2");
		menu2.add(menuItem22);
		JMenuItem menuItem23 = new JMenuItem("Game3");
		menuItem23.setName("Game3");
		menu2.add(menuItem23);
		JMenuItem menuItem24 = new JMenuItem("Game4");
		menuItem24.setName("Game4");
		menu2.add(menuItem24);
		
		JMenu menu3 = new JMenu("Save");
		menu3.setName("Save");
		JMenuItem menuItem31 = new JMenuItem("Game1");
		menuItem31.setName("Game1");
		menu3.add(menuItem31);
		JMenuItem menuItem32 = new JMenuItem("Game2");
		menuItem32.setName("Game2");
		menu3.add(menuItem32);
		JMenuItem menuItem33 = new JMenuItem("Game3");
		menuItem33.setName("Game3");
		menu3.add(menuItem33);
		JMenuItem menuItem34 = new JMenuItem("Game4");
		menuItem34.setName("Game4");
		menu3.add(menuItem34);
		
		JMenu menu4 = new JMenu("Misc");
		menu4.setName("Misc");
		JMenuItem menuItem41 = new JMenuItem("About");
		menuItem41.setName("About");
		menu4.add(menuItem41);
		
		JMenu menuHelp = new JMenu("Help");
		menuHelp.setName("Help");
		
		menuBar.add(menu0);
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);
		
		gameFrame.setJMenuBar(menuBar);
		
		Dimension minSize = new Dimension(minFrameHeight, minFrameWidth);
		
		gameFrame.setSize(frameHeight, frameWidth);
		gameFrame.setMinimumSize(minSize);
		//gamePanel.setForeground(Color.YELLOW);
		//gamePanel.setBackground(Color.BLACK);
		gameFrame.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		gameFrame.setTitle(gameTitle);
		ImageIcon icon = createImageIcon("icons/" + gameIcon,
                "a pretty but meaningless splat");
		gameFrame.setIconImage(icon.getImage());
		gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.gamePanel = gamePanel;
		this.gameFrame = gameFrame;
		
		this.playerNum = playerNum;
		
		getGameFrame().setLocation((Game.getScreenSize().width / 2) - this.getGameFrame().getWidth()/2, (Game.getScreenSize().height / 2) - this.getGameFrame().getHeight()/2);
	}
	
	public int getFrameHeight() {
		return frameHeight;
	}
	
	public int getFrameWidth() {
		return frameWidth;
	}
	
	public int getMinFrameHeight() {
		return minFrameHeight;
	}
	
	public int getMinFrameWidth() {
		return minFrameWidth;
	}
	
	public int getMaxFrameHeight() {
		return maxFrameHeight;
	}
	
	public int getMaxFrameWidth() {
		return maxFrameWidth;
	}
	
	public JFrame getGameFrame() {
		return gameFrame;
	}
	
	public JPanel getGamePanel() {
		return gamePanel;
	}
	
	public void setGameFrame(JFrame gameFrame) {
		this.gameFrame = gameFrame;
	}
	
	public void setGamePanel(JPanel gamePanel) {
		this.gameFrame.add(gamePanel);
		this.gamePanel = gamePanel;
		//this.gameFrame.pack();
	}
	
	public void setPlayer(int i, Player player) {
		this.players[i] = player;
	}
	
	public Player getPlayer(int i) {
		return players[i];
	}
	
	public int getPlayerNum() {
		return playerNum;
	}
	
	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}
	
	public static Dimension getScreenSize() {
		return screenSize;
	}
	
	public abstract boolean updateMove(int numx, int numy, Player p1);
	
	/** Returns an ImageIcon, or null if the path was invalid. */
	protected ImageIcon createImageIcon(String path,
	                                           String description) {
		ImageIcon imageIcon = new ImageIcon(path, description);
	    if (imageIcon.equals(null)) {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
		return imageIcon;
	}
	
}
