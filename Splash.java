//package lms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;
//import java.sql.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Splash extends JFrame 
{
	JProgressBar jpb;
	Splash()
	{
		JPanel jp=new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(new GridLayout(3,1));
		ImageIcon ii=new ImageIcon("");
        JLabel jl1=new JLabel("Library Management System",ii,JLabel.LEFT);
		JLabel jl2=new JLabel("Developed by Ankit Saxena",JLabel.RIGHT);
		Font f1=new Font("Arial",Font.BOLD+Font.ITALIC,20);
		jl1.setFont(f1);
		jl2.setFont(f1);
		jpb=new JProgressBar();
		jpb.setMinimum(1);
		jpb.setMaximum(100);
		jp.add(jl1);
		jp.add(jl2);
		jp.add(jpb);
		add(jp);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setBounds(100,150,500,250);
		setVisible(true);
		for(int i=1;i<=100;i++)
		{
			jpb.setValue(i);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		dispose();
	}
}
/*class Login1 extends JFrame
{
	JTextField jtf1;
	JPasswordField jpf;
	JButton jb1,jb2;
	JLabel  jl1,jl2,jl3;
	Login1()
	{
		super("Login Form");
		
		setResizable(false);
		JPanel jp=new JPanel();
		Color c1=new Color(50,110,210);
		jp.setBackground(c1);
		jp.setLayout(new GridLayout(4,2));
		jp.setLayout(null);

		jl1=new JLabel("username");
		jl2=new JLabel("password");
		jl1.setBounds(50, 30, 100, 50);
		jl2.setBounds(50, 80, 100, 50);
		
		jtf1=new JTextField(30);
		jtf1.setBounds(150, 50, 100, 20);
		
		jpf=new JPasswordField();
		jpf.setBounds(150, 100, 100, 20);
		
		jb1=new JButton("Login");
		jb2=new JButton("Cancel");
		jb1.setBounds(150, 150, 100, 30);
		jb2.setBounds(225, 150, 100, 30);
		


		JLabel jl1=new JLabel("Login Name");
		JLabel jl2=new JLabel("Password");
		jl3=new JLabel("");
	    jtf1=new JTextField();
	    jpf=new JPasswordField();
		jb1=new JButton("Login");
	}



	public static void main(String args[])
	{
		Splash s1= new Splash();
		Login1 l1= new Login1();
	}
}

