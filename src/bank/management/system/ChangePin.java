package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class ChangePin extends JFrame implements ActionListener {

	JButton b1, b2;
	JPasswordField p1, p2;
	String Pinno;

	ChangePin(String Pinno) {
		
		this.Pinno = Pinno;

		JLabel label1 = new JLabel("BOK");
		label1.setFont(new Font("Copperplate", Font.BOLD, 20));
		label1.setBounds(145, 35, 150, 50);
		label1.setForeground(new Color(100, 117, 115));
		add(label1);
		JLabel l2 = new JLabel("Bank Of Karnataka");
		l2.setBounds(120, 59, 250, 50);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l2.setForeground(new Color(100, 117, 115));
		add(l2);

		JLabel l10 = new JLabel("Set Your New Pin ");
		l10.setBounds(1160, 270, 500, 50);
		l10.setFont(new Font("Verdana", Font.BOLD, 17));
		l10.setForeground(Color.BLACK);
		add(l10);

//new Pin to enter
		JLabel l11 = new JLabel("New Pin :");
		l11.setBounds(1100, 350, 500, 50);
		l11.setFont(new Font("Verdana", Font.PLAIN, 15));
		l11.setForeground(Color.BLACK);
		add(l11);

		p1 = new JPasswordField();
		p1.setBounds(1210, 360, 200, 25);
		p1.setFont(new Font("Verdana", Font.PLAIN, 15));
		p1.setBackground(Color.WHITE);
		p1.setForeground(Color.BLACK);
		p1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				String text = p1.getText();
				if (!Character.isDigit(c) || text.length() >= 4) {
					e.consume();
				}
			}
		});
		add(p1);

//conformation of pin
		JLabel l12 = new JLabel("Confirm Pin :");
		l12.setBounds(1100, 400, 500, 50);
		l12.setFont(new Font("Verdana", Font.PLAIN, 15));
		l12.setForeground(Color.BLACK);
		add(l12);

		p2 = new JPasswordField();
		p2.setBounds(1210, 410, 200, 25);
		p2.setFont(new Font("Verdana", Font.PLAIN, 15));
		p2.setBackground(Color.WHITE);
		p2.setForeground(Color.BLACK);
		p2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				String text = p2.getText();
				if (!Character.isDigit(c) || text.length() >= 4) {
					e.consume();
				}
			}
		});
		add(p2);

// button for deposit
		b1 = new JButton("Set Pin");
		b1.setBounds(1130, 510, 80, 25);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);

// button for back
		b2 = new JButton("Back");
		b2.setBounds(1260, 510, 80, 25);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);

