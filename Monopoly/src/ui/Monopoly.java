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
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Monopoly extends JFrame implements ActionListener{
	private String[] playerlist = {"Bailey", "Sean", "Isaiah", "Tyler", "Alex", "Pot"};
	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private final JLabel lblMonopolyBank = new JLabel("Monopoly Bank");
	private final JPanel panel_5 = new JPanel();
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
	public final static String newline = System.lineSeparator();
	public Player[] players;
	private HttpWebServer webServer;
	private static String[] listPlaying;
	public int pot = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	 * @throws IOException 
	 */
	public Monopoly() throws IOException {
		webServer = new HttpWebServer(80, this);
		transferAmount.setBounds(384, 143, 196, 43);
		transferAmount.setColumns(10);
		transferAmount.setFont(new Font("Tahoma", Font.PLAIN, 25));
		players = new Player[4];
		players[0] = new Player("Isaiah", DEFAULT_MONEY, "dummy", 10, 149);
		players[1] = new Player("Sean", DEFAULT_MONEY, "dummy", 485, 149);
		players[2] = new Player("Bailey", DEFAULT_MONEY, "Dummy", 965, 149);
		players[3] = new Player("Tyler", DEFAULT_MONEY , "dummy", 1440, 149);
		//players[4] = new Player("POT", 0, "dummy", "pot.jpg");
		listPlaying = new String[]{players[0].getName(), players[1].getName(), players[2].getName(), players[3].getName(), "Pot"}; //, players[4].getName()};
		log("--------------------------------------------------------" + newline + "New Monopoly game started!");
		initGUI();
	}
	private void initGUI() {
		setBackground(SystemColor.menu);
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\monopoly.png"));
		setTitle("Monopoly");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1062);
		contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout());
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
		JButton resetButton = new JButton("RESET");
		resetButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		resetButton.setBounds(400, 10, 100, 80);
		resetButton.setBackground(Color.red);
		panel.add(Box.createRigidArea(new Dimension(550,30)));
		panel.add(lblMonopolyBank);
		panel.add(Box.createRigidArea(new Dimension(500,30)));
		panel.add(resetButton);


		contentPane.add(players[0]);
		contentPane.add(players[1]);
		contentPane.add(players[2]);
		contentPane.add(players[3]);


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
		
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add that money
				for(Player p : players){
					p.setMoney(1500);
					pot = 0;
					potMoney.setText(String.valueOf(pot));
					p.reset();
				}
				try {
					log("Reset Monopoly game!");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		transferButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("transferring money!");
				String donator = (String) transferFromBox.getSelectedItem();
				String acceptor = (String) transferToBox.getSelectedItem();
				
				//Special circumstance for pot
				//donator is pot
				if (donator.equals("Pot")) {
					//This means that the money from the pot is going to somebody
					if (pot - Integer.parseInt(transferAmount.getText()) < 0 ) {
						players[0].createErrorWindow();
						return;
					}
					pot -= Integer.parseInt(transferAmount.getText());
					potMoney.setText(String.valueOf(pot));
					//add that money
					for(Player p : players){
						if(p.getName().equals(acceptor))
							p.addMoney(Integer.parseInt(transferAmount.getText()));
						webServer.setPlayerList(players);

					}
				}
				//acceptor is pot
				else if (acceptor.equals("Pot")) {
					//This means that somebody is giving money to the pot
					pot += Integer.parseInt(transferAmount.getText());
					potMoney.setText(String.valueOf(pot));
					for(Player p : players){
						if(p.getName().equals(donator))
							p.removeMoney(Integer.parseInt(transferAmount.getText()));}
				} else {
				//subtract money
				for(Player p : players){
					if(p.getName().equals(donator))
						p.removeMoney(Integer.parseInt(transferAmount.getText()));}
				//add that money
				for(Player p : players){
					if(p.getName().equals(acceptor))
						p.addMoney(Integer.parseInt(transferAmount.getText()));
					webServer.setPlayerList(players);

				}
				
				
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
		lblNewLabel_7.setIcon(new ImageIcon("main_files\\image006.png"));
	}

	public Player[] getPlayers(){
		return players;
	}

	public void log(String sentence) throws IOException{
		FileWriter op = new FileWriter("logged.data", true);
		BufferedWriter po = new BufferedWriter(op); 
		Date now = new Date();
		po.write(now.toString() + ": " + sentence + newline);
		po.close();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
