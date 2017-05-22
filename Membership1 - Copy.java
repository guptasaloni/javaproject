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
import java.lang.String.*;

class Membership1 extends JFrame
{
    JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8,jtf9;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;
	JButton jb1,jb2;
	JPanel jp;

	Membership1()
	{
	     super(" Membership Card ");
	
    
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		jp=new JPanel();
		jp.setLayout(null);
		jl10=new JLabel("membership");
		jl10.setBounds(50, 80, 100, 50);
		jl1=new JLabel("ID");
		jl1.setBounds(50, 30, 100, 50);
		jtf1=new JTextField(30);
	    jtf1.setBounds(150, 20, 100, 50);
		jl2=new JLabel("Name");
		jl2.setBounds(20, 80, 100, 50);
		jtf2=new JTextField();
		jtf2.setBounds(100, 10, 100, 20);

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
		jp.add(jl10);
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jtf2);
		/*jp.add(jl3);
		jp.add(jtf3);
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
		jp.add(jb2);*/
		

		setSize(501,701);
		setResizable(false);
		setVisible(true);
	}
	
   public static void main(String args[])
	{   
	    //AboutUs aboutu=new AboutUs();
		//Splash s1=new Splash();
		//Login l1=new Login();
		Membership1 f=new Membership1();
	}
}