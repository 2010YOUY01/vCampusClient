package vcampus.view;

public interface HomeListener {
	public void inHomePerfomed();	
	public void getPersonInfo();
	public void selectCourse(int uid);
	public void dropCourse(int uid);
	public void getCourseList();
	public void searchCourse();
	public void searchBookname(String bookName);
	public void searchBookAuthor(String authorName);
	public void borrowBook(int uID);
	public void returnBook(int uID);
	public void searchHistory();
	
	public void showAllProducts();
	public void searchProduct(String productName);
	public void addToCart(int uid, String productName, String productPrice, String productLabel);
	public void displayCart();
	public void emptyCart();
	public void deleteCartItem(int uid);
	public void buyCartItem(int uid);
	public void orderHistory();
	public void checkAccount();
	public void chargeAccount(double money);
	
	public void logout();
	
}