// mini mobile
		ImageIcon displayIcon00 = new ImageIcon(getClass().getResource("/icon/mobile.png"));
		Image displayImage00 = displayIcon00.getImage().getScaledInstance(500, 700, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon00 = new ImageIcon(displayImage00);
		JLabel displayLabel00 = new JLabel(resizedDisplayIcon00);
		displayLabel00.setBounds(1000, 180, 500, 700);
		add(displayLabel00);

		// graph logo
		ImageIcon displayIcon0 = new ImageIcon(getClass().getResource("/icon/graph1.png"));
		Image displayImage0 = displayIcon0.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon0 = new ImageIcon(displayImage0);
		JLabel displayLabel0 = new JLabel(resizedDisplayIcon0);
		displayLabel0.setBounds(1000, 37, 60, 60);
		add(displayLabel0);
		JLabel l4 = new JLabel("Market");
		l4.setBounds(1010, 90, 100, 50);
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l4.setForeground(new Color(126, 117, 115));
		add(l4);

		// coins logo
		ImageIcon displayIcon1 = new ImageIcon(getClass().getResource("/icon/loan.png"));
		Image displayImage1 = displayIcon1.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon1 = new ImageIcon(displayImage1);
		JLabel displayLabel1 = new JLabel(resizedDisplayIcon1);
		displayLabel1.setBounds(1100, 37, 60, 60);
		add(displayLabel1);
		JLabel l5 = new JLabel("Loan");
		l5.setBounds(1110, 90, 100, 50);
		l5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l5.setForeground(new Color(126, 117, 115));
		add(l5);

		// Locker logo
		ImageIcon displayIcon2 = new ImageIcon(getClass().getResource("/icon/shield.png"));
		Image displayImage2 = displayIcon2.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon2 = new ImageIcon(displayImage2);
		JLabel displayLabel2 = new JLabel(resizedDisplayIcon2);
		displayLabel2.setBounds(1200, 37, 60, 60);
		add(displayLabel2);
		JLabel l6 = new JLabel("Locker");
		l6.setBounds(1210, 90, 100, 50);
		l6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l6.setForeground(new Color(126, 117, 115));
		add(l6);

		// Security logo
		ImageIcon displayIcon3 = new ImageIcon(getClass().getResource("/icon/transaction.png"));
		Image displayImage3 = displayIcon3.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon3 = new ImageIcon(displayImage3);
		JLabel displayLabel3 = new JLabel(resizedDisplayIcon3);
		displayLabel3.setBounds(1300, 37, 60, 60);
		add(displayLabel3);
		JLabel l7 = new JLabel("Transaction");
		l7.setBounds(1300, 90, 100, 50);
		l7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l7.setForeground(new Color(126, 117, 115));
		add(l7);

		// Customer care logo
		ImageIcon displayIcon4 = new ImageIcon(getClass().getResource("/icon/customer.png"));
		Image displayImage4 = displayIcon4.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon4 = new ImageIcon(displayImage4);
		JLabel displayLabel4 = new JLabel(resizedDisplayIcon4);
		displayLabel4.setBounds(1400, 37, 60, 60);
		add(displayLabel4);
		JLabel l8 = new JLabel("27/7 Support");
		l8.setBounds(1400, 90, 170, 50);
		l8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l8.setForeground(new Color(126, 117, 115));
		add(l8);

		// Bank logo
		ImageIcon displayIcon5 = new ImageIcon(getClass().getResource("/icon/man.png"));
		Image displayImage5 = displayIcon5.getImage().getScaledInstance(40, 70, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon5 = new ImageIcon(displayImage5);
		JLabel displayLabel5 = new JLabel(resizedDisplayIcon5);
		displayLabel5.setBounds(79, 37, 40, 70);
		add(displayLabel5);

		// Bank logo box
		ImageIcon displayIcon = new ImageIcon(getClass().getResource("/icon/BOX.png"));
		Image displayImage = displayIcon.getImage().getScaledInstance(250, 120, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon = new ImageIcon(displayImage);
		JLabel displayLabel = new JLabel(resizedDisplayIcon);
		displayLabel.setBounds(30, 10, 250, 120);
		add(displayLabel);

		// background
		ImageIcon i1 = new ImageIcon(getClass().getResource("/icon/mobile-banking.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1540, 1070, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(0, 0, 1540, 1070);
		add(l3);

		setLayout(null);
		setSize(1550, 1080);
		setLocation(0, 0);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			String pin1 = p1.getText();
			String pin2 = p2.getText();
			if (!pin1.equals(pin2)) {
				JOptionPane.showMessageDialog(null, "PINS Does Not Matched ");
				return;
			}
			
			if (e.getSource() == b1) {
				if (p1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter Your PIN");
					return;
				}
				if(p2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Confirm Your PIN");
					return;
				}
				
				Conn c = new Conn();
				String q1 = "update bank set pin = '"+pin1+"' where pin = '"+Pinno+"' ";
				String q2 = "update login set pin = '"+pin1+"' where pin = '"+Pinno+"' ";
				String q3 = "update signup3 set pin = '"+pin1+"' where pin = '"+Pinno+"' ";
				
				
				c.statement.executeUpdate(q1);
				c.statement.executeUpdate(q2);
				c.statement.executeUpdate(q3);
				
				JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
				setVisible(false);
				new main_Class(Pinno);
				
				
			}
			else if(e.getSource()==b2) {
				new main_Class(Pinno);
				setVisible(false);
			}
			
		}

		catch (Exception E) {

			E.getStackTrace();

		}

	}

	public static void main(String[] args) {
		new ChangePin("");
	}

}
