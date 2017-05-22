//package lms;


import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.sql.*;

class Issue extends JFrame

{
	
JTextField jtf1,jtf2,jtf3,jtf4;
	JLabel jl1,jl2,jl3,jl4;

	JButton jb1,jb2;

	JPanel jp;

	
Issue()
	
{

		super(" Issue of Books");
	
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		

		jp=new JPanel();

		jp.setLayout(new GridLayout(5,2));
		

		jl1=new JLabel("ID");
	
	        jtf1=new JTextField();

	
	jl2=new JLabel("BookCode");

		jtf2=new JTextField();


		jl3=new JLabel("IssueDate");

		jtf3=new JTextField();

	
	        jl4=new JLabel("ExpireDate");

		jtf4=new JTextField();


		jb1=new JButton(" Issuing ");
		
            /*    jb1.addActionListener(new ActionListener()

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
String bcode=jtf2.getText();

String idte=jtf3.getText();
String ed=jtf4.getText();
     
                   String sql="insert into tbl_issue values('"+id+"','"+bcode+"','"+idte+"','"+ed+"')";

						int count=stmt.executeUpdate(sql);

						stmt.close();

						conn.close();

	
			}
		
		catch(SQLException e){


}
			
//	catch(ClassNotFoundException e){



}

				jtf1.setText("");

				jtf2.setText("");
	
			jtf3.setText("");

				jtf4.setText("");

				jtf1.requestFocus();


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

);*/

	
		add(jp);
	
	jp.add(jl1);jp.add(jtf1);
        jp.add(jl2);jp.add(jtf2);
	
	jp.add(jl3);jp.add(jtf3);

	jp.add(jl4);jp.add(jtf4);
		
        jp.add(jb1);jp.add(jb2);

	setSize(400,400);

		setResizable(false);

		setVisible(true);

	}


	
	public static void main(String args[])
		
{
		
	Issue f=new Issue();

		}

}