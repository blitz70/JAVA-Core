package center.wiz.java3.project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MainChatC extends Frame implements ActionListener{

	private List list;
	private Panel panel;
	private TextField text;
	private Button btn;
	private Label label;
	
	Socket socket;
	PrintWriter writer;
	BufferedReader reader;
	String data, data2;
	
	public MainChatC() {
		
		setLayout(new BorderLayout());
		list = new List();
		panel = new Panel();
		add(list, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		label = new Label("Client");
		text = new TextField(20);
		btn = new Button("Chat");
		panel.add(label);
		panel.add(text);
		panel.add(btn);
		btn.addActionListener(this);
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
			socket = new Socket("localhost", 2000);
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			/*
			*/
		} catch (Exception e) {
			try {
				if(writer != null) writer.close(); 
				if(reader != null) reader.close(); 
				if(socket != null) socket.close(); 
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)) {
			data = text.getText();
			text.setText("");
			btn.transferFocusBackward();
			writer.println(data);
			try {
				data2 = reader.readLine();
			} catch (Exception e2) {
			}
			list.add("Output : "+ data2);
		}
	}

	public static void main(String[] args) {
		new MainChatC();
	}

}
