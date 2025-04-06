package bank.management.system;

import java.awt.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener {
	
	JRadioButton r1, r2, m3, m4, m5;
	
	JButton next;
	
	JTextField textName, textFname, textMname, textAdd, textEmail, textCity, textPin, 
	textState, textNum;
	
	JDateChooser dateChooser;
	
	Random ran = new Random();
	
	long first4 = (ran.nextLong()%9999L)+1000L;
	String first = " "+Math.abs(first4);
	
	
	Signup() {
		super("Application Form for the new Users ");
		ImageIcon i1 = new ImageIcon(getClass().getResource("/icon/bank.png"));  
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); //by this we scalled the image 
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(30, 30, 100, 100);
		add(image);
		
		
		JLabel label1 = new JLabel("Application Number : " +first);
		label1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		label1.setBounds(420, 20, 500, 35);
		label1.setForeground(Color.RED);
		add(label1);
		
		JLabel label2 = new JLabel("Page 1.");
		label2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label2.setBounds(150, 50, 200, 33);
		add(label2);
		
		JLabel label3 = new JLabel("Personal Details.");
		label3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label3.setBounds(150, 80, 200, 33);
		add(label3);
		
		
//		Enter name 
		JLabel labelName = new JLabel("Name :");
		labelName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelName.setBounds(150, 210, 200, 30);
		add(labelName);
		
		textName = new JTextField(14);
		textName.setBounds(300, 212, 250, 25);
		textName.setFont(new Font("Verdana", Font.PLAIN, 15));
		textName.setBackground(Color.WHITE);
		textName.setForeground(Color.BLACK);
		textName.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        char c = evt.getKeyChar();
		        if (!Character.isLetter(c) && c != ' ') { 
		            evt.consume(); // Ignore the event (block input)
		        }
		    }
		});
		add(textName);
		
//		Father Name
		JLabel labelFName = new JLabel("Father Name :");
		labelFName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelFName.setBounds(150, 240, 200, 30);
		add(labelFName);
		
		textFname = new JTextField(14);
		textFname.setBounds(300, 242, 250, 25);
		textFname.setFont(new Font("Verdana", Font.PLAIN, 15));
		textFname.setBackground(Color.WHITE);
		textFname.setForeground(Color.BLACK);
		textFname.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char c = evt.getKeyChar();
				if (!Character.isLetter(c) && c != ' ') { 
					evt.consume(); // Ignore the event (block input)
				}
			}
		});
		add(textFname);
		
//		Mother Name
		JLabel labelMName = new JLabel("Mother Name :");
		labelMName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelMName.setBounds(150, 270, 200, 30);
		add(labelMName);
		
		textMname = new JTextField(14);
		textMname.setBounds(300, 272, 250, 25);
		textMname.setFont(new Font("Verdana", Font.PLAIN, 15));
		textMname.setBackground(Color.WHITE);
		textMname.setForeground(Color.BLACK);
		textMname.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char c = evt.getKeyChar();
				if (!Character.isLetter(c) && c != ' ') { 
					evt.consume(); // Ignore the event (block input)
				}
			}
		});
		add(textMname);
		
		
//		Date of Birth
		JLabel DOB = new JLabel("Date of Birth :");
		DOB.setFont(new Font("Times New Roman", Font.BOLD, 15));
		DOB.setBounds(150, 300, 200, 30);
		add(DOB);
		
		dateChooser = new JDateChooser();
		dateChooser.setBackground(Color.WHITE);
		dateChooser.setForeground(Color.BLACK);
		dateChooser.setBounds(300, 302, 250, 25);
		add(dateChooser);
		
		
//		Gender selection
		JLabel labelG = new JLabel("Gender :");
		labelG.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelG.setBounds(150, 330, 200, 30);
		add(labelG);
		
		r1 = new JRadioButton("Male");
		r1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		r1.setBackground(new Color(142, 191, 195));
		r1.setBounds(300, 332, 60, 30);
		add(r1);
		r2 = new JRadioButton("Female");
		r2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		r2.setBackground(new Color(142, 191, 195));
		r2.setBounds(400, 332, 80, 30);
		add(r2);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		
//		Email Address
		JLabel labelEmail = new JLabel("Email Address :");
		labelEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelEmail.setBounds(150, 360, 200, 30);
		add(labelEmail);
		
		textEmail = new JTextField(14);
		textEmail.setBounds(300, 362, 250, 25);
		textEmail.setFont(new Font("Verdana", Font.PLAIN, 15));
		textEmail.setBackground(Color.WHITE);
		textEmail.setForeground(Color.BLACK);
		add(textEmail);
		
