package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdminHome extends JFrame{

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome adminHome = new AdminHome();
					centreWindow(adminHome);
					adminHome.setVisible(true);

					JPanel panel = new JPanel();
					adminHome.add(panel);
					placeComponents(panel);
					adminHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AdminHome() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	public static void centreWindow(Window frame) {
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
	}
	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);
		
		/*JLabel headLabel = new JLabel("Welcome To Library Management System");
		headLabel.setBounds(70, 50, 450, 30);
		Font font = new Font("Serif", Font.BOLD, 18);
		headLabel.setFont(font);
		panel.add(headLabel);
		
		JLabel userLabel = new JLabel("User Name:");
		userLabel.setBounds(140, 150, 90, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(250, 150, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(140, 180, 90, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(250, 180, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(205, 250, 100, 35);
		loginButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				AdminHome adminHOme = new AdminHome();
				adminHOme.setVisible(true);
			}
		});
		panel.add(loginButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.setBounds(305, 250, 100, 35);
		panel.add(registerButton);*/
	}
}
