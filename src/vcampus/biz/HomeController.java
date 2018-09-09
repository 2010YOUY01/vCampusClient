package vcampus.biz;

import vcampus.view.HomeView;

import java.util.Date;

import vcampus.view.HomeListener;
import vcampus.vo.PersonInfo;
import vcampus.vo.User;

public class HomeController implements HomeListener {
	private HomeView homeView;
	private User user;
	private PersonInfo personInfo;
	
	public HomeController(HomeView homeView) {
		super();
		this.homeView = homeView;
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
			personInfo = homeEvent.searchPersonInfo("haha");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homeView.getTextUsername().setText(personInfo.getUsername());
		homeView.getTextName().setText(personInfo.getName());
		homeView.getTextAge().setText(personInfo.getName());
		String gender =  personInfo.getGender() == PersonInfo.GENDER.MAlE? "ÄÐ":"Å®";
		homeView.getTextGender().setText(gender);
		homeView.getTextSchool().setText(personInfo.getSchool().toString());
		String birthday = personInfo.getBirthday().getYear() + " - "
				+personInfo.getBirthday().getMonth()+" - "
				+personInfo.getBirthday().getDay();
		homeView.getTextBirthday().setText(birthday);
		homeView.getTextLocation().setText(personInfo.getLoc());
		homeView.getTextCity().setText(personInfo.getCity());
		
		//personInfo = HomeEvent.searchPersonInfo(User user);
	}


	@Override
	public void selectCourse(int uid) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void dropCourse(int uid) {
		// TODO Auto-generated method stub
		
	} 
	
}
