//package lms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Return  extends JFrame
{
	JTextField jtf1,jtf2,jtf3,jtf4;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8;
	JButton jb1,jb2,jb3;
	JPanel jp;

	Return()
	{
		super(" Return of Books");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		jp=new JPanel();
		jp.setLayout(new GridLayout(5,3));
		
		jl1=new JLabel("ID");
		jtf1=new JTextField();
	
		jl2=new JLabel("BookCode");
		jtf2=new JTextField();

		jl3=new JLabel("IssueDate");
		jtf3=new JTextField();

		jl4=new JLabel("ExpireDate");
		jtf4=new JTextField();

		jl5=new JLabel("");
		jl6=new JLabel("");
		jl7=new JLabel("");
		jl8=new JLabel("");

		jb1=new JButton(" Returning ");
			/*jb1.addActionListener
		(
			new ActionListener()
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
                   String id=jtf1.getText();
						String s="Delete from tbl_issue where ID='"+id+"'";
						int count=stmt.executeUpdate(s);
						stmt.close();	
						conn.close();
					}
					catch(SQLException e)
					{
						System.out.println(e);
					}
					jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
				//	new Msg("ID is Removed...");
					JOptionPane.showMessageDialog(null,
							" The Book is returned ......","Information",
							JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
			}
		);
		jb2=new JButton(" Cancel ");
		
		jb2.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					dispose();
				}
			}
		);
		jb3=new JButton(" Show ");
		jb3.addActionListener
	(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
				{
					Object data[][]=new Object[10][4];
		String heads[]={"Member ID No.","Book Code","Date of Issue","Date of Expiry"};
		
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
			ResultSet rst=stmt.executeQuery("Select BookCode,DateofIssue,DateofExpiry from Issue where MemberIdNo="+jtf1.getText());
		
			while(rst.next())
			{
				jtf2.setText(rst.getInt("BookCode")+"");
				jtf3.setText(rst.getString("DateofIssue"));
				jtf4.setText(rst.getString("DateofExpiry"));
				
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
	);*/

			
		add(jp);
		jp.add(jl1);jp.add(jtf1);jp.add(jl5);
		jp.add(jl2);jp.add(jtf2);jp.add(jl6);
		jp.add(jl3);jp.add(jtf3);jp.add(jl7);
		jp.add(jl4);jp.add(jtf4);jp.add(jl8);
		jp.add(jb1);jp.add(jb2);jp.add(jb3);
		

		setSize(400,400);
		setResizable(false);
		setVisible(true);
	}


		public static void main(String args[])
		{
			Return f=new Return();
		}
}