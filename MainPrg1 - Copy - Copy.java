
//package lms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;
import java.sql.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
}

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
		JLabel jl2=new JLabel("Developed by saloni gupta",JLabel.RIGHT);
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
				Thread.sleep(300);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		dispose();
	}
}
class Login extends JFrame
{
	JTextField jtf1;
	JPasswordField jpf;
	JButton jb1,jb2;
	JLabel  jl1,jl2,jl3;
	Login()
	{
		super("Login Form");
		
		setResizable(false);
		JPanel jp=new JPanel();
		Color c1=new Color(50,110,210);
		jp.setBackground(c1);
	//	jp.setLayout(new GridLayout(4,2));
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
		


	//	JLabel jl1=new JLabel("Login Name");
	//	JLabel jl2=new JLabel("Password");
		jl3=new JLabel("");
	//	jtf1=new JTextField();
	//	jpf=new JPasswordField();
	//	jb1=new JButton("Login");
	    jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jpf);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jl3);
		add(jp);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100,150,500,500);
		setVisible(true);
	}
}
/*class Membership extends JFrame
{
	JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8,jtf9;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9;
	JButton jb1,jb2;
	JPanel jp;

	Membership()
	{
		super(" Membership Card ");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		jp=new JPanel();
		jp.setLayout(new GridLayout(10,2));
		
		jl1=new JLabel("ID");
		jtf1=new JTextField();
	
		jl2=new JLabel("Name");
		jtf2=new JTextField();

		jl3=new JLabel("FatherName");
		jtf3=new JTextField();

		

		jl5=new JLabel("Branch");
		jtf5=new JTextField();

		jl6=new JLabel("Address");
		jtf6=new JTextField();

		

		jl9=new JLabel("Contact");
		jtf9=new JTextField();

		jb1=new JButton(" Save ");
		add(jp);
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jtf2);
		jp.add(jl3);jp.add(jtf3);
		//jp.add(jl4);
		jp.add(jtf4);
		jp.add(jl5);
		jp.add(jtf5);
		jp.add(jl6);
		jp.add(jtf6);
		//jp.add(jl7);jp.add(jtf7);
		//jp.add(jl8);jp.add(jtf8);
		jp.add(jl9);
		jp.add(jtf9);
		jp.add(jb1);
		jp.add(jb2);
		

		setSize(501,701);
		setResizable(false);
		setVisible(true);
	}
}*/

class MainPrg1 extends JFrame //implements ActionListener
{
   public static void main(String args[])
	{   
	   AboutUs aboutu=new AboutUs();
		Splash s1=new Splash();
		Login l1=new Login();
		//Membership f=new Membership();
	}
}