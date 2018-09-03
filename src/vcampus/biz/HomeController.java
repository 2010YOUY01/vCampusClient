package vcampus.biz;

import vcampus.view.Home;
import vcampus.view.HomeListener;
import vcampus.vo.User;

public class HomeController implements HomeListener {
	private User user;
	private Home home;
	
	public HomeController(User user, Home home) {
		this.user = user;
		this.home = home;
	}

	
	@Override
	public void inHomePerfomed() {
		home.getTextName().setText("HELLO");
		home.getTextCity().setText(user.getPassword());
	}
	
}
