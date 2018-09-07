package vcampus.biz;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import vcampus.util.MessageOperation;
import vcampus.util.SocketConnection;
import vcampus.vo.LoginFormEvent;
import vcampus.vo.SocketMessage;
import vcampus.vo.*;

public class LoginEvent {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		LoginEvent loginEventDTO = new LoginEvent();
		boolean loginSucceedFlag = 
				loginEventDTO.authenticate(new LoginFormEvent("admin", "admin"));
		if(true == loginSucceedFlag) {
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
	
	
	public  static boolean authenticate(LoginFormEvent loginFormEvent) throws IOException, ClassNotFoundException 
	{
		boolean loginSucceedFlag = false;
		SocketMessage socketMessage = new SocketMessage("0",SocketMessage.TYPE.LOGINCHECK);		
		socketMessage.setType(SocketMessage.TYPE.LOGINCHECK);
		socketMessage.setObj(loginFormEvent);
		SocketMessage socketMessageReceived = MessageOperation.sendMessage(socketMessage);
		
		if(socketMessageReceived.getType().equals(SocketMessage.TYPE.LOGINSUCCEED)) {
			loginSucceedFlag = true;
		}
		
		return loginSucceedFlag;
	}
	
	public static boolean register(RegisterForm registerForm) throws ClassNotFoundException {
		boolean registerSucceedFlag = false;
		SocketMessage socketMessage = new SocketMessage("0", SocketMessage.TYPE.REGISTER);
		socketMessage.setObj(registerForm);
		SocketMessage messageReceived = MessageOperation.sendMessage(socketMessage);
		if(messageReceived.getType().equals(SocketMessage.TYPE.REGISTERSUCCEED)) {
			registerSucceedFlag = true;
		}
		return registerSucceedFlag;
	}
//	public SocketMessage sendMessage(SocketMessage socketMessage) {
//		SocketConnection socketConnection = SocketConnection.getInstance();
//		socketConnection.initSocket();
//		boolean loginSucceedFlag = false;
//		Socket client = null;
//		ObjectOutputStream out = null;
//		ObjectInputStream in = null;
//		SocketMessage socketMessageReceived = null;
//
//		try {
//			client = socketConnection.getSocket();
//			//client = new Socket("223.3.113.76", 8508)
//			out = new ObjectOutputStream(client.getOutputStream());
//			
//			//pass the massage to the server
//			out.writeObject(socketMessage);
//			out.flush();
//			client.shutdownOutput();
//			
//			
//			in = new ObjectInputStream(client.getInputStream());
//			socketMessageReceived = (SocketMessage) in.readObject();
//			//close resources
//
//			out.close();
//			client.close();
//
//			} catch (UnknownHostException e) {
//			e.printStackTrace();
//			System.exit(1);
//			} catch (IOException e) {
//			e.printStackTrace();
//			System.exit(1);
//			}
//			return socketMessageReceived;
//	}
//	
//	
//	public  boolean authenticate(LoginFormEvent loginFormEvent) throws IOException, ClassNotFoundException 
//	{
//		SocketConnection socketConnection = SocketConnection.getInstance();
//		socketConnection.initSocket();
//		boolean loginSucceedFlag = false;
//		Socket client = null;
//		ObjectOutputStream out = null;
//		ObjectInputStream in = null;
//		
//
//		try {
//			client = socketConnection.getSocket();
//			//client = new Socket("223.3.113.76", 8508)
//			out = new ObjectOutputStream(client.getOutputStream());
//			//message setup
//			SocketMessage socketMessage = new SocketMessage();		
//			socketMessage.setType(SocketMessage.TYPE.LOGINCHECK);
//			socketMessage.setObj(loginFormEvent);
//			
//			//pass the massage to the server
//			out.writeObject(socketMessage);
//			out.flush();
//			client.shutdownOutput();
//			
//			
//			in = new ObjectInputStream(client.getInputStream());
//			SocketMessage socketMessageReceived = (SocketMessage) in.readObject();
//			if((socketMessageReceived.getType() == SocketMessage.TYPE.LOGINSUCCEED)) {
//				loginSucceedFlag = true;
//			}
//			//close resources
//
//			out.close();
//			client.close();
//
//			} catch (UnknownHostException e) {
//			e.printStackTrace();
//			System.exit(1);
//			} catch (IOException e) {
//			e.printStackTrace();
//			System.exit(1);		
//		}
//		return loginSucceedFlag;
//	
//	}
}
	
