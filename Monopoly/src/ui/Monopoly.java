package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Monopoly extends JFrame implements ActionListener{
	private String[] playerlist = {"Bailey", "Sean", "Isaiah", "Tyler", "Alex", "Pot"};
	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private final JLabel lblMonopolyBank = new JLabel("Monopoly Bank");
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel_3 = new JPanel();
	private final JPanel panel_4 = new JPanel();
	private final JPanel panel_5 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("Blueberry");
	private final JLabel lblNewLabel_1 = new JLabel("");
	private final JLabel lblNewLabel_2 = new JLabel("");
	private final JLabel lblNewLabel_3 = new JLabel("");
	private final JButton p1Add200Button = new JButton("+$200");
	private final JButton p1AddMoneyButton = new JButton("Add Money");
	private final JButton p1RemoveMoneyButton = new JButton("Remove Money");
	private final JButton p2Add200Button = new JButton("+$200");
	private final JButton p2AddMoneyButton = new JButton("Add Money");
	private final JButton p2RemoveMoneyButton = new JButton("Remove Money");
	private final JButton p3Add200Button = new JButton("+$200");
	private final JButton p3AddMoneyButton = new JButton("Add Money");
	private final JButton p3RemoveMoneyButton = new JButton("Remove Money");
	private final JButton p4Add200Button = new JButton("+$200");
	private final JButton p4AddMoneyButton = new JButton("Add Money");
	private final JButton p4RemoveMoneyButton = new JButton("Remove Money");
	private final JLabel player_label1 = new JLabel("$"+Integer.toString(DEFAULT_MONEY));
	private final JLabel player_label2 = new JLabel("$"+Integer.toString(DEFAULT_MONEY));
	private final JLabel player_label3 = new JLabel("$" + Integer.toString(DEFAULT_MONEY));
	private final JLabel player_label4 = new JLabel("$" + Integer.toString(DEFAULT_MONEY));
	private final JTextField p1MoneyAmount = new JTextField();
	private final JTextField p2MoneyAmount = new JTextField();
	private final JTextField p3MoneyAmount = new JTextField();
	private final JTextField p4MoneyAmount = new JTextField();
	private final JPanel panel_6 = new JPanel();
	private final JLabel lblPot = new JLabel("Transfer");
	private final JLabel potMoney = new JLabel("$0");
	private final JLabel lblNewLabel_7 = new JLabel("");
	private final JButton transferButton = new JButton("Transfer");
	private final JComboBox transferFromBox = new JComboBox();
	private final JComboBox transferToBox = new JComboBox();
	private final JTextField transferAmount = new JTextField();
	private final JPanel panel_7 = new JPanel();
	private final JLabel label_3 = new JLabel("");
	private final JLabel label_4 = new JLabel("");
	private final static int DEFAULT_MONEY = 1500;
	private static Player[] players = new Player[5];
	private final JComboBox p1DropDown = new JComboBox();
	private final JComboBox p2DropDown = new JComboBox();
	private final JComboBox p3DropDown = new JComboBox();
	private final JComboBox p4DropDown = new JComboBox();
	private static String[] listPlaying; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					players[0] = new Player("Isaiah", DEFAULT_MONEY, "dummy");
					players[1] = new Player("Sean", DEFAULT_MONEY, "dummy");
					players[2] = new Player("Bailey", DEFAULT_MONEY, "Dummy");
					players[3] = new Player("Tyler", DEFAULT_MONEY , "dummy");
					players[4] = new Player("POT", 0, "pot.jpg");
					listPlaying = new String[]{players[0].getName(), players[1].getName(), players[2].getName(), players[3].getName(), players[4].getName()};
					Monopoly frame = new Monopoly();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Monopoly() {
		transferAmount.setBounds(384, 143, 196, 43);
		transferAmount.setColumns(10);
		transferAmount.setFont(new Font("Tahoma", Font.PLAIN, 25));
		p4MoneyAmount.setBackground(Color.WHITE);
		p4MoneyAmount.setBounds(100, 323, 256, 47);
		p4MoneyAmount.setColumns(10);
		p3MoneyAmount.setBounds(100, 321, 256, 47);
		p3MoneyAmount.setColumns(10);
		p2MoneyAmount.setBounds(110, 313, 246, 47);
		p2MoneyAmount.setColumns(10);
		p1MoneyAmount.setBounds(100, 322, 256, 47);
		p1MoneyAmount.setColumns(10);
		initGUI();
	}
	private void initGUI() {
		setBackground(SystemColor.menu);
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\monopoly.png"));
		setTitle("Monopoly");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1062);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, SystemColor.windowText, SystemColor.activeCaption, SystemColor.desktop, SystemColor.activeCaption));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(10, 0, 1884, 111);
		
		contentPane.add(panel);
		lblMonopolyBank.setFont(new Font("Tahoma", Font.PLAIN, 70));
		
		panel.add(lblMonopolyBank);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_1.setBounds(10, 149, 440, 550);
		
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		player_label1.setBounds(10, 447, 420, 92);
		player_label1.setBackground(Color.WHITE);
		player_label1.setOpaque(true);
		panel_1.add(player_label1);
		player_label1.setHorizontalAlignment(SwingConstants.CENTER);
		player_label1.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		player_label1.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBounds(100, 70, 256, 170);
		lblNewLabel.setIcon(new ImageIcon("resources\\monopoly.png"));
		
		panel_1.add(lblNewLabel);
		p1Add200Button.setBackground(new Color(0, 128, 0));
		p1Add200Button.setForeground(Color.BLACK);
		p1Add200Button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		p1Add200Button.setBounds(100, 270, 256, 40);
		p1Add200Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Adding 200 to p1!");
				System.out.println(players[0].getName());
				players[0].addMoney(200);
				player_label1.setText("$" + Integer.toString(players[0].getMoney()));
				panel_1.repaint();
			}
		});
		
		panel_1.add(p1Add200Button);
		
		p1AddMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p1AddMoneyButton.setBackground(new Color(0, 128, 0));
		p1AddMoneyButton.setBounds(100, 380, 256, 23);
		p1AddMoneyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Adding 200! P1");
				System.out.println(players[0].getName());
				players[0].addMoney(Integer.parseInt(p1MoneyAmount.getText()));
				player_label1.setText("$" + Integer.toString(players[0].getMoney()));
				panel_1.repaint();
			}
		}));
		
		panel_1.add(p1AddMoneyButton);
		p1RemoveMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p1RemoveMoneyButton.setBackground(new Color(165, 42, 42));
		p1RemoveMoneyButton.setBounds(100, 414, 256, 23);
		p1RemoveMoneyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Adding special money");
				System.out.println(players[0].getName());
				try{
					players[0].removeMoney(Integer.parseInt(p1MoneyAmount.getText()));
				player_label1.setText("$" + Integer.toString(players[0].getMoney()));
				panel_1.repaint();
				}
				catch (IllegalArgumentException e1){
					JFrame error = new JFrame(players[0].getName());
					error.setSize(675, 200);
					JLabel errormsg = new JLabel("Insufficient Funds! Mortgage or Bankrupt!");
					errormsg.setFont(new Font("Tahoma", Font.BOLD, 30));
					errormsg.setForeground(Color.red);
					error.add(errormsg);
					error.setLocationRelativeTo(null);
					error.setVisible(true);}
			}
		}));
		
		panel_1.add(p1RemoveMoneyButton);
		
		panel_1.add(p1MoneyAmount);
		p1DropDown.setFont(new Font("Tahoma", Font.PLAIN, 20));
		p1DropDown.setBounds(129, 11, 199, 53);
		p1DropDown.setModel(new DefaultComboBoxModel<String>(playerlist));
		p1DropDown.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				players[0].setName((String) p1DropDown.getSelectedItem());
				//repaint panel + change label!
		}}));
		p1DropDown.setSelectedItem(players[0].getName());
		panel_1.add(p1DropDown);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_2.setBounds(490, 149, 440, 550);
		
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		lblNewLabel_1.setBounds(110, 71, 256, 186);
		lblNewLabel_1.setIcon(new ImageIcon("resources//monopoly.png"));
		
		panel_2.add(lblNewLabel_1);
		p2Add200Button.setBackground(new Color(0, 128, 0));
		p2Add200Button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		p2Add200Button.setBounds(110, 268, 256, 40);
		p2Add200Button.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("P2 add $200 button!");
				System.out.println(players[1].getName());
				players[1].addMoney(200);
				player_label2.setText("$" + Integer.toString(players[1].getMoney()));
				panel_2.repaint();
			}
		}));
		panel_2.add(p2Add200Button);
		
		p2AddMoneyButton.setBackground(new Color(0, 128, 0));
		p2AddMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p2AddMoneyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//put code here
				System.out.println("p2 add money regular!");
				players[1].addMoney(Integer.parseInt(p2MoneyAmount.getText()));
				player_label2.setText("$" + Integer.toString(players[1].getMoney()));
				panel_2.repaint();
			}
		});
		p2AddMoneyButton.setBounds(110, 371, 246, 23);
		
		panel_2.add(p2AddMoneyButton);
		p2RemoveMoneyButton.setBackground(new Color(165, 42, 42));
		p2RemoveMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p2RemoveMoneyButton.setBounds(110, 405, 246, 23);
		p2RemoveMoneyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("p2 remove money button");
				System.out.println(players[1].getName());
				try{
					players[1].removeMoney(Integer.parseInt(p2MoneyAmount.getText()));
				player_label2.setText("$" + Integer.toString(players[1].getMoney()));
				panel_2.repaint();
				}
				catch (IllegalArgumentException op){
					JFrame error = new JFrame(players[1].getName());
					error.setSize(675, 200);
					JLabel errormsg = new JLabel("Insufficient Funds! Mortgage or Bankrupt!");
					errormsg.setFont(new Font("Tahoma", Font.BOLD, 30));
					errormsg.setForeground(Color.red);
					error.add(errormsg);
					error.setLocationRelativeTo(null);
					error.setVisible(true);
				}
			}
		}));
		
		panel_2.add(p2RemoveMoneyButton);
		player_label2.setBackground(Color.WHITE);
		player_label2.setHorizontalAlignment(SwingConstants.CENTER);
		player_label2.setForeground(new Color(0, 128, 0));
		player_label2.setOpaque(true);
		player_label2.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		player_label2.setBounds(10, 439, 420, 100);
		
		panel_2.add(player_label2);
		
		panel_2.add(p2MoneyAmount);
		p2DropDown.setFont(new Font("Tahoma", Font.PLAIN, 20));
		p2DropDown.setBounds(134, 11, 199, 53);
		p2DropDown.setModel(new DefaultComboBoxModel<String>(playerlist));
		p2DropDown.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				players[1].setName((String) p2DropDown.getSelectedItem());
				//repaint panel + change label!
		}}));
		p2DropDown.setSelectedItem(players[1].getName());

		panel_2.add(p2DropDown);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_3.setBounds(970, 149, 440, 550);
		
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		lblNewLabel_2.setBounds(100, 70, 256, 187);
		lblNewLabel_2.setIcon(new ImageIcon("resources//monopoly.png"));
		
		panel_3.add(lblNewLabel_2);
		p3Add200Button.setBackground(new Color(0, 128, 0));
		p3Add200Button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		p3Add200Button.setBounds(100, 273, 256, 40);
		p3Add200Button.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("p3 add 200 button!");
				System.out.println(players[2].getName());
				players[2].addMoney(200);
				player_label3.setText("$" + Integer.toString(players[2].getMoney()));
				panel_3.repaint();
			}
		} ));
		
		panel_3.add(p3Add200Button);
		
		p3AddMoneyButton.setBackground(new Color(0, 128, 0));
		p3AddMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p3AddMoneyButton.setBounds(100, 379, 256, 23);
		p3AddMoneyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("p3 add regular money!");
				System.out.println(players[2].getName());
				players[2].addMoney(Integer.parseInt(p3MoneyAmount.getText()));
				player_label3.setText("$" + Integer.toString(players[2].getMoney()));
				panel_3.repaint();
			}
		}));
		
		panel_3.add(p3AddMoneyButton);
		p3RemoveMoneyButton.setBackground(new Color(165, 42, 42));
		p3RemoveMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p3RemoveMoneyButton.setBounds(100, 413, 256, 23);
		p3RemoveMoneyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("p3 remove money button!");
				System.out.println(players[2].getName());
				try{
					players[2].removeMoney(Integer.parseInt(p3MoneyAmount.getText()));
				player_label3.setText("$" + Integer.toString(players[2].getMoney()));
				panel_3.repaint();
				}
				catch (IllegalArgumentException os){
					JFrame error = new JFrame(players[2].getName());
					error.setSize(675, 200);
					JLabel errormsg = new JLabel("Insufficient Funds! Mortgage or Bankrupt!");
					errormsg.setFont(new Font("Tahoma", Font.BOLD, 30));
					errormsg.setForeground(Color.red);
					error.add(errormsg);
					error.setLocationRelativeTo(null);
					error.setVisible(true);
				}
			}
		}));
		
		panel_3.add(p3RemoveMoneyButton);
		player_label3.setOpaque(true);
		player_label3.setBackground(Color.WHITE);
		player_label3.setHorizontalAlignment(SwingConstants.CENTER);
		player_label3.setForeground(new Color(0, 128, 0));
		player_label4.setOpaque(true);
		player_label3.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		player_label3.setBounds(10, 447, 420, 92);
		
		panel_3.add(player_label3);
		
		panel_3.add(p3MoneyAmount);
		p3DropDown.setFont(new Font("Tahoma", Font.PLAIN, 20));
		p3DropDown.setBounds(134, 11, 199, 53);
		p3DropDown.setModel(new DefaultComboBoxModel<String>(playerlist));
		p3DropDown.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				players[2].setName((String) p3DropDown.getSelectedItem());
				//repaint panel + change label!
		}}));
		p3DropDown.setSelectedItem(players[2].getName());

		panel_3.add(p3DropDown);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_4.setBounds(1454, 149, 440, 550);
		
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		lblNewLabel_3.setBounds(100, 70, 256, 196);
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setIcon(new ImageIcon("resources//monopoly.png"));
		
		panel_4.add(lblNewLabel_3);
		p4Add200Button.setBackground(new Color(0, 128, 0));
		p4Add200Button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		p4Add200Button.setBounds(100, 277, 256, 40);
		p4Add200Button.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("p4 add 200 button!");
				System.out.println(players[3].getName());
				players[3].addMoney(200);
				player_label4.setText("$" + Integer.toString(players[3].getMoney()));
				panel_4.repaint();
			}
		} ));
		panel_4.add(p4Add200Button);
		p4AddMoneyButton.setBackground(new Color(0, 128, 0));
		p4AddMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p4AddMoneyButton.setBounds(100, 381, 256, 23);
		p4AddMoneyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("p4 add regular money!");
				System.out.println(players[0].getName());
				players[3].addMoney(Integer.parseInt(p4MoneyAmount.getText()));
				player_label4.setText("$" + Integer.toString(players[3].getMoney()));
				panel_4.repaint();
			}
		} ));
		
		panel_4.add(p4AddMoneyButton);
		p4RemoveMoneyButton.setBackground(new Color(165, 42, 42));
		p4RemoveMoneyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p4RemoveMoneyButton.setBounds(100, 415, 256, 23);
		p4RemoveMoneyButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("p4 remove money button!");
				System.out.println(players[0].getName());
				try{
					players[3].removeMoney(Integer.parseInt(p4MoneyAmount.getText()));
				player_label4.setText("$" + Integer.toString(players[3].getMoney()));
				panel_4.repaint();
				}
				catch (IllegalArgumentException um){;
				JFrame error = new JFrame(players[3].getName());
				error.setSize(675, 200);
				JLabel errormsg = new JLabel("Insufficient Funds! Mortgage or Bankrupt!");
				errormsg.setFont(new Font("Tahoma", Font.BOLD, 30));
				errormsg.setForeground(Color.red);
				error.add(errormsg);
				error.setLocationRelativeTo(null);
				error.setVisible(true);
				}
			}
		} ));
		panel_4.add(p4RemoveMoneyButton);
		player_label4.setBackground(Color.WHITE);
		player_label4.setHorizontalAlignment(SwingConstants.CENTER);
		player_label4.setOpaque(true);
		player_label4.setForeground(new Color(0, 128, 0));
		player_label4.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		player_label4.setBounds(10, 449, 420, 90);
		
		panel_4.add(player_label4);
		
		panel_4.add(p4MoneyAmount);
		p4DropDown.setFont(new Font("Tahoma", Font.PLAIN, 20));
		p4DropDown.setBounds(128, 11, 199, 53);
		p4DropDown.setModel(new DefaultComboBoxModel<String>(playerlist));
		p4DropDown.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				players[3].setName((String) p4DropDown.getSelectedItem());
				//repaint panel + change label!
		}}));
		p4DropDown.setSelectedItem(players[3].getName());

		panel_4.add(p4DropDown);
		panel_5.setBackground(new Color(192, 192, 192));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_5.setBounds(982, 725, 701, 288);
		
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		label_4.setBounds(52, 11, 264, 266);
		panel_5.add(label_4);
		label_4.setIcon(new ImageIcon("C:\\Users\\zjones\\git\\Monopoly\\Monopoly\\resources\\free_parking.jpg"));
		panel_7.setBounds(338, 24, 292, 234);
		panel_5.add(panel_7);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_7.setLayout(null);
		potMoney.setBounds(30, 79, 236, 64);
		panel_7.add(potMoney);
		potMoney.setOpaque(true);
		potMoney.setForeground(Color.GREEN);
		potMoney.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
		potMoney.setBackground(SystemColor.textInactiveText);
		label_3.setBounds(266, 47, 0, 0);
		
		panel_7.add(label_3);
		panel_6.setBackground(new Color(192, 192, 192));
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_6.setBounds(25, 725, 612, 288);
		
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		lblPot.setBounds(108, 11, 238, 71);
		lblPot.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		
		panel_6.add(lblPot);
		transferButton.setBackground(Color.GREEN);
		transferButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		transferButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("transferring money!");
				String donator = (String) transferFromBox.getSelectedItem();
				String acceptor = (String) transferToBox.getSelectedItem();
				//subtract money
				for(Player p : players){
					if(p.getName().equals(donator))
						try{
						p.removeMoney(Integer.parseInt(transferAmount.getText()));}
						catch (IllegalArgumentException mo){
							JFrame error = new JFrame(p.getName());
							error.setSize(675, 200);
							JLabel errormsg = new JLabel("Insufficient Funds! Mortgage or Bankrupt!");
							errormsg.setFont(new Font("Tahoma", Font.BOLD, 30));
							errormsg.setForeground(Color.red);
							error.add(errormsg);
							error.setLocationRelativeTo(null);
							error.setVisible(true);
							return;}
				}
				//did NOT include checking to see if player there... oh well
				for(Player p : players){
					if(p.getName().equals(acceptor))
						p.addMoney(Integer.parseInt(transferAmount.getText()));
						player_label1.setText("$"+Integer.toString(players[0].getMoney()));
						player_label2.setText("$"+Integer.toString(players[1].getMoney()));
						player_label3.setText("$"+Integer.toString(players[2].getMoney()));
						player_label4.setText("$"+Integer.toString(players[3].getMoney()));
						potMoney.setText("$" + Integer.toString(players[4].getMoney()));
						contentPane.repaint(); //stopppp
				}
			}
		});
		transferButton.setBounds(390, 197, 196, 62);
		
		panel_6.add(transferButton);
		transferFromBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		//System.out.println(listPlaying);
		transferFromBox.setModel(new DefaultComboBoxModel<String>(listPlaying));
		transferFromBox.setBounds(390, 21, 199, 53);
		
		panel_6.add(transferFromBox);
		transferToBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		transferToBox.setModel(new DefaultComboBoxModel<String>(listPlaying));
		transferToBox.setBounds(387, 79, 199, 53);
		
		panel_6.add(transferToBox);
		
		panel_6.add(transferAmount);
		lblNewLabel_7.setBounds(0, 0, 1894, 1013);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon("resources\\background.jpg"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
