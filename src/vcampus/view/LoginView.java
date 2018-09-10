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
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class LoginView extends JFrame{

	private JPanel contentPane;
	private JTextField usernameField;
	private LoginListener loginListener;
	private User user;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		LoginView login = new LoginView(new User());
		login.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	
	public LoginView(User user) {
		this.user = user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 401);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("");
		lblUsername.setIcon(new ImageIcon(LoginView.class.getResource("/material/user.png")));
		lblUsername.setBounds(38, 141, 48, 48);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("");
		lblPassword.setIcon(new ImageIcon(LoginView.class.getResource("/material/password (1).png")));
		lblPassword.setBounds(38, 202, 48, 48);
		contentPane.add(lblPassword);
		
		usernameField = new JTextField();
		usernameField.setForeground(new Color(153,181,242));
		usernameField.setFont(new Font("Eras Light ITC", Font.PLAIN, 24));
		usernameField.setBounds(100, 141, 230, 36);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JButton btnLogin = new JButton("");
		btnLogin.setIcon(new ImageIcon(LoginView.class.getResource("/material/\u767B\u9646\u6309\u94AE.png")));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());
				fireLoginEvent(new LoginFormEvent(username, password));
				
				//usernameField.setText("");
				passwordField.setText("");
		
			}
		});
		btnLogin.setBounds(201, 271, 145, 48);
		contentPane.add(btnLogin);
		
		JButton btnCreatAccount = new JButton("creat account");
		btnCreatAccount.setForeground(new Color(104,146,237));
		btnCreatAccount.setFont(new Font("Eras Light ITC", Font.PLAIN, 20));
		btnCreatAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterView registerView = new RegisterView();
				RegisterController registerController = 
						new RegisterController(registerView, null);
				registerView.setRegisterListener(registerController);
				
				registerView.setVisible(true);
			}
		});
		btnCreatAccount.setBounds(41, 292, 133, 27);
		btnCreatAccount.setBorder(null);
		btnCreatAccount.setBackground(null);
		contentPane.add(btnCreatAccount);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(153,181,242));
		passwordField.setFont(new Font("Eras Light ITC", Font.PLAIN, 24));
		passwordField.setBounds(100, 204, 230, 36);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginView.class.getResource("/material/\u767B\u9646\u5E95.png")));
		lblNewLabel.setBounds(0, 0, 384, 114);
		contentPane.add(lblNewLabel);
		
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
