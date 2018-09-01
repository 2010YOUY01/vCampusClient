package vcampus.biz;

import vcampus.view.Home;
import vcampus.view.LoginView;
import vcampus.view.LoginListener;
import vcampus.vo.LoginFormEvent;
import vcampus.vo.User;

public class LoginController implements LoginListener {
	private User user;
	private LoginView login;
	
	public LoginController(User user, LoginView login) {
		super();
		this.user = user;
		this.login = login;
	}

	@Override
	public void LoginPerformed(LoginFormEvent event) {
		//Authentiation check to be implemented
		boolean loginSuccessFlag = true;
		if(loginSuccessFlag == true) {
			//this.user = new User(event.getUsername(), event.getPassword());
			login.getUsernameField().setText("hello£¬hello");
			//login.closeWindow();
			Home home = new Home(this.user);
			HomeController homeController = new HomeController(user, home);
			home.setHomeListener(homeController);
			home.start();
			System.out.println("hello");
		}
		else {
			
		}
	}

}
