//package lms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class RemoveID extends JFrame
{
	JTextField jtf1;
	JButton jb1;
	JLabel jl1;
	RemoveID()
	{
		super("Remove Membership Form");
		JPanel jp=new JPanel();
		Color c1=new Color(100,200,100);
		jp.setBackground(c1);
		jp.setLayout(new GridLayout(4,2));
		JLabel jl1=new JLabel("ID Number");
		jtf1=new JTextField(8);
		jb1=new JButton("Remove ID");
	/*	jb1.addActionListener
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
						String sql="Delete from tbl_memberdetail where ID='"+id+"'";
						int count=stmt.executeUpdate(sql);
						stmt.close();	
						conn.close();
					}
					catch(SQLException e)
					{
						System.out.println(e);
					}
				//	new Msg("ID is Removed...");
					JOptionPane.showMessageDialog(null,
							" ID is Removed......","Information",
							JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
			}
		);*/
		jp.add(jl1);jp.add(jtf1);
		jp.add(jb1);
		add(jp);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(200,150,450,200);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new RemoveID();
	}

}
