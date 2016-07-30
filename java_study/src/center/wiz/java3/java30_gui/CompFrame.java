package center.wiz.java3.java30_gui;

import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CompFrame extends Frame implements ActionListener{

	private List list;
	private Panel panel;
	private TextField textField;
	private Button okBtn;
	private Button exitBtn;
	
	public CompFrame() {
		
		list = new List();
		panel = new Panel();
		textField = new TextField(20);
		okBtn = new Button("OK");
		exitBtn = new Button("Exit");
		
		setLayout(new BorderLayout());
		add(panel, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		
		panel.add(new Label("Write"));
		panel.add(textField);
		panel.add(okBtn);
		panel.add(exitBtn);
		
		okBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {	//창 닫기 기능 활성화
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(okBtn)) {
			list.add(textField.getText());
			textField.setText("");
			okBtn.transferFocusBackward();
		} else if(e.getSource().equals(exitBtn)) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}

}
