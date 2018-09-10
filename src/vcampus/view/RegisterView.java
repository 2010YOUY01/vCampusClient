package vcampus.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vcampus.vo.RegisterForm;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class RegisterView extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField textName;
	private JPasswordField passwordField;
	private JPasswordField passwordRepeatField;
	private RegisterForm registerForm;
	private RegisterListener registerListener;

	public RegisterListener getRegisterListener() {
		return registerListener;
	}

	public void setRegisterListener(RegisterListener registerListener) {
		this.registerListener = registerListener;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterView frame = new RegisterView();
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
	public RegisterView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 603);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegister = new JButton("");
		btnRegister.setIcon(new ImageIcon(RegisterView.class.getResource("/material/\u6CE8\u518C\u6309\u94AE.png")));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//°´ÏÂ×¢²á°´Å¥
				registerForm = new RegisterForm(textUsername.getText(),
						new String(passwordField.getPassword()),
						new String(passwordRepeatField.getPassword()),
						textName.getText());
				registerListener.registerPerformed(registerForm);
			}
		});
		btnRegister.setBounds(127, 447, 183, 64);
		contentPane.add(btnRegister);
		
		textUsername = new JTextField();
		textUsername.setForeground(new Color(153,181,242));
		textUsername.setFont(new Font("Eras Light ITC", Font.PLAIN, 24));
		textUsername.setText("studentID:");
		textUsername.setToolTipText("");
		textUsername.setBounds(142, 170, 211, 36);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		textName = new JTextField();
		textName.setForeground(new Color(153,181,242));
		textName.setFont(new Font("Eras Light ITC", Font.PLAIN, 24));
		textName.setText("name:");
		textName.setColumns(10);
		textName.setBounds(142, 238, 211, 36);
		contentPane.add(textName);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RegisterView.class.getResource("/material/card (1).png")));
		label.setBounds(45, 170, 48, 45);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(RegisterView.class.getResource("/material/Student.png")));
		label_1.setBounds(45, 238, 54, 45);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(RegisterView.class.getResource("/material/password (1).png")));
		label_2.setBounds(45, 303, 48, 45);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(RegisterView.class.getResource("/material/password (1).png")));
		label_3.setBounds(45, 361, 48, 45);
		contentPane.add(label_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Eras Light ITC", Font.PLAIN, 24));
		passwordField.setForeground(new Color(153,181,242));
		passwordField.setToolTipText("\u8F93\u5165\u60A8\u7684\u5BC6\u7801");
		passwordField.setBounds(142, 303, 211, 36);
		contentPane.add(passwordField);
		
		passwordRepeatField = new JPasswordField();
		passwordRepeatField.setForeground(new Color(153,181,242));
		passwordRepeatField.setFont(new Font("Eras Light ITC", Font.PLAIN, 24));
		passwordRepeatField.setToolTipText("\u786E\u8BA4\u60A8\u7684\u5BC6\u7801");
		passwordRepeatField.setBounds(142, 370, 211, 36);
		contentPane.add(passwordRepeatField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RegisterView.class.getResource("/material/\u6CE8\u518C\u5E95.png")));
		lblNewLabel.setBounds(0, 0, 400, 128);
		contentPane.add(lblNewLabel);
		
		
	}

	public JTextField getTextUsername() {
		return textUsername;
	}

	public void setTextUsername(JTextField textUsername) {
		this.textUsername = textUsername;
	}

	public JTextField getTextName() {
		return textName;
	}

	public void setTextName(JTextField textName) {
		this.textName = textName;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JPasswordField getPasswordRepeatField() {
		return passwordRepeatField;
	}

	public void setPasswordRepeatField(JPasswordField passwordRepeatField) {
		this.passwordRepeatField = passwordRepeatField;
	}

	
	
	
}
