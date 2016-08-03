package center.wiz.java3.project;

import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatThread extends Thread {

	private int id = 0;
	private Socket socket = null;
	private List list = null;
	private PrintWriter writer = null;
	private BufferedReader reader = null;
	private String data;
	
	public ChatThread(int id, Socket socket, List list) {
		super();
		this.id = id;
		this.socket = socket;
		this.list = list;
	}

	@Override
	public void run() {
		try {
			list.add("Client(" + id + ") connected.");
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				try {
					data = reader.readLine();
					writer.println(data);
					list.add("(" + id + ") :" + data);
				} catch (Exception e) {
					list.add("Client(" + id + ")  disconnected.");
					break;
				}
			}
			if(writer != null) writer.close(); 
			if(reader != null) reader.close(); 
			if(socket != null) socket.close(); 
			
		} catch (Exception e) {
		}
	}

}
