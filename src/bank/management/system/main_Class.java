package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main_Class extends JFrame implements ActionListener {
	
	JButton b1, b2, b3, b4, b5, b6, b7;
	
	String pin ;

	main_Class(String pin) {
		this.pin = pin;
		
		
//bank name
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
		
		
//gesture in mini mobile
		JLabel l9 = new JLabel("Welcome to Mobile Banking");
		l9.setBounds(1100, 250, 400, 50);
		l9.setFont(new Font("Verdana", Font.BOLD, 20));
		l9.setForeground(new Color(91, 81, 192));
		add(l9);
		
//services offered in mobile
		JLabel l10 = new JLabel("My services ");
		l10.setBounds(1100, 350, 400, 50);
		l10.setFont(new Font("Verdana", Font.PLAIN, 18));
		l10.setForeground(Color.BLACK);
		add(l10);
		
		
//buttoms for enter services
//Deposit button
		ImageIcon displayIconDeposit = new ImageIcon(getClass().getResource("/icon/deposit_button.png"));
		Image displayImageDeposit = displayIconDeposit.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIconDeposit = new ImageIcon(displayImageDeposit);
		b1 = new JButton(resizedDisplayIconDeposit);
		b1.setBounds(1107, 420, 40, 40);
		b1.setBackground(new Color(81,182,190));
		b1.addActionListener(this);
		add(b1);
		JLabel l11 = new JLabel("Deposit ");
		l11.setBounds(1100, 470, 100, 20);
		l11.setFont(new Font("Verdana", Font.PLAIN, 15));
		l11.setForeground(new Color(167, 93, 93));
		add(l11);
		
		
//Withdraw
		ImageIcon displayIconWithdraw = new ImageIcon(getClass().getResource("/icon/withdraw.png"));
		Image displayImageWithdraw = displayIconWithdraw.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIconWithdraw = new ImageIcon(displayImageWithdraw);
		b2 = new JButton(resizedDisplayIconWithdraw);
		b2.setBounds(1220, 420, 40, 40);
		b2.setBackground(new Color(81,182,190));
		b2.addActionListener(this);
		add(b2);
		JLabel l12 = new JLabel("Withdraw");
		l12.setBounds(1207, 470, 100, 20);
		l12.setFont(new Font("Verdana", Font.PLAIN, 15));
		l12.setForeground(new Color(167, 93, 93));
		add(l12);
		
		
//fast cash
		ImageIcon displayIconFC = new ImageIcon(getClass().getResource("/icon/fast_cash.png"));
		Image displayImageFC = displayIconFC.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIconFC = new ImageIcon(displayImageFC);
		b3 = new JButton(resizedDisplayIconFC);
		b3.setBounds(1320, 420, 40, 40);
		b3.setBackground(new Color(81,182,190));
		b3.addActionListener(this);
		add(b3);
		JLabel l13 = new JLabel("Fast Cash");
		l13.setBounds(1307, 470, 100, 20);
		l13.setFont(new Font("Verdana", Font.PLAIN, 15));
		l13.setForeground(new Color(167, 93, 93));
		add(l13);
		
		
//MINI statement
		ImageIcon displayIconMiniStatement = new ImageIcon(getClass().getResource("/icon/mini_statement.png"));
		Image displayImageMiniStatement = displayIconMiniStatement.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIconMiniStatement = new ImageIcon(displayImageMiniStatement);
		b4 = new JButton(resizedDisplayIconMiniStatement);
		b4.setBounds(1107, 530, 40, 40);
		b4.setBackground(new Color(81,182,190));
		b4.addActionListener(this);
		add(b4);
		JLabel l14 = new JLabel("Mini");
		JLabel l15 = new JLabel("Statement");
		l14.setBounds(1117, 575, 100, 20);
		l15.setBounds(1095, 595, 100, 20);
		l14.setFont(new Font("Verdana", Font.PLAIN, 15));
		l15.setFont(new Font("Verdana", Font.PLAIN, 15));
		l14.setForeground(new Color(167, 93, 93));
		l15.setForeground(new Color(167, 93, 93));
		add(l14);
		add(l15);
		
//pin change
		ImageIcon displayIconPC = new ImageIcon(getClass().getResource("/icon/pin_change.png"));
		Image displayImagePC = displayIconPC.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIconPC = new ImageIcon(displayImagePC);
		b5 = new JButton(resizedDisplayIconPC);
		b5.setBounds(1220, 530, 40, 40);
		b5.setBackground(new Color(81,182,190));
		b5.addActionListener(this);
		add(b5);
		JLabel l16 = new JLabel("Pin Change");
		l16.setBounds(1207, 583, 100, 20);
		l16.setFont(new Font("Verdana", Font.PLAIN, 15));
		l16.setForeground(new Color(167, 93, 93));
		add(l16);
		
		
//Balance
		ImageIcon displayIconBalance = new ImageIcon(getClass().getResource("/icon/balance.png"));
		Image displayImageBalance = displayIconBalance.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIconBalance = new ImageIcon(displayImageBalance);
		b6 = new JButton(resizedDisplayIconBalance);
		b6.setBounds(1325, 530, 40, 40);
		b6.setBackground(new Color(81,182,190));
		b6.addActionListener(this);
		add(b6);
		JLabel l17 = new JLabel("Balance");
		l17.setBounds(1313, 583, 100, 20);
		l17.setFont(new Font("Verdana", Font.PLAIN, 15));
		l17.setForeground(new Color(167, 93, 93));
		add(l17);
		
		
//Exit button 
		ImageIcon displayIconExit = new ImageIcon(getClass().getResource("/icon/exit.png"));
		Image displayImageExit = displayIconExit.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIconExit = new ImageIcon(displayImageExit);
		b7 = new JButton(resizedDisplayIconExit);
		b7.setBounds(1365, 750, 40, 40);
		b7.setBackground(new Color(51,153,165));
		b7.addActionListener(this);
		add(b7);
		JLabel l18 = new JLabel("Log Out");
		l18.setBounds(1353, 790, 100, 20);
		l18.setFont(new Font("Verdana", Font.PLAIN, 15));
		l18.setForeground(new Color(167, 93, 93));
		add(l18);
		
		
//mini mobile 
		ImageIcon displayIcon00 = new ImageIcon(getClass().getResource("/icon/mobile.png"));
		Image displayImage00 = displayIcon00.getImage().getScaledInstance(500, 700, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon00 = new ImageIcon(displayImage00);
		JLabel displayLabel00 = new JLabel(resizedDisplayIcon00);
		displayLabel00.setBounds(1000, 180, 500, 700);
		add(displayLabel00);
		
		
//graph logo
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
		
		
//coins logo
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
		
		
//Locker logo
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
		
		
//Security logo
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
		
		
//Customer care logo
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
		
		
//Bank logo
		ImageIcon displayIcon5 = new ImageIcon(getClass().getResource("/icon/man.png"));
		Image displayImage5 = displayIcon5.getImage().getScaledInstance(40, 70, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon5 = new ImageIcon(displayImage5);
		JLabel displayLabel5 = new JLabel(resizedDisplayIcon5);
		displayLabel5.setBounds(79, 37, 40, 70);
		add(displayLabel5);
		
		
//Bank logo box
		ImageIcon displayIcon = new ImageIcon(getClass().getResource("/icon/BOX.png"));
		Image displayImage = displayIcon.getImage().getScaledInstance(250, 120, Image.SCALE_DEFAULT);
		ImageIcon resizedDisplayIcon = new ImageIcon(displayImage);
		JLabel displayLabel = new JLabel(resizedDisplayIcon);
		displayLabel.setBounds(30, 10, 250, 120);
		add(displayLabel);
		
		
//background
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

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			new Deposit(pin);
			setVisible(false);
		}
		else if(e.getSource()==b7) {
			System.exit(0);
		}
		else if(e.getSource()==b2) {
			new Withdrawl(pin);
			setVisible(false);
		}
		else if(e.getSource()==b6) {
			new BalanceEnquriy(pin);
			setVisible(false);
		}
		else if(e.getSource()==b3) {
			new FastCash(pin);
			setVisible(false);
		}
		else if(e.getSource()==b5) {
			new ChangePin(pin);
			setVisible(false);
		}
		else if(e.getSource()==b4) {
			new Mini(pin);
			setVisible(false);
		}
		
		
		
		
	}

	public static void main(String[] args) {
		new main_Class("");

	}

}
