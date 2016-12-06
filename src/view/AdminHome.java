package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AdminHome extends JFrame{

	private JPanel contentPane;
	private static AdminHome adminHome;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminHome = new AdminHome();
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
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//setUndecorated(true);
		setTitle("Admin Home");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setComponents();
	}

	private void setComponents() {
		
		JMenuBar adminBar = new JMenuBar();
		
		JMenu book = new JMenu("BOOK");
		adminBar.add(book);
		//panel.add(adminBar);
		JMenuItem bookDetails = new JMenuItem("Book Details");
		book.add(bookDetails);
		JMenuItem searchBook = new JMenuItem("Search Book");
		book.add(searchBook);
		JMenuItem addBook = new JMenuItem("Add New Book");
		book.add(addBook);
		JMenuItem modifyDeleteBook = new JMenuItem("Modify/Delete Book");
		book.add(modifyDeleteBook);
		
		//Student Menu
		JMenu student = new JMenu("STUDENT");
		adminBar.add(student);
		// Student Menu Items
		JMenuItem studentDetails = new JMenuItem("Student Details");
		student.add(studentDetails);
		JMenuItem searchStudent = new JMenuItem("Search Student");
		student.add(searchStudent);
		JMenuItem addStudent = new JMenuItem("Add New Student");
		student.add(addStudent);
		JMenuItem modifyDeleteStudent = new JMenuItem("Modify/Delete Student");
		student.add(modifyDeleteStudent);
		
		// Issue Menu
		JMenu issue = new JMenu("ISSUE");
		adminBar.add(issue);
		// Issue Menu Items
		JMenuItem issuedBook = new JMenuItem("Issued Book");
		issue.add(issuedBook);
		JMenuItem returnBook = new JMenuItem("Return Book");
		issue.add(returnBook);
		
		//Setting Menu
		JMenu setting = new JMenu("SETTING");
		adminBar.add(setting);
		//Setting Menu Items
		JMenuItem profile = new JMenuItem("Profile");
		setting.add(profile);
		JMenuItem logout = new JMenuItem("Logout");
		setting.add(logout);
		logout.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				adminHome.setVisible(false);
				adminHome.dispose();
			}
		});
		
		this.setJMenuBar(adminBar);
	}
}
