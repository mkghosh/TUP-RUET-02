package com.mithun.main;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class MyFrame {

	private static JFrame myFrame;
	public static void main(String[] args) {
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame = new JFrame("My Frame");
		myFrame.setBounds(new Rectangle(10,10,400,200));
		myFrame.getContentPane().setBackground(Color.RED);
//		myFrame.setBackground(Color.GREEN);
		myFrame.setVisible(true);
	}
}
