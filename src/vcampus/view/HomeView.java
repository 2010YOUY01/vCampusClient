package vcampus.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.Choice;

public class HomeView extends JFrame {
	private JPanel pane = null;
	private JPanel p = null;
	//private JPanel pa = null;
	private JPanel pa1 = null;
	private CardLayout card = null;
	private JButton button_1=null;
	/*private JTabbedPane jTabbedpane = new JTabbedPane();
	private String[] tabNames = { "在线购买", "购物车","我的订单","账户余额"};
	int i=0;
	JPanel jpanelFirst = new JPanel();*/
	
	private JButton b_1=null,b_2=null,b_3=null,b_1_1=null;
	private JButton b_3_1=null,b_3_2=null,b_3_3=null,b_3_4=null;
	private JPanel p_1=null,p_1_1=null,p_2=null,p_3=null; 
	private JPanel p_4=null,p_3_1=null,p_3_2=null,p_3_3=null,p_3_4=null;
	private JTextField textUsername;
	private JTextField textName;
	private JTextField textAge;
	private JTextField textGender;
	private JTextField textBirthday;
	private JTextField textCity;
	private JTextField textSchool;
	private JTextField textLocation;
	private JTextField textField_8;
	private JTextField textField_9;
	
	private HomeListener homeListener;
	
	
	public HomeView(){
		card = new CardLayout(5,5);
		pane = new JPanel(card);
		pane.setBounds(93, 24, 493, 439);//p_3_1=new JPanel(card);
		//pa=new JPanel();
		//pa1= new JPanel();
		b_1_1 = new JButton("详细信息");
		JButton b_2_1 = new JButton("选课");JButton b_2_2 = new JButton("课表查看");
		b_3_1 = new JButton("在线购买");b_3_2 = new JButton("购物车");b_3_3 = new JButton("我的订单");b_3_4=new JButton("账户余额");
		JButton button_1_1 = new JButton("查阅书籍");JButton button_1_2 = new JButton("借阅记录");
		
		b_1_1.setMargin(new Insets(2,2,2,2));b_3_1.setMargin(new Insets(2,2,2,2));
		//pa1.setLayout(new BoxLayout(pa1, BoxLayout.X_AXIS));
		//p.add(button_2);
		p_1 = new JPanel();//p_1_1=new JPanel();
		p_2 = new JPanel();	
		p_3 = new JPanel();//p_3_1 = new JPanel();p_3_2 = new JPanel();p_3_3 = new JPanel();p_3_4=new JPanel();
		p_4=  new JPanel();

		p_1.setLayout(null);
		JLabel label = new JLabel("学籍管理");
		label.setBounds(214, 5, 76, 15);
		p_1.add(label);
		p_2.setLayout(null);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(0, 41, 473, 291);
		panel_2.setLayout(null);
		
		List list_1 = new List();
		list_1.setBounds(64, 8, 348, 249);
		panel_2.add(list_1);
		JLabel label_9 = new JLabel("选课管理");
		label_9.setBounds(214, 5, 105, 15);
		p_2.add(label_9);
		p_3.setLayout(null);
		p = new JPanel();
		p.setBounds(0, 0, 586, 23);
		p_3.add(p);
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		
		JLabel label_10 = new JLabel("商店管理");
		label_10.setBounds(214, 5, 92, 15);
		p_3.add(label_10);
		p_4.setLayout(null);
		
		Panel panel_4 = new Panel();
		panel_4.setBounds(0, 66, 483, 251);
		p_4.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u67E5\u8BE2\u4E66\u7C4D");
		lblNewLabel.setBounds(10, 31, 58, 15);
		panel_4.add(lblNewLabel);
		
		textField_9 = new JTextField();
		textField_9.setBounds(94, 28, 66, 21);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		JButton button_6 = new JButton("\u67E5\u8BE2\u4E66\u540D");
		button_6.setBounds(189, 27, 97, 23);
		panel_4.add(button_6);
		
		JButton button_7 = new JButton("\u67E5\u8BE2\u4F5C\u8005");
		button_7.setBounds(296, 27, 97, 23);
		panel_4.add(button_7);
		
		JButton button_8 = new JButton("\u501F\u9605\u6B64\u4E66");
		button_8.setBounds(319, 325, 97, 23);
		panel_4.add(button_8);
		
		List list_3 = new List();
		list_3.setBounds(31, 107, 410, 187);
		panel_4.add(list_3);
		pane.add(p_1,"p1");
		
		JLabel label_1 = new JLabel("\u5B66\u53F7");
		label_1.setBounds(10, 48, 58, 15);
		p_1.add(label_1);
		
		textUsername = new JTextField();
		textUsername.setBounds(79, 45, 111, 21);
		p_1.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(10, 111, 58, 15);
		p_1.add(label_2);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(79, 108, 111, 21);
		p_1.add(textName);
		
		JLabel label_3 = new JLabel("\u5E74\u9F84");
		label_3.setBounds(10, 170, 58, 15);
		p_1.add(label_3);
		
		JLabel label_4 = new JLabel("\u6027\u522B");
		label_4.setBounds(10, 229, 58, 15);
		p_1.add(label_4);
		
		JLabel label_5 = new JLabel("\u51FA\u751F\u65E5\u671F");
		label_5.setBounds(10, 292, 58, 15);
		p_1.add(label_5);
		
		JLabel label_6 = new JLabel("\u7C4D\u8D2F");
		label_6.setBounds(10, 359, 58, 15);
		p_1.add(label_6);
		
		JLabel label_7 = new JLabel("\u5B66\u9662");
		label_7.setBounds(269, 292, 58, 15);
		p_1.add(label_7);
		
		JLabel label_8 = new JLabel("\u5BBF\u820D");
		label_8.setBounds(269, 359, 58, 15);
		p_1.add(label_8);
		
		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(79, 167, 111, 21);
		p_1.add(textAge);
		
		textGender = new JTextField();
		textGender.setColumns(10);
		textGender.setBounds(79, 226, 111, 21);
		p_1.add(textGender);
		
		textBirthday = new JTextField();
		textBirthday.setColumns(10);
		textBirthday.setBounds(79, 289, 111, 21);
		p_1.add(textBirthday);
		
		textCity = new JTextField();
		textCity.setColumns(10);
		textCity.setBounds(79, 356, 111, 21);
		p_1.add(textCity);
		
		textSchool = new JTextField();
		textSchool.setColumns(10);
		textSchool.setBounds(328, 289, 111, 21);
		p_1.add(textSchool);
		
		textLocation = new JTextField();
		textLocation.setColumns(10);
		textLocation.setBounds(328, 356, 111, 21);
		p_1.add(textLocation);
		pane.add(p_2,"p2");
		
		JButton button = new JButton("\u9009\u62E9\u8BFE\u7A0B");
		button.setBounds(61, 358, 97, 23);
		p_2.add(button);
		
		JButton button_2 = new JButton("\u9000\u9009\u8BFE\u7A0B");
		button_2.setBounds(305, 358, 97, 23);
		p_2.add(button_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 192, 35);
		p_2.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 1));
		
		List list = new List();
		list.setBounds(61, 52, 371, 280);
		p_2.add(list);
		pane.add(p_3,"p3");
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setBounds(60, 95, 389, 189);
		p_3.add(textArea_2);
		
		JLabel label_12 = new JLabel("\u5728\u7EBF\u8D2D\u4E70");
		label_12.setBounds(21, 43, 58, 15);
		p_3.add(label_12);
		
		textField_8 = new JTextField();
		textField_8.setBounds(100, 40, 66, 21);
		p_3.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel label_13 = new JLabel("\u6309\u6807\u7B7E");
		label_13.setBounds(265, 43, 58, 15);
		p_3.add(label_13);
		
		Choice choice = new Choice();
		choice.setBounds(360, 38, 28, 20);
		p_3.add(choice);
		
		Panel panel_3 = new Panel();
		panel_3.setBounds(0, 95, 483, 268);
		
		panel_3.setLayout(null);
		
		JButton button_4 = new JButton("\u67E5\u8BE2");
		button_4.setBounds(187, 188, 97, 23);
		panel_3.add(button_4);
		
		List list_2 = new List();
		list_2.setBounds(59, 0, 387, 191);
		panel_3.add(list_2);
		
		JButton button_5 = new JButton("\u52A0\u5165\u8D2D\u7269\u8F66");
		button_5.setBounds(179, 389, 167, 30);
		p_3.add(button_5);
		pane.add(p_4,"p4");
		JLabel label_11 = new JLabel("图书馆");
		label_11.setBounds(220, 5, 97, 15);
		p_4.add(label_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 192, 47);
		p_4.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 66, 483, 303);
		p_4.add(panel_5);
		panel_5.setLayout(null);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(0, 95, 473, 226);
		panel_5.add(textArea_1);
		
		JButton btnNewButton = new JButton("\u8FD8\u4E66");
		btnNewButton.setBounds(78, 396, 97, 23);
		p_4.add(btnNewButton);
		
		JButton button_3 = new JButton("\u5237\u65B0");
		button_3.setBounds(240, 396, 104, 23);
		p_4.add(button_3);
	/*	button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.next(pane);
			}
		});*/
		b_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//card.show(pane,"p1");
				
			}
		});
		getContentPane().setLayout(null);
		
		this.getContentPane().add(pane);
		//this.getContentPane().add(pa,BorderLayout.NORTH);
		
		//p.setPreferredSize(new Dimension(300, 150));//关键代码,设置JPanel的大小
		
		b_1 = new JButton("学籍管理");
		b_1.setBounds(0, 113, 91, 71);
		getContentPane().add(b_1);
	
		b_1.setMargin(new Insets(2,2,2,2));
		
		b_2 = new JButton("选课管理");
		b_2.setBounds(0, 197, 91, 71);
		getContentPane().add(b_2);
		b_2.setMargin(new Insets(2,2,2,2));
		
		b_3 = new JButton("商店管理");
		b_3.setBounds(0, 298, 91, 71);
		getContentPane().add(b_3);
		b_3.setMargin(new Insets(2,2,2,2));
		
		button_1 = new JButton("图书馆");
		button_1.setBounds(0, 382, 91, 72);
		getContentPane().add(button_1);
		
		button_1.setMargin(new Insets(2,2,2,2));
		
		JButton button_9 = new JButton("\u5B66\u7C4D\u7BA1\u7406");
		button_9.setMargin(new Insets(2, 2, 2, 2));
		button_9.setBounds(0, 26, 91, 71);
		getContentPane().add(button_9);
		
	/*	TabPanel tabPanel1 = new TabPanel (); 
		// 添加Panel到此选项卡TAB1中 
		tabPane.addTab("TAB1", tabPanel1); 
*/		
		b_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		card.show(pane,"p1");
		homeListener.getPersonInfo();
	}
});

