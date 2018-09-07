package vcampus.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vcampus.biz.RegisterController;
import vcampus.vo.LoginFormEvent;
import vcampus.vo.RegisterForm;
import vcampus.vo.User;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginView extends JFrame{

	private JPanel contentPane;
	private JTextField usernameField;
	private LoginListener loginListener;
	private User user;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public LoginView(User user) {
		this.user = user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("\u5B66\u53F7");
		lblUsername.setBounds(14, 72, 72, 18);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("\u5BC6\u7801");
		lblPassword.setBounds(14, 118, 72, 18);
		contentPane.add(lblPassword);
		
		usernameField = new JTextField();
		usernameField.setBounds(103, 69, 243, 24);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JButton btnLogin = new JButton("\u767B\u9646");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());
				fireLoginEvent(new LoginFormEvent(username, password));
				
				//usernameField.setText("");
				passwordField.setText("");
		
			}
		});
		btnLogin.setBounds(103, 181, 113, 27);
		contentPane.add(btnLogin);
		
		JButton button = new JButton("\u6CE8\u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				RegisterController registerController = 
						new RegisterController(registerView, null);
				registerView.setRegisterListener(registerController);
				
				registerView.setVisible(true);
			}
		});
		button.setBounds(240, 181, 113, 27);
		contentPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 114, 246, 27);
		contentPane.add(passwordField);
		
		setVisible(true);
	}

	public LoginListener getLoginListener() {
		return loginListener;
	}

	public void setLoginListener(LoginListener loginListener) {
		this.loginListener = loginListener;
	}
	
	public void fireLoginEvent(LoginFormEvent event) {
		if(loginListener != null) {
			loginListener.LoginPerformed(event);
		}
	}

	public JTextField getUsernameField() {
		return usernameField;
	}

	public void setUsernameField(JTextField usernameField) {
		this.usernameField = usernameField;
	}

	
	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public void closeWindow() {
		setVisible(false);
	}
}
