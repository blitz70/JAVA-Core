package kr.co.iamtek.projectchat;

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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatUI extends Frame implements ActionListener, KeyListener{

	private List list;
	private Panel panel;
	private TextField text;
	private Button btn;
	private Label label;
	
	public ChatUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {	//창 닫기 기능 활성화
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}
	
	public List serverUI() {
		setLayout(new BorderLayout());
		list = new List();
		panel = new Panel();
		add(list, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		label = new Label("Server");
		panel.add(label);
		setLocation(0, 0);
		setSize(new Dimension(300, 700));
		setVisible(true);
		return list;
	}
	
	public List clientUI() {
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
		text.addKeyListener(this);
		setLocation(500, 0);
		setSize(new Dimension(300, 300));
		setVisible(true);
		return list;
	}
	
	public void output(String out) {
		list.add(out);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)) {
			MainChatC.data = text.getText();
			text.setText("");
			btn.transferFocusBackward();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			MainChatC.data = text.getText();
			text.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
}
