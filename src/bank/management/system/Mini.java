package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mini extends JFrame implements ActionListener {

	String Pinno;
	
	JButton b7;

	Mini(String Pinno) {

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

		JLabel Label3 = new JLabel("Your Transaction Detials");
		Label3.setBounds(1130, 300, 300, 25);
		Label3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(Label3);

		JLabel Label2 = new JLabel();
		Label2.setBounds(1080, 350, 400, 25);
		add(Label2);

		JLabel Label4 = new JLabel();
		Label4.setBounds(1080, 390, 400, 320);
		add(Label4);

		JLabel Label5 = new JLabel();
		Label5.setBounds(1080, 700, 400, 25);
		add(Label5);

		try {

			Conn c = new Conn();
			ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '" + Pinno + "'");
			while (resultSet.next()) {
				Label2.setText("Card Number " + resultSet.getString("card_number").substring(0, 4) + "XXXXXXXX"
						+ resultSet.getString("card_number").substring(12));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			int balance = 0;
			Conn c = new Conn();
			ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + Pinno + "'");
			while (resultSet.next()) {

				Label4.setText(Label4.getText() + "<html>" + resultSet.getString("date")
						+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type")
						+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br><html>");
				if (resultSet.getString("type").equals("Deposit")) {
					balance += Integer.parseInt(resultSet.getString("amount"));
				} else {
					balance -= Integer.parseInt(resultSet.getString("amount"));
				}
			}
			
			Label5 .setText("Your Total Balance is Rs."+balance);

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		ImageIcon displayIconExit = new ImageIcon(getClass().getResource("/icon/back.png"));
		Image displayImageExit = displayIconExit.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIconExit = new ImageIcon(displayImageExit);
		b7 = new JButton(resizedDisplayIconExit);
		b7.setBounds(1365, 750, 40, 40);
		b7.setBackground(new Color(51, 153, 165));
		b7.addActionListener(this);
		add(b7);
		JLabel l18 = new JLabel("Back");
		l18.setBounds(1353, 790, 100, 20);
		l18.setFont(new Font("Verdana", Font.PLAIN, 15));
		l18.setForeground(new Color(167, 93, 93));
		add(l18);

		
		
		

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
		if(e.getSource()== b7) { 
			new main_Class(Pinno);
		}
		setVisible(false);

	}

	public static void main(String[] args) {
		new Mini("");

	}

}
