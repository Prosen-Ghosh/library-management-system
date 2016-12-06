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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import controller.*;
public class Login extends JFrame {

	private JPanel contentPane;
	private static Login login;
	private static JPasswordField userPassword;
	private static JTextField userName;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login = new Login();
					centreWindow(login);
					login.setVisible(true);

					JPanel panel = new JPanel();
					login.add(panel);
					placeComponents(panel);
					login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Login() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(600, 400);
		setTitle("Login");
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
		
		JLabel headLabel = new JLabel("Welcome To Library Management System");
		headLabel.setBounds(70, 50, 450, 30);
		Font font = new Font("Serif", Font.BOLD, 18);
		headLabel.setFont(font);
		panel.add(headLabel);
		
		JLabel userLabel = new JLabel("User Name:");
		userLabel.setBounds(140, 150, 90, 25);
		panel.add(userLabel);

		userName = new JTextField(30);
		userName.setBounds(250, 150, 160, 25);
		panel.add(userName);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(140, 180, 90, 25);
		panel.add(passwordLabel);

		userPassword = new JPasswordField(25);
		userPassword.setBounds(250, 180, 160, 25);
		panel.add(userPassword);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(250, 250, 100, 35);
		loginButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				UserController UC = new UserController();
				if(UC.checkAuthenticUser(userName.getText().toString(),userPassword.getText().toString())){
					AdminHome adminHOme = new AdminHome();
					adminHOme.setVisible(true);
					login.setVisible(false);
					login.dispose();
				}
				else JOptionPane.showMessageDialog(null, "Incorrect Username Or Password.");
			}
		});
		panel.add(loginButton);
	}
}
