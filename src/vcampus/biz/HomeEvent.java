package vcampus.biz;

import java.util.ArrayList;

import vcampus.util.MessageOperation;
import vcampus.vo.BankInfo;
import vcampus.vo.Book;
import vcampus.vo.BookBorrowInfo;
import vcampus.vo.Course;
import vcampus.vo.PersonInfo;
import vcampus.vo.Product;
import vcampus.vo.ShoppingInfo;
import vcampus.vo.SocketMessage;
import vcampus.vo.User;

public class HomeEvent {
	public PersonInfo searchPersonInfo(String username) throws ClassNotFoundException {
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.SEARCH_PERSONINFO);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		
		PersonInfo personInfo = (PersonInfo) socketMessageReceived.getObj();
		return personInfo;
	}
	public boolean ifCourseSelected(int courseUID, String username) throws ClassNotFoundException {
		boolean selectSucceedFlag = false;
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.CHECK_COURSE_SELECTED);
		socketMessage.setObj(courseUID);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		
		if(socketMessageReceived.getType().equals(SocketMessage.TYPE.COURSE_SELECTED)) {
			selectSucceedFlag = true;
		}

		return selectSucceedFlag;
	}
	public boolean selectCourse(int courseUID, String username) throws ClassNotFoundException {
		boolean selectSucceedFlag = false;
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.SELECT_COURSE);
		socketMessage.setObj(courseUID);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		
		if(socketMessageReceived.getType().equals(SocketMessage.TYPE.SELECT_COURSE_SUCCEED)) {
			selectSucceedFlag = true;
		}

		return selectSucceedFlag;
	}
	
	public boolean dropCourse(int courseUID, String username) throws ClassNotFoundException {
		//send obj: int courseUID
		boolean dropSucceedFlag = false;
		SocketMessage socketMessage = new SocketMessage(username,SocketMessage.TYPE.DROP_COURSE);
		socketMessage.setObj(courseUID);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		
		if(socketMessageReceived.getType().equals(SocketMessage.TYPE.DROP_COURSE_SUCCEED)) {
			dropSucceedFlag = true;
		}
		
		return dropSucceedFlag;
	}
	
	public ArrayList<Course> getCourseList(String username) throws ClassNotFoundException{
		//send name: username type: GET_COURSE_TABLE 
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.GET_COURSE_TABLE);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		ArrayList<Course> courseList = (ArrayList)socketMessageReceived.getObj();
		return courseList;
	}
	
	public ArrayList<Course> getAllCourseList() throws ClassNotFoundException{
		//send name: username type: GET_COURSE_TABLE 
		SocketMessage socketMessage = new SocketMessage("server", SocketMessage.TYPE.GET_ALL_COURSE);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		ArrayList<Course> courseList = (ArrayList)socketMessageReceived.getObj();
		return courseList;
	}
	
	public ArrayList<Product> searchAllProduct() throws ClassNotFoundException{
		//send obj: string productName
		SocketMessage socketMessage = new SocketMessage("user", SocketMessage.TYPE.GET_ALL_PRODUCTS);
		
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		ArrayList<Product> productList = (ArrayList<Product>)socketMessageReceived.getObj();
		return productList;
	}
	
	public ArrayList<Product> searchProduct(String username, String productName) throws ClassNotFoundException{
		//send obj: string productName
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.SEARCH_PRODUCT);
		socketMessage.setObj(productName);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		ArrayList<Product> productList = (ArrayList<Product>)socketMessageReceived.getObj();
		return productList;
	}
	
	public boolean buyProduct(int productUID, String username) throws ClassNotFoundException {
		//send obj: int productUID
		boolean buySucceedFlag = false;
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.BUY_PRODUCT);
		socketMessage.setObj(productUID);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		
		if(socketMessageReceived.getType().equals(SocketMessage.TYPE.BUY_PRODUCT_SUCCEED)) {
			buySucceedFlag = true;
		}
		
		return buySucceedFlag;
	}
	
	public ArrayList<ShoppingInfo> checkShoppingHistory(String username) throws ClassNotFoundException{
		//send object : null
		
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.SEARCH_SHOPPING_HISTORY);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		
		ArrayList<ShoppingInfo> shoppingHistory = (ArrayList<ShoppingInfo>)socketMessageReceived.getObj();
		
		return shoppingHistory;
	}
	
	public boolean chargeMoney(double money, String username) throws ClassNotFoundException {
		//send object: double money
		boolean chargeSucceedFlag = false;
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.CHARGE);
		socketMessage.setObj(money);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		if(socketMessageReceived.getType().equals(SocketMessage.TYPE.CHARGE_SUCCEED)) {
			chargeSucceedFlag = true;
		}
		return chargeSucceedFlag;
	}
	
	public double checkAccount(String username) throws ClassNotFoundException {
		//send object:null
		double balance = -1;
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.CHECK_ACCOUNT_BALANCE);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);

		balance = (double)socketMessageReceived.getObj();
		return balance;
	}
	
	public ArrayList<BankInfo> searchAccountHistory(String username) throws ClassNotFoundException{
		//send object: null
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.CHECK_ACCOUNT_HISTORY);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		
		ArrayList<BankInfo> accountHistory= (ArrayList<BankInfo>) socketMessageReceived.getObj();
		return accountHistory;
	}
	public ArrayList<Book> searchBookByName(String bookName) throws ClassNotFoundException{
		//send object: String bookName
		SocketMessage socketMessage = new SocketMessage("user", SocketMessage.TYPE.SEARCH_BOOK_NAME);
		socketMessage.setObj(bookName);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		
		ArrayList<Book> bookList = (ArrayList<Book>) socketMessageReceived.getObj();

		return bookList;
	}
	
	public ArrayList<Book> searchBookByAuthor(String authorName) throws ClassNotFoundException{
		// send object: String authorName
		SocketMessage socketMessage = new SocketMessage("user", SocketMessage.TYPE.SEARCH_BOOK_AUTHOR);
		socketMessage.setObj(authorName);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);

		ArrayList<Book> bookList = (ArrayList<Book>) socketMessageReceived.getObj();

		return bookList;
	}
	
	public boolean borrowBook(int bookUID, String username) throws ClassNotFoundException {
		//send object: int bookUID
		boolean borrowSucceedFlag = false;
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.BORROW_BOOK);
		socketMessage.setObj(bookUID);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		if(socketMessageReceived.getType().equals(SocketMessage.TYPE.BORROW_BOOK_SUCCEED)) {
			borrowSucceedFlag = true;
		}
		return borrowSucceedFlag;
	}
	
	public boolean returnBook(int bookUID, String username) throws ClassNotFoundException {
		//send object: int bookUID;
		boolean returnSucceedFlag = false;
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.RETURN_BOOK);
		socketMessage.setObj(bookUID);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		if(socketMessage.getType().equals(SocketMessage.TYPE.RETURN_BOOK_SUCCEED)) {
			returnSucceedFlag = true;
		}
		return returnSucceedFlag;
	}
	
	public ArrayList<BookBorrowInfo> searchLibraryHistory(String username) throws ClassNotFoundException{
		//send object: null
		SocketMessage socketMessage = new SocketMessage(username, SocketMessage.TYPE.CHECK_LIBRARY_HISTORY);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		ArrayList<BookBorrowInfo> libraryHistory = (ArrayList<BookBorrowInfo>)socketMessageReceived.getObj();
		return libraryHistory;
	}
	
	public void logout() {
		SocketMessage socketMessage = new SocketMessage("user", SocketMessage.TYPE.LOGOUT);
		try {
			System.out.println("before sending");
			MessageOperation.sendMessage(socketMessage);
			System.out.println("after sending");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
