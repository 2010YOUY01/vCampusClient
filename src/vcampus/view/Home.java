package vcampus.view;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Container;
import java.awt.List;
import java.awt.Panel;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class Home extends JFrame {
	private JPanel pane = null;
	private JPanel paneCard;
	private JPanel p = null;
	private CardLayout card = null;
	private CardLayout cl_paneCard;
	private JButton button_1=null;
	private JButton btnLibrary;
	
	private JButton b_1=null,b_2=null,b_3=null;
	private JButton btnStore;
	private JButton btnCourse;
	private JButton btnHome;
	private JPanel p_1=null,p_2=null,p_3=null; 
	private JPanel panelStore;
	private JPanel panelCourse;
	private JPanel panelWelcome;
	private JPanel p_4=null;
	private JPanel panelLibrary;
	private JTextField btnSearchProduct;
	private JTextField textLibrarySearchBox;
	private JTable tableProductList;
	private JTable tableBookList;
	private JTable tableLibHistory;
	private JTable tableCartList;
	private JTable tableMyCourseList;
	private JTable tableMyCourseTable;
	private JTable tableOrderList;
	private JTable tableAccountHistory;
	private JTextField textChargeMoney;
	private JTextField textUsername;
	private JTextField textName;
	private JTextField textAge;
	private JTextField textGender;
	private JTextField textBirthday;
	private JTextField textCity;
	private JTextField textSchool;
	private JTextField textLoc;
	private JTable tableAllCourseList;
	
	
	public Home(){
		getContentPane().setBackground(UIManager.getColor("Button.background"));
		
		//getContentPane().setForeground(Color.BLUE);
		
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
		
		JTabbedPane panelMain = new JTabbedPane(JTabbedPane.TOP); //tabbedPane_4.setForeground(new Color(0,57,179));
		panelMain.setBounds(194, -25, 592, 578);
		getContentPane().add(panelMain);
		cl_paneCard = new CardLayout(5,5);
		paneCard = new JPanel(cl_paneCard);
		panelMain.addTab("欢迎来到Home界面！", null, paneCard, null);
		panelWelcome = new JPanel();
		panelWelcome.setBackground(new Color(30, 144, 255));
		panelCourse = new JPanel();	
		panelCourse.setBackground(new Color(30, 144, 255));
		panelStore = new JPanel();
		panelStore.setBackground(new Color(30, 144, 255));
		panelLibrary=  new JPanel();
		panelLibrary.setBackground(new Color(30, 144, 255));
		
				panelWelcome.setLayout(null);
				
				JTabbedPane panelWelcomeTab = new JTabbedPane(JTabbedPane.TOP);
				panelWelcomeTab.setBounds(0, 23, 521, 487);
				panelWelcome.add(panelWelcomeTab);
				
				JPanel panelWelcomeIn = new JPanel();  //panel_1.setForeground(new Color(0,57,179));
				panelWelcomeTab.addTab("WEILCOME TO THE HOME!", null, panelWelcomeIn, null);
				panelWelcomeIn.setLayout(null);
				panelCourse.setLayout(null);
				JLabel lblCourseManagement = new JLabel("COURSE MANAGEMENT");
				lblCourseManagement.setBounds(214, 5, 170, 15);
				panelCourse.add(lblCourseManagement);
				panelStore.setLayout(null);
				panelLibrary.setLayout(null);
				paneCard.add(panelWelcome,"p1");
				paneCard.add(panelCourse,"p2");
				
				JTabbedPane tabPanelCourse = new JTabbedPane(JTabbedPane.TOP);
				tabPanelCourse.setBounds(0, 30, 521, 480);
				panelCourse.add(tabPanelCourse);
				 
				JPanel panelSelectCourse = new JPanel();
				tabPanelCourse.addTab("选课系统", null, panelSelectCourse, null);
				panelSelectCourse.setLayout(null);
				
				JButton btnDropCourse = new JButton("\u9000\u9009\u8BFE\u7A0B");
				btnDropCourse.setBounds(334, 322, 106, 23);
				panelSelectCourse.add(btnDropCourse);
				
				JButton btnSelectCourse = new JButton("\u9009\u62E9\u8BFE\u7A0B");
				btnSelectCourse.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnSelectCourse.setBounds(71, 322, 106, 23);
				panelSelectCourse.add(btnSelectCourse);
				
				//选课系统
				Object[][] cellData = {{"row1-col1", "row1-col2"},{"row2-col1", "row2-col2"}};
				String[] columnNames = {"col1", "col2"};
				JTable table = new JTable(cellData, columnNames);
				tableAllCourseList = new JTable();
				tableAllCourseList.setBounds(10, 34, 493, 246);
				panelSelectCourse.add(tableAllCourseList);
				DefaultTableModel tableModel = (DefaultTableModel) tableAllCourseList.getModel();
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
				
				JPanel panelCourseTable = new JPanel();
				tabPanelCourse.addTab("课表查看", null, panelCourseTable, null);
				panelCourseTable.setLayout(null);
				
				JButton btnSeeCourseTable = new JButton("\u70B9\u51FB\u67E5\u770B");
				btnSeeCourseTable.setBounds(10, 224, 97, 69);
				panelCourseTable.add(btnSeeCourseTable);
				
				//课表查询
				tableMyCourseList = new JTable();
				tableMyCourseList.setBounds(117, 224, 377, 122);
				panelCourseTable.add(tableMyCourseList);
				DefaultTableModel tableModel20 = (DefaultTableModel) tableMyCourseList.getModel();
				tableModel20.addColumn("1");
				tableModel20.addColumn("2");
				tableModel20.addColumn("3");
				tableModel20.addColumn("3");
				Object[] g={"课程","教师","地点","学分"};
				tableModel20.addRow(g);
				
				tableMyCourseTable = new JTable();
				tableMyCourseTable.setBounds(10, 32, 496, 168);
				panelCourseTable.add(tableMyCourseTable);
			   DefaultTableModel tableModel21 = (DefaultTableModel) tableMyCourseTable.getModel();
				tableModel21.addColumn("1");
				tableModel21.addColumn("2");
				tableModel21.addColumn("3");
				tableModel21.addColumn("3");
				tableModel21.addColumn("3");
				tableModel21.addColumn("3");
				tableModel21.addColumn("3");
				tableModel21.addColumn("3");
				Object[] h={"时间","周一","周二","周三","周四","周五","周六","周日"};
				tableModel21.addRow(h);
				Object[] a1={"上午12","计算机组成原理","数据结构","","","","",""};
				tableModel21.addRow(a1);
				Object[] a2={"上午34","高等数学","","","","","高等数学",""};
				tableModel21.addRow(a2);
				Object[] a3={"下午12","数据结构","","","大学英语3","","","几何代数"};
				tableModel21.addRow(a3);
				Object[] a4={"下午34","大学语文","","软件实践","","","",""};
				tableModel21.addRow(a4);
				Object[] a5={"晚上12","","","","大学物理","","",""};
				tableModel21.addRow(a5);
				
				JTable table_2 = new JTable(cellData, columnNames);
				table_2 = new JTable();
				table_2.setBounds(122, 32, 336, 184);
				paneCard.add(panelStore,"p3");
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
				
				
				
				JTabbedPane tabPanelStore = new JTabbedPane(JTabbedPane.TOP);
				tabPanelStore.setBounds(0, 28, 521, 482);
				panelStore.add(tabPanelStore);
				
				JPanel panelBuy = new JPanel();
				tabPanelStore.addTab("在线购买", null, panelBuy, null);
				panelBuy.setLayout(null);
				
				btnSearchProduct = new JTextField();
				btnSearchProduct.setBounds(99, 23, 66, 21);
				panelBuy.add(btnSearchProduct);
				btnSearchProduct.setColumns(10);
				
				JButton button_5 = new JButton("\u52A0\u5165\u8D2D\u7269\u8F66");
				button_5.setBounds(99, 293, 253, 30);
				panelBuy.add(button_5);
				
				Choice choiceProductCat = new Choice();
				choiceProductCat.setBounds(412, 24, 48, 20);
				panelBuy.add(choiceProductCat);
				
				JLabel label_13 = new JLabel("\u6309\u6807\u7B7E");
				label_13.setBounds(324, 27, 58, 15);
				panelBuy.add(label_13);
				
				JLabel label_12 = new JLabel("\u5546\u54C1\u540D");
				label_12.setBounds(34, 27, 58, 15);
				panelBuy.add(label_12);
				
				//在线购买
				tableProductList = new JTable();
				tableProductList.setBounds(10, 92, 485, 168);
				panelBuy.add(tableProductList);
				
				JButton btnAddToCart = new JButton("\u641C\u7D22\u5546\u54C1");
				btnAddToCart.setBounds(193, 23, 97, 23);
				panelBuy.add(btnAddToCart);
				DefaultTableModel tableModel11 = (DefaultTableModel) tableProductList.getModel();
				tableModel11.addColumn("1");
				tableModel11.addColumn("2");
				tableModel11.addColumn("3");
				Object[] b={"名称","价格","类别"};
				tableModel11.addRow(b);
				Object[] b1={"康师傅酸辣牛肉面","3.5","吃"};
				tableModel11.addRow(b1);
				
				JPanel panelShoppingCar = new JPanel();
				tabPanelStore.addTab("购物车", null, panelShoppingCar, null);
				panelShoppingCar.setLayout(null);
				
				JButton buttonResetCart = new JButton("\u6E05\u7A7A\u8D2D\u7269\u8F66");
				buttonResetCart.setBounds(46, 308, 141, 23);
				panelShoppingCar.add(buttonResetCart);
				
				JButton btnSelectProduct = new JButton("\u9009\u62E9");
				btnSelectProduct.setBounds(41, 28, 97, 23);
				panelShoppingCar.add(btnSelectProduct);
				
				JButton btnDeleteCart = new JButton("\u5220\u9664");
				btnDeleteCart.setBounds(335, 28, 97, 23);
				panelShoppingCar.add(btnDeleteCart);
				
				JButton btnPay = new JButton("\u652F\u4ED8");
				btnPay.setBounds(335, 308, 97, 23);
				panelShoppingCar.add(btnPay);
				
				//购物车
				tableCartList = new JTable();
				tableCartList.setBounds(10, 61, 448, 222);
				panelShoppingCar.add(tableCartList);
				DefaultTableModel tableModel201= (DefaultTableModel) tableCartList.getModel();
				tableModel201.addColumn("1");
				tableModel201.addColumn("2");
				tableModel201.addColumn("3");
				Object[] i={"名称","价格","类别"};
				tableModel201.addRow(i);
				Object[] i1={"薯片","3.3","食"};
				tableModel201.addRow(i1);
				
				JPanel panelShoppingHistory = new JPanel();
				tabPanelStore.addTab("我的订单", null, panelShoppingHistory, null);
				panelShoppingHistory.setLayout(null);
				
				JButton btnSearchOrderHistory = new JButton("\u67E5\u8BE2");
				btnSearchOrderHistory.setBounds(40, 40, 97, 23);
				panelShoppingHistory.add(btnSearchOrderHistory);
				
				//我的订单
				tableOrderList = new JTable();
				tableOrderList.setBounds(27, 84, 418, 265);
				panelShoppingHistory.add(tableOrderList);
				DefaultTableModel tableModel3= (DefaultTableModel) tableOrderList.getModel();
				tableModel3.addColumn("1");
				tableModel3.addColumn("2");
				tableModel3.addColumn("3");
				Object[] j={"商品名","价格","购买日期"};
				tableModel3.addRow(j);
				Object[] j1={"怡宝矿泉水","1.5","2018.9.9.19:06"};
				tableModel3.addRow(j1);
				
				JPanel panelAccount = new JPanel();
				tabPanelStore.addTab("账户管理", null, panelAccount, null);
				panelAccount.setLayout(null);
				
				JLabel label_14 = new JLabel("\u6D88\u8D39\u8BB0\u5F55");
				label_14.setBounds(72, 45, 58, 15);
				panelAccount.add(label_14);
				
				JButton buttonChargeMoney = new JButton("\u5145\u503C");
				buttonChargeMoney.setBounds(215, 339, 97, 23);
				panelAccount.add(buttonChargeMoney);
				
				//账户余额
				tableAccountHistory = new JTable();
				tableAccountHistory.setBounds(27, 73, 405, 223);
				panelAccount.add(tableAccountHistory);
				
				textChargeMoney = new JTextField();
				textChargeMoney.setBounds(86, 340, 66, 21);
				panelAccount.add(textChargeMoney);
				textChargeMoney.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("\u4F59\u989D");
				lblNewLabel_1.setBounds(86, 395, 58, 15);
				panelAccount.add(lblNewLabel_1);
				
				JLabel labelMoney = new JLabel("14.50 ");
				labelMoney.setBounds(159, 395, 58, 15);
				panelAccount.add(labelMoney);
				DefaultTableModel tableModel4= (DefaultTableModel) tableAccountHistory.getModel();
				tableModel4.addColumn("1");
				tableModel4.addColumn("2");
				tableModel4.addColumn("3");
				Object[] k={"消费日期","消费金额/元","账户余额/元"};
				tableModel4.addRow(k);
				Object[] k1={"2018.9.1","200","20"};
				tableModel4.addRow(k1);
				
				
				paneCard.add(panelLibrary,"p4");
				JLabel lblLibrary = new JLabel("LIBRARY");
				lblLibrary.setBounds(220, 5, 204, 15);
				panelLibrary.add(lblLibrary);
				
				JTabbedPane tabPanelLibrary = new JTabbedPane(JTabbedPane.TOP);
				tabPanelLibrary.setBounds(0, 30, 521, 480);
				panelLibrary.add(tabPanelLibrary);
				
				JPanel panelLibSearch = new JPanel();
				tabPanelLibrary.addTab("查询书籍", null, panelLibSearch, null);
				panelLibSearch.setLayout(null);
				
				JButton btnSearchAuthor = new JButton("\u67E5\u8BE2\u4F5C\u8005");
				btnSearchAuthor.setBounds(282, 18, 97, 23);
				panelLibSearch.add(btnSearchAuthor);
				
				JButton btnSearchBookname = new JButton("\u67E5\u8BE2\u4E66\u540D");
				btnSearchBookname.setBounds(282, 51, 97, 23);
				panelLibSearch.add(btnSearchBookname);
				
				textLibrarySearchBox = new JTextField();
				textLibrarySearchBox.setBounds(112, 52, 66, 21);
				panelLibSearch.add(textLibrarySearchBox);
				textLibrarySearchBox.setColumns(10);
				
				JLabel lblNewLabel = new JLabel("\u67E5\u8BE2\u4E66\u7C4D");
				lblNewLabel.setBounds(22, 55, 58, 15);
				panelLibSearch.add(lblNewLabel);
				
				JButton btnBorrow = new JButton("\u501F\u9605\u6B64\u4E66");
				btnBorrow.setBounds(282, 84, 97, 23);
				panelLibSearch.add(btnBorrow);
				
				//查询书籍
				tableBookList = new JTable();
				tableBookList.setBounds(10, 125, 496, 245);
				panelLibSearch.add(tableBookList);
				DefaultTableModel tableModel300 = (DefaultTableModel) tableBookList.getModel();
				tableModel300.addColumn("1");
				tableModel300.addColumn("2");
				tableModel300.addColumn("3");
				tableModel300.addColumn("4");
				Object[] e={"ISBN","书籍名称","书籍作者","书籍出版商"};
				tableModel300.addRow(e);
				Object[] l={"233","三国演义","罗贯中","凤凰出版社"};
				tableModel300.addRow(l);
				Object[] l1={"322","追风筝的人","bala","凤凰出版社"};
				tableModel300.addRow(l1);
				Object[] l2={"323","白夜行","东野圭吾","人民出版社"};
				tableModel300.addRow(l2);
				Object[] l3={"121","计算机组成原理","任国林","人民教育出版社"};
				tableModel300.addRow(l3);
				
				
				JPanel panelLibHistory = new JPanel();
				tabPanelLibrary.addTab("借阅记录", null, panelLibHistory, null);
				panelLibHistory.setLayout(null);
				
				JButton btnSearchLibHistory = new JButton("\u67E5\u8BE2\u8BB0\u5F55");
				btnSearchLibHistory.setBounds(287, 351, 104, 23);
				panelLibHistory.add(btnSearchLibHistory);
				
				JButton btnReturnBook = new JButton("\u8FD8\u4E66");
				btnReturnBook.setBounds(90, 351, 97, 23);
				panelLibHistory.add(btnReturnBook);
				
				//借阅记录
				tableLibHistory = new JTable();
				tableLibHistory.setBounds(10, 66, 496, 253);
				panelLibHistory.add(tableLibHistory);
				
				JPanel panelInfo = new JPanel();
				panelInfo.setOpaque(false);
				paneCard.add(panelInfo, "name_124769338576444");
				paneCard.add(panelInfo,"p5");
				panelInfo.setLayout(null);
				DefaultTableModel tableModel40 = (DefaultTableModel) tableLibHistory.getModel();
				tableModel40.addColumn("1");
				tableModel40.addColumn("2");
				tableModel40.addColumn("3");
				Object[] f={"书籍名称","借书时间","还书时间"};
				tableModel40.addRow(f);
				Object[] f1={"三国演义","2018.9.3.19:01","2018.9.3.19:01"};
				tableModel40.addRow(f1);
				
		
		btnHome = new JButton("Click Come into home");
		btnHome.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		btnHome.setIcon(new ImageIcon(Home.class.getResource("/\u7D20\u6750/user.png")));
		btnHome.setBounds(0, 0, 197, 71);
		getContentPane().add(btnHome);
	
		btnHome.setMargin(new Insets(2,2,2,2));
		
		btnCourse = new JButton("Curriculum");
		btnCourse.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		btnCourse.setIcon(new ImageIcon(Home.class.getResource("/\u7D20\u6750/class (1).png")));
		btnCourse.setBounds(0, 209, 197, 71);
		getContentPane().add(btnCourse);
		btnCourse.setMargin(new Insets(2,2,2,2));
		
		btnStore = new JButton("Store");
		btnStore.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		btnStore.setIcon(new ImageIcon(Home.class.getResource("/\u7D20\u6750/store (1).png")));
		btnStore.setBounds(0, 326, 197, 71);
		getContentPane().add(btnStore);
		btnStore.setMargin(new Insets(2,2,2,2));
		
		btnLibrary = new JButton("Library");
		btnLibrary.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		btnLibrary.setIcon(new ImageIcon(Home.class.getResource("/\u7D20\u6750/Book (2).png")));
		btnLibrary.setBounds(0, 439, 197, 72);
		getContentPane().add(btnLibrary);
		btnLibrary.setMargin(new Insets(2,2,2,2));

	    JButton btnInfo = new JButton("Status Information");
	    btnInfo.setIcon(new ImageIcon(Home.class.getResource("/\u7D20\u6750/Student.png")));
	    btnInfo.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		cl_paneCard.show(paneCard,"p5");
	    	}
	    });
	    btnInfo.setMargin(new Insets(2, 2, 2, 2));
	    btnInfo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
	    btnInfo.setBounds(0, 98, 197, 71);
	    getContentPane().add(btnInfo);
	    
		btnHome.addActionListener(new ActionListener() {//学籍管理
	public void actionPerformed(ActionEvent e) {
		cl_paneCard.show(paneCard,"p1");
	}
});

