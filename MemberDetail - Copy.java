//package lms;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MemberDetail extends JFrame 
{   
   	JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8,jtf9;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9;
	JButton jb1,jb2;
	JPanel jp;


   MemberDetail()
   {
     	super("Member Detail ");
       	
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		jp=new JPanel();
		jp.setLayout(new GridLayout(10,2));

		jl1 = new JLabel("Enter ID no.");	
		jl2=new JLabel(" Name ");			
		jtf1 = new JTextField(8);	
		jtf2=new JTextField();

		jl3=new JLabel(" Father's Name ");
		jtf3=new JTextField();

		jl4=new JLabel(" Designation ");
		jtf4=new JTextField();

		jl5=new JLabel(" Branch ");
		jtf5=new JTextField();

		jl6=new JLabel(" Address ");
		jtf6=new JTextField();

		jl7=new JLabel(" Date of issue ");
		jtf7=new JTextField();

		jl8=new JLabel(" Date of expiry");
		jtf8=new JTextField();

		jl9=new JLabel(" Contact No.");
		jtf9=new JTextField();		
	
 	jb1 = new JButton("Show");
	/*jb1.addActionListener
	(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
				{
					Object data[][]=new Object[10][9];
		String heads[]={"ID No."," Name","Father's Name","Designation","Branch","Address","Date of issue","Date of expiry","Contact No."};
		
		try
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println(e);
			}
			Connection conn=DriverManager.getConnection("Jdbc:Odbc:lms");
			Statement stmt=conn.createStatement();
			ResultSet rst=stmt.executeQuery("Select * from membership where IDNO="+jtf1.getText());
		
			while(rst.next())
			{
				jtf2.setText(rst.getString("Name"));
				jtf3.setText(rst.getString("Father'sName"));
				jtf4.setText(rst.getString("Designation"));
				jtf5.setText(rst.getString("Branch"));
				jtf6.setText(rst.getString("Address"));
				jtf7.setText(rst.getString("IssueDate"));
				jtf8.setText(rst.getString("ExpiryDate"));
				jtf9.setText(rst.getInt("ContactNo")+"");
			   }
				stmt.close();
				conn.close();
			}
				catch(SQLException e)
				   {
					System.out.print(e);
					}	

			}
		}
	);
	jb2=new JButton("Cancel");
		jb2.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					dispose();
				}
			}
		);*/
          
	 add(jp);
		jp.add(jl1);jp.add(jtf1);
		jp.add(jl2);jp.add(jtf2);
		jp.add(jl3);jp.add(jtf3);
		jp.add(jl4);jp.add(jtf4);
		jp.add(jl5);jp.add(jtf5);
		jp.add(jl6);jp.add(jtf6);
		jp.add(jl7);jp.add(jtf7);
		jp.add(jl8);jp.add(jtf8);
		jp.add(jl9);jp.add(jtf9);
		jp.add(jb1);jp.add(jb2);
		

		setSize(500,700);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String args[])
	{
		MemberDetail f= new MemberDetail();
	}			
}

	