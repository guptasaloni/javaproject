//package lms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AboutUs extends JFrame
{
	AboutUs()
 	{
 		super("Library Management System-About Us");
 		setLayout(new GridLayout(5,1));
 		setBackground(Color.green);
 		add(new Label("Library Management System "));
		add(new Label(""));
 		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new AboutUs();
	
	}
}