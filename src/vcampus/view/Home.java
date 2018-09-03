package vcampus.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vcampus.vo.User;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class Home extends JFrame {

	private JPanel contentPane;
	private HomeListener homeListener;
	private User user;
	private JTextField textName;
	private JTextField textCity;
	private JTextField textOccupation;
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
		
		JLabel label = new JLabel("\u59D3\u540D");
		label.setBounds(12, 11, 63, 16);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\u57CE\u5E02");
		lblNewLabel.setBounds(12, 56, 63, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u804C\u4E1A");
		lblNewLabel_1.setBounds(12, 95, 63, 16);
		contentPane.add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setEnabled(false);
		textName.setBounds(115, 8, 207, 22);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textCity = new JTextField();
		textCity.setEnabled(false);
		textCity.setColumns(10);
		textCity.setBounds(115, 53, 207, 22);
		contentPane.add(textCity);
		
		textOccupation = new JTextField();
		textOccupation.setEnabled(false);
		textOccupation.setColumns(10);
		textOccupation.setBounds(115, 92, 207, 22);
		contentPane.add(textOccupation);
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



	public JTextField getTextName() {
		return textName;
	}
	public void setTextName(JTextField textName) {
		this.textName = textName;
	}
	public JTextField getTextCity() {
		return textCity;
	}
	public void setTextCity(JTextField textCity) {
		this.textCity = textCity;
	}
	public JTextField getTextOccupation() {
		return textOccupation;
	}
	public void setTextOccupation(JTextField textOccupation) {
		this.textOccupation = textOccupation;
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
