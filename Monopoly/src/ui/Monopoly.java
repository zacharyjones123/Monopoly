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

public class Monopoly extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private final JLabel lblMonopolyBank = new JLabel("Monopoly Bank");
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel_3 = new JPanel();
	private final JPanel panel_4 = new JPanel();
	private final JPanel panel_5 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("");
	private final JLabel lblNewLabel_1 = new JLabel("");
	private final JLabel lblNewLabel_2 = new JLabel("");
	private final JLabel lblNewLabel_3 = new JLabel("");
	private final JButton btnNewButton = new JButton("+$200");
	private final JButton btnNewButton_1 = new JButton("Add Money");
	private final JButton btnNewButton_2 = new JButton("Remove Money");
	private final JButton btnNewButton_3 = new JButton("+$200");
	private final JButton btnNewButton_4 = new JButton("Add Money");
	private final JButton btnNewButton_5 = new JButton("Remove Money");
	private final JButton btnNewButton_6 = new JButton("+$200");
	private final JButton btnNewButton_7 = new JButton("Add Money");
	private final JButton btnNewButton_8 = new JButton("Remove Money");
	private final JButton btnNewButton_9 = new JButton("+$200");
	private final JButton btnNewButton_10 = new JButton("Add Money");
	private final JButton btnNewButton_11 = new JButton("Remove Money");
	private final JLabel lblNewLabel_8 = new JLabel("$1000.20");
	private final JLabel label = new JLabel("$1000.20");
	private final JLabel label_1 = new JLabel("$1000.20");
	private final JLabel label_2 = new JLabel("$1000.20");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JPanel panel_6 = new JPanel();
	private final JLabel lblPot = new JLabel("Transfer");
	private final JLabel lblNewLabel_6 = new JLabel("$10,000.00");
	private final JLabel lblNewLabel_7 = new JLabel("");
	private final JButton btnNewButton_12 = new JButton("Transfer");
	private final JComboBox comboBox = new JComboBox();
	private final JComboBox comboBox_1 = new JComboBox();
	private final JTextField textField_4 = new JTextField();
	private final JPanel panel_7 = new JPanel();
	private final JLabel label_3 = new JLabel("");
	private final JLabel label_4 = new JLabel("");
	
	private static Player[] players = new Player[4];
	private final JComboBox comboBox_2 = new JComboBox();
	private final JComboBox comboBox_3 = new JComboBox();
	private final JComboBox comboBox_4 = new JComboBox();
	private final JComboBox comboBox_5 = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monopoly frame = new Monopoly();
					players[0] = new Player();
					players[1] = new Player();
					players[2] = new Player();
					players[3] = new Player();
					
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
		textField_4.setBounds(384, 143, 196, 43);
		textField_4.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(100, 323, 256, 47);
		textField_3.setColumns(10);
		textField_2.setBounds(100, 321, 256, 47);
		textField_2.setColumns(10);
		textField_1.setBounds(110, 313, 246, 47);
		textField_1.setColumns(10);
		textField.setBounds(100, 322, 256, 47);
		textField.setColumns(10);
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
		lblNewLabel_8.setBounds(10, 447, 420, 92);
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setOpaque(true);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		lblNewLabel_8.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBounds(100, 70, 256, 170);
		lblNewLabel.setIcon(new ImageIcon("resources\\monopoly.png"));
		
		panel_1.add(lblNewLabel);
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(100, 270, 256, 40);
		
		panel_1.add(btnNewButton);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1.setBounds(100, 380, 256, 23);
		
		panel_1.add(btnNewButton_1);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBackground(new Color(165, 42, 42));
		btnNewButton_2.setBounds(100, 414, 256, 23);
		
		panel_1.add(btnNewButton_2);
		
		panel_1.add(textField);
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_2.setBounds(129, 11, 199, 53);
		
		panel_1.add(comboBox_2);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_2.setBounds(490, 149, 440, 550);
		
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		lblNewLabel_1.setBounds(110, 71, 256, 186);
		lblNewLabel_1.setIcon(new ImageIcon("resources//monopoly.png"));
		
		panel_2.add(lblNewLabel_1);
		btnNewButton_3.setBackground(new Color(0, 128, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_3.setBounds(110, 268, 256, 40);
		
		panel_2.add(btnNewButton_3);
		btnNewButton_4.setBackground(new Color(0, 128, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(110, 371, 246, 23);
		
		panel_2.add(btnNewButton_4);
		btnNewButton_5.setBackground(new Color(165, 42, 42));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_5.setBounds(110, 405, 246, 23);
		
		panel_2.add(btnNewButton_5);
		label.setBackground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 128, 0));
		label.setOpaque(true);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		label.setBounds(10, 439, 420, 100);
		
		panel_2.add(label);
		
		panel_2.add(textField_1);
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_3.setBounds(134, 11, 199, 53);
		
		panel_2.add(comboBox_3);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_3.setBounds(970, 149, 440, 550);
		
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		lblNewLabel_2.setBounds(100, 70, 256, 187);
		lblNewLabel_2.setIcon(new ImageIcon("resources//monopoly.png"));
		
		panel_3.add(lblNewLabel_2);
		btnNewButton_6.setBackground(new Color(0, 128, 0));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_6.setBounds(100, 273, 256, 40);
		
		panel_3.add(btnNewButton_6);
		btnNewButton_7.setBackground(new Color(0, 128, 0));
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_7.setBounds(100, 379, 256, 23);
		
		panel_3.add(btnNewButton_7);
		btnNewButton_8.setBackground(new Color(165, 42, 42));
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_8.setBounds(100, 413, 256, 23);
		
		panel_3.add(btnNewButton_8);
		label_1.setOpaque(true);
		label_1.setBackground(Color.WHITE);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 128, 0));
		label_2.setOpaque(true);
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		label_1.setBounds(10, 447, 420, 92);
		
		panel_3.add(label_1);
		
		panel_3.add(textField_2);
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_4.setBounds(134, 11, 199, 53);
		
		panel_3.add(comboBox_4);
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
		btnNewButton_9.setBackground(new Color(0, 128, 0));
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_9.setBounds(100, 277, 256, 40);
		
		panel_4.add(btnNewButton_9);
		btnNewButton_10.setBackground(new Color(0, 128, 0));
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_10.setBounds(100, 381, 256, 23);
		
		panel_4.add(btnNewButton_10);
		btnNewButton_11.setBackground(new Color(165, 42, 42));
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_11.setBounds(100, 415, 256, 23);
		
		panel_4.add(btnNewButton_11);
		label_2.setBackground(Color.WHITE);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setOpaque(true);
		label_2.setForeground(new Color(0, 128, 0));
		label_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		label_2.setBounds(10, 449, 420, 90);
		
		panel_4.add(label_2);
		
		panel_4.add(textField_3);
		comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_5.setBounds(128, 11, 199, 53);
		
		panel_4.add(comboBox_5);
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
		lblNewLabel_6.setBounds(30, 79, 236, 64);
		panel_7.add(lblNewLabel_6);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setForeground(Color.GREEN);
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
		lblNewLabel_6.setBackground(SystemColor.textInactiveText);
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
		btnNewButton_12.setBackground(Color.GREEN);
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setBounds(390, 197, 196, 62);
		
		panel_6.add(btnNewButton_12);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bailey", "Isaiah", "Tyler", "Sean", "Pot"}));
		comboBox.setBounds(390, 21, 199, 53);
		
		panel_6.add(comboBox);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Bailey", "Sean", "Isaiah", "Tyler", "Pot"}));
		comboBox_1.setBounds(387, 79, 199, 53);
		
		panel_6.add(comboBox_1);
		
		panel_6.add(textField_4);
		lblNewLabel_7.setBounds(0, 0, 1894, 1013);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon("resources\\background.jpg"));
	}
}
