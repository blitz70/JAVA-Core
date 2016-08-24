package kr.co.iamtek.projectchat;

import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class SeverThread extends Thread {

	private int id = 0;
	private HashMap<Integer, Socket> sockets = null;
	private Socket socket = null;
	private List list = null;
	private PrintWriter writer = null;
	private BufferedReader reader = null;
	private String data = null;

	public SeverThread(int id, HashMap<Integer, Socket> sockets, List list) {
		super();
		this.id = id;
		this.sockets = sockets;
		this.list = list;
	}

	@Override
	public void run() {
		try {
			list.add("[" + id + "] connected. " + sockets.size() + " connections.");
			reader = new BufferedReader(new InputStreamReader(sockets.get(id).getInputStream()));
			socket = sockets.get(id);
			while((data = reader.readLine()) != null) {
					list.add("[" + id + "] : " + data);
					Iterator<Integer> iterator = sockets.keySet().iterator();
					while (iterator.hasNext()) {
						Socket _socket = sockets.get(iterator.next());
						writer = new PrintWriter(_socket.getOutputStream(), true);
						writer.println("[" + id + "] : " + data);
					}
			}
		} catch (Exception e) {
			sockets.remove(id);
			list.add("[" + id + "] disconnected." + sockets.size() + " connections.");
		} finally {
			try {
				if(writer != null) writer.close(); 
				if(reader != null) reader.close(); 
				if(socket != null) socket.close(); 
			} catch (Exception e2) {
			}
		}
	}

}
