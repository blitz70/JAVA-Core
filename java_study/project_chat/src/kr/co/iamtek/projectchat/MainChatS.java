package kr.co.iamtek.projectchat;

import java.awt.List;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class MainChatS {

	private ServerSocket sSocket;
	HashMap<Integer, Socket> sockets;
	
	private MainChatS() {
		
		ChatUI ui = new ChatUI();
		List list = ui.serverUI();
		
		try {
			sSocket = new ServerSocket(2000);
			sockets = new HashMap<Integer, Socket>();
			int id = 0;
			while(true) {
				sockets.put(id, sSocket.accept());
				SeverThread server = new SeverThread(id, sockets, list);
		    server.start();
				id ++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MainChatS();
	}

}
