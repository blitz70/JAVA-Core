package center.wiz.java3.project;

import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MainChatC {

	Socket socket;
	PrintWriter writer;
	BufferedReader reader;
	static String data;
	String data2;
	
	public MainChatC() {
		ChatUI ui = new ChatUI();
		List list = ui.clientUI();
		try {
			socket = new Socket("localhost", 2000);
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while(true) {
				if (data != null) {
					writer.println(data);
					data2 = reader.readLine();
					list.add("Output : "+ data2);
					data = null;
				}
				Thread.sleep(10);
				if (false) break;
			}
			if(writer != null) writer.close(); 
			if(reader != null) reader.close(); 
			if(socket != null) socket.close(); 
		} catch (Exception e) {
			System.out.println("6");
		}
	}

	public static void main(String[] args) {
		new MainChatC();
	}

}
