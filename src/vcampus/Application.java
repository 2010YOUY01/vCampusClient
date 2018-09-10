package vcampus;
import javax.swing.SwingUtilities;

import vcampus.biz.HomeController;
import vcampus.biz.LoginController;
import vcampus.view.HomeView1;
import vcampus.view.LoginView;
import vcampus.vo.User;



public class Application {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				runApp();
			}
			
		});
	}
	
	public static void runApp() {
		User user = new User();
		LoginView login = new LoginView(user);
		LoginController loginController = new LoginController(user, login);
		
		login.setLoginListener(loginController);
		
	}

}
