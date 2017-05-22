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

class Login2 extends JFrame
{
	JTextField jtf1;
	JPasswordField jpf;
	JButton jb1,jb2;
	JLabel  jl1,jl2,jl3;
	Login2()
	{
		super("Login Form");
		
		setResizable(true);
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
	    jp.add(jl1);jp.add(jtf1);
		jp.add(jl2);jp.add(jpf);
		jp.add(jb1);jp.add(jb2);
		jp.add(jl3);
		add(jp);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100,150,500,500);
		setVisible(true);
	}
	public static void main(String args[])
	{
		//Splash s1=new Splash();
		Login2 l1=new Login2();
	}
}
