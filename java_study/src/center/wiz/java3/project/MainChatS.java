package center.wiz.java3.project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.ServerSocket;

public class MainChatS extends Frame {

	private List list;
	private Panel panel;
	private TextField text;
	private Button btn;
	private Label label; 
	
	private ServerSocket sSocket;
	
	private MainChatS() {
		
		setLayout(new BorderLayout());
		list = new List();
		panel = new Panel();
		add(list, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		label = new Label("Server");
		panel.add(label);
		setSize(new Dimension(500, 500));
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {	//창 닫기 기능 활성화
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		
		try {
			sSocket = new ServerSocket(2000);
			int id = 0;
			while(true) {
				ChatThread chat = new ChatThread(id, sSocket.accept(), list);
		    chat.start();
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
