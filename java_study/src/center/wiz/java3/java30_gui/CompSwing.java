package center.wiz.java3.java30_gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompSwing extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel label;
	private JLabel labelBlank;
	private JButton btn;
	private JButton exitBtn;
	private JTextField textField;
	private JComboBox<String> comboBox;
	private JCheckBox checkBox;
	String[] items = {"A", "B", "C"};
	
	public CompSwing() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Label");
		btn = new JButton("Button");
		textField = new JTextField(20);
		comboBox = new JComboBox<String>(items);
		checkBox = new JCheckBox("CheckBox");
		labelBlank = new JLabel();
		exitBtn = new JButton("Exit");
		
		panel = (JPanel) getContentPane();
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(btn);
		panel.add(textField);
		panel.add(comboBox);
		panel.add(checkBox);
		panel.add(labelBlank);
		panel.add(exitBtn);
		
		/*
		*/
		label.setPreferredSize(new Dimension(50, 50));
		btn.setPreferredSize(new Dimension(100, 50));
		textField.setPreferredSize(new Dimension(300, 50));
		comboBox.setPreferredSize(new Dimension(50, 50));
		checkBox.setPreferredSize(new Dimension(100, 50));
		labelBlank.setPreferredSize(new Dimension(200, 50));
		exitBtn.setPreferredSize(new Dimension(100, 50));
		
		btn.addActionListener(this);
		exitBtn.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)) {
			labelBlank.setText(textField.getText());
			textField.setText("");
			btn.transferFocus();
		} else if(e.getSource().equals(exitBtn)) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}

}
