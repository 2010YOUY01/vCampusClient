package vcampus.biz;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import vcampus.util.SocketConnection;
import vcampus.vo.LoginFormEvent;
import vcampus.vo.SocketMessage;
import vcampus.vo.*;

public class LoginEvent {

	
	public static void main(String[] args) throws IOException  {
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

	public  boolean authenticate(LoginFormEvent loginFormEvent) throws IOException 
	{
		SocketConnection socketConnection = SocketConnection.getInstance();
		socketConnection.initSocket();
		boolean loginSucceedFlag = false;
		Socket client = null;
		ObjectOutputStream out = null;
		

		try {
			client = socketConnection.getSocket();
			Scanner socketScanner = new Scanner(client.getInputStream());
			out = new ObjectOutputStream(client.getOutputStream());
			
			//message setup
			SocketMessage socketMessage = new SocketMessage();		
			socketMessage.setType(SocketMessage.TYPE.LOGINCHECK);
			socketMessage.setObj(loginFormEvent);
			
			//pass the massage to the server
			out.writeObject(socketMessage);
			out.flush();
			client.shutdownOutput();
			
			//loginSucceedFlag = socketScanner.nextBoolean();
				
			//close resources

			out.close();
			socketScanner.close();
			client.close();

			} catch (UnknownHostException e) {
			e.printStackTrace();
			System.exit(1);
			} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
			}
		return loginSucceedFlag;
		}
	
	}
	
