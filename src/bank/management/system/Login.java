 package bank.management.system;

import java.awt.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 

public class Login extends JFrame implements ActionListener{
	JLabel label1, label2, label3;
	JTextField textField2;
	JPasswordField passwordField3;
	JButton button1, button2, button3;
	
	Login() {
		super("My New Bank "); // gives title 
//		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		ImageIcon i1 = new ImageIcon(getClass().getResource("/icon/bank.png"));  
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); //by this we scalled the image 
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(430, 10, 100, 100);
		add(image);
		
		ImageIcon ii1 = new ImageIcon(getClass().getResource("/icon/card.png"));
		Image ii2 = ii1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		ImageIcon ii3 = new ImageIcon(ii2);
		JLabel iimage = new JLabel(ii3);
		iimage.setBounds(750, 380, 150, 150);
		add(iimage);
		
		
		
//		headder for the Welcome
		label1 = new JLabel("WELCOME TO BANK OF KARNATAKA");
		label1.setForeground(Color.YELLOW);
		label1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		label1.setBounds(280, 50, 500, 170);
		add(label1);
		
		
		
//		text field for the card number 
		label2 = new JLabel("Card No: ");
		label2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		label2.setForeground(Color.WHITE);
		label2.setBounds(200, 190, 350,30);
		add(label2);
		
		textField2 = new JTextField(14);
		textField2.setBounds(300, 190, 350, 25);
		textField2.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		textField2.setBackground(Color.GRAY);
		textField2.setForeground(Color.BLACK);
		textField2.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!Character.isDigit(c) || textField2.getText().length() >= 16) {
		            evt.consume(); // Ignore the event (block input)
		        }
		    }
		});
		add(textField2);
		
		
		
//		password field for the Pin
		label3 = new JLabel("PIN: ");
		label3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		label3.setForeground(Color.WHITE);
		label3.setBounds(200, 240, 350,30);
		add(label3);
		
		passwordField3 = new JPasswordField(6); 
		passwordField3.setBounds(300, 240, 350, 25);
		passwordField3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		passwordField3.setBackground(Color.GRAY);
		passwordField3.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!Character.isDigit(c) || passwordField3.getPassword().length >= 6) {
		            evt.consume(); // Ignore the event (block input)
		        }
		    }
		});
		add(passwordField3);
		
		
		button1 = new JButton("Login");
		button1.setBounds(350, 300, 100, 30);
		button1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.DARK_GRAY);
		button1.addActionListener(this);
		add(button1);
		
		button2 = new JButton("Clear");
		button2.setBounds(470, 300, 100, 30);
		button2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		button2.setForeground(Color.WHITE);
		button2.setBackground(Color.DARK_GRAY);
		button2.addActionListener(this);
		add(button2);
		
		button3 = new JButton("Sign Up");
		button3.setBounds(350, 350, 220, 30);
		button3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		button3.setForeground(Color.WHITE);
		button3.setBackground(Color.DARK_GRAY);
		button3.addActionListener(this);
		add(button3);
		
		
	
		
		ImageIcon iii1 = new ImageIcon(getClass().getResource("/icon/backbg.jpg"));
		Image iii2 = iii1.getImage().getScaledInstance(1000, 550, Image.SCALE_DEFAULT);
		ImageIcon iii3 = new ImageIcon(iii2);
		JLabel iiimage = new JLabel(iii3);
		iiimage.setBounds(0, 0, 1000, 550);
		add(iiimage);
		
		
		setLayout(null);
		setSize(1000, 550); //it sets the size of the frame
		setLocation(450, 200); // sets location in the display
//		setUndecorated(true);
		setVisible(true);  //it is used for visibility of the frame 
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()== button1) {
				Conn c = new Conn();
				String cardno = textField2.getText();
				String pin = passwordField3.getText();
				String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"' ";
				ResultSet resultSet = c.statement.executeQuery(q);
				if(resultSet.next()) {
					setVisible(false);
					new main_Class(pin);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Card Number/Pin");
				}
				
			}
			else if (e.getSource()== button2) {
				textField2.setText("");
				passwordField3.setText("");
			}
			else if(e.getSource()== button3) {
				new Signup(); 
				setVisible(false);
			}
			
		} catch (Exception E) {
			E.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Login();
		
	}

}