//		Married Status
		JLabel labelMs = new JLabel("Marital Status :");
		labelMs.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelMs.setBounds(150, 390, 200, 30);
		add(labelMs);
		
		m3 = new JRadioButton("Married");
		m3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		m3.setBackground(new Color(142, 191, 195));
		m3.setBounds(300, 392, 80, 30);
		add(m3);
		m4 = new JRadioButton("Single");
		m4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		m4.setBackground(new Color(142, 191, 195));
		m4.setBounds(400, 392, 80, 30);
		add(m4);
		m5 = new JRadioButton("Divorced");
		m5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		m5.setBackground(new Color(142, 191, 195));
		m5.setBounds(490, 392, 100, 30);
		add(m5);
		
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(m3);
		buttonGroup1.add(m4);
		buttonGroup1.add(m5);
		
//		Address
		JLabel labeladd = new JLabel("Premanent Address :");
		labeladd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labeladd.setBounds(150, 420, 200, 30);
		add(labeladd);
		
		textAdd = new JTextField(14);
		textAdd.setBounds(300, 422, 250, 25);
		textAdd.setFont(new Font("Verdana", Font.PLAIN, 15));
		textAdd.setBackground(Color.WHITE);
		textAdd.setForeground(Color.BLACK);
		add(textAdd);
		
//		city
		JLabel labelCity = new JLabel("City :");
		labelCity.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelCity.setBounds(150, 450, 200, 30);
		add(labelCity);
		
		textCity = new JTextField(14);
		textCity.setBounds(300, 452, 250, 25);
		textCity.setFont(new Font("Verdana", Font.PLAIN, 15));
		textCity.setBackground(Color.WHITE);
		textCity.setForeground(Color.BLACK);
		add(textCity);
		
//		city pincode
		JLabel labelPin = new JLabel("Pin Code :");
		labelPin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelPin.setBounds(150, 480, 200, 30);
		add(labelPin);
		
		textPin = new JTextField(14);
		textPin.setBounds(300, 482, 250, 25);
		textPin.setFont(new Font("Verdana", Font.PLAIN, 15));
		textPin.setBackground(Color.WHITE);
		textPin.setForeground(Color.BLACK);
		add(textPin);
		
//		State
		JLabel labelState = new JLabel("State :");
		labelState.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelState.setBounds(150, 510, 200, 30);
		add(labelState);
		
		textState = new JTextField(14);
		textState.setBounds(300, 512, 250, 25);
		textState.setFont(new Font("Verdana", Font.PLAIN, 15));
		textState.setBackground(Color.WHITE);
		textState.setForeground(Color.BLACK);
		add(textState);
		
//		phone number
		JLabel labelNum = new JLabel("Phone Number :");
		labelNum.setFont(new Font("Times New Roman", Font.BOLD, 15));
		labelNum.setBounds(150, 540, 200, 30);
		add(labelNum);
		
		textNum = new JTextField(14);
		textNum.setBounds(300, 542, 250, 25);
		textNum.setFont(new Font("Verdana", Font.PLAIN, 15));
		textNum.setBackground(Color.WHITE);
		textNum.setForeground(Color.BLACK);
		textNum.setText("+91-");
		textNum.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = textNum.getText();
                if (!Character.isDigit(c) || text.length() >= 14) {
                    e.consume(); 
                }
            }
        });
		add(textNum);
		
//		NExt button
		next = new JButton("Next");
		next.setFont(new Font("Times New Roman", Font.BOLD, 17));
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setBounds(470, 582, 80, 35);
		next.addActionListener(this);
		add(next);
		
		
		getContentPane().setBackground(new Color(142, 191, 195));
		setLayout(null);
		setSize(700, 800);
		setLocation(750, 150);
		setVisible(true);
 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String formno = first;
		String name = textName.getText() ;
		String fname = textFname.getText() ;
		String mname = textMname.getText() ;
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if(r1.isSelected()) {
			gender = "Male";
		}
		else if(r2.isSelected()) {
			gender = "Female";
		}
		String email = textEmail.getText();
		String marital = null;
		if(m3.isSelected()) {
			marital = "Married";
		}
		else if(m4.isSelected()) {
			marital = "Single";
		}
		else if(m5.isSelected()) {
			marital = "Student";
		}
		String address = textAdd.getText() ;
		String city = textCity.getText() ;
		String pin = textPin.getText() ;
		String state = textState.getText() ;  
		String phone = textNum.getText() ;
		
		try {
			if(textName.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the fields");
			}else {
				Conn con1 = new Conn();
				String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+mname+"','"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"', '"+phone+"')";
				con1.statement.executeUpdate(q);
				new Signup2(formno);
				setVisible(false);
			}
			
			
		} catch (Exception E) {
			E.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		new Signup();
	} 

}
