package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Signup3 extends JFrame implements ActionListener {

	JRadioButton r1, r2, r3, r4;
	JCheckBox c1, c2, c3, c4, c5, c6, c7;
	String formno;
	JButton S, C;

	Signup3(String formno) {

		super("Application Form for the new Users ");
		ImageIcon i1 = new ImageIcon(getClass().getResource("/icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // by this we scalled the image
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(30, 30, 100, 100);
		add(image);
		this.formno = formno;

		
//page heading
		JLabel l1 = new JLabel("Page 3.");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l1.setBounds(150, 50, 200, 33);
		add(l1);

		JLabel l2 = new JLabel("Account Detials : ");
		l2.setBounds(150, 80, 200, 33);
		l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(l2);

		
//Type of account U R creating
		JLabel l3 = new JLabel("Account Type : ");
		l3.setBounds(150, 220, 200, 33);
		l3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		add(l3);

		r1 = new JRadioButton("Current Account");
		r1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		r1.setBackground(new Color(142, 191, 195));
		r1.setBounds(150, 252, 150, 30);
		add(r1);
		r2 = new JRadioButton("Savings Account");
		r2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		r2.setBackground(new Color(142, 191, 195));
		r2.setBounds(350, 252, 150, 30);
		add(r2);
		r3 = new JRadioButton("NRI Account");
		r3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		r3.setBackground(new Color(142, 191, 195));
		r3.setBounds(150, 282, 150, 30);
		add(r3);
		r4 = new JRadioButton("Demat Account");
		r4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		r4.setBackground(new Color(142, 191, 195));
		r4.setBounds(350, 282, 150, 30);
		add(r4);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		buttonGroup.add(r3);
		buttonGroup.add(r4);
		
		
		
//Card number 
		JLabel l4 = new JLabel("Card Number : ");
		l4.setBounds(150, 330, 200, 33);
		l4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		add(l4);
		JLabel l5 = new JLabel("(Your 16 digit card number)  ");
		l5.setBounds(150, 355, 250, 33);
		l5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		add(l5);

		JLabel l6 = new JLabel("XXXX-XXXX-XXXX-5852 ");
		l6.setBounds(350, 330, 200, 33);
		l6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		add(l6);
		JLabel l7 = new JLabel("It would appear on ATM card, cheque book and Bank Statements ");
		l7.setBounds(350, 355, 400, 33);
		l7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		add(l7);

		JLabel l8 = new JLabel("PIN : ");
		l8.setBounds(150, 400, 200, 33);
		l8.setFont(new Font("Times New Roman", Font.BOLD, 17));
		add(l8);
		JLabel l9 = new JLabel("(Your 4 digit PIN)  ");
		l9.setBounds(150, 425, 250, 33);
		l9.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		add(l9);

		JLabel l10 = new JLabel("****");
		l10.setBounds(350, 402, 200, 33);
		l10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		add(l10);

		
		
//Service provided by the bank
		JLabel l11 = new JLabel("Service Requeired : ");
		l11.setBounds(150, 470, 200, 33);
		l11.setFont(new Font("Times New Roman", Font.BOLD, 17));
		add(l11);

		c1 = new JCheckBox("ATM CARD");
		c1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		c1.setBackground(new Color(142, 191, 195));
		c1.setBounds(150, 515, 150, 20);
		add(c1);
		c2 = new JCheckBox("Internet Banking");
		c2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		c2.setBackground(new Color(142, 191, 195));
		c2.setBounds(350, 515, 200, 20);
		add(c2);
		c3 = new JCheckBox("Mobile Banking");
		c3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		c3.setBackground(new Color(142, 191, 195));
		c3.setBounds(150, 545, 200, 20);
		add(c3);
		c4 = new JCheckBox("Email Alerts");
		c4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		c4.setBackground(new Color(142, 191, 195));
		c4.setBounds(350, 545, 200, 20);
		add(c4);
		c5 = new JCheckBox("Cheque Book");
		c5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		c5.setBackground(new Color(142, 191, 195));
		c5.setBounds(150, 575, 200, 20);
		add(c5);
		c6 = new JCheckBox("E-Statement");
		c6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		c6.setBackground(new Color(142, 191, 195));
		c6.setBounds(350, 575, 200, 20);
		add(c6);

		
		
//decleration Check Box 
		c7 = new JCheckBox(
				"I hereby declare that all the information submitted by me in the application form is correct, true and valid.",
				true);
		JLabel l12 = new JLabel("and I will present the supporting documents as and when required.");
		c7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		l12.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c7.setBackground(new Color(142, 191, 195));
		l12.setBackground(new Color(142, 191, 195));
		c7.setBounds(100, 620, 600, 15);
		l12.setBounds(120, 635, 600, 15);
		add(c7);
		add(l12);

		
		
//form number
		this.formno = formno;
		JLabel l13 = new JLabel("Form Number :");
		l13.setBounds(450, 20, 150, 30);
		l13.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l13.setForeground(new Color(127, 61, 40, 100));
		add(l13);
		JLabel l14 = new JLabel(formno);
		l14.setBounds(610, 20, 150, 30);
		l14.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l14.setForeground(new Color(127, 61, 40, 100));
		add(l14);

		
		
//buttons
		S = new JButton("Submit");
		S.setFont(new Font("Times New Roman", Font.BOLD, 15));
		S.setBackground(Color.BLACK);
		S.setForeground(Color.WHITE);
		S.setBounds(170, 672, 120, 25);
		S.addActionListener(this);
		add(S);
		C = new JButton("Cancel");
		C.setFont(new Font("Times New Roman", Font.BOLD, 15));
		C.setBackground(Color.BLACK);
		C.setForeground(Color.WHITE);
		C.setBounds(370, 672, 120, 25);
		C.addActionListener(this);
		add(C);

		getContentPane().setBackground(new Color(142, 191, 195));
		setLayout(null);
		setSize(700, 800);
		setLocation(750, 150);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		
		String atype = null;
		if (r1.isSelected()) {
			atype = "Current Account";
		} 
		else if (r2.isSelected()) {
			atype = "Savings Account";
		}
		else if (r3.isSelected()) {
			atype = "NRI Account";
		}
		else if (r4.isSelected()) {
			atype = "Demat Account";
		}
		
		
		Random ran = new Random();
		long first7 = (ran.nextLong()%90000000l)+ 1744524000000000L;
		String cardno = ""+ Math.abs(first7);
		long first3 =  (ran.nextLong()%9000l)+ 1000L;
		String Pinno = ""+Math.abs(first3);
		
		
		String fec = "";
		if (c1.isSelected()) {
			fec += "ATM CARD";
		} 
		else if (c2.isSelected()) {
			fec += "Internet Banking";
		}
		else if (c3.isSelected()) {
			fec += "Mobile Banking";
		}
		else if (c4.isSelected()) {
			fec += "Email Alerts";
		}
		else if (c5.isSelected()) {
			fec += "Cheque Book";
		}
		else if (c6.isSelected()) {
			fec += "E-Statement";
		}
		 
		try 
		{
			if (e.getSource() == S ) 
			{
				if(atype.equals("")) 
				{
					JOptionPane.showMessageDialog(null, "Fill all the fields");
				}
				else 
				{
				Conn c1 = new Conn();
				String q1 = "insert into signup3 values( '" + formno + "', '" + atype + "', '" + cardno + "', '" + Pinno + "', '" + fec + "')";
				String q2 = "insert into login values( '" + formno + "', '" + cardno + "', '" + Pinno + "')";
				c1.statement.executeUpdate(q1);
				c1.statement.executeUpdate(q2);
				new Signup3(formno);
				JOptionPane.showMessageDialog(null, "Card Number : "+cardno+"\nPin : "+Pinno);
				new Deposit(Pinno);
				setVisible(false);
				}
			}
			else if(e.getSource()==C) {
				System.exit(0);
			}
		}
		catch (Exception E) 
		{
			E.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Signup3("");
	}

}
