package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class MyCalc {

	private JFrame frmMycalcV;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmMycalcV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMycalcV = new JFrame();
		frmMycalcV.setTitle("MyCalc v1.0");
		frmMycalcV.setBounds(100, 100, 293, 413);
		frmMycalcV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMycalcV.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 33));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setText("0");
		textField.setBounds(12, 10, 253, 73);
		frmMycalcV.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(12, 93, 53, 50);
		frmMycalcV.getContentPane().add(btnNewButton);
	}

}
