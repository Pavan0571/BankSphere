package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.*;

public class Signup2 extends JFrame implements ActionListener {

	JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;

	JRadioButton r1, r2, e1, e2;
	JButton next;

	String formno;
	JTextField textPan, textAadhar;

	Signup2(String formno) {

		super("Application Form for the new Users ");
		ImageIcon i1 = new ImageIcon(getClass().getResource("/icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // by this we scalled the image
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(30, 30, 100, 100);
		add(image);

		this.formno = formno;
		JLabel l1 = new JLabel("Page 2.");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l1.setBounds(150, 50, 200, 33);
		add(l1);

//		Additional Detials
		JLabel l2 = new JLabel("Additional Detials : ");
		l2.setBounds(150, 80, 200, 33);
		l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(l2);

//		Add Religion
		JLabel l3 = new JLabel("Religion :");
		l3.setBounds(150, 230, 200, 30);
		l3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(l3);

		String religion[] = { "", " Hindu", " Muslim", " Christian", " Sikh", " Boudha", " Other/NA" };
		comboBox = new JComboBox(religion);
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setBackground(new Color(142, 191, 195));
		comboBox.setForeground(Color.BLACK);
		comboBox.setBounds(300, 232, 250, 25);
		add(comboBox);

//		Add category
		JLabel l4 = new JLabel("Category :");
		l4.setBounds(150, 270, 200, 30);
		l4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(l4);

		String category[] = { "", " General", " OBC", " SC", " ST", " Other/NA" };
		comboBox2 = new JComboBox(category);
		comboBox2.setBackground(Color.WHITE);
		comboBox2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox2.setBackground(new Color(142, 191, 195));
		comboBox2.setForeground(Color.BLACK);
		comboBox2.setBounds(300, 272, 250, 25);
		add(comboBox2);

//		Add income
		JLabel l5 = new JLabel("Income :");
		l5.setBounds(150, 310, 200, 30);
		l5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(l5);

		String Income[] = { "", " <50,000", " >50,000 & <1,00,000", " >1,00,000 & <2,00,000", " >2,00,000" };
		comboBox3 = new JComboBox(Income);
		comboBox3.setBackground(Color.WHITE);
		comboBox3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox3.setBackground(new Color(142, 191, 195));
		comboBox3.setForeground(Color.BLACK);
		comboBox3.setBounds(300, 312, 250, 25);
		add(comboBox3);

//		Add Education
		JLabel l6 = new JLabel("Education :");
		l6.setBounds(150, 350, 200, 30);
		l6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(l6);

		String education[] = { "", " SSLC", " PUC", " Diploma", " Bachelors", " Masters", " Doctrate",
				" Not Applicable" };
		comboBox4 = new JComboBox(education);
		comboBox4.setBackground(Color.WHITE);
		comboBox4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox4.setBackground(new Color(142, 191, 195));
		comboBox4.setForeground(Color.BLACK);
		comboBox4.setBounds(300, 352, 250, 25);
		add(comboBox4);

//		Add occupation
		JLabel l7 = new JLabel("Occupation :");
		l7.setBounds(150, 390, 200, 30);
		l7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(l7);

		String occupation[] = { "", " Farmer", " Self Business", " Student", " Employee", " House wife", " Retired",
				" Not Applicable" };
		comboBox5 = new JComboBox(occupation);
		comboBox5.setBackground(Color.WHITE);
		comboBox5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox5.setBackground(new Color(142, 191, 195));
		comboBox5.setForeground(Color.BLACK);
		comboBox5.setBounds(300, 392, 250, 25);
		add(comboBox5);

//		Add PAN Number
		JLabel l8 = new JLabel("PAN Number :");
		l8.setBounds(150, 430, 200, 30);
		l8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(l8);

		textPan = new JTextField(14);
		textPan.setBounds(300, 430, 250, 25);
		textPan.setFont(new Font("Verdana", Font.PLAIN, 15));
		textPan.setBackground(Color.WHITE);
		textPan.setForeground(Color.BLACK);
		add(textPan);

//		Add Aadhar number
		JLabel l9 = new JLabel("Aadhar Number :");
		l9.setBounds(150, 470, 200, 30);
		l9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(l9);

		textAadhar = new JTextField(14);
		textAadhar.setBounds(300, 470, 250, 25);
		textAadhar.setFont(new Font("Verdana", Font.PLAIN, 15));
		textAadhar.setBackground(Color.WHITE);
		textAadhar.setForeground(Color.BLACK);
		textAadhar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				String text = textAadhar.getText();
				if (!Character.isDigit(c) || text.length() >= 12) {
					e.consume();
				}
			}
		});
		add(textAadhar);

//		Add Seniority
		JLabel l10 = new JLabel("Senior Citizen :");
		l10.setBounds(150, 510, 200, 30);
		l10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(l10);

