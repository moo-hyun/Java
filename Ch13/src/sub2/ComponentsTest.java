package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Components Test");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 148, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn3 = new JButton("종료");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "종료 클릭","확인대화상자", JOptionPane.YES_NO_OPTION);
			
				if(answer == 0) {
					System.out.println("YES 클릭...");
					
					
				}else {
					System.out.println("NO 클릭...");
					
				}
			}
		});
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.RED);
		btn3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btn3.setBounds(325, 297, 97, 23);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("실행");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(227, 297, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("이벤트 실행");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 1 클릭...");
				
			
				
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btn1.setBackground(SystemColor.inactiveCaptionBorder);
		btn1.setBounds(12, 35, 108, 23);
		frame.getContentPane().add(btn1);
		
		JLabel lblNewLabel_1 = new JLabel("TextField 실습");
		lblNewLabel_1.setBounds(12, 68, 97, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("아이디");
		lblNewLabel_1_1.setBounds(12, 91, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이름");
		lblNewLabel_1_1_1.setBounds(12, 110, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("휴대폰");
		lblNewLabel_1_1_1_1.setBounds(12, 127, 46, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		txtUid = new JTextField();
		txtUid.setBounds(54, 88, 83, 15);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(54, 107, 83, 15);
		frame.getContentPane().add(txtName);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(54, 124, 83, 15);
		frame.getContentPane().add(txtHp);
		
		JLabel lbUid = new JLabel("결과 :");
		lbUid.setBounds(213, 91, 111, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과 :");
		lbName.setBounds(213, 110, 111, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과 :");
		lbHp.setBounds(213, 127, 111, 15);
		frame.getContentPane().add(lbHp);
		
		JButton btnUid = new JButton("확인");
		btnUid.setFont(new Font("굴림", Font.PLAIN, 8));
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbUid.setText("결과 : "+uid);
				
			}
		});
		btnUid.setBounds(149, 87, 55, 19);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText();
				lbName.setText("결과 : " +name);
			}
		});
		btnName.setFont(new Font("굴림", Font.PLAIN, 8));
		btnName.setBounds(149, 106, 55, 19);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHp.getText();
				lbHp.setText("결과 : " +hp);
			}
		});
		btnHp.setFont(new Font("굴림", Font.PLAIN, 8));
		btnHp.setBounds(149, 123, 55, 19);
		frame.getContentPane().add(btnHp);
		
		JLabel lblNewLabel_2 = new JLabel("CheckBox 실습");
		lblNewLabel_2.setBounds(12, 152, 97, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(12, 169, 53, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(67, 169, 53, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(124, 169, 53, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(181, 169, 53, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(239, 169, 53, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한과일 :");
		lbChkFruit.setBounds(12, 192, 254, 15);
		frame.getContentPane().add(lbChkFruit);
		
		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) {
					fruits.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					fruits.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					fruits.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					fruits.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					fruits.add(chk5.getText());
				}
				
				lbChkFruit.setText("선택한 과일 :"+fruits);
				
				
			}
		});
		
		JLabel lbGender = new JLabel("선택결과 :");
		lbGender.setBounds(12, 267, 254, 15);
		frame.getContentPane().add(lbGender);
		
		btnChkFruit.setBackground(SystemColor.inactiveCaptionBorder);
		btnChkFruit.setFont(new Font("굴림", Font.PLAIN, 10));
		btnChkFruit.setBounds(295, 169, 55, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_2_1 = new JLabel("RadioButton");
		lblNewLabel_2_1.setBounds(12, 217, 97, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(12, 238, 55, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(67, 238, 55, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		

	
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdMale.isSelected()) {
					lbGender.setText("선택결과 : "+ rdMale.getText());
					
				}else {
					lbGender.setText("선택결과 : " + rdFemale.getText());
				}
			}
		});
		btnGender.setFont(new Font("굴림", Font.PLAIN, 10));
		btnGender.setBackground(SystemColor.inactiveCaptionBorder);
		btnGender.setBounds(122, 238, 55, 23);
		frame.getContentPane().add(btnGender);
		


		
	
	}
}
