package center.wiz.java3.java31_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MainChatC {

	Socket socket;
	PrintWriter writer;
	BufferedReader reader;
	BufferedReader reader2;
	String data;
	
	public MainChatC() {
		try {
			socket = new Socket("localhost", 2000);
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			reader2 = new BufferedReader(new InputStreamReader(System.in));
			
			while ((data = reader2.readLine()) != null) {
				writer.println(data);
				System.out.println("Output : "+ data);
			}
			close();
		} catch (Exception e) {
		}
	}
	
	public void close() {
		try {
			if(writer != null) writer.close(); 
			if(reader != null) reader.close(); 
			if(socket != null) socket.close(); 
		} catch (Exception e) {
		}
	}
	
	public static void main(String[] args) {
		new MainChatC();
	}

}