		r1 = new JRadioButton("Yes");
		r1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		r1.setBackground(new Color(142, 191, 195));
		r1.setBounds(300, 512, 50, 30);
		add(r1);
		r2 = new JRadioButton("No");
		r2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		r2.setBackground(new Color(142, 191, 195));
		r2.setBounds(400, 512, 50, 30);
		add(r2);

		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(r1);
		buttonGroup1.add(r2);

//		Add if Account Exist or not
		JLabel l11 = new JLabel("Existing Account :");
		l11.setBounds(150, 550, 200, 30);
		l11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		add(l11);

		e1 = new JRadioButton("Yes");
		e1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		e1.setBackground(new Color(142, 191, 195));
		e1.setBounds(300, 552, 50, 30);
		add(e1);
		e2 = new JRadioButton("No");
		e2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		e2.setBackground(new Color(142, 191, 195));
		e2.setBounds(400, 552, 50, 30);
		add(e2);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(e1);
		buttonGroup2.add(e2);

//		Form number in top right
		JLabel l12 = new JLabel("Form Number :");
		l12.setBounds(450, 20, 150, 30);
		l12.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l12.setForeground(new Color(127, 61, 40, 100));
		add(l12);
		JLabel l13 = new JLabel(formno);
		l13.setBounds(610, 20, 150, 30);
		l13.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l13.setForeground(new Color(127, 61, 40, 100));
		add(l13);

//		Next Button
		next = new JButton("Next");
		next.setFont(new Font("Times New Roman", Font.BOLD, 17));
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setBounds(470, 612, 80, 30);
		next.addActionListener(this);
		add(next);

		getContentPane().setBackground(new Color(142, 191, 195));
		setLayout(null);
		setSize(700, 800);
		setLocation(750, 150);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
//		String formno = first;
		String rel = (String) comboBox.getSelectedItem();
		String cate = (String) comboBox2.getSelectedItem();
		String inc = (String) comboBox3.getSelectedItem();
		String edu = (String) comboBox4.getSelectedItem();
		String occu = (String) comboBox5.getSelectedItem();
		String pan = textPan.getText();
		String aadhar = textAadhar.getText();
		String scitizen = "";
		if (r1.isSelected()) {
			scitizen = "Yes";
		} else if (r2.isSelected()) {
			scitizen = "No";
		}
		String eAccount = "";
		if (e1.isSelected()) {
			eAccount = "Yes";
		} else if (e2.isSelected()) {
			eAccount = "No";
		}

		try {
			if (textPan.getText().equals("") || textAadhar.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the fields");                       
			} else {
				Conn c1 = new Conn();
				String q = "insert into signup2 values( '" + formno + "', '" + rel + "', '" + cate + "', '" + inc + "', '" + edu + "','"
						+ occu + "', '" + pan + "', '" + aadhar + "', '" + scitizen + "', '" + eAccount + "')";
				c1.statement.executeUpdate(q);
				new Signup3(formno);
				setVisible(false);
			}

		} catch (Exception E) {
			E.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Signup2("");

	}

}
