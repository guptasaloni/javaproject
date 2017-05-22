package lms
 
import java.sql.*;

import javax.swing.*;

import java.awt.*;

class DisplayBooksDetail extends JFrame

{
	DisplayBooksDetail()

	{
	
	Color c2 = new Color(20,40,50);

		setBackground(c2);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		Object data[][]=new Object[20][7];

		String heads[]={"BookName","BookCode","Author","Copies","SubjectCode"};

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

			ResultSet rst=stmt.executeQuery("Select * from tbl_stock");
	
	
			int i=0;
			
            while(rst.next())

			{
				
                data[i][0]=rst.getString("BookName");

				data[i][1]=rst.getString("BookCode");

				data[i][2]=rst.getString("Author");

			     //data[i][3]=rst.getString("DateofArrival");
	
		
	               data[i][3]=rst.getString("Copies");

			       data[i][4]=rst.getString("SubjectCode");

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

	
	new DisplayBooksDetail();

	
   }

}




