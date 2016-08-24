package kr.co.iamtek.projectchat;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread extends Thread {

	private Socket socket = null;
	private List list = null;
	private BufferedReader reader = null;
	private String data;

	public ClientThread (Socket socket, List list) {
		super();
		this.socket = socket;
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while ((data = reader.readLine()) != null) {
				list.add(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close(); 
				if(socket != null) socket.close(); 
			} catch (Exception e) {
			}
		}
	}

}
