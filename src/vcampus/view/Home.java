package vcampus.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vcampus.vo.User;

import javax.swing.JTextField;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField usernameDisplayField;
	private JTextField pswDisplayField;
	private HomeListener homeListener;
	private User user;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Home(User user) {
		this.user = user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usernameDisplayField = new JTextField();
		usernameDisplayField.setEditable(false);
		usernameDisplayField.setBounds(68, 61, 268, 24);
		contentPane.add(usernameDisplayField);
		usernameDisplayField.setColumns(10);
		
		pswDisplayField = new JTextField();
		pswDisplayField.setEditable(false);
		pswDisplayField.setBounds(68, 135, 268, 24);
		contentPane.add(pswDisplayField);
		pswDisplayField.setColumns(10);
	}
	public JTextField getUsernameDisplayField() {
		return usernameDisplayField;
	}



	public void setUsernameDisplayField(JTextField usernameDisplayField) {
		this.usernameDisplayField = usernameDisplayField;
	}



	public JTextField getPswDisplayField() {
		return pswDisplayField;
	}



	public void setPswDisplayField(JTextField pswDisplayField) {
		this.pswDisplayField = pswDisplayField;
	}



	public HomeListener getHomeListener() {
		return homeListener;
	}



	public void setHomeListener(HomeListener homeListener) {
		this.homeListener = homeListener;
	}



	private void fireInHomeEvent() {
		if(homeListener != null) {
			homeListener.inHomePerfomed();
		}
	}
	
	public void start() {
		fireInHomeEvent();
		setVisible(true);
	}

}