b_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		//pa.remove(pa);
		card.show(pane,"p2");
		panel.add(b_2_1);panel.add(b_2_2);
	}
});
b_2_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		//pa.remove(pa);
		p_2.add(panel_2);
		panel_2.add(list);
	}
});
b_2_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		//pa.remove(pa);
		p_2.add(panel_2);
		panel_2.add(list_1);
	}
});

		b_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				card.show(pane,"p3");
				p.add(b_3_1);p.add(b_3_2);p.add(b_3_3);p.add(b_3_4);
			//	JTabbedPane tabPane = new JTabbedPane(JTabbedPane.TOP); 
				//加入到窗口中 
				//tabPane.add("Tab!",p); 
			}
		});
		
		b_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//p_3.add(p);
				panel_3.add(textArea_2);
			}
		});
		b_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				card.show(pane,"p3");
				p.add(b_3_1);p.add(b_3_2);p.add(b_3_3);p.add(b_3_4);
			}
		});
		b_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_3.add(panel_3);
				panel_3.add(list_2);
				panel_3.add(button_4);
			}
		});
		
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(pane,"p4");		
				p_4.add(panel_5);
				panel_1.add(button_1_1);
				panel_1.add(button_1_2);
			}
		});
		
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_4.add(textField_9);
				panel_4.add(button_6);
				panel_4.add(button_7);
				panel_4.add(button_8);
				panel_4.add(list_3);
			}
		});
		button_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_5.add(btnNewButton);
				panel_5.add(textArea_1);
				panel_5.add(button_3);
			}
		});

		//this.getContentPane().add(pa,BorderLayout.NORTH);
		
		this.setSize(602, 501);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new HomeView();
	}

	public HomeListener getHomeListener() {
		return homeListener;
	}

	public void setHomeListener(HomeListener homeListener) {
		this.homeListener = homeListener;
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

	public JTextField getTextAge() {
		return textAge;
	}

	public void setTextAge(JTextField textAge) {
		this.textAge = textAge;
	}

	public JTextField getTextGender() {
		return textGender;
	}

	public void setTextGender(JTextField textGender) {
		this.textGender = textGender;
	}

	public JTextField getTextBirthday() {
		return textBirthday;
	}

	public void setTextBirthday(JTextField textBirthday) {
		this.textBirthday = textBirthday;
	}

	public JTextField getTextCity() {
		return textCity;
	}

	public void setTextCity(JTextField textCity) {
		this.textCity = textCity;
	}

	public JTextField getTextSchool() {
		return textSchool;
	}

	public void setTextSchool(JTextField textSchool) {
		this.textSchool = textSchool;
	}

	public JTextField getTextLocation() {
		return textLocation;
	}

	public void setTextLocation(JTextField textLocation) {
		this.textLocation = textLocation;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public JTextField getTextField_9() {
		return textField_9;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}
}