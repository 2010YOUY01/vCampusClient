package vcampus.biz;

import vcampus.view.HomeView1;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import vcampus.view.HomeListener;
import vcampus.view.HomeView;
import vcampus.vo.BankInfo;
import vcampus.vo.Book;
import vcampus.vo.BookBorrowInfo;
import vcampus.vo.Course;
import vcampus.vo.PersonInfo;
import vcampus.vo.Product;
import vcampus.vo.ShoppingInfo;
import vcampus.vo.User;

public class HomeController implements HomeListener {
	private HomeView homeView;
	private String username;
	private PersonInfo personInfo;
	
	public HomeController(HomeView homeView) {
		super();
		this.homeView = homeView;
	}
	
	

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public void inHomePerfomed() {
		homeView.setVisible(true);
	}


	@Override
	public void getPersonInfo() {
		HomeEvent homeEvent = new HomeEvent();
		PersonInfo personInfo = null;
		try {
			personInfo = homeEvent.searchPersonInfo(username);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homeView.getTextUsername().setText(username);
		//homeView.getTextUsername().setText(personInfo.getUsername());
		homeView.getTextName().setText(personInfo.getName());
		homeView.getTextAge().setText(personInfo.getName());
		String gender =  personInfo.getGender() == PersonInfo.GENDER.MAlE? "男":"女";
		homeView.getTextGender().setText(gender);
		homeView.getTextSchool().setText(personInfo.getSchool().toString());
		String birthday = personInfo.getBirthday().getYear() + " - "
				+personInfo.getBirthday().getMonth()+" - "
				+personInfo.getBirthday().getDay();
		homeView.getTextBirthday().setText(birthday);
		homeView.getTextLoc().setText(personInfo.getLoc());
		homeView.getTextCity().setText(personInfo.getCity());
		
		//personInfo = HomeEvent.searchPersonInfo(User user);
	}


	@Override
	public void selectCourse(int uid) {
		HomeEvent homeEvent = new HomeEvent();
		try {
			homeEvent.selectCourse(uid, username);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public void dropCourse(int uid) {
		HomeEvent homeEvent = new HomeEvent();
		try {
			homeEvent.dropCourse(uid, username);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	@Override
	public void getCourseList() {
		HomeEvent homeEvent = new HomeEvent();
		ArrayList<Course> courseList = new ArrayList<Course>();
		try {
			courseList = homeEvent.getAllCourseList();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DefaultTableModel tableAllCourse = homeView.getTableModel();
		tableAllCourse.setRowCount(1);
		for(int i=0; i<courseList.size(); i++) {
			boolean selectedFlag = false;
			Course course = courseList.get(i);
			try {
				selectedFlag = homeEvent.ifCourseSelected(course.getuID(), username);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			String courseStatus = "未选择";
			if(selectedFlag == true) {
				courseStatus = "已选择";
			}
			
			Object[] obj = {course.getuID(), course.getClassName(), 
					course.getTeacher(), course.getLoc(),
					course.getTimeInWeek().toString()+course.getTimeInDay().toString()
					, courseStatus};
			tableAllCourse.addRow(obj);
		}
		
		
	}



	@Override
	public void searchCourse() {
		HomeEvent homeEvent = new HomeEvent();
		ArrayList<Course> courseList = new ArrayList<Course>();
		try {
			courseList = homeEvent.getCourseList(username);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		DefaultTableModel tableMyCourse = homeView.getTableModel20();
		tableMyCourse.setRowCount(1);
		for(int i=0; i<courseList.size(); i++) {
			Course course = courseList.get(i);
			Object[] obj = {course.getClassName(), course.getTeacher(), course.getLoc(), course.getCredit()};
			tableMyCourse.addRow(obj);
		}
	
		
	}


	@Override
	public void borrowBook(int uID) {
		HomeEvent homeEvent = new HomeEvent();
		boolean borrowSucceedFlag = false;
		try {
			borrowSucceedFlag = homeEvent.borrowBook(uID, username);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(borrowSucceedFlag == true) {
			JOptionPane.showMessageDialog(null, "借阅成功", "提示",JOptionPane.WARNING_MESSAGE); 
		}else {
			JOptionPane.showMessageDialog(null, "借阅失败", "提示",JOptionPane.WARNING_MESSAGE); 
		}
		
	}



	@Override
	public void searchBookname(String bookName) {
		HomeEvent homeEvent = new HomeEvent();
		ArrayList<Book> bookList = new ArrayList<Book>();
		try {
			bookList = homeEvent.searchBookByName(bookName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		DefaultTableModel tableBookList = homeView.getTableModel300();
		
		tableBookList.setRowCount(1);
		for(int i=0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			Object[] obj = {book.getuID(), book.getBookName(), book.getAuthor(), book.getPublichser()};
			tableBookList.addRow(obj);
		}
		
	}



	@Override
	public void searchBookAuthor(String authorName) {
		HomeEvent homeEvent = new HomeEvent();
		ArrayList<Book> bookList = new ArrayList<Book>();
		try {
			bookList = homeEvent.searchBookByAuthor(authorName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		DefaultTableModel tableBookList = homeView.getTableModel300();
		
		tableBookList.setRowCount(1);
		for(int i=0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			Object[] obj = {book.getuID(), book.getBookName(), book.getAuthor(), book.getPublichser()};
			tableBookList.addRow(obj);
		}
		
		
	}



	@Override
	public void searchHistory() {
		HomeEvent homeEvent = new HomeEvent();
		ArrayList<BookBorrowInfo> bookHistory = new ArrayList<BookBorrowInfo>();
		try {
			bookHistory = homeEvent.searchLibraryHistory(username);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		DefaultTableModel historyTable = homeView.getTableModel40();
		historyTable.setRowCount(1);
		for(int i=0; i<bookHistory.size(); i++) {
			BookBorrowInfo info = bookHistory.get(i);
			Object[] obj = {info.getuID(), info.getBookname(), info.getBorrowDate(), info.getReturnDate()};
			historyTable.addRow(obj);
		}
		
	}



	@Override
	public void returnBook(int uID) {
		HomeEvent homeEvent = new HomeEvent();
		boolean returnSucceedFlag = false;
		try {
			returnSucceedFlag = homeEvent.returnBook(uID, username);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(returnSucceedFlag == true) {
			JOptionPane.showMessageDialog(null, "还书成功", "提示",JOptionPane.WARNING_MESSAGE); 
		}else {
			JOptionPane.showMessageDialog(null, "还书失败", "提示",JOptionPane.WARNING_MESSAGE); 
		}
		
	}



	@Override
	public void showAllProducts() {
		HomeEvent homeEvent = new HomeEvent();
		ArrayList<Product> productList = new ArrayList<Product>();
		
		try {
			productList = homeEvent.searchAllProduct();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		DefaultTableModel tableAllProcudt = homeView.getTableModel11();
		tableAllProcudt.setRowCount(1);
		for(int i=0; i<productList.size(); i++) {
			Product product = productList.get(i);
			Object[] obj = {product.getuID(), product.getName(), product.getPrice(), product.getLabel()};
			tableAllProcudt.addRow(obj);
		}
		
	}



	@Override
	public void searchProduct(String productName) {
		HomeEvent homeEvent = new HomeEvent();
		ArrayList<Product> productList = new ArrayList<Product>();
		
		try {
			productList = homeEvent.searchProduct(productName, productName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		DefaultTableModel tableAllProcudt = homeView.getTableModel11();
		tableAllProcudt.setRowCount(1);
		for(int i=0; i<productList.size(); i++) {
			Product product = productList.get(i);
			Object[] obj = {product.getuID(), product.getName(), product.getPrice(), product.getLabel()};
			tableAllProcudt.addRow(obj);
		}
		
		
	}


	public ArrayList<Product> cartList = new ArrayList<Product>();

	@Override
	public void addToCart(int uid, String productName, String productPrice, String productLabel) {
		Product product = new Product(uid, productName, Double.parseDouble(productPrice), productLabel);
		cartList.add(product);
		
	}



	@Override
	public void displayCart() {
		DefaultTableModel cartTable = homeView.getTableModel201();
		cartTable.setRowCount(1);
		for(int i=1; i<cartList.size(); i++) {
			Product product = cartList.get(i);
			Object[] obj = {product.getuID(), product.getName(), product.getPrice(), product.getLabel()};
			cartTable.addRow(obj);
		}
		
	}



	@Override
	public void emptyCart() {
		cartList.clear();
	}



	@Override
	public void deleteCartItem(int uid) {
		for(int i=0; i<cartList.size(); i++) {
			if(cartList.get(i).getuID() == uid) {
				cartList.remove(i);
			}
		}
		
	}



	@Override
	public void buyCartItem(int uid) {
		HomeEvent homeEvent = new HomeEvent();
		boolean buySucceedFlag = true;
		try {
			buySucceedFlag = homeEvent.buyProduct(uid, username);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(true == buySucceedFlag) {
			JOptionPane.showMessageDialog(null, "购买成功", "提示",JOptionPane.WARNING_MESSAGE); 
			deleteCartItem(uid);
		}else {
			JOptionPane.showMessageDialog(null, "购买失败", "提示",JOptionPane.WARNING_MESSAGE); 
		}
		
	}



	@Override
	public void orderHistory() {
		HomeEvent homeEvent = new HomeEvent();
		ArrayList<ShoppingInfo> shoppingHistory = new ArrayList<ShoppingInfo>();
		try {
			shoppingHistory = homeEvent.checkShoppingHistory(username);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		DefaultTableModel tableOrderHistory = homeView.getTableModel3();
		tableOrderHistory.setRowCount(1);
		for(int i=0; i<shoppingHistory.size(); i++) {
			ShoppingInfo shoppingInfo = shoppingHistory.get(i);
			Object[] obj = {shoppingInfo.getProductName(), shoppingInfo.getPrice(), shoppingInfo.getPurchaseDate()};
			tableOrderHistory.addRow(obj);
		}
		
	}



	@Override
	public void checkAccount() {
		//更新余额显示
		HomeEvent homeEvent = new HomeEvent();
		double balance = 0;
		try {
			balance = homeEvent.checkAccount(username);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		homeView.getLabelMoney().setText(balance+"");
		
		//更新消费记录
		DefaultTableModel tableAccountHistory = homeView.getTableModel4();
		ArrayList<BankInfo> accountHistory = new ArrayList<BankInfo>();
		try {
			accountHistory = homeEvent.searchAccountHistory(username);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		for(int i=0; i<accountHistory.size(); i++) {
			BankInfo info = accountHistory.get(i);
			Object[] obj = {info.getDate(), info.getMoney(),info.getBalance()};
			tableAccountHistory.addRow(obj);
		}
		
		
	}



	@Override
	public void chargeAccount(double money) {
		HomeEvent homeEvent = new HomeEvent();
		boolean chargeSucceedFlag = false;
		try {
			chargeSucceedFlag = homeEvent.chargeMoney(money, username);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(true == chargeSucceedFlag) {
			JOptionPane.showMessageDialog(null, "充值成功", "提示",JOptionPane.WARNING_MESSAGE); 
			checkAccount();
		}else {
			JOptionPane.showMessageDialog(null, "充值失败", "提示",JOptionPane.WARNING_MESSAGE); 
		}
		
		
	}



	@Override
	public void logout() {
	
		HomeEvent homeEvent = new HomeEvent();
		
		homeEvent.logout();
		
	}







	
}