btnCourse.addActionListener(new ActionListener() {//选课管理
	public void actionPerformed(ActionEvent e) {
		cl_paneCard.show(paneCard,"p2");
	}
});


		btnStore.addActionListener(new ActionListener() {//商店
			public void actionPerformed(ActionEvent e) {
				
				cl_paneCard.show(paneCard,"p3");
			}
		});
		
		btnLibrary.addActionListener(new ActionListener() {//图书馆
			public void actionPerformed(ActionEvent arg0) {
				cl_paneCard.show(paneCard,"p4");		

			}
		});
		this.setSize(800,600);
		this.setVisible(true);
		
		/*  setBak(); //调用背景方法
		    Container c1 = getContentPane();//获取JFrame面板
		    panelWelcomeIn.setOpaque(false); *///把JPanel设置为透明 这样就不会遮住后面的背景 这样你就能在JPanel随意加组件了
		//    c1.add(panel_1);

		    
		    JTabbedPane tabPanelInfo = new JTabbedPane(JTabbedPane.TOP);
		    tabPanelInfo.setBounds(0, 26, 513, 482);
		    panelInfo.add(tabPanelInfo);
		    
		    JPanel panelInfoIn = new JPanel();
		    tabPanelInfo.addTab("Status information", null, panelInfoIn, null);
		    panelInfoIn.setLayout(null);
		    panelInfoIn.setBackground(UIManager.getColor("menu"));
		 //   panel_4.setOpaque(false); //把JPanel设置为透明 这样就不会遮住后面的背景 这样你就能在JPanel随意加组件了
		    
		    JLabel label_9 = new JLabel("\u5B66\u53F7");
		    label_9.setBounds(26, 41, 58, 15);
		    panelInfoIn.add(label_9);
		    
		    JLabel label_10 = new JLabel("\u59D3\u540D");
		    label_10.setBounds(26, 102, 58, 15);
		    panelInfoIn.add(label_10);
		    
		    JLabel label_11 = new JLabel("\u5E74\u9F84");
		    label_11.setBounds(26, 168, 58, 15);
		    panelInfoIn.add(label_11);
		    
		    JLabel label_15 = new JLabel("\u6027\u522B");
		    label_15.setBounds(26, 244, 58, 15);
		    panelInfoIn.add(label_15);
		    
		    JLabel label_16 = new JLabel("\u51FA\u751F\u65E5\u671F");
		    label_16.setBounds(26, 323, 58, 15);
		    panelInfoIn.add(label_16);
		    
		    JLabel label_17 = new JLabel("\u7C4D\u8D2F");
		    label_17.setBounds(26, 397, 58, 15);
		    panelInfoIn.add(label_17);
		    
		    JLabel label_18 = new JLabel("\u5B66\u9662");
		    label_18.setBounds(286, 323, 58, 15);
		    panelInfoIn.add(label_18);
		    
		    JLabel label_19 = new JLabel("\u5BBF\u820D");
		    label_19.setBounds(286, 397, 58, 15);
		    panelInfoIn.add(label_19);
		    
		    textUsername = new JTextField();
		    textUsername.setBounds(94, 38, 99, 21);
		    panelInfoIn.add(textUsername);
		    textUsername.setColumns(10);
		    
		    textName = new JTextField();
		    textName.setColumns(10);
		    textName.setBounds(94, 99, 99, 21);
		    panelInfoIn.add(textName);
		    
		    textAge = new JTextField();
		    textAge.setColumns(10);
		    textAge.setBounds(94, 165, 99, 21);
		    panelInfoIn.add(textAge);
		    
		    textGender = new JTextField();
		    textGender.setColumns(10);
		    textGender.setBounds(94, 241, 99, 21);
		    panelInfoIn.add(textGender);
		    
		    textBirthday = new JTextField();
		    textBirthday.setColumns(10);
		    textBirthday.setBounds(94, 320, 99, 21);
		    panelInfoIn.add(textBirthday);
		    
		    textCity = new JTextField();
		    textCity.setColumns(10);
		    textCity.setBounds(94, 394, 99, 21);
		    panelInfoIn.add(textCity);
		    
		    textSchool = new JTextField();
		    textSchool.setColumns(10);
		    textSchool.setBounds(368, 320, 99, 21);
		    panelInfoIn.add(textSchool);
		    
		    textLoc = new JTextField();
		    textLoc.setColumns(10);
		    textLoc.setBounds(368, 394, 99, 21);
		    panelInfoIn.add(textLoc);
		    
		    JLabel label = new JLabel("STUDENT MANAGEMENT");
		    label.setBounds(182, 0, 222, 15);
		    panelInfo.add(label);
		    label.setBackground(new Color(30, 144, 255));
		   
		 //   setSize(800, 600);
		   // setVisible(true);
		
	}

/*	@SuppressWarnings("deprecation")
		public void setBak(){
		    ((JPanel)this.getContentPane()).setOpaque(false);
		    ImageIcon img = new ImageIcon("d://seu.jpg"); //添加图片
		    JLabel background = new JLabel(img); 
		    this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
		    background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		}
*/
	public static void main(String[] args) {
		new Home();
	
	}
}