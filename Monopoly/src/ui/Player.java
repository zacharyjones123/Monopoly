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
	/* The name of the player */
	public String name;
	/* amount of money */
	public int money;
	/* File name of pic */
	public String filename;
	private static final int DEFAULT_MONEY = 1500;
	private static final int WIDTH = 440;
	private static final int HEIGHT = 550;
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
		this.money = 1500;
		this.filename = "";
		buildGUI();
	}
	
	public Player(String name, int money, String filename, int locx, int locy) {
		this.x_location = locx;
		this.y_location = locy;
		this.name = name;
		this.money = money;
		this.filename = filename;
		buildGUI();
	}
	public void setLocation(int xloc, int yloc){
		this.x_location = xloc;
		this.y_location = yloc;
	}
	
	private void buildGUI() {
		money_label = new JLabel("$"+Integer.toString(DEFAULT_MONEY));
		image_label = new JLabel(); //image
		Add200Button = new JButton("+200");
		AddMoneyButton = new JButton("Add Money");
		RemoveMoneyButton = new JButton("Remove Money");
		MoneyAmount = new JTextField();
		nameDropDown = new JComboBox();

		System.out.println("making "+name+" gui w/ " + 10 + " ," + 149);
		setBorder(new LineBorder(new Color(0, 90, 0), 10, true));
		//setBounds(10, 149, 440, 550);
		setBounds(x_location, y_location, WIDTH, HEIGHT);
		setLayout(null);
		MoneyAmount.setBackground(Color.WHITE);
		//MoneyAmount.setBounds(10 + 90, 149 + 174, 256, 47);
		MoneyAmount.setBounds(100, 323, 256, 47 );
		MoneyAmount.setColumns(10);
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
				System.out.println("Adding 200 to p1!");
				System.out.println(name);
				addMoney(200);
				money_label.setText("$" + Integer.toString(money));
				repaint();
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
				System.out.println("Adding 200! P1");
				System.out.println(name);
				addMoney(Integer.parseInt(MoneyAmount.getText()));
				money_label.setText("$" + Integer.toString(money));
				repaint();
				//webServer.setPlayerList(players);

			}
		}));
		
		add(AddMoneyButton);
		RemoveMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		RemoveMoneyButton.setBackground(new Color(165, 42, 42));
		RemoveMoneyButton.setBounds(100, 414, 256, 23);
		RemoveMoneyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Adding special money");
				System.out.println(name);
				try{
					removeMoney(Integer.parseInt(MoneyAmount.getText()));
				money_label.setText("$" + Integer.toString(money));
				repaint();
				//webServer.setPlayerList(players);
				}
				catch (IllegalArgumentException e1){
					JFrame error = new JFrame(name);
					error.setSize(675, 200);
					JLabel errormsg = new JLabel("Insufficient Funds! Mortgage or Bankrupt!");
					errormsg.setFont(new Font("Tahoma", Font.BOLD, 30));
					errormsg.setForeground(Color.red);
					error.add(errormsg);
					error.setLocationRelativeTo(null);
					error.setVisible(true);}
			}
		}));
		
		add(RemoveMoneyButton);
		
		add(MoneyAmount);
		nameDropDown.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nameDropDown.setBounds(129, 11, 199, 53);
		nameDropDown.setModel(new DefaultComboBoxModel<String>(playerlist));
		nameDropDown.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = (String) nameDropDown.getSelectedItem();
				//webServer.setPlayerList(players);
				//repaint panel + change label!
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
		repaint();
	}
	
	public void addMoney(int money){
		this.money += money;
		repaint();
	}
	
	public void removeMoney(int money) throws IllegalArgumentException{
		if(this.money - money < 0)
			throw new IllegalArgumentException("Can't go negative");
		this.money -= money;
		repaint();
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}

}
