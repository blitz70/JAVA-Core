package center.wiz.java3.project;

import java.awt.List;
import java.io.PrintWriter;
import java.net.Socket;

public class MainChatC {

	Socket socket;
	PrintWriter writer;
	static String data = null;
	
	public MainChatC() {
		ChatUI ui = new ChatUI();
		List list = ui.clientUI();
		try {
			socket = new Socket("localhost", 2000);
			writer = new PrintWriter(socket.getOutputStream(), true);
			ClientThread client = new ClientThread(socket, list);
	    client.start();
			while(true) {
				if (data != null) {
					writer.println(data);
					data = null;
				}
				Thread.sleep(1);
				if (false) break;
			}
			if(writer != null) writer.close(); 
			if(socket != null) socket.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MainChatC();
	}

}
