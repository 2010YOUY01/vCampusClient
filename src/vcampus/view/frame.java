package vcampus.view;

import java.awt.BorderLayout;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;

 
public class frame extends JFrame {
	private JPanel pane = null;
	private JPanel p = null;
	private JPanel pa = null;
	private JPanel pa1 = null;
	private CardLayout card = null;
	private JButton button_1=null;
	//private JButton button_2=null;
	private JButton b_1=null,b_2=null,b_3=null,b_1_1=null;
	private JButton b_3_1=null,b_3_2=null,b_3_3=null;
	private JPanel p_1=null,p_2=null,p_3=null; 
	private JPanel p_4=null,p_3_1=null,p_3_2=null,p_3_3=null,p_1_1=null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	public frame(){
		card = new CardLayout(5,5);
		pane = new JPanel(card);
		pane.setBounds(0, 23, 586, 440);p_3_1=new JPanel(card);
		p = new JPanel();
		p.setBounds(0, 0, 586, 23);
		pa1= new JPanel();
		
		//p.setPreferredSize(new Dimension(300, 150));//关键代码,设置JPanel的大小
		
		b_1 = new JButton("学籍管理");
		b_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//pa.add(b_1_1);
			}
		});
		b_1_1 = new JButton("详细信息");
		
		b_2 = new JButton("选课管理");JButton b_2_1 = new JButton("课表查看");JButton b_2_2 = new JButton("选课");
		
		b_3 = new JButton("商店管理");  b_3_1 = new JButton("在线购买");b_3_2 = new JButton("购物车");b_3_3 = new JButton("我的订单");
		
		button_1 = new JButton("图书馆");JButton button_1_1 = new JButton("查阅书籍");JButton button_1_2 = new JButton("借阅记录");
		//button_2 = new JButton(">");
		b_1.setMargin(new Insets(2,2,2,2));b_1_1.setMargin(new Insets(2,2,2,2));
		b_2.setMargin(new Insets(2,2,2,2));
		b_3.setMargin(new Insets(2,2,2,2));b_3_1.setMargin(new Insets(2,2,2,2));
		
		button_1.setMargin(new Insets(2,2,2,2));
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		pa1.setLayout(new BoxLayout(pa1, BoxLayout.X_AXIS));
		p.add(b_1);
	//pa.add(b_1_1);
		p.add(b_2);	
		p.add(b_3); 
		p.add(button_1);
		//p.add(button_2);
		p_1 = new JPanel();p_1_1=new JPanel();
		p_2 = new JPanel();	
		p_3 = new JPanel();p_3_1 = new JPanel();p_3_2 = new JPanel();p_3_3 = new JPanel();
		p_4=new JPanel();

		p_1.setLayout(null);
		JLabel label = new JLabel("学籍管理");
		label.setBounds(214, 5, 76, 15);
		p_1.add(label);
		p_2.setLayout(null);
		JLabel label_9 = new JLabel("选课管理");
		label_9.setBounds(214, 5, 105, 15);
		p_2.add(label_9);
		p_3.setLayout(null);
		JLabel label_10 = new JLabel("商店管理");
		label_10.setBounds(214, 5, 92, 15);
		p_3.add(label_10);
		p_4.setLayout(null);
		JLabel label_11 = new JLabel("图书馆");
		label_11.setBounds(220, 5, 97, 15);
		p_4.add(label_11);
		pane.add(p_1,"p1");
		
		JLabel label_1 = new JLabel("\u5B66\u53F7");
		label_1.setBounds(10, 48, 58, 15);
		p_1.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(79, 45, 111, 21);
		p_1.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(10, 111, 58, 15);
		p_1.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 108, 111, 21);
		p_1.add(textField_1);
		
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
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(79, 167, 111, 21);
		p_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(79, 226, 111, 21);
		p_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(79, 289, 111, 21);
		p_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(79, 356, 111, 21);
		p_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(328, 289, 111, 21);
		p_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(328, 356, 111, 21);
		p_1.add(textField_7);
		pane.add(p_2,"p2");
		
		TextArea textArea = new TextArea();
		textArea.setBounds(42, 81, 389, 189);
		p_2.add(textArea);
		
		JButton button = new JButton("\u9009\u62E9\u8BFE\u7A0B");
		button.setBounds(61, 314, 97, 23);
		p_2.add(button);
		
		JButton button_2 = new JButton("\u9000\u9009\u8BFE\u7A0B");
		button_2.setBounds(299, 314, 97, 23);
		p_2.add(button_2);
		pane.add(p_3,"p3");
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setBounds(127, 85, 389, 189);
		p_3.add(textArea_2);
		
		JButton button_4 = new JButton("\u67E5\u8BE2");
		button_4.setBounds(192, 322, 97, 23);
		p_3.add(button_4);
		pa = new JPanel();
		pa.setBounds(0, 26, 500, 20);
		p_3.add(pa);
		pa.setLayout(new BoxLayout(pa, BoxLayout.X_AXIS));
		pane.add(p_4,"p4");
		
		JButton btnNewButton = new JButton("\u8FD8\u4E66");
		btnNewButton.setBounds(62, 301, 97, 23);
		p_4.add(btnNewButton);
		
		JButton button_3 = new JButton("\u5237\u65B0");
		button_3.setBounds(277, 301, 97, 23);
		p_4.add(button_3);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(47, 66, 389, 189);
		p_4.add(textArea_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(pane,"p4");
			//	pa.add(b_1_1);
			}
		});
	/*	button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.next(pane);
			}
		});*/
		b_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pane,"p1");
				
			}
		});
		b_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pa.remove(pa);
				card.show(pane,"p2");
				
			}
		});
		b_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				card.show(pane,"p3");
				pa.add(b_3_1);pa.add(b_3_2);pa.add(b_3_3);
				
			}
		});
		b_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//card.show(pane,"p1");
				
			}
		});
		getContentPane().setLayout(null);
		
		this.getContentPane().add(pane);
		this.getContentPane().add(p);
		//this.getContentPane().add(pa,BorderLayout.WEST);
		this.setSize(600, 500);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new frame();
	}
}