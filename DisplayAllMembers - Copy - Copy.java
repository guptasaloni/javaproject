package lms;

import java.sql.*;
import javax.swing.*;
import java.awt.*;

class DisplayAllMembers extends JFrame

{
	
DisplayAllMembers()

	{
	
	Color c2 = new Color(20,40,50);

		setBackground(c2);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		Object data[][]=new Object[20][9];
		
                String heads[]={"ID","Name","FatherName","Branch","Address","Contact"};

	  try


		{


			try

	
		
            {
		
		Class.forName("com.mysql.jdbc.Driver");


            }


			catch(ClassNotFoundException e)

			{
			
	System.out.println(e);

			
}
		
	     
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/apps","root","mysql");

           Statement stmt=conn.createStatement();

           ResultSet rst=stmt.executeQuery("Select * from tbl_memberdetail");

		

			int i=0;
		
	                      while(rst.next())
	
		{
	
				data[i][0]=rst.getInt("ID");

		    		data[i][1]=rst.getString("Name");
	
			        data[i][2]=rst.getString("FatherName");

			      //data[i][3]=rst.getString("Designation");

		     		data[i][3]=rst.getString("Branch");

			    	data[i][4]=rst.getString("Address");

			      //data[i][6]=rst.getString("IssueDate");

			      //data[i][7]=rst.getString("ExpiryDate");

			        data[i][5]=rst.getString("Contact");
	
			         i++;

			}
			
                  stmt.close();
		
                  conn.close();

	
	}

		
      catch(SQLException e)

		
       {

		
	System.out.println(e);

		
         }

		
       JTable table=new JTable(data,heads);
		
       JScrollPane jsp=new JScrollPane(table);
		
        add(jsp);


		setSize(800,200);
		
        setVisible(true);

	}
	
    public static void main(String args[])

	{
	
	new DisplayAllMembers();
	
}

}