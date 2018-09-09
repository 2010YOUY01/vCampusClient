package vcampus.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.TextArea;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.Choice;
import java.awt.TextField;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class frame extends JFrame {
	private JPanel pane = null;
	private JPanel p = null;
	private CardLayout card = null;
	private JButton button_1=null;
	
	private JButton b_1=null,b_2=null,b_3=null;
	private JPanel p_1=null,p_2=null,p_3=null; 
	private JPanel p_4=null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	
	public frame(){
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(0, 41, 473, 291);
		panel_2.setLayout(null);
		
		List list_1 = new List();
		list_1.setBounds(64, 8, 348, 249);
		panel_2.add(list_1);
		
		Panel panel_3 = new Panel();
		panel_3.setBounds(0, 95, 483, 268);
		
		panel_3.setLayout(null);
		
		JButton button_4 = new JButton("\u67E5\u8BE2");
		button_4.setBounds(187, 188, 97, 23);
		panel_3.add(button_4);
		
		List list_2 = new List();
		list_2.setBounds(59, 0, 387, 191);
		panel_3.add(list_2);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(84, 0, 502, 463);
		getContentPane().add(tabbedPane_4);
		card = new CardLayout(5,5);
		pane = new JPanel(card);
		tabbedPane_4.addTab("欢迎来到Home界面！", null, pane, null);
		p_1 = new JPanel();
		p_2 = new JPanel();	
		p_3 = new JPanel();
		p_4=  new JPanel();
		
				p_1.setLayout(null);
				
				JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane_3.setBounds(0, 30, 483, 423);
				p_1.add(tabbedPane_3);
				
				JPanel panel_1 = new JPanel();
				tabbedPane_3.addTab("详细信息", null, panel_1, null);
				panel_1.setLayout(null);
				
				textField = new JTextField();
				textField.setBounds(86, 51, 111, 21);
				panel_1.add(textField);
				textField.setColumns(10);
				
				JLabel label_2 = new JLabel("\u59D3\u540D");
				label_2.setBounds(0, 54, 58, 15);
				panel_1.add(label_2);
				
				textField_1 = new JTextField();
				textField_1.setBounds(86, 20, 111, 21);
				panel_1.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel label_3 = new JLabel("\u5E74\u9F84");
				label_3.setBounds(0, 101, 58, 15);
				panel_1.add(label_3);
				
				JLabel label_4 = new JLabel("\u6027\u522B");
				label_4.setBounds(0, 146, 58, 15);
				panel_1.add(label_4);
				
				JLabel label_5 = new JLabel("\u51FA\u751F\u65E5\u671F");
				label_5.setBounds(0, 198, 58, 15);
				panel_1.add(label_5);
				
				JLabel label_6 = new JLabel("\u7C4D\u8D2F");
				label_6.setBounds(0, 255, 58, 15);
				panel_1.add(label_6);
				
				textField_7 = new JTextField();
				textField_7.setBounds(86, 98, 111, 21);
				panel_1.add(textField_7);
				textField_7.setColumns(10);
				
				textField_6 = new JTextField();
				textField_6.setBounds(86, 143, 111, 21);
				panel_1.add(textField_6);
				textField_6.setColumns(10);
				
				textField_5 = new JTextField();
				textField_5.setBounds(86, 195, 111, 21);
				panel_1.add(textField_5);
				textField_5.setColumns(10);
				
				textField_4 = new JTextField();
				textField_4.setBounds(86, 252, 111, 21);
				panel_1.add(textField_4);
				textField_4.setColumns(10);
				
				textField_3 = new JTextField();
				textField_3.setBounds(357, 195, 111, 21);
				panel_1.add(textField_3);
				textField_3.setColumns(10);
				
				textField_2 = new JTextField();
				textField_2.setBounds(357, 252, 111, 21);
				panel_1.add(textField_2);
				textField_2.setColumns(10);
				
				JLabel label_8 = new JLabel("\u5BBF\u820D");
				label_8.setBounds(276, 255, 58, 15);
				panel_1.add(label_8);
				
				JLabel label_7 = new JLabel("\u5B66\u9662");
				label_7.setBounds(276, 198, 58, 15);
				panel_1.add(label_7);
				
				JLabel label_1 = new JLabel("\u5B66\u53F7");
				label_1.setBounds(0, 23, 58, 15);
				panel_1.add(label_1);
				JLabel label = new JLabel("学籍管理");
				label.setBounds(214, 5, 76, 15);
				p_1.add(label);
				p_2.setLayout(null);
				JLabel label_9 = new JLabel("选课管理");
				label_9.setBounds(214, 5, 105, 15);
				p_2.add(label_9);
				p_3.setLayout(null);
				p = new JPanel();
				p.setBounds(0, 0, 586, 23);
				p_3.add(p);
				p.setLayout(null);
				
				JLabel label_10 = new JLabel("商店管理");
				label_10.setBounds(191, 3, 166, 15);
				p.add(label_10);
				p_4.setLayout(null);
				pane.add(p_1,"p1");
				pane.add(p_2,"p2");
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 192, 35);
				p_2.add(panel);
				panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 1));
				
				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane.setBounds(0, 42, 473, 377);
				p_2.add(tabbedPane);
				
				JPanel panel_8 = new JPanel();
				tabbedPane.addTab("选课系统", null, panel_8, null);
				panel_8.setLayout(null);
				
				JButton button_2 = new JButton("\u9000\u9009\u8BFE\u7A0B");
				button_2.setBounds(352, 296, 106, 23);
				panel_8.add(button_2);
				
				JButton button = new JButton("\u9009\u62E9\u8BFE\u7A0B");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				button.setBounds(0, 296, 106, 23);
				panel_8.add(button);
				
				//选课系统
				Object[][] cellData = {{"row1-col1", "row1-col2"},{"row2-col1", "row2-col2"}};
				String[] columnNames = {"col1", "col2"};
				JTable table = new JTable(cellData, columnNames);
				table = new JTable();
				table.setBounds(0, 10, 458, 246);
				panel_8.add(table);
				/*DefaultTableModel model = new DefaultTableModel(cellData, columnNames) {
					  public boolean isCellEditable(int row, int column) {
					    return false;
					  }
					};*/
				DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
				//因为只有DefaultTableModel有addColumn的功能，而table.getModel()返回的是一个TableModel类型的对象
				//查看API，DefaultTableModel实现了TableModel的接口，为了调用DefaultTableModel的方法，必须强制类型转换
				tableModel.addColumn("1");
				tableModel.addColumn("2");
				tableModel.addColumn("3");
				tableModel.addColumn("4");
				tableModel.addColumn("5");
				tableModel.addColumn("6");
				Object[] o={"课程ID","课程名称","授课老师","上课地点","上课时间","课程状态"};
				tableModel.addRow(o);
				Object[] c={"1","高等数学","朱平","教6 101","周二34","已选"};
				tableModel.addRow(c);
				
				JPanel panel_9 = new JPanel();
				tabbedPane.addTab("课表查看", null, panel_9, null);
				panel_9.setLayout(null);
				
				JButton button_9 = new JButton("\u70B9\u51FB\u67E5\u770B");
				button_9.setBounds(10, 261, 97, 23);
				panel_9.add(button_9);
				
				//课表查询
				table_6 = new JTable();
				table_6.setBounds(0, 32, 119, 184);
				panel_9.add(table_6);
				DefaultTableModel tableModel20 = (DefaultTableModel) table_6.getModel();
				tableModel20.addColumn("1");
				tableModel20.addColumn("2");
				tableModel20.addColumn("3");
				Object[] g={"ID","课程","学分"};
				tableModel20.addRow(g);
				
				table_7 = new JTable();
				table_7.setBounds(129, 32, 329, 184);
				panel_9.add(table_7);
			/*    DefaultTableModel tableModel21 = (DefaultTableModel) table_6.getModel();
				tableModel21.addColumn("1");
				tableModel21.addColumn("2");
				tableModel21.addColumn("3");
				tableModel21.addColumn("3");
				tableModel21.addColumn("3");
				tableModel21.addColumn("3");
				tableModel21.addColumn("3");
				tableModel21.addColumn("3");
				Object[] h={"时间","周一","周二","周三","周四","周五","周六","周日"};
				tableModel21.addRow(h);*/
				
				JTable table_2 = new JTable(cellData, columnNames);
				table_2 = new JTable();
				table_2.setBounds(122, 32, 336, 184);
				pane.add(p_3,"p3");
				DefaultTableModel tableModel5 = (DefaultTableModel) table_2.getModel();
				tableModel5.addColumn("1");
				tableModel5.addColumn("2");
				tableModel5.addColumn("3");
				tableModel5.addColumn("4");
				tableModel5.addColumn("5");
				tableModel5.addColumn("6");
				tableModel5.addColumn("7");
				tableModel5.addColumn("7");
				Object[] a={"时间","周一","周二","周三","周四","周五","周六","周日"};
				tableModel5.addRow(a);
				
				JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane_1.setBounds(0, 33, 473, 403);
				p_3.add(tabbedPane_1);
				
				JPanel panel_6 = new JPanel();
				tabbedPane_1.addTab("在线购买", null, panel_6, null);
				panel_6.setLayout(null);
				
				textField_8 = new JTextField();
				textField_8.setBounds(115, 24, 66, 21);
				panel_6.add(textField_8);
				textField_8.setColumns(10);
				
				JButton button_5 = new JButton("\u52A0\u5165\u8D2D\u7269\u8F66");
				button_5.setBounds(99, 293, 253, 30);
				panel_6.add(button_5);
				
				Choice choice = new Choice();
				choice.setBounds(343, 27, 48, 20);
				panel_6.add(choice);
				
				JLabel label_13 = new JLabel("\u6309\u6807\u7B7E");
				label_13.setBounds(264, 29, 58, 15);
				panel_6.add(label_13);
				
				JLabel label_12 = new JLabel("\u5728\u7EBF\u8D2D\u4E70");
				label_12.setBounds(43, 26, 58, 15);
				panel_6.add(label_12);
				
				//在线购买
				table_1 = new JTable();
				table_1.setBounds(10, 92, 437, 168);
				panel_6.add(table_1);
				DefaultTableModel tableModel11 = (DefaultTableModel) table_1.getModel();
				tableModel11.addColumn("1");
				tableModel11.addColumn("2");
				tableModel11.addColumn("3");
				tableModel11.addColumn("4");
				tableModel11.addColumn("5");
				tableModel11.addColumn("6");
				Object[] b={"ID","productName","remainNum","price","Supplier","Tag"};
				tableModel11.addRow(b);
				
				JPanel panel_7 = new JPanel();
				tabbedPane_1.addTab("购物车", null, panel_7, null);
				panel_7.setLayout(null);
				
				JButton button_12 = new JButton("\u6E05\u7A7A\u8D2D\u7269\u8F66");
				button_12.setBounds(46, 308, 141, 23);
				panel_7.add(button_12);
				
				JButton button_13 = new JButton("\u9009\u62E9");
				button_13.setBounds(41, 28, 97, 23);
				panel_7.add(button_13);
				
				JButton button_14 = new JButton("\u5220\u9664");
				button_14.setBounds(335, 28, 97, 23);
				panel_7.add(button_14);
				
				JButton button_15 = new JButton("\u652F\u4ED8");
				button_15.setBounds(335, 308, 97, 23);
				panel_7.add(button_15);
				
				//购物车
				table_5 = new JTable();
				table_5.setBounds(10, 61, 448, 222);
				panel_7.add(table_5);
				DefaultTableModel tableModel201= (DefaultTableModel) table_5.getModel();
				tableModel201.addColumn("1");
				tableModel201.addColumn("2");
				tableModel201.addColumn("3");
				tableModel201.addColumn("4");
				tableModel201.addColumn("5");
				Object[] i={"ID","productName","price","Supplier","Tag"};
				tableModel201.addRow(i);
				
				JPanel panel_10 = new JPanel();
				tabbedPane_1.addTab("我的订单", null, panel_10, null);
				panel_10.setLayout(null);
				
				List list_5 = new List();
				list_5.setBounds(49, 91, 349, 201);
				panel_10.add(list_5);
				
				JButton button_10 = new JButton("\u67E5\u8BE2");
				button_10.setBounds(40, 40, 97, 23);
				panel_10.add(button_10);
				
				JPanel panel_11 = new JPanel();
				tabbedPane_1.addTab("账户余额", null, panel_11, null);
				panel_11.setLayout(null);
				
				JList list_6 = new JList();
				list_6.setBounds(48, 86, 366, 179);
				panel_11.add(list_6);
				
				JLabel label_14 = new JLabel("\u6D88\u8D39\u8BB0\u5F55");
				label_14.setBounds(72, 45, 58, 15);
				panel_11.add(label_14);
				
				JButton button_11 = new JButton("\u5145\u503C");
				button_11.setBounds(72, 306, 97, 23);
				panel_11.add(button_11);
				pane.add(p_4,"p4");
				JLabel label_11 = new JLabel("图书馆");
				label_11.setBounds(220, 5, 97, 15);
				p_4.add(label_11);
				
				JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane_2.setBounds(0, 30, 483, 423);
				p_4.add(tabbedPane_2);
				
				JPanel panel_12 = new JPanel();
				tabbedPane_2.addTab("查询书籍", null, panel_12, null);
				panel_12.setLayout(null);
				
				JButton button_7 = new JButton("\u67E5\u8BE2\u4F5C\u8005");
				button_7.setBounds(282, 18, 97, 23);
				panel_12.add(button_7);
				
				JButton button_6 = new JButton("\u67E5\u8BE2\u4E66\u540D");
				button_6.setBounds(282, 51, 97, 23);
				panel_12.add(button_6);
				
				textField_9 = new JTextField();
				textField_9.setBounds(112, 52, 66, 21);
				panel_12.add(textField_9);
				textField_9.setColumns(10);
				
				JLabel lblNewLabel = new JLabel("\u67E5\u8BE2\u4E66\u7C4D");
				lblNewLabel.setBounds(22, 55, 58, 15);
				panel_12.add(lblNewLabel);
				
				JButton button_8 = new JButton("\u501F\u9605\u6B64\u4E66");
				button_8.setBounds(282, 84, 97, 23);
				panel_12.add(button_8);
				
				//查询书籍
				table_3 = new JTable();
				table_3.setBounds(10, 125, 458, 245);
				panel_12.add(table_3);
				DefaultTableModel tableModel3 = (DefaultTableModel) table_3.getModel();
				tableModel3.addColumn("1");
				tableModel3.addColumn("2");
				tableModel3.addColumn("3");
				tableModel3.addColumn("4");
				tableModel3.addColumn("5");
				Object[] e={"书籍","ISBN","书籍名称","书籍作者","书籍出版商","书籍状态"};
				tableModel3.addRow(e);
				
				JPanel panel_13 = new JPanel();
				tabbedPane_2.addTab("借阅记录", null, panel_13, null);
				panel_13.setLayout(null);
				
				JButton button_3 = new JButton("\u5237\u65B0");
				button_3.setBounds(275, 310, 104, 23);
				panel_13.add(button_3);
				
				JButton btnNewButton = new JButton("\u8FD8\u4E66");
				btnNewButton.setBounds(82, 310, 97, 23);
				panel_13.add(btnNewButton);
				
				//借阅记录
				table_4 = new JTable();
				table_4.setBounds(10, 33, 458, 253);
				panel_13.add(table_4);
				DefaultTableModel tableModel4 = (DefaultTableModel) table_4.getModel();
				tableModel4.addColumn("1");
				tableModel4.addColumn("2");
				tableModel4.addColumn("3");
				tableModel4.addColumn("4");
				tableModel4.addColumn("5");
				Object[] f={"书籍ID","书籍名称","借书时间","还书时间","借阅状态"};
				tableModel4.addRow(f);
		
		b_1 = new JButton("学籍管理");
		b_1.setBounds(0, 43, 91, 71);
		getContentPane().add(b_1);
	
		b_1.setMargin(new Insets(2,2,2,2));
		
		b_2 = new JButton("选课管理");
		b_2.setBounds(0, 158, 91, 71);
		getContentPane().add(b_2);
		b_2.setMargin(new Insets(2,2,2,2));
		
		b_3 = new JButton("商店管理");
		b_3.setBounds(0, 265, 91, 71);
		getContentPane().add(b_3);
		b_3.setMargin(new Insets(2,2,2,2));
		
		button_1 = new JButton("图书馆");
		button_1.setBounds(0, 382, 91, 72);
		getContentPane().add(button_1);
		
		button_1.setMargin(new Insets(2,2,2,2));

		b_1.addActionListener(new ActionListener() {//学籍管理
	public void actionPerformed(ActionEvent e) {
		card.show(pane,"p1");
	}
});

b_2.addActionListener(new ActionListener() {//选课管理
	public void actionPerformed(ActionEvent e) {
		//pa.remove(pa);
		card.show(pane,"p2");
	}
});


		b_3.addActionListener(new ActionListener() {//商店
			public void actionPerformed(ActionEvent e) {
				
				card.show(pane,"p3");
			}
		});
		
		button_1.addActionListener(new ActionListener() {//图书馆
			public void actionPerformed(ActionEvent arg0) {
				card.show(pane,"p4");		

			}
		});
		this.setSize(602, 501);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new frame();
	}
}