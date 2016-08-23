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
	private final JLabel lblSean = new JLabel("Sean");
	private final JLabel lblNewLabel_4 = new JLabel("Bailey");
	private final JLabel lblPlayer = new JLabel("Isaiah");
	private final JLabel lblPlayer_1 = new JLabel("Tyler");
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
	private final JLabel lblNewLabel_5 = new JLabel("");
	private final JPanel panel_6 = new JPanel();
	private final JLabel lblPot = new JLabel("POT");
	private final JLabel lblNewLabel_6 = new JLabel("$10,000.00");
	private final JLabel lblNewLabel_7 = new JLabel("New label");
	private final JPanel panel_7 = new JPanel();
	private final JLabel label_3 = new JLabel("");
	private final JButton btnNewButton_12 = new JButton("Transfer");

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
	 */
	public Monopoly() {
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(100, 371, 256, 47);
		textField_3.setColumns(10);
		textField_2.setBounds(100, 371, 256, 47);
		textField_2.setColumns(10);
		textField_1.setBounds(110, 371, 246, 47);
		textField_1.setColumns(10);
		textField.setBounds(100, 371, 256, 47);
		textField.setColumns(10);
		initGUI();
	}
	private void initGUI() {
		setBackground(SystemColor.menu);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\monopoly.png"));
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
		lblNewLabel_8.setBounds(82, 497, 295, 42);
		lblNewLabel_8.setBackground(SystemColor.textInactiveText);
		lblNewLabel_8.setOpaque(true);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblNewLabel_8.setForeground(Color.GREEN);
		lblSean.setHorizontalAlignment(SwingConstants.CENTER);
		lblSean.setBounds(139, 22, 180, 30);
		lblSean.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		panel_1.add(lblSean);
		lblNewLabel.setBounds(100, 70, 230, 230);
		lblNewLabel.setIcon(new ImageIcon("src\\monopoly.png"));
		
		panel_1.add(lblNewLabel);
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(100, 319, 256, 40);
		
		panel_1.add(btnNewButton);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(100, 429, 256, 23);
		
		panel_1.add(btnNewButton_1);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(100, 463, 256, 23);
		
		panel_1.add(btnNewButton_2);
		
		panel_1.add(textField);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_2.setBounds(490, 149, 440, 550);
		
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(142, 30, 180, 30);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		panel_2.add(lblNewLabel_4);
		lblNewLabel_1.setBounds(110, 71, 230, 230);
		lblNewLabel_1.setIcon(new ImageIcon("src//monopoly.png"));
		
		panel_2.add(lblNewLabel_1);
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setBounds(110, 326, 256, 40);
		
		panel_2.add(btnNewButton_3);
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(110, 429, 246, 23);
		
		panel_2.add(btnNewButton_4);
		btnNewButton_5.setBackground(Color.RED);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_5.setBounds(110, 463, 246, 23);
		
		panel_2.add(btnNewButton_5);
		label.setBackground(SystemColor.textInactiveText);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.GREEN);
		label.setOpaque(true);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		label.setBounds(80, 497, 295, 42);
		
		panel_2.add(label);
		
		panel_2.add(textField_1);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_3.setBounds(970, 149, 440, 550);
		
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setBounds(137, 24, 180, 30);
		lblPlayer.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		panel_3.add(lblPlayer);
		lblNewLabel_2.setBounds(100, 70, 230, 230);
		lblNewLabel_2.setIcon(new ImageIcon("src//monopoly.png"));
		
		panel_3.add(lblNewLabel_2);
		btnNewButton_6.setBackground(Color.GREEN);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_6.setBounds(100, 323, 256, 40);
		
		panel_3.add(btnNewButton_6);
		btnNewButton_7.setBackground(Color.GREEN);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_7.setBounds(100, 429, 256, 23);
		
		panel_3.add(btnNewButton_7);
		btnNewButton_8.setBackground(Color.RED);
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_8.setBounds(100, 463, 256, 23);
		
		panel_3.add(btnNewButton_8);
		label_1.setOpaque(true);
		label_1.setBackground(SystemColor.textInactiveText);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.GREEN);
		label_2.setOpaque(true);
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		label_1.setBounds(74, 497, 295, 42);
		
		panel_3.add(label_1);
		
		panel_3.add(textField_2);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_4.setBounds(1454, 149, 440, 550);
		
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		lblPlayer_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_1.setBounds(128, 22, 180, 37);
		lblPlayer_1.setFont(new Font("Arial Black", Font.PLAIN, 30));
		
		panel_4.add(lblPlayer_1);
		lblNewLabel_3.setBounds(100, 70, 230, 230);
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setIcon(new ImageIcon("src//monopoly.png"));
		
		panel_4.add(lblNewLabel_3);
		btnNewButton_9.setBackground(Color.GREEN);
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_9.setBounds(100, 325, 256, 40);
		
		panel_4.add(btnNewButton_9);
		btnNewButton_10.setBackground(Color.GREEN);
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_10.setBounds(100, 429, 256, 23);
		
		panel_4.add(btnNewButton_10);
		btnNewButton_11.setBackground(Color.RED);
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_11.setBounds(100, 463, 256, 23);
		
		panel_4.add(btnNewButton_11);
		label_2.setBackground(SystemColor.textInactiveText);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setOpaque(true);
		label_2.setForeground(Color.GREEN);
		label_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		label_2.setBounds(78, 497, 295, 42);
		
		panel_4.add(label_2);
		
		panel_4.add(textField_3);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_5.setBounds(644, 725, 286, 288);
		
		contentPane.add(panel_5);
		lblNewLabel_5.setIcon(new ImageIcon("src\\free_parking.jpg"));
		
		panel_5.add(lblNewLabel_5);
		panel_6.setBackground(Color.YELLOW);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_6.setBounds(970, 725, 489, 288);
		
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setForeground(Color.GREEN);
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
		lblNewLabel_6.setBackground(SystemColor.textInactiveText);
		lblNewLabel_6.setBounds(20, 144, 245, 83);
		
		panel_6.add(lblNewLabel_6);
		lblPot.setBounds(90, 33, 100, 71);
		lblPot.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		
		panel_6.add(lblPot);
		btnNewButton_12.setBackground(Color.GREEN);
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setBounds(304, 85, 141, 115);
		
		panel_6.add(btnNewButton_12);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_7.setBounds(1540, 725, 286, 288);
		
		contentPane.add(panel_7);
		label_3.setIcon(new ImageIcon("src\\free_parking.jpg"));
		
		panel_7.add(label_3);
		lblNewLabel_7.setIcon(new ImageIcon("src\\background.jpg"));
		lblNewLabel_7.setBounds(0, 0, 1894, 1013);
		
		contentPane.add(lblNewLabel_7);
	}
}
