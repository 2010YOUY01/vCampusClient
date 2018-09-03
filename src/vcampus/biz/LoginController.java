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
			user.setUserName(login.getUsernameField().getText());
			user.setPassword(login.getPasswordField().getText());
			//login.closeWindow();
			Home home = new Home(this.user);
			HomeController homeController = new HomeController(this.user, home);
			home.setHomeListener(homeController);
			home.start();
			System.out.println("hello");
		}
		else {
			
		}
	}

}
