package lms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.lang.String.*;

class Membership extends JFrame
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
		jb1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				try
				{
						try
						{
							Class.forName("com.mysql.jdbc.Driver");
						}
						catch(ClassNotFoundException e)
						{
							System.out.print(e);
						}
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/apps","root","mysql");
String id=jtf1.getText();
String nme=jtf2.getText();
String fname=jtf3.getText();
String branch=jtf5.getText();
String address=jtf6.getText();
String contact=jtf9.getText();




String sql="insert into tbl_memberdetail values('"+id+"','"+nme+"','"+fname+"','"+branch+"','"+address+"','"+contact+"')";
						Statement stmt=conn.createStatement();
                                               int count=stmt.executeUpdate(sql);
						
						stmt.close();
						conn.close();
				}
				catch(SQLException e){}
			//	catch(ClassNotFoundException e){}
				jtf1.setText(Integer.parseInt(jtf1.getText())+1+"");
				jtf2.setText("");
				jtf3.setText("");
				//jtf4.setText("");
				jtf5.setText("");
				jtf6.setText("");
				//jtf7.setText("");
				//jtf8.setText("");
				jtf9.setText("");
				jtf2.requestFocus();

			}
		});



		jb2=new JButton(" Clear ");
			jb2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				jtf2.setText("");
				jtf3.setText("");
				//jtf4.setText("");
				jtf5.setText("");
				jtf6.setText("");
				//jtf7.setText("");
				//jtf8.setText("");
				jtf9.setText("");
				jtf2.requestFocus();
			}
		});

	
		add(jp);
		jp.add(jl1);jp.add(jtf1);
		jp.add(jl2);jp.add(jtf2);
		jp.add(jl3);jp.add(jtf3);
		//jp.add(jl4);jp.add(jtf4);
		jp.add(jl5);jp.add(jtf5);
		jp.add(jl6);jp.add(jtf6);
		//jp.add(jl7);jp.add(jtf7);
		//jp.add(jl8);jp.add(jtf8);
		jp.add(jl9);jp.add(jtf9);
		jp.add(jb1);jp.add(jb2);
		

		setSize(501,701);
		setResizable(false);
		setVisible(true);

	try
		{
						try
						{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						}
						catch(ClassNotFoundException e)
						{
							System.out.print(e);
						}
						Connection conn=DriverManager.getConnection("Jdbc:Odbc:lms");
						Statement stmt=conn.createStatement();
                				String qry="select * from membership order by sno";
						ResultSet rst=stmt.executeQuery(qry);
						int idno=0;
						while(rst.next())
						{
							idno=rst.getInt("IDNO");
						}
						idno++;
						jtf1.setText(idno+"");
						rst.close();
						stmt.close();
						conn.close();
		}
		catch(SQLException e){}
	//	catch(ClassNotFoundException e){} 
	}


		public static void main(String args[])
		{
			Membership f=new Membership();
		}
}