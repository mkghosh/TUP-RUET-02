package com.mithun.helper;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MyAppWindow {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyAppWindow window = new MyAppWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyAppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel myLabel = new JLabel("Text to Change");
		myLabel.setBounds(10, 11, 86, 20);
		frame.getContentPane().add(myLabel);
		
		textField = new JTextField();
		textField.setBounds(105, 11, 319, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton cngButton = new JButton("Changge");
		cngButton.setBounds(172, 58, 89, 23);
		cngButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String txt = textField.getText();
				if(!txt.isEmpty()) {
					myLabel.setText(txt);
					textField.setText("");
				}
			}
		});
		frame.getContentPane().add(cngButton);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
		lblNewJgoodiesLabel.setBounds(105, 144, 92, 14);
		frame.getContentPane().add(lblNewJgoodiesLabel);
	}
}
