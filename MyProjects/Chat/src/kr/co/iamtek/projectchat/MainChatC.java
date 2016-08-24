package kr.co.iamtek.projectchat;

import java.awt.List;
import java.io.PrintWriter;
import java.net.Socket;

public class MainChatC {

	Socket socket;
	PrintWriter writer;
	static String data = "";
	
	public MainChatC() {
		ChatUI ui = new ChatUI();
		List list = ui.clientUI();
		try {
			socket = new Socket("localhost", 2000);
			writer = new PrintWriter(socket.getOutputStream(), true);
			ClientThread client = new ClientThread(socket, list);
	    client.start();
			while(true) {
				if (data.equals("exit")) System.exit(0);
				if (data != "") {
					writer.println(data);
					data = "";
				}
				Thread.sleep(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(writer != null) writer.close();
		}
	}

	public static void main(String[] args) {
		new MainChatC();
	}

}
