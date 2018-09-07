package vcampus.biz;

import javax.swing.JOptionPane;

import vcampus.util.MessageOperation;
import vcampus.view.RegisterListener;
import vcampus.view.RegisterView;
import vcampus.vo.RegisterForm;
import vcampus.vo.SocketMessage;

public class RegisterController implements RegisterListener {
	private RegisterView registerView;
	private RegisterForm registerForm;
	
	public RegisterController(RegisterView registerView, RegisterForm registerForm) {
		super();
		this.registerView = registerView;
		this.registerForm = registerForm;
	}

	@Override
	public void registerPerformed(RegisterForm registerForm) {
		//�������벻һ��
		if(! registerForm.getPassword().equals(registerForm.getRepeatPassword())) {
			JOptionPane.showMessageDialog(null, "�������벻һ��", "��ʾ",JOptionPane.WARNING_MESSAGE); 
			registerView.getPasswordField().setText("");
			registerView.getPasswordRepeatField().setText("");
		}
		else {
			boolean registerSucceedFlag = false;
			try {
				registerSucceedFlag = LoginEvent.register(registerForm);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			if(registerSucceedFlag) {
				JOptionPane.showMessageDialog(null, "ע��ɹ�", "��ʾ",JOptionPane.WARNING_MESSAGE); 
				registerView.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null, "�û��Ѿ�����", "��ʾ",JOptionPane.WARNING_MESSAGE);
				registerView.getTextUsername().setText("");
				registerView.getPasswordField().setText("");
				registerView.getPasswordRepeatField().setText("");
			}
		}
		
	}
	
	private boolean register(RegisterForm registerForm) throws ClassNotFoundException {
		boolean registerSucceedFlag = false;
		SocketMessage msg = new SocketMessage("0", SocketMessage.TYPE.REGISTER);
		msg.setObj(registerForm);
		SocketMessage msgReceived = MessageOperation.sendMessage(msg);
		if(msgReceived.getType().equals(SocketMessage.TYPE.REGISTERSUCCEED)) {
			registerSucceedFlag = true;
		}
		return registerSucceedFlag;
	}

}
