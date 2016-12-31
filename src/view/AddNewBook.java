package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.BookController;

public class AddNewBook extends JFrame {

	private static AddNewBook addNewNook;
	private static AdminHome adminHome;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addNewNook = new AddNewBook();
					addNewNook.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AddNewBook(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setTitle("Book - Add New Book");
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		this.setContentPane(contentPane);
		this.setNavBar();
		JPanel panel = new JPanel();
		this.setBodyComponents(panel);
		this.add(panel);
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

	private void setBodyComponents(JPanel panel){
		
		panel.setLayout(null);
		
		JLabel headLabel = new JLabel("Add New Book To The Libary");
		headLabel.setBounds(480, 50, 450, 30);
		Font font = new Font("Serif", Font.BOLD, 20);
		headLabel.setFont(font);
		panel.add(headLabel);
		
		JLabel bookName = new JLabel();
		bookName.setText("Book Name: ");
		bookName.setBounds(420, 120, 450, 40);
		font = new Font("Serif", Font.BOLD, 16);
		bookName.setFont(font);
		panel.add(bookName);
		
		final JTextField tfBookName = new JTextField(50);
		tfBookName.setBounds(600, 130, 220, 25);
		tfBookName.setToolTipText("Enter Book Name Here");
		panel.add(tfBookName);
		
		JLabel authorName = new JLabel();
		authorName.setText("Author Name: ");
		authorName.setBounds(420, 170, 450, 40);
		authorName.setFont(font);
		panel.add(authorName);
		
		final JTextField tfAuthorName = new JTextField(50);
		tfAuthorName.setBounds(600, 175, 220, 25);
		tfAuthorName.setToolTipText("Enter Author Name Here");
		panel.add(tfAuthorName);
		
		JLabel publicationName = new JLabel();
		publicationName.setText("Publication Name: ");
		publicationName.setBounds(420, 210, 450, 40);
		publicationName.setFont(font);
		panel.add(publicationName);
		
		final JTextField tfPublicationName = new JTextField(50);
		tfPublicationName.setBounds(600, 220, 220, 25);
		tfPublicationName.setToolTipText("Enter Publication Name Here");
		panel.add(tfPublicationName);
		
		JLabel bookEdition = new JLabel();
		bookEdition.setText("Book Edition: ");
		bookEdition.setBounds(420, 255, 450, 40);
		bookEdition.setFont(font);
		panel.add(bookEdition);
		
		final JTextField tfbookEdition = new JTextField(50);
		tfbookEdition.setBounds(600, 265, 220, 25);
		tfbookEdition.setToolTipText("Enter Book Edition Here");
		panel.add(tfbookEdition);
		
		JLabel noOfCopies = new JLabel();
		noOfCopies.setText("No Of Copies: ");
		noOfCopies.setBounds(420, 300, 450, 40);
		noOfCopies.setFont(font);
		panel.add(noOfCopies);
		
		final JTextField tfnoOfCopies = new JTextField(50);
		tfnoOfCopies.setBounds(600, 310, 220, 25);
		tfnoOfCopies.setToolTipText("Enter No Of Copies Here");
		panel.add(tfnoOfCopies);

		JLabel price = new JLabel();
		price.setText("Price: ");
		price.setBounds(420, 340, 450, 40);
		price.setFont(font);
		panel.add(price);
		
		final JTextField tfprice = new JTextField(50);
		tfprice.setBounds(600, 350, 220, 25);
		tfprice.setToolTipText("Enter Price Here");
		panel.add(tfprice);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(500, 450, 100, 35);
		submitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Map<String, String> list = new HashMap<String, String>();
				list.put("bookName",tfBookName.getText().toString());
				list.put("authorName",tfAuthorName.getText().toString());
				list.put("bookEdition",tfbookEdition.getText().toString());
				list.put("noOfCopies",tfnoOfCopies.getText().toString());
				list.put("publicationName",tfPublicationName.getText().toString());
				list.put("price",tfprice.getText().toString());
				
				BookController BC = new BookController();
				String checkIsEmpty =  BC.isEmpty(list);
				if(checkIsEmpty.equals("OK")){
					if(BC.insert(list))JOptionPane.showMessageDialog(null, "New  Book Added Successfuly.");
					else JOptionPane.showMessageDialog(null, "New Book Add Action failed");
				}
				else{
					JOptionPane.showMessageDialog(null, checkIsEmpty + "Can Not Be Empty.");
				}
			}
		});
		panel.add(submitButton);
		
		JButton resetButton = new JButton("Reset");
		resetButton.setBounds(605, 450, 100, 35);
		resetButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tfAuthorName.setText("");
				tfbookEdition.setText("");
				tfBookName.setText("");
				tfnoOfCopies.setText("");
				tfprice.setText("");
				tfPublicationName.setText("");
			}
		});
		panel.add(resetButton);
	}
	
}
