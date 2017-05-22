//package lms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Stock extends JFrame
{
	JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7;
	JButton jb1,jb2;
	JPanel jp;

	Stock()
	{
		super(" Stock Maintenance ");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		jp=new JPanel();
		jp.setLayout(new GridLayout(8,2));
		
		jl1=new JLabel("BookName");
		jtf1=new JTextField();
	
		jl2=new JLabel("BookCode");
		jtf2=new JTextField();

		jl3=new JLabel("Author");
		jtf3=new JTextField();

	      //	jl4=new JLabel("Date of Arrival ");
		//jtf4=new JTextField();

		//jl5=new JLabel(" Price ");
		//jtf5=new JTextField();

		jl6=new JLabel("Copies");
		jtf6=new JTextField();

		jl7=new JLabel("SubjectCode");
		jtf7=new JTextField();

		jb1=new JButton(" Save ");
			/*jb1.addActionListener(new ActionListener()
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
                                         Statement stmt=conn.createStatement();
                       String bname=jtf1.getText();String bcode=jtf2.getText();String author=jtf3.getText();String copies=jtf6.getText();
                       String scode=jtf7.getText();
                      String sql="insert into tbl_stock values('"+bname+"','"+bcode+"','"+author+"','"+copies+"','"+scode+"')";
                                         int count=stmt.executeUpdate(sql);
						
						stmt.close();
						conn.close();
				}
				catch(SQLException e){}
			//	catch(ClassNotFoundException e){}
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
		//		jtf4.setText("");
		//		jtf5.setText("");
				jtf6.setText("");
				jtf7.setText("");
				jtf1.requestFocus();

			}
		});
	
	
		
		jb2=new JButton(" Clear ");
		jb2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				//jtf4.setText("");
				//jtf5.setText("");
				jtf6.setText("");
				jtf7.setText("");
				jtf1.requestFocus();
			}
		});*/

	
		add(jp);
		jp.add(jl1);jp.add(jtf1);
		jp.add(jl2);jp.add(jtf2);
		jp.add(jl3);jp.add(jtf3);
		//jp.add(jl4);jp.add(jtf4);
		//jp.add(jl5);jp.add(jtf5);
		jp.add(jl6);jp.add(jtf6);
		jp.add(jl7);jp.add(jtf7);
		jp.add(jb1);jp.add(jb2);
		

		setSize(500,700);
		setResizable(false);
		setVisible(true);
	}


		public static void main(String args[])
		{
			Stock f=new Stock();
		}
}

