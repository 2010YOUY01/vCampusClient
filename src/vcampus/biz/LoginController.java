package vcampus.biz;

import java.io.IOException;

import javax.swing.JOptionPane;

import vcampus.view.HomeView;
import vcampus.view.HomeView1;
import vcampus.view.LoginView;
import vcampus.view.LoginListener;
import vcampus.vo.LoginFormEvent;
import vcampus.vo.RegisterForm;
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
		boolean loginSuccessFlag = false;
		LoginEvent loginEvent = new LoginEvent();
		try {
			loginSuccessFlag = loginEvent.authenticate(event);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(loginSuccessFlag == true) {
			login.closeWindow();
			HomeView homeView = new HomeView();
			HomeController homeController = new HomeController(homeView);
			homeController.setUsername(event.getUsername());
			homeView.setHomeListener(homeController);
			homeView.getHomeListener().inHomePerfomed();
		}
		else {
			JOptionPane.showMessageDialog(null, "µÇÂ½Ê§°Ü", "ÌáÊ¾",JOptionPane.WARNING_MESSAGE); 
		}
	}

	

}
