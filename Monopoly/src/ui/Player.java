package ui;

import java.awt.Color;
import java.awt.Font;

/**
 * The abstract class for the Player
 * 
 * @author Isaiah Smoak
 * @author Zachary Jones
 */

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Player extends JPanel{
	private static final int DEFAULT_MONEY = 1500;
	private static final int WIDTH = 440;
	private static final int HEIGHT = 550;
	/* The name of the player */
	public String name;
	/* amount of money */
	private int balance = DEFAULT_MONEY;
	/* File name of pic */
	public String filename;

	private static String[] playerlist = {"Bailey", "Sean", "Isaiah", "Tyler", "Alex", "Pot"};

	//private final JLabel idk_label;
	private JLabel money_label;
	private JLabel image_label; //image
	private JButton Add200Button;
	private JButton AddMoneyButton;
	private JButton RemoveMoneyButton;
	private JTextField MoneyAmount;
	private JComboBox nameDropDown;
	private int x_location, y_location;

	/**
	 * Constructor of the Player class
	 */
	public Player() {
		this.name = "";
		this.balance = 1500;
		this.filename = "";
		buildGUI();
	}

	public Player(String name, int money, String filename, int locx, int locy) {
		this.x_location = locx;
		this.y_location = locy;
		this.name = name;
		this.balance = money;
		this.filename = filename;
		buildGUI();
	}
	public void setLocation(int xloc, int yloc){
		this.x_location = xloc;
		this.y_location = yloc;
	}

	private void buildGUI() {
		money_label = new JLabel("$"+Integer.toString(balance));
		image_label = new JLabel(); //image
		Add200Button = new JButton("+200");
		AddMoneyButton = new JButton("Add Money");
		RemoveMoneyButton = new JButton("Remove Money");
		MoneyAmount = new JTextField();
		nameDropDown = new JComboBox();
		setBorder(new LineBorder(new Color(0, 90, 0), 10, true));
		setBounds(x_location, y_location, WIDTH, HEIGHT);
		setLayout(null);
		MoneyAmount.setBackground(Color.WHITE);
		MoneyAmount.setBounds(100, 323, 256, 47 );
		MoneyAmount.setColumns(10);
		MoneyAmount.setFont(new Font(Font.SANS_SERIF, 0, 30));
		money_label.setBounds(10, 447, 420, 92);
		money_label.setBackground(Color.WHITE);
		money_label.setOpaque(true);
		this.add(money_label);
		money_label.setHorizontalAlignment(SwingConstants.CENTER);
		money_label.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		money_label.setForeground(new Color(0, 128, 0));
		image_label.setBounds(100, 70, 256, 170);
		image_label.setIcon(new ImageIcon("resources\\monopoly.png"));
		add(image_label);
		Add200Button.setBackground(new Color(0, 128, 0));
		Add200Button.setForeground(Color.BLACK);
		Add200Button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Add200Button.setBounds(100, 270, 256, 40);
		Add200Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMoney(200);
				//webServer.setPlayerList(players);
			}
		});

		add(Add200Button);
		//break
		AddMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		AddMoneyButton.setBackground(new Color(0, 128, 0));
		AddMoneyButton.setBounds(100, 380, 256, 23);
		AddMoneyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMoney(Integer.parseInt(MoneyAmount.getText()));
				//webServer.setPlayerList(players);
			}
		}));

		add(AddMoneyButton);
		RemoveMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		RemoveMoneyButton.setBackground(new Color(165, 42, 42));
		RemoveMoneyButton.setBounds(100, 414, 256, 23);
		RemoveMoneyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					removeMoney(Integer.parseInt(MoneyAmount.getText()));
					//webServer.setPlayerList(players);
				}
				catch (IllegalArgumentException e1){
					createErrorWindow();
				}
			}}));

		add(RemoveMoneyButton);

		add(MoneyAmount);
		nameDropDown.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nameDropDown.setBounds(129, 11, 199, 53);
		nameDropDown.setModel(new DefaultComboBoxModel<String>(playerlist));
		nameDropDown.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = (String) nameDropDown.getSelectedItem();
				//webServer.setPlayerList(players);
			}}));
		nameDropDown.setSelectedItem(name);
		add(nameDropDown);

		//end of GUI
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
		return balance;
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
		repaint();
	}

	public void setMoney(int money) {
		this.balance = money;
		money_label.setText("$" + Integer.toString(this.balance));
		repaint();
	}

	public void addMoney(int money){
		this.balance += money;
		money_label.setText("$" + Integer.toString(this.balance));
		repaint();
		System.out.println( this.name + " total money: " + this.balance);
		checkBankrupt();
	}

	public void removeMoney(int money) throws IllegalArgumentException{
		if(this.balance - money < 0){
			//throw new IllegalArgumentException("Can't go negative");
			createErrorWindow();
			return;
		}
		this.balance -= money;
		money_label.setText("$" + Integer.toString(balance));
		repaint();
		System.out.println("Total money: " + balance);
		checkBankrupt();
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public void createErrorWindow(){
		JFrame error = new JFrame(name);
		error.setSize(675, 200);
		JLabel errormsg = new JLabel("Insufficient Funds! Mortgage or Bankrupt!");
		errormsg.setFont(new Font("Tahoma", Font.BOLD, 30));
		errormsg.setForeground(Color.red);
		error.add(errormsg);
		error.setLocationRelativeTo(null);
		error.setVisible(true);}
	
	public void checkBankrupt() {
		if(balance == 0) {
			this.set
			this.setBackground(Color.TRANSLUCENT);
			this.setOpaque(false);
			
		}
	}
	
	public void reset() {
		this.setOpaque(true);
	}
}
