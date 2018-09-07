package vcampus.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import vcampus.vo.SocketMessage;

public class MessageOperation {
	public static SocketMessage sendMessage(SocketMessage socketMessage) throws ClassNotFoundException {
		SocketConnection socketConnection = SocketConnection.getInstance();
		socketConnection.initSocket();
		boolean loginSucceedFlag = false;
		Socket client = null;
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		SocketMessage socketMessageReceived = null;

		try {
			client = socketConnection.getSocket();
			//client = new Socket("223.3.113.76", 8508)
			out = new ObjectOutputStream(client.getOutputStream());
			
			//pass the massage to the server
			out.writeObject(socketMessage);
			out.flush();
			client.shutdownOutput();
			
			
			in = new ObjectInputStream(client.getInputStream());
			socketMessageReceived = (SocketMessage) in.readObject();
			//close resources

			out.close();
			client.close();

			} catch (UnknownHostException e) {
			e.printStackTrace();
			System.exit(1);
			} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
			}
			return socketMessageReceived;
	}
	
}
