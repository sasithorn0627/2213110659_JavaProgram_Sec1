import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNumber1.setBounds(31, 29, 117, 14);
		contentPane.add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNumber2.setBounds(31, 54, 108, 28);
		contentPane.add(lblNumber2);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(177, 28, 218, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(177, 60, 218, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(229, 227, 89, 23);
		contentPane.add(btnCancel);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(177, 202, 61, 14);
		contentPane.add(lblResult);
		
		final JComboBox cmbOperator = new JComboBox();
		cmbOperator.setBounds(177, 91, 117, 22);
		cmbOperator.addItem("+");
		cmbOperator.addItem("-");
		cmbOperator.addItem("*");
		cmbOperator.addItem("/");
		contentPane.add(cmbOperator);
		
		
		JLabel lblNewLabel = new JLabel("Operator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(31, 93, 71, 18);
		contentPane.add(lblNewLabel);
		
		final JRadioButton onedigit = new JRadioButton("1 Digit");
		onedigit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		onedigit.setBounds(177, 129, 109, 23);
		contentPane.add(onedigit);
		
		final JRadioButton twodigit = new JRadioButton("2 Digit");
		twodigit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		twodigit.setBounds(177, 159, 109, 23);
		contentPane.add(twodigit);
		
		ButtonGroup  group= new ButtonGroup();
		group.add(onedigit);
		group.add(twodigit);
		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOK) {
					num1=Double.parseDouble(txtNumber1.getText());
					num2=Double.parseDouble(txtNumber2.getText());
					//sum = num1+num2;
					operator = (String)cmbOperator.getSelectedItem();
					if(operator.equals("+"))
						sum=num1+num2;
					if(operator.equals("-"))
						sum=num1-num2;
					if(operator.equals("*"))
						sum=num1*num2;
					if(operator.equals("/"))
						sum=num1/num2;
					
					DecimalFormat frmNumber = null;
					if(onedigit.isSelected())
						frmNumber = new DecimalFormat("#,###.0");
					else if (twodigit.isSelected())
						frmNumber = new DecimalFormat("#,###.00");
					
					lblResult.setText(String.format("%.2f",sum));
				}
			}
		});
		btnOK.setBounds(109, 227, 89, 23);
		contentPane.add(btnOK);
		
		JLabel lblNewLabel_1 = new JLabel("How to show ddigit");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(31, 124, 159, 28);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		
	}
}
