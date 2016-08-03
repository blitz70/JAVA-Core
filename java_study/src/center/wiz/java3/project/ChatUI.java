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

public class ChatUI extends Frame implements ActionListener{

	private List list;
	private Panel panel;
	private TextField text;
	private Button btn;
	private Label label; 
	
	public ChatUI(String type) {
		if (type.equals("server")) {
			setLayout(new BorderLayout());
			list = new List();
			panel = new Panel();
			add(list, BorderLayout.CENTER);
			add(panel, BorderLayout.SOUTH);
			label = new Label("Server");
			panel.add(label);
		} else if (type.equals("client")) {
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
		}
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {	//창 닫기 기능 활성화
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		setSize(new Dimension(500, 500));
		setVisible(true);

	}
	
	public void output(String out) {
		list.add(out);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)) {
			//MainChatC.data = text.getText();
			text.setText("");
			btn.transferFocusBackward();
		}
		
	}
	
	/*
	public static void main(String[] args) {
		ChatUI s = new ChatUI("server");
		ChatUI c = new ChatUI("client");
	}
	*/
}
