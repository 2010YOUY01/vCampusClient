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
		setBounds(100, 100, 451, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegister = new JButton("\u6CE8\u518C");
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
		btnRegister.setBounds(155, 322, 133, 56);
		contentPane.add(btnRegister);
		
		textUsername = new JTextField();
		textUsername.setText("\u8F93\u5165\u60A8\u7684\u5B66\u53F7");
		textUsername.setToolTipText("");
		textUsername.setBounds(170, 121, 172, 29);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		textName = new JTextField();
		textName.setText("\u8F93\u5165\u60A8\u7684\u59D3\u540D");
		textName.setColumns(10);
		textName.setBounds(170, 163, 172, 29);
		contentPane.add(textName);
		
		JLabel label = new JLabel("\u5B66\u53F7");
		label.setBounds(67, 126, 72, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setBounds(67, 168, 72, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801");
		label_2.setBounds(67, 210, 72, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u786E\u8BA4\u5BC6\u7801");
		label_3.setBounds(67, 252, 72, 18);
		contentPane.add(label_3);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("\u8F93\u5165\u60A8\u7684\u5BC6\u7801");
		passwordField.setBounds(170, 205, 172, 29);
		contentPane.add(passwordField);
		
		passwordRepeatField = new JPasswordField();
		passwordRepeatField.setToolTipText("\u786E\u8BA4\u60A8\u7684\u5BC6\u7801");
		passwordRepeatField.setBounds(170, 247, 172, 29);
		contentPane.add(passwordRepeatField);
		
		
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
