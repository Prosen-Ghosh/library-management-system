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
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setTitle("Admin Home");
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		this.setContentPane(contentPane);
		this.setNavBar();
	}

	private void setNavBar() {
		
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
		
		// Books Menu Items Event
		// Books Details Event
		bookDetails.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		// Books Search Event
		searchBook.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		// Add Book Event
		addBook.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				AddNewBook addNewBok = new AddNewBook();
				addNewBok.setVisible(true);
				adminHome.setVisible(false);
				adminHome.dispose();
			}
		});
		// Modify Or Delete Books Event
		modifyDeleteBook.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		//Student Menu Items Event
		// Student Details Event
		studentDetails.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		// Search Student Event
		searchStudent.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		// Add New Student Event
		addStudent.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		//Modify Or Delete Student Event
		modifyDeleteStudent.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		// Issue Menu Items Event
		// Issue Books Event
		issuedBook.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		// Return Books Event
		returnBook.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		//Setting Menu Items Event
		// Profile Event
		profile.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		// Logout Event
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
