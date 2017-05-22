
package lms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;
import java.sql.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Splash extends JFrame 
{
	JProgressBar jpb;
	Splash()
	{
		JPanel jp=new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(new GridLayout(3,1));
		ImageIcon ii=new ImageIcon("");
        JLabel jl1=new JLabel("Library Management System",ii,JLabel.LEFT);
		JLabel jl2=new JLabel("Developed by saloni gupta",JLabel.RIGHT);
		Font f1=new Font("Arial",Font.BOLD+Font.ITALIC,20);
		jl1.setFont(f1);
		jl2.setFont(f1);
		jpb=new JProgressBar();
		jpb.setMinimum(1);
		jpb.setMaximum(100);
		jp.add(jl1);
		jp.add(jl2);
		jp.add(jpb);
		add(jp);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setBounds(100,150,500,250);
		setVisible(true);
		for(int i=1;i<=100;i++)
		{
			jpb.setValue(i);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		dispose();
	}
}
class Login extends JFrame
{
	JTextField jtf1;
	JPasswordField jpf;
	JButton jb1,jb2;
	JLabel  jl1,jl2,jl3;
	Login()
	{
		super("Login Form");
		
		setResizable(false);
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
						ResultSet rst=stmt.executeQuery("Select * from tbl_login");

                                                String nam=jtf1.getText();
                                                System.out.println(nam);



						boolean found=false;
						while(rst.next())
						{
							if(jtf1.getText().equals(rst.getString("username")) && jpf.getText().equals(rst.getString("password")))
							{
								dispose();
								MainPrg m1=new MainPrg();		
								found=true;
								break;
							}
						}
						if(found==false)
						{
							JOptionPane.showMessageDialog(null,
							" Invalid id or Password","Information",
							JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}
						stmt.close();	
						conn.close();
					}
					catch(SQLException e)
					{
						System.out.println(e);
					}
				}
			}
		);
	//	jb2=new JButton("Cancel");
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
		jp.add(jl1);jp.add(jtf1);
		jp.add(jl2);jp.add(jpf);
		jp.add(jb1);jp.add(jb2);
		jp.add(jl3);
		add(jp);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100,150,500,500);
		setVisible(true);
	}*/
}
}


class MainPrg //extends JFrame// implements ActionListener
{
	/*MainPrg()
	{
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(1,1));
		ImageIcon ii=new ImageIcon("q1.jpg");
		JLabel jl1=new JLabel("Library Management System",ii,JLabel.LEFT);
		Font f1=new Font("Arial",Font.BOLD+Font.ITALIC,40);
		jl1.setFont(f1);
		jp.add(jl1);
		
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   JMenuBar mbar =new JMenuBar();
	   JMenu masters=new JMenu("Masters");
	   JMenuItem membership=new JMenuItem("Membership");
		
		JMenuItem stockmaintenance=new JMenuItem("Stock Maintenence");
		membership.addActionListener(this);
		stockmaintenance.addActionListener(this);
		masters.add(membership);
		JMenuItem removeid=new JMenuItem("Remove ID");
		removeid.addActionListener(this);
		masters.add(removeid);
		masters.add(stockmaintenance);
	     JMenu transactions=new JMenu("Transactions");				
		JMenuItem issueofbooks=new JMenuItem("Issue of Books");
		JMenuItem returnofbooks=new JMenuItem("Return of Books");
		issueofbooks.addActionListener(this);
		returnofbooks.addActionListener(this);
		//transactions.add(issueofbooks);
		//transactions.add(returnofbooks);
   	     JMenu view=new JMenu("View");

		JMenuItem displaybooksdetail=new JMenuItem("Display Books Detail");
		
		displaybooksdetail.addActionListener(this);
		
		view.add(displaybooksdetail);
		
		//JMenuItem memberdetail=new JMenuItem("Member Detail");
		
		//memberdetail.addActionListener(this);
		
		//view.add(memberdetail);

		JMenuItem displayallmembers=new JMenuItem("Display All Members");
		
		displayallmembers.addActionListener(this);
		
		view.add(displayallmembers);


	     JMenu help=new JMenu("Help");
		JMenuItem helptopics=new JMenuItem("Help Topics");
		helptopics.addActionListener(this);
		help.add(helptopics);

		JMenuItem aboutus=new JMenuItem("About Us");
		aboutus.addActionListener(this);
		help.add(aboutus);
	     JMenu exit=new JMenu("Exit");
		JMenuItem quit=new JMenuItem("Quit");
		quit.addActionListener(this);
		exit.add(quit);
	     mbar.add(masters);
	     mbar.add(transactions);
	     mbar.add(view);
	     mbar.add(help);
	     mbar.add(exit);
		add(jp);
	     setJMenuBar(mbar);
		setSize(1200,600);
		setVisible(true);	  
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("lms");
            String s1=(String)ae.getActionCommand();
		if(s1.equals("Membership"))
			new Membership();
		else if(s1.equals("Remove ID"))
			new RemoveID();
		else if(s1.equals("Stock Maintenence"))
			new Stock();
		else if(s1.equals("Issue of Books"))
			new Issue();
		else if(s1.equals("Return of Books"))
			new Return();
		else if(s1.equals("Member Detail"))
			new MemberDetail();
		else if(s1.equals("Display All Members"))
			new DisplayAllMembers();
		else if(s1.equals("Display Books Detail"))
			new DisplayBooksDetail();

		else if(s1.equals("About Us"))
			new AboutUs();
		else if(s1.equals("Quit"))
			dispose();


	}*/

public static void main(String args[])
	{
		Splash s1=new Splash();
		Login l1=new Login();
	}
}