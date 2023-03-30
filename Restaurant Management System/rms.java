import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.sql.*;
import java.util.Random;
import java.math.BigInteger;
import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat; 
import javax.swing.text.Document;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

class AdminEmployee
{
	
	JFrame f;
	JLabel block1,block2;
	static JLabel SANDEEP;
	JButton ADMIN,EMPLOYEE;
	ImageIcon img;
	static JLabel log;
	
	AdminEmployee()
	{
		f=new JFrame("Restaurant Management System");
		f.setBounds(300,10,900,750);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
		f.setResizable(false);
		
		ImageIcon img=new ImageIcon("r1.jpg");
		block1=new JLabel(img);
		block1.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		f.add(block1);
		block1.setVisible(true);
		
				
		SANDEEP=new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		SANDEEP.setFont(new Font("Cooper Black",Font.BOLD,30));
		SANDEEP.setBounds(100,20,900,50);
		SANDEEP.setForeground(Color.black);
		block1.add(SANDEEP);
		
		
		
		JButton p1=new JButton();
		p1.setLayout(null);
		p1.setBounds(200,150,230,350);
		//p1.setBackground(Color.green);
		p1.setBackground(new Color(255, 255, 250,255));
		block1.add(p1);
		
		
		ImageIcon logimg=new ImageIcon("admin.png");
		log=new JLabel(logimg);
		log.setBounds(15,0,200,240);
		log.setVisible(true);
		p1.add(log);
		
		ADMIN=new JButton("ADMIN");
		ADMIN.setBounds(30,300,160,30);
		ADMIN.setFont(new Font("Georgia",Font.BOLD,20));
		ADMIN.setBackground(Color.cyan);
		p1.add(ADMIN);
	

	
		JButton p2=new JButton();
		p2.setLayout(null);
		p2.setBounds(450,150,230,350);
		//p2.setBackground(Color.cyan);
		p2.setBackground(new Color(255, 255, 250,255));
		block1.add(p2);
			
		ImageIcon signimg=new ImageIcon("employee.png");
		JLabel sig=new JLabel(signimg);
		sig.setBounds(15,0,200,240);
		sig.setVisible(true);
		p2.add(sig);	
		
		EMPLOYEE=new JButton("EMPLOYEE");
		EMPLOYEE.setBounds(30,300,160,30);
		EMPLOYEE.setFont(new Font("Georgia",Font.BOLD,20));
		EMPLOYEE.setBackground(Color.red);
		p2.add(EMPLOYEE);
		
		new slide().start();
				
		
		f.setVisible(true);
		
		ADMIN.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{ 	
				slide.i=300;
				slide.j=-30;				
				new AdminLogin();
				f.setVisible(false);
		
			} 
       });
		
		p2.addActionListener(new ActionListener()
		{ 
			public void actionPerformed(ActionEvent ae)
			{
				slide.i=300;
				slide.j=-30;
				new EmployeeLogin();
				f.setVisible(false);
			}
		});
		
		p1.addActionListener(new ActionListener()
		{ 
			public void actionPerformed(ActionEvent ae)
			{
				slide.i=300;
				slide.j=-30;
				new AdminLogin();
				f.setVisible(false);
			}
		});
		EMPLOYEE.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{ 	
				slide.i=300;
				slide.j=-30;
				new EmployeeLogin();
				f.setVisible(false);		
			} 
       });
		
		//new imgslide().start(); 
		
	}	
	
}

class AdminLogin
{
	JFrame f;
	JLabel block1,block2,ID,PASSWORD,LOGIN,show;
	JButton ADMIN,EMPLOYEE,login,retry,back,Forget,cancel;
	ImageIcon img;
	JTextField id;
	static JLabel pro;
	JPasswordField password;
	
	AdminLogin()
	{
		
		ImageIcon img1=new ImageIcon("r1.jpg");

		f=new JFrame("sandeep");
		f.setBounds(300,10,900,750);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		f.setResizable(false);
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
		Container c=f.getContentPane();
		c.setBackground(Color.white);
				
								
		block1=new JLabel(img1);
		block1.setBounds(0,0,img1.getIconWidth(),img1.getIconHeight());
		f.add(block1);
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(200,60,500,600);
		//p1.setBackground(Color.cyan);
		p1.setBackground(new Color(250, 255, 255,230));
		block1.add(p1);
		
		ImageIcon logimg=new ImageIcon("admin.png");
		JLabel log=new JLabel(logimg);
		log.setBounds(150,0,200,240);
		log.setVisible(true);
		p1.add(log);
		
		LOGIN=new JLabel("LOGIN");
		LOGIN.setFont(new Font("Elephant",Font.BOLD,25));
		LOGIN.setBounds(380,20,250,30);
		LOGIN.setForeground(Color.black);
		block1.add(LOGIN);
					
		ID = new JLabel("Enter your ID");
		ID.setBounds(20,290,250,30);
		ID.setFont(new Font("Georgia",Font.BOLD,20));
		p1.add(ID);
		
		id=new JTextField();
		id.setBounds(310,290,150,25);
		id.setFont(new Font("Arial",Font.BOLD,15));
		id.setForeground(Color.green);
	    p1.add(id);
		
		PASSWORD = new JLabel("Enter your Password");
		PASSWORD.setBounds(20,340,250,30);
		PASSWORD.setFont(new Font("Georgia",Font.BOLD,20));
		p1.add(PASSWORD);
		
		password=new JPasswordField();
		password.setBounds(310,340,150,25);
		password.setFont(new Font("Arial",Font.BOLD,25));
		password.setForeground(Color.black);
		password.setEchoChar('*');
		p1.add(password);
						
		login=new JButton("LOGIN");
		login.setBounds(20,410,130,30);
		login.setFont(new Font("Georgia",Font.BOLD,20));
		login.setBackground(Color.red);
		p1.add(login);
				
		retry=new JButton("RETRY");
		retry.setBounds(350,400,130,30);
		retry.setFont(new Font("Georgia",Font.BOLD,20));
		retry.setBackground(Color.cyan);
		retry.setEnabled(false);
		p1.add(retry);
		
		cancel =new JButton("CANCEL");
		cancel.setBounds(350,480,130,30);
		cancel.setFont(new Font("Georgia",Font.BOLD,20));
		cancel.setBackground(Color.white);
		p1.add(cancel);
		
		back=new JButton("Back");
		back.setBounds(20,480,130,30);
		back.setFont(new Font("Georgia",Font.BOLD,20));
		back.setBackground(Color.white);
		p1.add(back);
		
		show =new JLabel("Sandeep sharma");
		show.setBounds(20,530,400,30);
		show.setFont(new Font("Georgia",Font.BOLD,25));
		show.setForeground(Color.red);
		p1.add(show);
		
		login.addActionListener(new ActionListener()
		{
			int condition =1;
			public void actionPerformed(ActionEvent ae)
			{
				
				if(id.getText().equals("")||password.getText().equals(""))
				{
					
				JOptionPane.showMessageDialog(f,"Please fill all the Text field","Alert",2);
					
				}else 
				{
			
					try
					{
						
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("select *from adminlogin");
						while(rs.next())
						{
							if(id.getText().equals(rs.getString(1))&&password.getText().equals(rs.getString(2)))
							{
								condition=0;
							}
						}
										
						if(condition==0)
						{
							new Admin();
							f.setVisible(false);
						}else
						{
							
							JOptionPane.showMessageDialog(f,"Invalid owner detail","Unauthorized",0);
							login.setEnabled(false);
							id.setEnabled(false);
							password.setEnabled(false);
							retry.setEnabled(true);
						}
					}catch(Exception e){System.out.println(e);}
					
				}
				
			}
		});
		
		retry.setEnabled(true);
		retry.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				id.setEnabled(true);
				password.setEnabled(true);
				id.setText("");
				password.setText("");
				login.setEnabled(true);
			}
		});
		
		cancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});
				
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{ 
			
				//new slide().start();
				new AdminEmployee();
				f.setVisible(false);
		
		
			} 
       });
		
		f.setVisible(true);
	}
}

class Admin
{
	static JFrame f;
	JLabel block1,block2,ID,PASSWORD,LOGIN,show;
	JButton ADMIN,EMPLOYEE,login,retry,back,Forget,cancel;
	ImageIcon img;
	JTextField name,password;
	JMenuBar menubar;
	JMenu Inventory,Edit;
	static JTable table;
	static JScrollPane pane;
	static DefaultTableModel model,model1,model2;
	Admin()
	{
		
		ImageIcon img1=new ImageIcon("sign.jpg");
		f=new JFrame("sandeep");
		f.setLayout(null);
		f.setBounds(-10,0,1920,1080);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setResizable(false);
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
		Container c=f.getContentPane();
		c.setBackground(Color.white);
		
		block1=new JLabel(img1);
		block1.setBounds(0,0,img1.getIconWidth(),img1.getIconHeight());
		f.add(block1);
		
		menubar=new JMenuBar();
		menubar.setBackground(new Color(05,45,67));
			
		Inventory=new JMenu("Inventory");
		Inventory.setForeground(Color.white);
		Inventory.setFont(new Font("Arial",Font.BOLD,15));
		menubar.add(Inventory);
		f.add(menubar);
		
		JMenuItem sales_record=new JMenuItem("Sales Record");
		sales_record.setBackground(new Color(05,45,67));
		sales_record.setFont(new Font("Arial",Font.BOLD,15));
		sales_record.setForeground(Color.white);
		Inventory.add(sales_record);
		
		table=new JTable();
		table.setBackground(new Color(05,45,67));
        table.setForeground(Color.white);
        table.setRowHeight(20);
		table.setEnabled(true);
		block1.add(table);
		//table.setVisible(false);			
		
		ImageIcon printimg=new ImageIcon("print.png");
		JButton print1=new JButton(printimg);
		print1.setBounds(1000,1,50,30);
		print1.setFont(new Font("Georgia",Font.BOLD,25));
		block1.add(print1);
		print1.setBackground(Color.white);
		print1.setOpaque(false);
		print1.setEnabled(false);
		
		pane = new JScrollPane(table);
        pane.setBounds(760, 30, 600, 670);
		block1.add(pane);
		pane.setVisible(false);
		model = new DefaultTableModel(new String[]{"Food Name", "Category", "Quantity","Price","Total","Sold by","ID","Date","Day"}, 0);
		
				
		
		sales_record.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				model.setRowCount(0);
				try
				{
					print1.setEnabled(true);
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("Select*from sales_record");
					while(rs.next())
					{
						model.addRow(new Object[]{rs.getString(2),rs.getString(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(8),rs.getString(9),rs.getString(7),rs.getString(6)});
					}
					
				}catch(Exception e){System.out.println(e);}
				table.setModel(model);
				pane.setVisible(true);
				table.setEnabled(false);
			}
		});
		
		JMenuItem employee_record=new JMenuItem("Employee Record");
		employee_record.setBackground(new Color(05,45,67));
		employee_record.setFont(new Font("Arial",Font.BOLD,15));
		employee_record.setForeground(Color.white);
		Inventory.add(employee_record);
		
		model1=new DefaultTableModel(new String[]{"ID","Name","Father Name","Gender","DOB","Aadhar","Phone"},0);
		
		employee_record.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					print1.setEnabled(true);
					model1.setRowCount(0);
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("Select*from employeelogin");
					while(rs.next())
					{
						model1.addRow(new Object[]{rs.getString(8),rs.getString(2),rs.getString(3),rs.getString(6),rs.getString(7),rs.getString(4),rs.getString(5)});

					}				
			
				}catch(Exception e){System.out.println(e);}
				
				table.setModel(model1);
				pane.setVisible(true);
				table.setEnabled(false);
			}
		});
		
		JMenuItem product_record=new JMenuItem("Product Record");
		product_record.setBackground(new Color(05,45,67));
		product_record.setFont(new Font("Arial",Font.BOLD,15));
		product_record.setForeground(Color.white);
		Inventory.add(product_record);
		
		model2=new DefaultTableModel(new String[]{"ID","Name","Price","Category"},0);
		
		
		product_record.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					print1.setEnabled(true);
					model2.setRowCount(0);
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("Select*from product");
					while(rs.next())
					{
					
						model2.addRow(new Object[]{rs.getString(5),rs.getString(2),rs.getString(3),rs.getString(4)});

					}					
			
				}catch(Exception e){System.out.println(e);}
				table.setModel(model2);
				pane.setVisible(true);
				table.setEnabled(false);
			}
		});
		
		JMenuItem cpassword =new JMenuItem("Chnage your password");
		cpassword.setBackground(new Color(05,45,67));
		cpassword.setFont(new Font("Arial",Font.BOLD,15));
		cpassword.setForeground(Color.white);
		
		JMenuItem editEmployee=new JMenuItem("Edit Employee Details");
		editEmployee.setBackground(new Color(05,45,67));
		editEmployee.setFont(new Font("Arial",Font.BOLD,15));
		editEmployee.setForeground(Color.white);
		
		JMenuItem editItem =new JMenuItem("Edit Item Details");
		editItem.setBackground(new Color(05,45,67));
		editItem.setFont(new Font("Arial",Font.BOLD,15));
		editItem.setForeground(Color.white);
		
		editItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				
				new editProduct();
				Admin.f.setEnabled(false);
			}
		});
				
		Edit=new JMenu("Edit");		
		Edit.setForeground(Color.white);
		Edit.setFont(new Font("Arial",Font.BOLD,15));
		menubar.add(Edit);
		
		Edit.add(cpassword);
		Edit.add(editEmployee);
		Edit.add(editItem);
		//Edit.add(removeItem);
		
		JLabel date=new JLabel("Date");
		date.setBounds(1230,1,250,30);
		date.setFont(new Font("Georgia",Font.BOLD,23));
		date.setForeground(Color.black);
		block1.add(date);
		
		Date date1 = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
        String strDate = dateFormat.format(date1);
		date.setText(strDate);
		
		JLabel day=new JLabel("Day");
		day.setBounds(1090,1,250,30);
		day.setFont(new Font("Georgia",Font.BOLD,23));
		day.setForeground(Color.black);
		block1.add(day);
		
		Calendar calendar = Calendar.getInstance();
		Date day1 = calendar.getTime();
		day.setText(new SimpleDateFormat("EEEEE", Locale.ENGLISH).format(day1.getTime()));
		
		JButton add_product=new JButton("Add product");
		add_product.setBounds(150,200,250,100);
		add_product.setFont(new Font("Arial",Font.BOLD,20));
		add_product.setBackground(new Color(30,40,50));
		add_product.setForeground(Color.white);		
		block1.add(add_product);
		
		JButton add_employee=new JButton("Add Employee");
		add_employee.setBounds(500,200,250,100);
		add_employee.setFont(new Font("Arial",Font.BOLD,20));
		add_employee.setBackground(new Color(30,40,50));
		add_employee.setForeground(Color.white);		
		block1.add(add_employee);
		
		JButton remove_product=new JButton("Remove product");
		remove_product.setBounds(150,400,250,100);
		remove_product.setFont(new Font("Arial",Font.BOLD,20));
		remove_product.setBackground(new Color(30,40,50));
		remove_product.setForeground(Color.white);		
		block1.add(remove_product);
		
		JButton remove_employee=new JButton("Remove Employee");
		remove_employee.setBounds(500,400,250,100);
		remove_employee.setFont(new Font("Arial",Font.BOLD,20));
		remove_employee.setBackground(new Color(30,40,50));
		remove_employee.setForeground(Color.white);		
		block1.add(remove_employee);
	
		JButton back=new JButton("Back");
		back.setBounds(30,670,130,30);
		back.setBackground(Color.white);
		back.setFont(new Font("Georgia",Font.BOLD,25));
		block1.add(back);
		
		
		
		print1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try 
				{
					boolean print = table.print();
					if (!print)
					{
						JOptionPane.showMessageDialog(null, "Unable To Print !!..");
					}
				} catch (Exception ex) 
					{
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
			}
		});
		
			f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					new AdminEmployee();
				}
			});
		
		cpassword.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new cpassword();
				Admin.f.setEnabled(false);
			}
		});
		editEmployee.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new editEmployee();
				Admin.f.setEnabled(false);
			}
		});
	
		add_employee.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new AddEmployee();
				f.setEnabled(false);
			}
		});
		
		add_product.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new AddProduct();
				f.setEnabled(false);
			}
		});

		remove_employee.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new RemoveEmployee();
				f.setEnabled(false);
			}
		});
	
		remove_product.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new RemoveProduct();
				f.setEnabled(false);
			}
		});		
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new AdminEmployee();
				f.setVisible(false);
			}
		});
		f.setJMenuBar(menubar);
		f.setVisible(true);
		
	}
	
	class cpassword
	{
		JFrame f;
		JLabel block1;
		int i=0;
		int a,b,c,d,e,rol,aad,pho;
		cpassword()
		{
			f=new JFrame("Change your Password");
			f.setBounds(750,70,600,500);
			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			ImageIcon fimg=new ImageIcon("icon1.png");
			f.setIconImage(fimg.getImage());
			f.setLayout(null);
			f.setResizable(false);
		
			block1=new JLabel("");
			block1.setBounds(0,0,600,750);
			block1.setBackground(new Color(05,45,67));
			block1.setOpaque(true);
			f.add(block1);
			
			ImageIcon logimg=new ImageIcon("admin1.png");
			JLabel img1=new JLabel(logimg);
			img1.setBounds(230,40,150,100);
			block1.add(img1);
		
			JLabel rms=new JLabel("RESTAURANT MANAGEMENT SYSTEM");
			rms.setBounds(25,10,600,30);
			rms.setFont(new Font("Cooper Black",Font.BOLD,25));
			rms.setForeground(Color.white);
			block1.add(rms);
			
			JLabel PASSWORD=new JLabel("Password");
			PASSWORD.setBounds(50,165,200,40);
			PASSWORD.setFont(new Font("Elephant",Font.BOLD,23));
			PASSWORD.setForeground(Color.white);
			block1.add(PASSWORD);
		
			JTextField password=new JTextField();
			password.setBounds(320,165,200,25);
			password.setFont(new Font("Georgia",Font.BOLD,20));
			block1.add(password);
		
			JLabel CPASSWORD=new JLabel("Confirm Password");
			CPASSWORD.setBounds(50,210,250,40);
			CPASSWORD.setFont(new Font("Elephant",Font.BOLD,23));
			CPASSWORD.setForeground(Color.white);
			block1.add(CPASSWORD);
		
		
			JPasswordField cpassword=new JPasswordField();
			cpassword.setBounds(320,210,200,25);
			cpassword.setFont(new Font("Georgia",Font.BOLD,20));
			block1.add(cpassword);
			cpassword.setEchoChar('*');
		
			JButton set=new JButton("Set");
			set.setBounds(380,280,130,35);
			set.setFont(new Font("Georgia",Font.BOLD,20));	
			set.setBackground(Color.white);
			block1.add(set);
		
			JButton back=new JButton("Back");
			back.setBounds(60,280,130,35);
			back.setFont(new Font("Georgia",Font.BOLD,20));	
			back.setBackground(Color.white);
			block1.add(back);
			
			set.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					if(password.getText().equals(""))
					{
						JOptionPane.showMessageDialog(f,"Please set your password","Warining",2);
					}else if(cpassword.getText().equals(""))
					{
						JOptionPane.showMessageDialog(f,"Please confirm your password","Warining",2);
					}else if(password.getText().equals(cpassword.getText()))
					{
						int t=0;
						    t=validate(password.getText());
						if(t==1)
						{
							try
							{
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
							Statement st=con.createStatement();
							st.executeUpdate("update adminlogin set password='"+password.getText()+"' where id=123");
							JOptionPane.showMessageDialog(f,"Password changed","Sucessful",1);
							Admin.f.setEnabled(true);
							f.setVisible(false);
							}catch(Exception e){System.out.println(e);}
						}else
						{
							JOptionPane.showMessageDialog(f,"Password contain atleaset\nOne Capital Letter\nOne small Letter\nOne Digit\nOne special Symbol","Warining",2);
						}
					
					}else
					{
						JOptionPane.showMessageDialog(f,"Password does not match","Mismatch",0);
					}
				}
			});
			
			f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					Admin.f.setEnabled(true);
				}
			});
			
			back.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					Admin.f.setEnabled(true);
					f.setVisible(false);
					
				}
			});
			f.setVisible(true);
		}
		int validate(String s)	
		{	
			int start=0;
			int end=s.length();
			char ch[]=new char [end-start];
			s.getChars(start,end,ch,0);
		 
			a=b=c=d=e=0;
			for(int i=0;i<end;i++)
			{
				if(ch[i]>=65&&ch[i]<=90)
				{
					//capital letter
					a=1;
				}
				if(ch[i]>=97&&ch[i]<=122)
				{
					//Small letter    
					b=1;
				}
				if(ch[i]>=48&&ch[i]<=57)
				{
					//digit
					c=1;
				}
				if(ch[i]==32)
				{
					//Space
					d=1;
				}
				if(ch[i]>32&&ch[i]<=38||ch[i]==64)
				{ 
            
					//Special Symbol
					e=1;
				}
         	 
			}
			if(a==1)
			{
				if(b==1)
				{
					if(e==1)
					{
						if(c==1)
						{
							return 1;
						}
					}
				}
			}
	
			return 0;
		}
	}
	
	class editEmployee
	{
		int i=0;
		int a,b,c,d,e,rol,aad,pho;
		int eid=0;
		JFrame f;
		editEmployee()
		{
			f=new JFrame("Edit Employee Details");
			f.setBounds(680,10,700,750);
			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			//f.setLocation(600,80);
			ImageIcon fimg=new ImageIcon("icon1.png");
			f.setIconImage(fimg.getImage());
			f.setLayout(null);
			f.setResizable(false);
		
			ImageIcon img=new ImageIcon("r1.jpg");
			JLabel block1=new JLabel(img);
			block1.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
			f.add(block1);
						
			JTextField FIND=new JTextField("Find by ID");
			FIND.setBounds(210,45,200,25);
			FIND.setForeground(Color.gray);
			block1.add(FIND);
		
			FIND.addFocusListener(new FocusListener()
			{
				public void focusGained(FocusEvent fe)
				{
					if(FIND.getText().equals("Find by ID"))
					{
						FIND.setText("");
					}
				}
				public void focusLost(FocusEvent fe)
				{
					if(FIND.getText().equals(""))
					{
						FIND.setText("Find by ID");
					}
				}
			});
		
		
			JLabel ID1=new JLabel("ID");
			ID1.setBounds(187,46,25,22);
			ID1.setBackground(Color.white);
			ID1.setForeground(Color.gray);
			ID1.setFont(new Font("Georgia",Font.BOLD,15));
			ID1.setOpaque(true);
			block1.add(ID1);
		
			JLabel show=new JLabel("Search Record");
			show.setBounds(436,46,300,22);
			show.setBackground(Color.white);
			show.setForeground(Color.red);
			show.setFont(new Font("Georgia",Font.BOLD,15));
			show.setOpaque(false);
			block1.add(show);
			show.setVisible(false);
		
			ImageIcon img1=new ImageIcon("search1.png");
			JButton find=new JButton(img1);
			find.setBounds(410,45,25,24);
			find.setBackground(Color.white);
			block1.add(find);
		
			JButton find1=new JButton(img1);
			find1.setBounds(210,60,25,24);
			find1.setBackground(Color.white);
				
			JPanel p=new JPanel();
			p.setLayout(null);
			p.setBounds(100,80,450,610);
			p.setBackground(Color.cyan);
			block1.add(p);
		
			ImageIcon empimg=new ImageIcon("edit.png");
			JLabel adde=new JLabel(empimg);
			adde.setBounds(130,-50,200,240);
			p.add(adde);
		
			JLabel empl=new JLabel("Edit Employee Details");
			empl.setFont(new Font("Elephant",Font.BOLD,25));
			empl.setBounds(165,10,350,30);
			empl.setForeground(Color.black);
			block1.add(empl);		
		
			JLabel NAME=new JLabel("Name*");
			NAME.setFont(new Font("Georgia",Font.BOLD,20));
			NAME.setForeground(Color.black);
			NAME.setBounds(20,160,100,20);
			p.add(NAME);
        
			JTextField name=new JTextField();
			name.setBounds(270,160,150,25);
			name.setOpaque(true);
			name.setToolTipText("Enter your name");
			p.add(name);
			name.setEnabled(false);
		
			JLabel FNAME=new JLabel("Father Name*");
			FNAME.setFont(new Font("Georgia",Font.BOLD,20));
			FNAME.setBounds(20,210,170,20);
			p.add(FNAME);
		
			JTextField fname=new JTextField();
			fname.setBounds(270,210,150,25);
			fname.setToolTipText("Enter Employee Father Name");
			p.add(fname);
			fname.setEnabled(false);

			JLabel AADHAR=new JLabel("Aadhar No*");
			AADHAR.setFont(new Font("Georgia",Font.BOLD,20));
			AADHAR.setBounds(20,265,150,20);
			p.add(AADHAR);
		
			JTextField aadhar=new JTextField();
			aadhar.setBounds(270,265,150,25);
			aadhar.setToolTipText("Enter Employee 12 Digit aadhar no");
			p.add(aadhar);
			aadhar.setEnabled(false);
		
		
			JLabel PHONE_NO=new JLabel("Phone No*");
			PHONE_NO.setFont(new Font("Georgia",Font.BOLD,20));
			PHONE_NO.setBounds(20,320,150,20);
			p.add(PHONE_NO);
		
			JTextField phone_no=new JTextField();
			phone_no.setBounds(270,320,150,25);
			phone_no.setToolTipText("Enter Employee 10 Digit Phone no");
			p.add(phone_no);
			phone_no.setEnabled(false);

			JLabel GENDER=new JLabel("Gender*");
			GENDER.setFont(new Font("Georgia",Font.BOLD,20));
			GENDER.setBounds(20,375,150,20);
			p.add(GENDER);
 		
			JComboBox Gender =new JComboBox();
			Gender.setBounds(270,375,150,30);
			Gender.setFont(new Font("Georgia",Font.BOLD,15));
			Gender.addItem("Select");
			Gender.addItem("Male");
			Gender.addItem("Female");
			Gender.setBackground(Color.white);
			Gender.setOpaque(true);
			p.add(Gender);
			Gender.setEnabled(false);
			Gender.setVisible(true);
	
			JLabel DOB=new JLabel("Date of Birth*");
			DOB.setFont(new Font("Georgia",Font.BOLD,20));
			DOB.setBounds(20,435,150,20);
			p.add(DOB);
		
			JLabel ID=new JLabel("Employee ID");
			ID.setFont(new Font("Georgia",Font.BOLD,20));
			ID.setBounds(20,475,150,20);
			p.add(ID);
		
			JLabel id=new JLabel("ID");
			id.setFont(new Font("Georgia",Font.BOLD,30));
			id.setForeground(Color.red);
			id.setBounds(270,470,150,35);
			p.add(id);
		
			JTextField dob=new JTextField();
			dob.setBounds(270,435,150,25);
			dob.setToolTipText("Enter Employee Date of Birth");
			p.add(dob);
			dob.setEnabled(false);
						
			JButton SUBMIT=new JButton("Submit");
			SUBMIT.setBounds(290,520,130,30);
			SUBMIT.setFont(new Font("Georgia",Font.BOLD,20));
			SUBMIT.setBackground(Color.white);
			p.add(SUBMIT);
			SUBMIT.setEnabled(false);
					
			JButton BACK=new JButton("BACK");
			BACK.setBounds(20,520,130,30);
			BACK.setFont(new Font("Georgia",Font.BOLD,20));
			BACK.setBackground(Color.white);
			p.add(BACK);
		
			p.setVisible(true);
		
			find.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{

					if(FIND.getText().equals("Find by ID"))
					{}else
					{
						try
						{
							i=0;
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
							Statement st=con.createStatement();
							ResultSet rs=st.executeQuery("select*from employeelogin where ID='"+FIND.getText()+"'");
							while(rs.next())
							{
								i=1;
							
								name.setEnabled(true);
								name.setText(rs.getString(2));
								fname.setEnabled(true);
								fname.setText(rs.getString(3));
								aadhar.setEnabled(true);
								aadhar.setText(rs.getString(4));
								phone_no.setEnabled(true);
								phone_no.setText(rs.getString(5));
								Gender.setEnabled(true);
								dob.setEnabled(true);
								dob.setText(rs.getString(7));
								SUBMIT.setEnabled(true);
								id.setText(rs.getString(8));
								break;
							}
						
						
						}catch(Exception e){System.out.println(e);}
							if(i==1)
							{
								show.setForeground(Color.green);
								show.setText("Record Found");
								show.setVisible(true);
							}else
							{
								SUBMIT.setEnabled(false);
								dob.setEnabled(false);
								dob.setText("");
								phone_no.setEnabled(false);
								phone_no.setText("");
								aadhar.setEnabled(false);
								aadhar.setText("");
								fname.setEnabled(false);
								fname.setText("");
								name.setEnabled(false);
								name.setText("");
								Gender.setEnabled(false);
								show.setForeground(Color.red);
								show.setText("No Record Found!");
								show.setVisible(true);
							}
					}
				}
			});
        		f.setVisible(true);
			
			f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					Admin.f.setEnabled(true);
				}
			});
			BACK.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{ 	
					Admin.f.setEnabled(true);
					f.setVisible(false);				
				
				
				} 
			});
		
				SUBMIT.addActionListener(new ActionListener()
				{
		
				public void actionPerformed(ActionEvent ae)
				{
					int aa,ph;
					aa=ph=0;
					if(name.getText().equals(""))
					{
						JOptionPane.showMessageDialog(f,"Please fill Employee Name","Alert",2);
					}else if(fname.getText().equals(""))
					{
						JOptionPane.showMessageDialog(f,"Please fill Employee Father name","Alert",2);
					}else if(aadhar.getText().equals(""))
					{
						JOptionPane.showMessageDialog(f,"Please fill Employee Aadhar no","Alert",2);
					}else if(phone_no.getText().equals(""))
					{
						JOptionPane.showMessageDialog(f,"Please fill Employee Phone no","Alert",2);
					}else if(Gender.getSelectedItem().equals("Select"))
					{
						JOptionPane.showMessageDialog(f,"Please Select Gender","Alert",2);
					}else if(dob.getText().equals(""))
					{
						JOptionPane.showMessageDialog(f,"Please enter Employee D.O.B.","Alert",2);
					}else
					{
						aad=validate(aadhar.getText());
						pho=validate(phone_no.getText());
						if(aad==1)
						{
							if(pho==1)
							{
								if(aadhar.getText().length()==12)
								{
									if(phone_no.getText().length()==10)
									{		
										if(Gender.getSelectedItem().equals("Select"))
										{JOptionPane.showMessageDialog(f,"Please select gender","Warining",2);}
										else
										{
											try
											{
												Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
												Statement st=con.createStatement();
												st.executeUpdate("update employeelogin set name='"+name.getText()+"',fathername='"+fname.getText()+"',aadhar='"+aadhar.getText()+"',phone='"+phone_no.getText()+"',Gender='"+Gender.getSelectedItem()+"',dob='"+dob.getText()+"' where ID='"+id.getText()+"'");
												JOptionPane.showMessageDialog(f,"Record Updated successfully","Sucessful",1);
												//Admin.f.setEnabled(true);
												name.setEnabled(false);
												name.setText("");
												fname.setEnabled(false);
												fname.setText("");
												aadhar.setEnabled(false);
												aadhar.setText("");
												phone_no.setEnabled(false);
												phone_no.setText("");
												Gender.setEnabled(false);
												dob.setEnabled(false);
												dob.setText("");
												SUBMIT.setEnabled(false);
												id.setText("ID");
												show.setText("");
												
											}catch(Exception e){System.out.println(e);}
										}
									
									}else
									{
										JOptionPane.showMessageDialog(f,"Please insert only 10 digit Phone no","Warining",2);
									}
								}else
								{
									JOptionPane.showMessageDialog(f,"Only 12 Digit Aadhar no is allowed","Warining",2);
								}
						
							}else
							{
								JOptionPane.showMessageDialog(f,"Phone no can not contain any special character or letter","Warning",2);
							}
						}else
						{
							JOptionPane.showMessageDialog(f,"Aadhar no can not contain any special character or letter","warining",2);
						}
			
					}
				}
			});
			
		
		}
		int validate(String s)	
		{	
			int start=0;
			int end=s.length();
			char ch[]=new char [end-start];
			s.getChars(start,end,ch,0);
		 
			a=b=c=d=e=0;
			for(int i=0;i<end;i++)
			{
				if(ch[i]>=65&&ch[i]<=90)
				{
					//capital letter
					a=1;
				}
				if(ch[i]>=97&&ch[i]<=122)
				{
					//Small letter    
					b=1;
				}
				if(ch[i]>=48&&ch[i]<=57)
				{
					//digit
					c=1;
				}
				if(ch[i]==32)
				{
					//Space
					d=1;
				}
				if(ch[i]>32&&ch[i]<=38||ch[i]==64)
				{ 
            
					//Special Symbol
					e=1;
				}
         	 
			}
			if(a==0)
			{
				if(b==0)
				{
					if(d==0)
					{
						if(e==0)
						{
						
							return 1;
							//System.out.println("Hello");
						}
					}
				}
			}
	
			return 0;
		}
			
	}


	class editProduct
	{
		int i=0;
		int a,b,c,d,e,rol,aad,pho;
		int eid=0;
		JFrame f;
		editProduct()
		{
			f=new JFrame("Edit Employee Details");
			f.setBounds(680,10,700,750);
			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			//f.setLocation(600,80);
			ImageIcon fimg=new ImageIcon("icon1.png");
			f.setIconImage(fimg.getImage());
			f.setLayout(null);
			f.setResizable(false);
		
			ImageIcon img=new ImageIcon("r1.jpg");
			JLabel block1=new JLabel(img);
			block1.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
			f.add(block1);
						
			JTextField FIND=new JTextField("Find by ID");
			FIND.setBounds(210,55,200,25);
			FIND.setForeground(Color.gray);
			block1.add(FIND);
		
			FIND.addFocusListener(new FocusListener()
			{
				public void focusGained(FocusEvent fe)
				{
					if(FIND.getText().equals("Find by ID"))
					{
						FIND.setText("");
					}
				}
				public void focusLost(FocusEvent fe)
				{
					if(FIND.getText().equals(""))
					{
						FIND.setText("Find by ID");
					}
				}
			});
		
		
			JLabel ID1=new JLabel("ID");
			ID1.setBounds(187,56,25,22);
			ID1.setBackground(Color.white);
			ID1.setForeground(Color.gray);
			ID1.setFont(new Font("Georgia",Font.BOLD,15));
			ID1.setOpaque(true);
			block1.add(ID1);
		
			JLabel show=new JLabel("Search Record");
			show.setBounds(436,56,300,22);
			show.setBackground(Color.white);
			show.setForeground(Color.red);
			show.setFont(new Font("Georgia",Font.BOLD,15));
			show.setOpaque(false);
			block1.add(show);
			show.setVisible(false);
		
			ImageIcon img1=new ImageIcon("search1.png");
			JButton find=new JButton(img1);
			find.setBounds(410,55,25,24);
			find.setBackground(Color.white);
			block1.add(find);
		
			JButton find1=new JButton(img1);
			find1.setBounds(260,60,25,24);
			find1.setBackground(Color.white);
				
			JPanel p=new JPanel();
			p.setLayout(null);
			p.setBounds(100,100,450,500);
			p.setBackground(Color.cyan);
			block1.add(p);
		
			ImageIcon empimg=new ImageIcon("edit.png");
			JLabel adde=new JLabel(empimg);
			adde.setBounds(130,-50,200,240);
			p.add(adde);
		
			JLabel empl=new JLabel("Edit Product Details");
			empl.setFont(new Font("Elephant",Font.BOLD,25));
			empl.setBounds(165,10,350,30);
			empl.setForeground(Color.black);
			block1.add(empl);		
		
			JLabel PNAME=new JLabel("Product Name");
			PNAME.setFont(new Font("Georgia",Font.BOLD,20));
			PNAME.setForeground(Color.black);
			PNAME.setBounds(20,160,200,20);
			p.add(PNAME);
        
			JTextField pname=new JTextField();
			pname.setBounds(270,160,150,25);
			pname.setOpaque(true);
			pname.setToolTipText("Enter Product name");
			p.add(pname);
			pname.setEnabled(false);
		
			JLabel PRICE=new JLabel("Price");
			PRICE.setFont(new Font("Georgia",Font.BOLD,20));
			PRICE.setBounds(20,210,170,20);
			p.add(PRICE);
		
			JTextField price=new JTextField();
			price.setBounds(270,210,150,25);
			price.setToolTipText("Enter Product Price");
			p.add(price);
			price.setEnabled(false);

			
			JLabel CATEGORY=new JLabel("Category");
			CATEGORY.setFont(new Font("Georgia",Font.BOLD,20));
			CATEGORY.setBounds(20,265,150,25);
			p.add(CATEGORY);
 		
			JComboBox category =new JComboBox();
			category.setBounds(270,265,150,30);
			category.setFont(new Font("Georgia",Font.BOLD,15));
			category.addItem("Select");
			category.addItem("Vegetarian");
			category.addItem("Non Vegetarian");
			category.setBackground(Color.white);
			category.setOpaque(true);
			p.add(category);
			category.setEnabled(false);
			category.setVisible(true);
						
			JLabel ID=new JLabel("Product ID");
			ID.setFont(new Font("Georgia",Font.BOLD,20));
			ID.setBounds(20,325,150,20);
			p.add(ID);
		
			JLabel id=new JLabel("ID");
			id.setFont(new Font("Georgia",Font.BOLD,30));
			id.setForeground(Color.red);
			id.setBounds(270,325,150,35);
			p.add(id);
											
			JButton SUBMIT=new JButton("Submit");
			SUBMIT.setBounds(290,385,130,30);
			SUBMIT.setFont(new Font("Georgia",Font.BOLD,20));
			SUBMIT.setBackground(Color.white);
			p.add(SUBMIT);
			SUBMIT.setEnabled(false);
					
			JButton BACK=new JButton("BACK");
			BACK.setBounds(20,385,130,30);
			BACK.setFont(new Font("Georgia",Font.BOLD,20));
			BACK.setBackground(Color.white);
			p.add(BACK);
		
			p.setVisible(true);
			
			
		
			find.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{

					if(FIND.getText().equals("Find by ID"))
					{}else
					{
						try
						{
							i=0;
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
							Statement st=con.createStatement();
							ResultSet rs=st.executeQuery("select*from product where ID='"+FIND.getText()+"'");
							while(rs.next())
							{
								i=1;
								pname.setEnabled(true);
								pname.setText(rs.getString(2));
								price.setEnabled(true);
								price.setText(rs.getString(3));
								id.setEnabled(true);
								id.setText(rs.getString(5));
								category.setEnabled(true);
								category.setSelectedItem(rs.getString(4));
								break;
							}
						
						
						}catch(Exception e){System.out.println(e);}
							if(i==1)
							{
								SUBMIT.setEnabled(true);
								category.setEnabled(true);
								show.setForeground(Color.green);
								show.setText("Record Found");
								show.setVisible(true);
							}else
							{
								SUBMIT.setEnabled(false);
								pname.setEnabled(false);
								price.setEnabled(false);
								id.setEnabled(false);
								category.setEnabled(false);
								show.setForeground(Color.red);
								show.setText("No Record Found!");
								show.setVisible(true);
							}
					}
				}
			});
        		f.setVisible(true);
			
			f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					Admin.f.setEnabled(true);
				}
			});
			BACK.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{ 	
					Admin.f.setEnabled(true);
					f.setVisible(false);				
				
				
				} 
			});
		
				SUBMIT.addActionListener(new ActionListener()
				{
		
				public void actionPerformed(ActionEvent ae)
				{
					int aa,ph;
					aa=ph=0;
					if(pname.getText().equals(""))
					{
						JOptionPane.showMessageDialog(f,"Please fill Product Name","Alert",2);
					}else if(price.getText().equals(""))
					{
						JOptionPane.showMessageDialog(f,"Please enter price","Alert",2);
					}else if(category.getSelectedItem().equals("Select"))
					{
						JOptionPane.showMessageDialog(f,"Please select category","Alert",2);
					}else
					{
						
											try
											{
												Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
												Statement st=con.createStatement();
												st.executeUpdate("update product set name='"+pname.getText()+"',price='"+price.getText()+"',category='"+category.getSelectedItem()+"' where id='"+id.getText()+"'");
												JOptionPane.showMessageDialog(f,"Record Updated successfully","Sucessful",1);
												//Admin.f.setEnabled(true);
												pname.setEnabled(false);
												pname.setText("");
												price.setEnabled(false);
												price.setText("");
												category.setEnabled(false);
												category.setSelectedItem("Select");
												SUBMIT.setEnabled(false);
												id.setText("ID");
												show.setText("");
												
											}catch(Exception e){System.out.println(e);}
						
			
					}
				}
			});
			
		
		}
		int validate(String s)	
		{	
			int start=0;
			int end=s.length();
			char ch[]=new char [end-start];
			s.getChars(start,end,ch,0);
		 
			a=b=c=d=e=0;
			for(int i=0;i<end;i++)
			{
				if(ch[i]>=65&&ch[i]<=90)
				{
					//capital letter
					a=1;
				}
				if(ch[i]>=97&&ch[i]<=122)
				{
					//Small letter    
					b=1;
				}
				if(ch[i]>=48&&ch[i]<=57)
				{
					//digit
					c=1;
				}
				if(ch[i]==32)
				{
					//Space
					d=1;
				}
				if(ch[i]>32&&ch[i]<=38||ch[i]==64)
				{ 
            
					//Special Symbol
					e=1;
				}
         	 
			}
			if(a==0)
			{
				if(b==0)
				{
					if(d==0)
					{
						if(e==0)
						{
						
							return 1;
							//System.out.println("Hello");
						}
					}
				}
			}
	
			return 0;
		}
			
	}
	
	
}

class AddEmployee
{
	JFrame f;
	JLabel empl,NAME,FNAME,AADHAR,PHONE_NO,GENDER,DOB,show,block1,captcha,adde;
	JTextField name,fname,aadhar,phone_no,ctf,dob;
	JButton SUBMIT,CANCEL,BACK,LOGOUT;
	JComboBox Gender;
	ImageIcon img,im;
	String random="";
	static JProgressBar jp;
	static String n1,r1,a1,ph,p1,p2;
	int a,b,c,d,e,rol,aad,pho;
	int eid=0;
	AddEmployee()
	{
		f=new JFrame("Add Employee");
		f.setBounds(680,10,700,750);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//f.setLocation(600,80);
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
	    f.setLayout(null);
		f.setResizable(false);
		
		ImageIcon img=new ImageIcon("r1.jpg");
		block1=new JLabel(img);
		block1.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		f.add(block1);
		
		
		JPanel p=new JPanel();
		p.setLayout(null);
		p.setBounds(100,50,450,610);
		p.setBackground(Color.cyan);
		//p.setBackground(new Color(255, 255, 250,200));
		block1.add(p);
		
		ImageIcon empimg=new ImageIcon("emp.png");
		adde=new JLabel(empimg);
		adde.setBounds(130,-50,200,240);
		p.add(adde);
		
        empl=new JLabel("Employee Registration");
		empl.setFont(new Font("Elephant",Font.BOLD,25));
		empl.setBounds(155,10,350,30);
		empl.setForeground(Color.black);
		block1.add(empl);		
		
		NAME=new JLabel("Name*");
		NAME.setFont(new Font("Georgia",Font.BOLD,20));
		NAME.setForeground(Color.black);
		NAME.setBounds(20,160,100,20);
		p.add(NAME);
        
		name=new JTextField();
		name.setBounds(270,160,150,25);
		name.setOpaque(true);
		name.setToolTipText("Enter your name");
		p.add(name);
		
		FNAME=new JLabel("Father Name*");
		FNAME.setFont(new Font("Georgia",Font.BOLD,20));
		FNAME.setBounds(20,210,170,20);
		p.add(FNAME);
		
		fname=new JTextField();
		fname.setBounds(270,210,150,25);
		fname.setToolTipText("Enter Employee Father Name");
		p.add(fname);

		AADHAR=new JLabel("Aadhar No*");
		AADHAR.setFont(new Font("Georgia",Font.BOLD,20));
		AADHAR.setBounds(20,265,150,20);
		p.add(AADHAR);
		
		aadhar=new JTextField();
		aadhar.setBounds(270,265,150,25);
		aadhar.setToolTipText("Enter Employee 12 Digit aadhar no");
		p.add(aadhar);
		
		
		PHONE_NO=new JLabel("Phone No*");
		PHONE_NO.setFont(new Font("Georgia",Font.BOLD,20));
		PHONE_NO.setBounds(20,320,150,20);
		p.add(PHONE_NO);
		
		phone_no=new JTextField();
		phone_no.setBounds(270,320,150,25);
		phone_no.setToolTipText("Enter Employee 10 Digit Phone no");
		p.add(phone_no);

/*
		CPASSWORD=new JLabel("Confirm Password*");
		CPASSWORD.setFont(new Font("Georgia",Font.BOLD,20));
		CPASSWORD.setBounds(20,320,200,20);
		p.add(CPASSWORD);		
		
		cpassword=new JTextField();
		cpassword.setBounds(270,320,150,25);
		cpassword.setToolTipText("Confirm password");
		p.add(cpassword);
		*/
		GENDER=new JLabel("Gender*");
		GENDER.setFont(new Font("Georgia",Font.BOLD,20));
		GENDER.setBounds(20,375,150,20);
		p.add(GENDER);
 		
		Gender =new JComboBox();
		Gender.setBounds(270,375,150,30);
		Gender.setFont(new Font("Georgia",Font.BOLD,15));
		Gender.addItem("Select");
		Gender.addItem("Male");
		Gender.addItem("Female");
		Gender.setBackground(Color.white);
		Gender.setOpaque(true);
		p.add(Gender);
		Gender.setVisible(true);
	
		DOB=new JLabel("Date of Birth*");
		DOB.setFont(new Font("Georgia",Font.BOLD,20));
		DOB.setBounds(20,435,150,20);
		p.add(DOB);
		
		JLabel ID=new JLabel("Employee ID");
		ID.setFont(new Font("Georgia",Font.BOLD,20));
		ID.setBounds(20,475,150,20);
		p.add(ID);
		
		JLabel id=new JLabel("ID");
		id.setFont(new Font("Georgia",Font.BOLD,30));
		id.setForeground(Color.red);
		id.setBounds(270,470,150,35);
		p.add(id);
		
		dob=new JTextField();
		dob.setBounds(270,435,150,25);
		dob.setToolTipText("Enter Employee Date of Birth");
		p.add(dob);
						
		SUBMIT=new JButton("Submit");
		SUBMIT.setBounds(290,520,130,30);
		SUBMIT.setFont(new Font("Georgia",Font.BOLD,20));
		SUBMIT.setBackground(Color.white);
		p.add(SUBMIT);
					
		BACK=new JButton("BACK");
		BACK.setBounds(20,520,130,30);
		BACK.setFont(new Font("Georgia",Font.BOLD,20));
		BACK.setBackground(Color.white);
		p.add(BACK);
		
		jp=new JProgressBar();
        jp.setOpaque(false);
	    jp.setBounds(10,620,430,20);
	    jp.setStringPainted(true);
        jp.setForeground(Color.blue); 
        p.add(jp);
	    jp.setVisible(false);
		
			f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					Admin.f.setEnabled(true);
				}
			});
	try
	{	
	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from employeelogin");
		while(rs.next())
		{
			eid=rs.getInt(8);
		}
		eid=eid+1;
		id.setText(Integer.toString(eid));
	}catch(Exception e){System.out.println(e);}
	
	
	
	SUBMIT.addActionListener(new ActionListener()
	{
		
		public void actionPerformed(ActionEvent ae)
		{
			int aa,ph;
			aa=ph=0;
			if(name.getText().equals(""))
			{
				JOptionPane.showMessageDialog(f,"Please fill Employee Name","Alert",2);
			}else if(fname.getText().equals(""))
			{
				JOptionPane.showMessageDialog(f,"Please fill Employee Father name","Alert",2);
			}else if(aadhar.getText().equals(""))
			{
				JOptionPane.showMessageDialog(f,"Please fill Employee Aadhar no","Alert",2);
			}else if(phone_no.getText().equals(""))
			{
				JOptionPane.showMessageDialog(f,"Please fill Employee Phone no","Alert",2);
			}else if(Gender.getSelectedItem().equals("Select"))
			{
				JOptionPane.showMessageDialog(f,"Please Select Gender","Alert",2);
			}else if(dob.getText().equals(""))
			{
				JOptionPane.showMessageDialog(f,"Please enter Employee D.O.B.","Alert",2);
			}else
			{
				aad=validate(aadhar.getText());
				pho=validate(phone_no.getText());
				if(aad==1)
				{
					if(pho==1)
					{
						if(aadhar.getText().length()==12)
						{
							if(phone_no.getText().length()==10)
							{
								try
								{
								Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
								Statement st=con.createStatement();
								ResultSet rs=st.executeQuery("select*from employeelogin");
								while(rs.next())
								{
									
									if(rs.getString(4).equals(aadhar.getText()))
									{
										aa=1; 
									}
									if(rs.getString(5).equals(phone_no.getText()))
									{
										ph=1;
									}
									
								}
								}catch(Exception e){System.out.println(e);}
								
								
									if(aa==0)
									{
										if(ph==0)
										{
											try
											{
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
											Statement st=con.createStatement();
											st.executeUpdate("insert into employeelogin(name,fathername,aadhar,phone,gender,dob,ID) values('"+name.getText()+"','"+fname.getText()+"','"+aadhar.getText()+"','"+phone_no.getText()+"','"+Gender.getSelectedItem()+"','"+dob.getText()+"','"+id.getText()+"')");
											JOptionPane.showMessageDialog(f,"Employee ID "+eid+"\nDefault Password 0000","Sucessful",1);
											//Admin.f.setEnabled(true);
											f.setVisible(false);
											}catch(Exception e){System.out.println(e);}
										}else
										{
										JOptionPane.showMessageDialog(f,"Phone no already exist","Warining",2);
										}
									}else
									{
										JOptionPane.showMessageDialog(f,"Aadhar no already exist","Warining",2);
									}
								
							}else
							{
								JOptionPane.showMessageDialog(f,"Please insert only 10 digit Phone no","Warining",2);
							}
						}else
						{
							JOptionPane.showMessageDialog(f,"Only 12 Digit Aadhar no is allowed","Warining",2);
						}
						
					}else
					{
						JOptionPane.showMessageDialog(f,"Phone no can not contain any special character or letter","Warning",2);
					}
				}else
				{
					JOptionPane.showMessageDialog(f,"Aadhar no can not contain any special character or letter","warining",2);
				}
			
			}
		}
	});
		
		BACK.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{ 	
				Admin.f.setEnabled(true);
				f.setVisible(false);				
				
				
			} 
       });
		
	
		f.setVisible(true);
	}
	int validate(String s)	
	{	
		 int start=0;
         int end=s.length();
		 char ch[]=new char [end-start];
		 s.getChars(start,end,ch,0);
		 
		 a=b=c=d=e=0;
		 for(int i=0;i<end;i++)
		 {
			 if(ch[i]>=65&&ch[i]<=90)
			{
				//capital letter
				a=1;
			}
			if(ch[i]>=97&&ch[i]<=122)
			{
				//Small letter    
				b=1;
            }
			if(ch[i]>=48&&ch[i]<=57)
			{
				//digit
				c=1;
			}
			if(ch[i]==32)
			{
				//Space
				d=1;
            }
			if(ch[i]>32&&ch[i]<=38||ch[i]==64)
			{ 
            
				//Special Symbol
				e=1;
			}
         	 
		 }
		 if(a==0)
		 {
			 if(b==0)
			 {
				if(d==0)
				{
					if(e==0)
					{
						
						return 1;
						//System.out.println("Hello");
					}
				}
			 }
		 }
	
		return 0;
	}
}

class RemoveEmployee
{
	JFrame f;
	JLabel empl,ID,show,block1,captcha,adde,title;
	JTextField id,dob;
	JButton REMOVE,CANCEL,BACK,FIND,CONFIRM;
	JComboBox Gender;
	ImageIcon img,im;
	String random="";
	static JProgressBar jp;
	static String n1,r1,a1,ph,p1,p2;
	int a,b,c,d,e,rol,aad,pho;
	String na,aa;
		

	RemoveEmployee()
	{
		f=new JFrame("Remove Employee");
		f.setBounds(680,10,700,750);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//f.setLocation(600,80);
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
	    f.setLayout(null);
		f.setResizable(false);
		
		ImageIcon img=new ImageIcon("r1.jpg");
		block1=new JLabel(img);
		block1.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		f.add(block1);
		
		title=new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		title.setFont(new Font("Cooper Black",Font.BOLD,25));
		title.setBounds(50,20,550,50);
		title.setForeground(Color.black);
		block1.add(title);
		
		JPanel p=new JPanel();
		p.setLayout(null);
		p.setBounds(100,120,450,500);
		//p.setBackground(Color.red);
		p.setBackground(new Color(200, 255, 250,230));
		block1.add(p);
		
		ImageIcon empimg=new ImageIcon("remove.png");
		adde=new JLabel(empimg);
		adde.setBounds(130,-10,200,240);
		p.add(adde);
		
        empl=new JLabel("Remove Employee",empl.CENTER);
		//empl.setBackground(new Color(255,255,255,120));
		empl.setBackground(Color.black);
		empl.setOpaque(true);
		empl.setForeground(Color.white);
		empl.setFont(new Font("Elephant",Font.BOLD,25));
		empl.setBounds(185,80,300,30);
		
		block1.add(empl);		
		
		ID=new JLabel("Employee ID*");
		ID.setFont(new Font("Georgia",Font.BOLD,20));
		ID.setForeground(Color.black);
		ID.setBounds(20,240,200,20);
		p.add(ID);
        
		id=new JTextField();
		id.setBounds(270,240,150,25);
		id.setOpaque(true);
		id.setToolTipText("Enter your id");
		p.add(id);
		
		JLabel NAME=new JLabel("Employee Name");
		NAME.setFont(new Font("Georgia",Font.BOLD,20));
		NAME.setForeground(Color.black);
		NAME.setBounds(20,280,200,20);
		p.add(NAME);
		NAME.setVisible(false);
		
		JLabel name=new JLabel("Name");
		name.setFont(new Font("Georgia",Font.BOLD,20));
		name.setForeground(Color.red);
		name.setBounds(270,280,200,30);
		p.add(name);
		name.setVisible(false);
		
		JLabel AADHAR=new JLabel("AADHAR");
		AADHAR.setFont(new Font("Georgia",Font.BOLD,20));
		AADHAR.setForeground(Color.black);
		AADHAR.setBounds(20,320,200,20);
		p.add(AADHAR);
		AADHAR.setVisible(false);
		
		JLabel aadhar=new JLabel("AADHAR");
		aadhar.setFont(new Font("Georgia",Font.BOLD,20));
		aadhar.setForeground(Color.red);
		aadhar.setBounds(270,320,200,30);
		p.add(aadhar);
		aadhar.setVisible(false);
		
		FIND=new JButton("Find");
		FIND.setBounds(290,400,130,30);
		FIND.setFont(new Font("Georgia",Font.BOLD,20));
		FIND.setBackground(Color.yellow);
		p.add(FIND);
						
		REMOVE=new JButton("Remove");
		REMOVE.setBounds(290,450,130,30);
		REMOVE.setFont(new Font("Georgia",Font.BOLD,20));
		REMOVE.setBackground(Color.red);
		p.add(REMOVE);
		REMOVE.setEnabled(false);
		
		CONFIRM=new JButton("Confirm");
		CONFIRM.setBounds(20,400,130,30);
		CONFIRM.setFont(new Font("Georgia",Font.BOLD,20));
		CONFIRM.setBackground(Color.green);
		p.add(CONFIRM);
		CONFIRM.setEnabled(false);
		
		BACK=new JButton("BACK");
		BACK.setBounds(20,450,130,30);
		BACK.setFont(new Font("Georgia",Font.BOLD,20));
		BACK.setBackground(Color.white);
		p.add(BACK);
		
		na="1";
		aa="1";
		
		
		jp=new JProgressBar();
        jp.setOpaque(false);
	    jp.setBounds(10,600,430,20);
	    jp.setStringPainted(true);
        jp.setForeground(Color.blue); 
        p.add(jp);
	    jp.setVisible(false);
		
		f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					Admin.f.setEnabled(true);
				}
			});
		
		BACK.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{ 	
				Admin.f.setEnabled(true);
				f.setVisible(false);
						
			} 
       });
		
	   	FIND.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				REMOVE.setEnabled(false);
				int a=0;
				
				
				if(id.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f,"Please enter the employee ID","Alert",2);
				}else
				{
					try
					{
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("select*from employeelogin");
						while(rs.next())
						{
							if(id.getText().equals(rs.getString(8)))
							{
								a=1;
								na=rs.getString(2);
								aa=rs.getString(4);
							}
						}
						if(a==1)
						{
							NAME.setVisible(true);
							name.setVisible(true);
							AADHAR.setVisible(true);
							aadhar.setVisible(true);
							name.setText(na);
							aadhar.setText(aa);
							CONFIRM.setEnabled(true);
						}else
						{
							JOptionPane.showMessageDialog(f,"No Employee Exist on this ID","Invalid",0);
							NAME.setVisible(false);
							name.setVisible(false);
							AADHAR.setVisible(false);
							aadhar.setVisible(false);
							CONFIRM.setEnabled(false);
						}
						
					}catch(Exception e){System.out.println(e);}
				}
			}
		});   
		
		REMOVE.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
					Statement st=con.createStatement();
					st.executeUpdate("delete from employeelogin where id="+id.getText());
					JOptionPane.showMessageDialog(f,"Employee removed","Sucessful",1);
					Admin.f.setEnabled(true);
					f.setVisible(false);
				}catch(Exception e){System.out.println(e);}
			}
		});
	
		CONFIRM.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				REMOVE.setEnabled(true);
				CONFIRM.setEnabled(false);
			}
		});
		f.setVisible(true);
	}
}

class AddProduct
{

	JFrame f;
	JLabel block1;
	int a,b,c,d,e;
	int eid;
	AddProduct()
	{
		f=new JFrame("Add product");
		f.setBounds(750,70,600,500);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
	    f.setLayout(null);
		f.setResizable(false);
	
		
		block1=new JLabel("");
		block1.setBounds(0,0,600,750);
		block1.setBackground(new Color(05,45,67));
		block1.setOpaque(true);
		f.add(block1);
		
		JLabel rms=new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		rms.setBounds(25,10,600,30);
		rms.setFont(new Font("Cooper Black",Font.BOLD,25));
		rms.setForeground(Color.white);
		block1.add(rms);
		
		JLabel PNAME=new JLabel("Product Name");
		PNAME.setBounds(50,70,200,40);
		PNAME.setFont(new Font("Elephant",Font.BOLD,23));
		PNAME.setForeground(Color.white);
		block1.add(PNAME);
		
		JTextField pname=new JTextField();
		pname.setBounds(320,75,200,25);
		pname.setFont(new Font("Arial",Font.BOLD,20));
		block1.add(pname);
		
		JLabel PPRICE=new JLabel("Product Price");
		PPRICE.setBounds(50,125,200,40);
		PPRICE.setFont(new Font("Elephant",Font.BOLD,23));
		PPRICE.setForeground(Color.white);
		block1.add(PPRICE);
		
		JTextField pprice=new JTextField();
		pprice.setBounds(320,130,200,25);
		pprice.setFont(new Font("Arial",Font.BOLD,20));
		block1.add(pprice);
		
		JLabel PCATEGORY=new JLabel("Product Category");
		PCATEGORY.setBounds(50,180,250,40);
		PCATEGORY.setFont(new Font("Elephant",Font.BOLD,23));
		PCATEGORY.setForeground(Color.white);
		block1.add(PCATEGORY);
		
		JComboBox category=new JComboBox();
		category.setBounds(320,185,200,25);
		category.setFont(new Font("Georgia",Font.BOLD,15));
		category.setBackground(Color.white);
		
		category.addItem("Select");
		category.addItem("Vegetarian");
		category.addItem("Non Vegetarian");
		block1.add(category);

		JLabel PID=new JLabel("Product ID");
		PID.setBounds(50,240,250,40);
		PID.setFont(new Font("Elephant",Font.BOLD,23));
		PID.setForeground(Color.white);
		block1.add(PID);
		
		JLabel pid=new JLabel("ID");
		pid.setBounds(320,240,250,40);
		pid.setFont(new Font("Georgia",Font.BOLD,26));
		pid.setForeground(Color.yellow);
		block1.add(pid);

		JButton submit=new JButton("Submit");
		submit.setBounds(380,300,130,35);
		submit.setFont(new Font("Georgia",Font.BOLD,20));	
		submit.setBackground(Color.white);
		block1.add(submit);
		
		JButton back=new JButton("Back");
		back.setBounds(60,300,130,35);
		back.setFont(new Font("Georgia",Font.BOLD,20));	
		back.setBackground(Color.white);
		block1.add(back);
		f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					Admin.f.setEnabled(true);
				}
			});
		
		try
		{	
	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from product");
		while(rs.next())
		{
			eid=rs.getInt(5);
		}
		
		eid=eid+1;
		pid.setText(Integer.toString(eid));
	}catch(Exception e){System.out.println(e);}
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				Admin.f.setEnabled(true);
				f.setVisible(false);
			}
		});
		
		submit.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent ae)
			{	int a=1;
				int pp=validate(pprice.getText());
				if(pname.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f,"Please fill Product Name","Alert",2);
				}else if(pprice.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f,"Please Enter Product price","Alert",2);
				}else if(category.getSelectedItem().equals("Select"))
				{
					JOptionPane.showMessageDialog(f,"Please select product category","Alert",2);
				}else if(pp==0)
				{
					JOptionPane.showMessageDialog(f,"Product price contain only integer values","Warning",2);
				}else
				{
					try
					{		
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("select*from product");
						while(rs.next())
						{
							if(pname.getText().equals(rs.getString(2)))
							{
								a=0;
							}
						}
						if(a==0)
						{
							JOptionPane.showMessageDialog(f,"Product is already exist","Warning",2);
						}else
						{
							try
							{		
								st.executeUpdate("insert into product(name,price,category,id) values('"+pname.getText()+"','"+Integer.parseInt(pprice.getText())+"','"+category.getSelectedItem()+"','"+eid+"')");
								JOptionPane.showMessageDialog(f,"Product added Successfully","Successful",1);
								Admin.f.setEnabled(true);
								f.setVisible(false);
								
					
							}catch(Exception e){System.out.println(e);}
							
						}
					}catch(Exception e){System.out.println(e);}
				}
			}
		});
		f.setVisible(true);
	}
	
	int validate(String s)	
	{	
		 int start=0;
         int end=s.length();
		 char ch[]=new char [end-start];
		 s.getChars(start,end,ch,0);
		 
		 a=b=c=d=e=0;
		 for(int i=0;i<end;i++)
		 {
			 if(ch[i]>=65&&ch[i]<=90)
			{
				//capital letter
				a=1;
			}
			if(ch[i]>=97&&ch[i]<=122)
			{
				//Small letter    
				b=1;
            }
			if(ch[i]>=48&&ch[i]<=57)
			{
				//digit
				c=1;
			}
			if(ch[i]==32)
			{
				//Space
				d=1;
            }
			if(ch[i]>32&&ch[i]<=38||ch[i]==64)
			{ 
            
				//Special Symbol
				e=1;
			}
         	 
		 }
		 if(a==0)
		 {
			 if(b==0)
			 {
				if(d==0)
				{
					if(e==0)
					{
						
						return 1;
						//System.out.println("Hello");
					}
				}
			 }
		 }
	
		return 0;
	}
	
}

class RemoveProduct
{
	JFrame f;
	JLabel block1;
	RemoveProduct()
	{
		f=new JFrame("Remove product");
		f.setBounds(750,70,600,500);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
	    f.setLayout(null);
		f.setResizable(false);
		
		block1=new JLabel("");
		block1.setBounds(0,0,600,750);
		block1.setBackground(new Color(05,45,67));
		block1.setOpaque(true);
		f.add(block1);
		
		JLabel rms=new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		rms.setBounds(25,10,600,30);
		rms.setFont(new Font("Cooper Black",Font.BOLD,25));
		rms.setForeground(Color.white);
		block1.add(rms);
		
		JLabel PID=new JLabel("Product ID");
		PID.setBounds(50,70,200,40);
		PID.setFont(new Font("Elephant",Font.BOLD,23));
		PID.setForeground(Color.white);
		block1.add(PID);
		
		JTextField pid=new JTextField();
		pid.setBounds(320,75,200,25);
		pid.setFont(new Font("Arial",Font.BOLD,20));
		block1.add(pid);
		
		JLabel PNAME=new JLabel("Product Name");
		PNAME.setFont(new Font("Elephant",Font.BOLD,23));
		PNAME.setForeground(Color.white);
		PNAME.setBounds(50,130,200,20);
		block1.add(PNAME);
		PNAME.setVisible(false);
		
		JLabel pname=new JLabel("Name");
		pname.setFont(new Font("Georgia",Font.BOLD,23));
		pname.setForeground(Color.red);
		pname.setBounds(320,130,200,30);
		block1.add(pname);
		pname.setVisible(false);
		
		JLabel PPRICE=new JLabel("Product Price");
		PPRICE.setFont(new Font("Elephant",Font.BOLD,23));
		PPRICE.setForeground(Color.white);
		PPRICE.setBounds(50,180,200,20);
		block1.add(PPRICE);
		PPRICE.setVisible(false);
		
		JLabel pprice=new JLabel("price");
		pprice.setFont(new Font("Georgia",Font.BOLD,23));
		pprice.setForeground(Color.red);
		pprice.setBounds(320,175,200,30);
		block1.add(pprice);
		pprice.setVisible(false);
		
		JButton find=new JButton("Find");
		find.setBounds(380,250,130,35);
		find.setFont(new Font("Georgia",Font.BOLD,20));	
		find.setBackground(Color.white);
		block1.add(find);
		
		JButton back=new JButton("Back");
		back.setBounds(60,250,130,35);
		back.setFont(new Font("Georgia",Font.BOLD,20));	
		back.setBackground(Color.white);
		block1.add(back);
		
		JButton confirm=new JButton("Confirm");
		confirm.setBounds(60,305,130,35);
		confirm.setFont(new Font("Georgia",Font.BOLD,20));	
		confirm.setBackground(Color.green);
		confirm.setEnabled(false);
		block1.add(confirm);
		
		JButton remove=new JButton("Remove");
		remove.setBounds(380,305,130,35);
		remove.setFont(new Font("Georgia",Font.BOLD,20));	
		remove.setBackground(Color.red);
		remove.setEnabled(false);
		block1.add(remove);
		
		f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					Admin.f.setEnabled(true);
				}
			});
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				Admin.f.setEnabled(true);
				f.setVisible(false);
			}
		});
		
		find.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int a=0;
				String pn,pp;
				pn="";
				pp="";
				confirm.setEnabled(false);
				if(pid.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f,"Please enter Product ID","Alert",2);
				}else
				{
					try
					{
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("select*from product");
						while(rs.next())
						{
							if(pid.getText().equals(rs.getString(5)))
							{
								a=1;
								pn=rs.getString(2);
								pp=rs.getString(3);
							}
						}
						if(a==0)
						{
							
							JOptionPane.showMessageDialog(f,"Product does not exist on this ID","Invalid ID",0);
						}else
						{
							PNAME.setVisible(true);
							PPRICE.setVisible(true);
							pname.setText(pn);
							pprice.setText(pp);
							pname.setVisible(true);
							pprice.setVisible(true);
							confirm.setEnabled(true);
						}
					}catch(Exception e){System.out.println(e);}
				}
			}
		});
		
		confirm.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				confirm.setEnabled(false);
				remove.setEnabled(true);
			}
		});
		
		remove.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
					Statement st=con.createStatement();
					st.executeUpdate("delete from product where id="+pid.getText());
					JOptionPane.showMessageDialog(f,"Product removed","Sucessful",1);
					//Admin.f.setEnabled(true);
					//f.setVisible(false);
				}catch(Exception e){System.out.println(e);}
			}
		});
		
		f.setVisible(true);
	}
}

class slide extends Thread
{
	static int i;
	static int j;
	public	void run()
		{
			try
			{
				
				for(i=0;i<240;i++)
				{

					if(i==238)
					{
						for(j=240;j>0;j--)
						{
							try
							{
							AdminEmployee.SANDEEP.setBounds(j,20,900,50);
						
							i=0;
							Thread.sleep(30);
							}catch(Exception e){}
						}
					}

					AdminEmployee.SANDEEP.setBounds(i,20,900,50);
					Thread.sleep(30);
				}
			}catch(Exception e){}
			
			
			
		}
	
}

class EmployeeLogin
{
	JFrame f;
	JLabel ID,PASSWORD,LOGIN,show,block1;
	JTextField name;
	JPasswordField password;
	JButton login,retry,back,forget,cancel;
	ImageIcon img;
	String s1="sandeep";
	String s2="san213";
	int a,b;
	static String ep,epn,epa,epp;
	
	EmployeeLogin()
	{
		a=b=0;
		ImageIcon img1=new ImageIcon("r1.jpg");
		f=new JFrame("sandeep");
		f.setBounds(300,10,900,750);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setLocation(600,80);
		Container c=f.getContentPane();
		c.setBackground(Color.white);
		
		
	    f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
		f.setResizable(false);
		
		
		
		block1=new JLabel(img1);
		block1.setBounds(0,0,img1.getIconWidth(),img1.getIconHeight());
		f.add(block1);
		block1.setVisible(true);
		
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(200,60,500,600);
		//p1.setBackground(Color.cyan);
		p1.setBackground(new Color(250, 255, 255,230));
		block1.add(p1);
		
		ImageIcon logimg=new ImageIcon("employee.png");
		JLabel log=new JLabel(logimg);
		log.setBounds(150,0,200,240);
		log.setVisible(true);
		p1.add(log);
		
		LOGIN=new JLabel("LOGIN");
		LOGIN.setFont(new Font("Elephant",Font.BOLD,25));
		LOGIN.setBounds(380,20,250,30);
		LOGIN.setForeground(Color.black);
		block1.add(LOGIN);
					
		ID = new JLabel("Enter your ID");
		ID.setBounds(20,290,250,30);
		ID.setFont(new Font("Georgia",Font.BOLD,20));
		p1.add(ID);
		
		JTextField id=new JTextField();
		id.setBounds(310,290,150,25);
		id.setFont(new Font("Arial",Font.BOLD,15));
		id.setForeground(Color.green);
	    p1.add(id);
		
		PASSWORD = new JLabel("Enter your Password");
		PASSWORD.setBounds(20,340,250,30);
		PASSWORD.setFont(new Font("Georgia",Font.BOLD,20));
		p1.add(PASSWORD);
		
		password=new JPasswordField();
		password.setBounds(310,340,150,25);
		password.setFont(new Font("Arial",Font.BOLD,25));
		password.setForeground(Color.black);
		password.setEchoChar('*');
		p1.add(password);
		
				
		login=new JButton("LOGIN");
		login.setBounds(20,410,130,30);
		login.setFont(new Font("Georgia",Font.BOLD,20));
		login.setBackground(Color.red);
		p1.add(login);
		
		forget =new JButton("Forget Password");
		forget.setBounds(350,480,130,30);
		forget.setFont(new Font("Georgia",Font.BOLD,20));
		forget.setBackground(Color.white);
		p1.add(forget);
			
		retry=new JButton("RETRY");
		retry.setBounds(350,400,130,30);
		retry.setFont(new Font("Georgia",Font.BOLD,20));
		retry.setBackground(Color.cyan);
		retry.setEnabled(false);
		p1.add(retry);
		
		back=new JButton("Back");
		back.setBounds(20,480,130,30);
		back.setFont(new Font("Georgia",Font.BOLD,20));
		back.setBackground(Color.white);
		p1.add(back);
		f.setVisible(true);
		
		retry.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{ 
		
				
				id.setEnabled(true);
				password.setEnabled(true);
				id.setText("");
				password.setText("");
				login.setEnabled(true);
				
				
		
			} 
       });
			
		
		forget.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new ForgetEmployeeD();
				f.setVisible(false);
			}
		});
		
				
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{ 
				//new slide().start();
				new AdminEmployee();
				f.setVisible(false);
				
		
			} 
       });
	    			
		
		login.addActionListener(new ActionListener()
		{
			int condition =1;
			public void actionPerformed(ActionEvent ae)
			{
				if(id.getText().equals("")||password.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f,"Please fill all the Text field","Alert",2);
				}else 
				{
						try
						{
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
							Statement st=con.createStatement();
							ResultSet rs=st.executeQuery("select *from employeelogin");
							while(rs.next())
							{
							//System.out.println(rs.getInt(8)+" "+rs.getString(9));
							
								if(id.getText().equals(rs.getString(8))&&password.getText().equals(rs.getString(9)))
								{
									
									condition=0;
									ep=rs.getString(8);
									epn=rs.getString(2);
									break;
								}else
								{
								
									condition=1;
								}
							}
							if(condition==0)
							{
							
								new Employee();
								f.setVisible(false);
							}else
							{
							
								JOptionPane.showMessageDialog(f,"Invalid user","Unauthorized",0);
								login.setEnabled(false);
								id.setEnabled(false);
								password.setEnabled(false);
								retry.setEnabled(true);
							}
						}catch(Exception e){System.out.println(e);}
					
				}
	
				
			}
		
	
		});
		
		
	
  
	}	
   
}

class Employee
{
	static JFrame f;
	JLabel block1;
	static JLabel rms;
	JLabel price;
	JLabel id1;
	String d,strDate;
	Employee()
	{
		ImageIcon img1=new ImageIcon("sign.jpg");
		f=new JFrame("Employee");
		f.setLayout(null);
		f.setBounds(-10,0,1920,1080);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setResizable(false);
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
		Container c=f.getContentPane();
		c.setBackground(Color.white);
						
						
						
		block1=new JLabel(img1);
		block1.setBounds(0,0,img1.getIconWidth(),img1.getIconHeight());
		f.add(block1);
		//System.out.println(img1.getIconHeight());
		
		JMenuBar menubar=new JMenuBar();
		menubar.setBackground(new Color(05,45,67));
				
		JMenuItem cpassword =new JMenuItem("Change password");
		cpassword.setBackground(new Color(05,45,67));
		cpassword.setFont(new Font("Arial",Font.BOLD,15));
		cpassword.setForeground(Color.white);
		
		JMenu Edit=new JMenu("Edit");		
		Edit.setForeground(Color.white);
		Edit.setFont(new Font("Arial",Font.BOLD,15));
		menubar.add(Edit);
		
		Edit.add(cpassword);
		
		f.setJMenuBar(menubar);
		f.addWindowListener(new java.awt.event.WindowAdapter()
		{
			public void windowClosing(java.awt.event.WindowEvent windowEvent)
			{
				new EmployeeLogin();
			}
		});
		
		cpassword.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new ResetPassword();
				Employee.f.setEnabled(false);
				//Admin.f.setEnabled(false);
			}
		});
		
		/*rms=new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		rms.setFont(new Font("Cooper Black",Font.BOLD,30));
		rms.setBounds(100,20,900,50);
		rms.setForeground(Color.black);
		block1.add(rms);*/
		
		JLabel date=new JLabel("Date");
		date.setBounds(1230,1,250,30);
		date.setFont(new Font("Georgia",Font.BOLD,23));
		date.setForeground(Color.black);
		block1.add(date);
		
		Date date1 = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
        strDate = dateFormat.format(date1);
		date.setText(strDate);
		
		JLabel day=new JLabel("Day");
		day.setBounds(1100,1,250,30);
		day.setFont(new Font("Georgia",Font.BOLD,23));
		day.setForeground(Color.black);
		block1.add(day);
		
		Calendar calendar = Calendar.getInstance();
		Date day1 = calendar.getTime();
		day.setText(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(day1.getTime()));
		d=new SimpleDateFormat("EEEE", Locale.ENGLISH).format(day1.getTime());
		
		
		JLabel SALE=new JLabel("Sale");
		SALE.setBounds(240,15,100,40);
		SALE.setFont(new Font("Cooper Black",Font.BOLD,30));
		SALE.setForeground(Color.black);
		block1.add(SALE);
		
		JPanel sale=new JPanel();
		sale.setLayout(null);
		sale.setBounds(60,60,500,600);
		sale.setBackground(new Color(251, 252, 179));		
		block1.add(sale);
		
		JLabel CATEGORY=new JLabel("Category");
		CATEGORY.setBounds(20,20,200,30);
		CATEGORY.setFont(new Font("Georgia",Font.BOLD,25));
		sale.add(CATEGORY);
	
		JComboBox category=new JComboBox();
		category.setBounds(240,25,200,25);
		category.setFont(new Font("Georgia",Font.BOLD,15));
		category.setBackground(Color.white);
		
		category.addItem("Select");
		category.addItem("Vegetarian");
		category.addItem("Non Vegetarian");
		sale.add(category);
	
		JLabel FNAME=new JLabel("Food Name");
		FNAME.setBounds(20,70,200,30);
		FNAME.setFont(new Font("Georgia",Font.BOLD,25));
		sale.add(FNAME);
		
		JComboBox fname=new JComboBox();
		fname.setBounds(240,70,200,25);
		fname.setFont(new Font("Georgia",Font.BOLD,15));
		fname.setBackground(Color.white);
		sale.add(fname);
		
		JLabel QUANTITY=new JLabel("Quantity");
		QUANTITY.setBounds(20,120,200,30);
		QUANTITY.setFont(new Font("Georgia",Font.BOLD,25));
		sale.add(QUANTITY);
		
		JComboBox quantity=new JComboBox();
		quantity.setBounds(240,120,200,25);
		quantity.setFont(new Font("Arial",Font.BOLD,20));
		quantity.setBackground(Color.white);
		
		quantity.addItem("1");
		quantity.addItem("2");
		quantity.addItem("3");
		quantity.addItem("4");
		quantity.addItem("5");
		quantity.addItem("6");
		quantity.addItem("7");
		quantity.addItem("8");
		quantity.addItem("9");
		quantity.addItem("10");
		quantity.addItem("11");
		quantity.addItem("12");
		sale.add(quantity);

		JLabel ID=new JLabel("Item ID");
		ID.setBounds(20,170,200,30);
		ID.setFont(new Font("Georgia",Font.BOLD,25));
		sale.add(ID);
		
		JLabel id=new JLabel("ID");
		id.setBounds(240,170,200,30);
		id.setForeground(Color.blue);
		id.setFont(new Font("Georgia",Font.BOLD,25));
		sale.add(id);
		
		JLabel PRICE=new JLabel("Price");
		PRICE.setBounds(20,220,200,30);
		PRICE.setFont(new Font("Georgia",Font.BOLD,25));
		sale.add(PRICE);
		
		price=new JLabel("Price");
		price.setBounds(240,220,200,30);
		price.setForeground(Color.red);
		price.setFont(new Font("Georgia",Font.BOLD,25));
		sale.add(price);
		
		JLabel TOTAL=new JLabel("Total");
		TOTAL.setBounds(20,270,200,30);
		TOTAL.setFont(new Font("Georgia",Font.BOLD,25));
		sale.add(TOTAL);
		
		JLabel total=new JLabel("Total");
		total.setBounds(240,270,200,30);
		total.setForeground(Color.red);
		total.setFont(new Font("Georgia",Font.BOLD,25));
		sale.add(total);
		
		JButton refresh=new JButton("Refresh");
		refresh.setBounds(30,350,130,30);
		refresh.setBackground(Color.white);
		refresh.setFont(new Font("Georgia",Font.BOLD,20));
		sale.add(refresh);
		
		JButton Sale=new JButton("Sale");
		Sale.setBounds(280,350,130,30);
		Sale.setBackground(Color.white);
		Sale.setFont(new Font("Georgia",Font.BOLD,25));
		sale.add(Sale);
		
		JButton back=new JButton("Back");
		back.setBounds(30,670,130,30);
		back.setBackground(Color.white);
		back.setFont(new Font("Georgia",Font.BOLD,25));
		block1.add(back);
		
		JLabel name1 =new JLabel("Sandeep sharma");
		name1.setBounds(10,0,400,30);
		name1.setFont(new Font("Georgia",Font.BOLD,25));
		name1.setForeground(Color.red);
		block1.add(name1);
		name1.setText(EmployeeLogin.epn);
		
		id1 =new JLabel("Sandeep sharma");
		id1.setBounds(10,25,400,30);
		id1.setFont(new Font("Georgia",Font.BOLD,25));
		id1.setForeground(Color.blue);
		block1.add(id1);
		id1.setText(EmployeeLogin.ep);
		quantity.setEnabled(false);
		
		//panel 2
		
		JLabel TSALE=new JLabel("Today Sales Record");
		TSALE.setBounds(690,15,400,40);
		TSALE.setFont(new Font("Cooper Black",Font.BOLD,30));
		TSALE.setForeground(Color.black);
		block1.add(TSALE);
		
		JPanel sales_record=new JPanel();
		sales_record.setLayout(null);
		sales_record.setBounds(600,60,500,600);
		sales_record.setBackground(new Color(251, 252, 179));		
		block1.add(sales_record);
		
		JTable table=new JTable();
		table.setBackground(new Color(05,45,67));
        table.setForeground(Color.white);
        table.setRowHeight(20);
		table.setEnabled(false);
		block1.add(table);
		//table.setVisible(false);			
		
		JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 500, 550);
		pane.setBackground(Color.red);
		sales_record.add(pane);
		pane.setEnabled(false);
		pane.setVisible(false);
		
		JLabel TOTAL1=new JLabel("Total sales    = ");
		TOTAL1.setBounds(30,560,250,30);
		TOTAL1.setFont(new Font("Georgia",Font.BOLD,25));
		TOTAL1.setForeground(Color.black);
		sales_record.add(TOTAL1);
		TOTAL1.setVisible(true);
		
		JLabel total1=new JLabel("Sum");
		total1.setBounds(260,560,300,30);
		total1.setFont(new Font("Arial",Font.BOLD,25));
		total1.setForeground(Color.black);
		sales_record.add(total1);
		
		
		f.setVisible(true);

		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
			Statement st=con.createStatement();
			
			DefaultTableModel model2=new DefaultTableModel(new String[]{"Name","Category","Quantity","Price","total"},0);
			table.setVisible(true);		
			pane.setVisible(true);
			ResultSet rs=st.executeQuery("Select*from sales_record where date='"+strDate+"' and sold_by_person_id='"+Integer.parseInt(EmployeeLogin.ep)+"'");
			//model2.getDataVector().removeAllElements
				
			total1.setText(sum());
			while(rs.next())
			{
				model2.addRow(new Object[]{rs.getString(2),rs.getString(1),rs.getString(3),rs.getString(4),rs.getString(5)});
							
			}
						
			table.setModel(model2);
			pane.setVisible(true);
			id.setText("ID");
			price.setText("Price");
			total.setText("Total");
			category.setSelectedItem("Select");
			quantity.setSelectedItem("1");
			quantity.setEnabled(false);
						
						
		}catch(Exception e){System.out.println(e);}
					
		fname.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("Select*from product");
					while(rs.next())
					{
						if(fname.getSelectedItem().equals(rs.getString(2)))
						{
						price.setText(rs.getString(3));
						id.setText(rs.getString(5));
						total.setText(rs.getString(3));
						fname.setSelectedItem("1");
						break;
						}
					}
					
					//System.out.println(s);
				}catch(Exception e){System.out.println(e);}
			}
		});
		quantity.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String x = quantity.getSelectedItem().toString();
				int t=calculate(x);
				total.setText(Integer.toString(t));
			}
		});
		category.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					int x=0;
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
					Statement st=con.createStatement();
					if(category.getSelectedItem().equals("Vegetarian"))
					{
						quantity.setEnabled(true);
						
						fname.removeAllItems();
						ResultSet rs=st.executeQuery("select*from product where category='Vegetarian'");			
						while(rs.next())
						{
							
							fname.addItem(rs.getString(2));
						}
						ResultSet rs1=st.executeQuery("select*from product");
						while(rs1.next())
						{
							
							if(fname.getSelectedItem().equals(rs1.getString(2)))
							{
								id.setText(rs1.getString(5));
								price.setText(rs1.getString(3));
								break;
							}
						}
						
						total.setText(price.getText());
						quantity.setSelectedItem("1");						
					}else//(category.getSelectedItem().equals("Non Vegetarian"))
					{
						quantity.setEnabled(true);
						//quantity.setSelectedItem("1");
						fname.removeAllItems();
						ResultSet rs=st.executeQuery("select*from product where category='Non Vegetarian'");
						while(rs.next())
						{
							fname.addItem(rs.getString(2));
						}
						ResultSet rs1=st.executeQuery("select*from product");
						while(rs1.next())
						{
							
							if(fname.getSelectedItem().equals(rs1.getString(2)))
							{
								id.setText(rs1.getString(5));
								price.setText(rs1.getString(3));
								break;
							}
						}
						total.setText(price.getText());
						quantity.setSelectedItem("1");	
					}
					if(category.getSelectedItem().equals("Select"))
					{
						fname.removeAllItems();
						quantity.setEnabled(false);
						id.setText("ID");
						price.setText("Price");
						total.setText("Total");
					}
					
				}catch(Exception e){System.out.println(e);}
			}
		});
		refresh.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				//quantity.setEnabled(false);
				id.setText("ID");
				price.setText("Price");
				total.setText("Total");
				//fname.setSelectedItem("");
				category.setSelectedItem("Select");
				//quantity.setSelectedItem("1");
			}
		});
		
		Sale.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(category.getSelectedItem().equals("Select"))
				{
					JOptionPane.showMessageDialog(f,"Please select category","Alert",2);
					
				}else
				{
					try
					{
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
						Statement st=con.createStatement();
						st.executeUpdate("insert into sales_record(category,fname,quantity,price,total,day,date,sold_by,sold_by_person_id) values('"+category.getSelectedItem().toString()+"','"+fname.getSelectedItem().toString()+"','"+Integer.parseInt(quantity.getSelectedItem().toString())+"','"+Integer.parseInt(price.getText())+"','"+Integer.parseInt(total.getText())+"','"+d+"','"+strDate+"','"+EmployeeLogin.epn+"','"+EmployeeLogin.ep+"')");
						JOptionPane.showMessageDialog(f,"Item sold","Successful",1);
						DefaultTableModel model2=new DefaultTableModel(new String[]{"Name","Category","Quantity","Price","total"},0);
						table.setVisible(true);		
						pane.setVisible(true);
						ResultSet rs=st.executeQuery("Select*from sales_record where date='"+strDate+"' and sold_by_person_id='"+Integer.parseInt(EmployeeLogin.ep)+"'");
						//model2.getDataVector().removeAllElements
						
						total1.setText(sum());
						while(rs.next())
						{
							model2.addRow(new Object[]{rs.getString(2),rs.getString(1),rs.getString(3),rs.getString(4),rs.getString(5)});
							
						}
						
						table.setModel(model2);
						pane.setVisible(true);
						id.setText("ID");
						price.setText("Price");
						total.setText("Total");
						category.setSelectedItem("Select");
						quantity.setSelectedItem("1");
						quantity.setEnabled(false);
						
						
					}catch(Exception e){System.out.println(e);}
						
				}
				
			}
		});
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new AdminEmployee();
				f.setVisible(false);
			}
		});
		
			}
			String sum()
			{
				String s="";
				try
				{
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select sum(total) from sales_record where sold_by_person_id='"+Integer.parseInt(id1.getText())+"' and date='"+strDate+"'");
					while(rs.next())
					{
					s=rs.getString(1);
					
					}
								
					
				}catch(Exception e){System.out.println(e);}
				return s;
			}
	int calculate(String s)
	{
		int q =Integer.parseInt(s);
		int p =Integer.parseInt(price.getText());
		int t;
		t=p*q;
		return t;
	}

}

class ForgetEmployeeD
{
	JFrame f;
	JLabel block1;
	int a,b,c,d,e;
	static String ep,epn;
	ForgetEmployeeD()
	{
		f=new JFrame("Forget Password");
		f.setBounds(400,50,600,500);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
	    f.setLayout(null);
		f.setResizable(false);
		
		block1=new JLabel("");
		block1.setBounds(0,0,600,750);
		block1.setBackground(new Color(05,45,67));
		block1.setOpaque(true);
		f.add(block1);
		
		JLabel rms=new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		rms.setBounds(25,10,600,30);
		rms.setFont(new Font("Cooper Black",Font.BOLD,25));
		rms.setForeground(Color.white);
		block1.add(rms);
		
		JLabel AADHAR=new JLabel("Aadhar no");
		AADHAR.setBounds(50,70,200,40);
		AADHAR.setFont(new Font("Elephant",Font.BOLD,23));
		AADHAR.setForeground(Color.white);
		block1.add(AADHAR);
		
		JTextField aadhar=new JTextField();
		aadhar.setBounds(320,75,200,25);
		aadhar.setFont(new Font("Arial",Font.BOLD,20));
		aadhar.setToolTipText("Enter 12 digit Aadhar no");
		block1.add(aadhar);
		
		JLabel PHONE=new JLabel("Phone no");
		PHONE.setBounds(50,120,200,40);
		PHONE.setFont(new Font("Elephant",Font.BOLD,23));
		PHONE.setForeground(Color.white);
		block1.add(PHONE);
		
		JTextField phone=new JTextField();
		phone.setBounds(320,120,200,25);
		phone.setFont(new Font("Arial",Font.BOLD,20));
		phone.setToolTipText("Enter 10 Digit Aadhar no");
		block1.add(phone);
		
		JButton find=new JButton("Find");
		find.setBounds(380,250,130,35);
		find.setFont(new Font("Georgia",Font.BOLD,20));	
		find.setBackground(Color.white);
		block1.add(find);
		
		JButton back=new JButton("Back");
		back.setBounds(60,250,130,35);
		back.setFont(new Font("Georgia",Font.BOLD,20));	
		back.setBackground(Color.white);
		block1.add(back);
		
			f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					new EmployeeLogin();
				}
			});
		
		find.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int condition=0;
				if(aadhar.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f,"Please fill Aadhar no","Alert",2);
				}else if(aadhar.getText().length()==12)
				{
					int aa=validate(aadhar.getText());
					if(aa==1)
					{
						if(phone.getText().equals(""))
						{
							JOptionPane.showMessageDialog(f,"Please fill Phone no","Alert",2);
						}else 	if(phone.getText().length()==10)
						{
							int pp=validate(phone.getText());
							if(pp==1)
							{
								try
								{
									Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
									Statement st=con.createStatement();
									ResultSet rs=st.executeQuery("select*from employeelogin");
									while(rs.next())
									{
										if(aadhar.getText().equals(rs.getString(4))&&phone.getText().equals(rs.getString(5)))
										{
											condition=1;
											ep=rs.getString(8);
											epn=rs.getString(2);
											System.out.println(rs.getString(4)+" "+rs.getString(8));
											break;
										}
										//System.out.println(rs.getString(4)+" "+rs.getString(8));
									}
									if(condition==1)
									{
										
										new ResetPassword1();
										f.setVisible(false);
									}else
									{
										JOptionPane.showMessageDialog(f,"User does not exist","Invalid",0);
									}
								}catch(Exception e){System.out.println(e);}
							}else
							{
								JOptionPane.showMessageDialog(f,"Please enter a valid Phone no","Invalid",0);
							}
							
						}else 
						{
							JOptionPane.showMessageDialog(f,"Please enter a valid 10 digit Mobile no","Alert",2);
						}
						
					}else
					{
						JOptionPane.showMessageDialog(f,"Please enter a valid Aadhar no","Invalid",0);
					}
				}else
				{
					JOptionPane.showMessageDialog(f,"Please enter a valid 12 digit Aadhar no","Alert",2);
				}
			}
		});
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new EmployeeLogin();
				f.setVisible(false);
			}
		});
		
		f.setVisible(true);
	}
	
	int validate(String s)	
	{	
		 int start=0;
         int end=s.length();
		 char ch[]=new char [end-start];
		 s.getChars(start,end,ch,0);
		 
		 a=b=c=d=e=0;
		 for(int i=0;i<end;i++)
		 {
			 if(ch[i]>=65&&ch[i]<=90)
			{
				//capital letter
				a=1;
			}
			if(ch[i]>=97&&ch[i]<=122)
			{
				//Small letter    
				b=1;
            }
			if(ch[i]>=48&&ch[i]<=57)
			{
				//digit
				c=1;
			}
			if(ch[i]==32)
			{
				//Space
				d=1;
            }
			if(ch[i]>32&&ch[i]<=38||ch[i]==64)
			{ 
            
				//Special Symbol
				e=1;
			}
         	 
		 }
		 if(a==0)
		 {
			 if(b==0)
			 {
				if(d==0)
				{
					if(e==0)
					{
						
						return 1;
						//System.out.println("Hello");
					}
				}
			 }
		 }
	
		return 0;
	}
	
}

class ResetPassword1
{
	JFrame f;
	JLabel block1;
	int a,b,c,d,e;
	ResetPassword1()
	{
		f=new JFrame("Forget Password");
		f.setBounds(400,50,600,500);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
	    f.setLayout(null);
		f.setResizable(false);
		
		block1=new JLabel("");
		block1.setBounds(0,0,600,750);
		block1.setBackground(new Color(05,45,67));
		block1.setOpaque(true);
		f.add(block1);
		
		JLabel rms=new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		rms.setBounds(25,10,600,30);
		rms.setFont(new Font("Cooper Black",Font.BOLD,25));
		rms.setForeground(Color.white);
		block1.add(rms);
			
		JLabel ID=new JLabel("Your ID");
		ID.setBounds(50,70,200,40);
		ID.setFont(new Font("Elephant",Font.BOLD,23));
		ID.setForeground(Color.white);
		block1.add(ID);
		
		JLabel id=new JLabel("ID");
		id.setBounds(320,75,200,25);
		id.setFont(new Font("Elephant",Font.BOLD,23));
		id.setForeground(Color.yellow);
		block1.add(id);
		id.setText(ForgetEmployeeD.ep);
		
		JLabel NAME=new JLabel("Your Name");
		NAME.setBounds(50,120,200,40);
		NAME.setFont(new Font("Elephant",Font.BOLD,23));
		NAME.setForeground(Color.white);
		block1.add(NAME);
		
		JLabel name=new JLabel("Name");
		name.setBounds(320,120,200,25);
		name.setForeground(Color.yellow);
		name.setFont(new Font("Elephant",Font.BOLD,23));
		block1.add(name);
		name.setText(ForgetEmployeeD.epn);
		
		JLabel PASSWORD=new JLabel("Password");
		PASSWORD.setBounds(50,165,200,40);
		PASSWORD.setFont(new Font("Elephant",Font.BOLD,23));
		PASSWORD.setForeground(Color.white);
		block1.add(PASSWORD);
		
		JTextField password=new JTextField();
		password.setBounds(320,165,200,25);
		password.setFont(new Font("Georgia",Font.BOLD,20));
		block1.add(password);
		
		JLabel CPASSWORD=new JLabel("Confirm Password");
		CPASSWORD.setBounds(50,210,250,40);
		CPASSWORD.setFont(new Font("Elephant",Font.BOLD,23));
		CPASSWORD.setForeground(Color.white);
		block1.add(CPASSWORD);
		
		
		JPasswordField cpassword=new JPasswordField();
		cpassword.setBounds(320,210,200,25);
		cpassword.setFont(new Font("Georgia",Font.BOLD,20));
		block1.add(cpassword);
		cpassword.setEchoChar('*');
		
		JButton set=new JButton("Set");
		set.setBounds(380,280,130,35);
		set.setFont(new Font("Georgia",Font.BOLD,20));	
		set.setBackground(Color.white);
		block1.add(set);
		
		JButton back=new JButton("Back");
		back.setBounds(60,280,130,35);
		back.setFont(new Font("Georgia",Font.BOLD,20));	
		back.setBackground(Color.white);
		block1.add(back);
		
			f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					new EmployeeLogin();
				}
			});
		
		set.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(password.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f,"Please set your password","Warining",2);
				}else if(cpassword.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f,"Please confirm your password","Warining",2);
				}else if(password.getText().equals(cpassword.getText()))
				{
					int t=validate(password.getText());
					if(t==1)
					{
						try
						{
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
							Statement st=con.createStatement();
							st.executeUpdate("update employeelogin set password='"+password.getText()+"' where id="+ForgetEmployeeD.ep);
							JOptionPane.showMessageDialog(f,"Password changed","Sucessful",1);
							new EmployeeLogin();
							f.setVisible(false);
						}catch(Exception e){System.out.println(e);}
					}else
					{
						JOptionPane.showMessageDialog(f,"Password contain atleaset\nOne Capital Letter\nOne small Letter\nOne Digit\nOne special Symbol","Warining",2);
					}
					
				}else
				{
					JOptionPane.showMessageDialog(f,"Password does not match","Mismatch",0);
				}
			}
		});
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new EmployeeLogin();
				f.setVisible(false);
			}
		});
		f.setVisible(true);
	}
	int validate(String s)	
	{	
		 int start=0;
         int end=s.length();
		 char ch[]=new char [end-start];
		 s.getChars(start,end,ch,0);
		 
		 a=b=c=d=e=0;
		 for(int i=0;i<end;i++)
		 {
			 if(ch[i]>=65&&ch[i]<=90)
			{
				//capital letter
				a=1;
			}
			if(ch[i]>=97&&ch[i]<=122)
			{
				//Small letter    
				b=1;
            }
			if(ch[i]>=48&&ch[i]<=57)
			{
				//digit
				c=1;
			}
			if(ch[i]==32)
			{
				//Space
				d=1;
            }
			if(ch[i]>32&&ch[i]<=38||ch[i]==64)
			{ 
            
				//Special Symbol
				e=1;
			}
         	 
		 }
		 if(a==1)
		 {
			 if(b==1)
			 {
				if(c==1)
				{
					if(e==1)
					{
						
						return 1;
						//System.out.println("Hello");
					}
				}
			 }
		 }
	
		return 0;
	}
}

class ResetPassword
{
	JFrame f;
	JLabel block1;
	int a,b,c,d,e;
	ResetPassword()
	{
		f=new JFrame("Forget Password");
		f.setBounds(750,70,600,500);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ImageIcon fimg=new ImageIcon("icon1.png");
		f.setIconImage(fimg.getImage());
	    f.setLayout(null);
		f.setResizable(false);
		
		block1=new JLabel("");
		block1.setBounds(0,0,600,750);
		block1.setBackground(new Color(05,45,67));
		block1.setOpaque(true);
		f.add(block1);
		
		
		
		JLabel rms=new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		rms.setBounds(25,10,600,30);
		rms.setFont(new Font("Cooper Black",Font.BOLD,25));
		rms.setForeground(Color.white);
		block1.add(rms);
			
		JLabel ID=new JLabel("Your ID");
		ID.setBounds(50,70,200,40);
		ID.setFont(new Font("Elephant",Font.BOLD,23));
		ID.setForeground(Color.white);
		block1.add(ID);
		
		JLabel id=new JLabel("ID");
		id.setBounds(320,75,200,25);
		id.setFont(new Font("Elephant",Font.BOLD,23));
		id.setForeground(Color.yellow);
		block1.add(id);
		id.setText(EmployeeLogin.ep);
		
		JLabel NAME=new JLabel("Your Name");
		NAME.setBounds(50,120,200,40);
		NAME.setFont(new Font("Elephant",Font.BOLD,23));
		NAME.setForeground(Color.white);
		block1.add(NAME);
		
		JLabel name=new JLabel("Name");
		name.setBounds(320,120,200,25);
		name.setForeground(Color.yellow);
		name.setFont(new Font("Elephant",Font.BOLD,23));
		block1.add(name);
		name.setText(EmployeeLogin.epn);
		
		JLabel PASSWORD=new JLabel("Password");
		PASSWORD.setBounds(50,165,200,40);
		PASSWORD.setFont(new Font("Elephant",Font.BOLD,23));
		PASSWORD.setForeground(Color.white);
		block1.add(PASSWORD);
		
		JTextField password=new JTextField();
		password.setBounds(320,165,200,25);
		password.setFont(new Font("Georgia",Font.BOLD,20));
		block1.add(password);
		
		JLabel CPASSWORD=new JLabel("Confirm Password");
		CPASSWORD.setBounds(50,210,250,40);
		CPASSWORD.setFont(new Font("Elephant",Font.BOLD,23));
		CPASSWORD.setForeground(Color.white);
		block1.add(CPASSWORD);
		
		
		JPasswordField cpassword=new JPasswordField();
		cpassword.setBounds(320,210,200,25);
		cpassword.setFont(new Font("Georgia",Font.BOLD,20));
		block1.add(cpassword);
		cpassword.setEchoChar('*');
		
		JButton set=new JButton("Set");
		set.setBounds(380,280,130,35);
		set.setFont(new Font("Georgia",Font.BOLD,20));	
		set.setBackground(Color.white);
		block1.add(set);
		
		JButton back=new JButton("Back");
		back.setBounds(60,280,130,35);
		back.setFont(new Font("Georgia",Font.BOLD,20));	
		back.setBackground(Color.white);
		block1.add(back);

		f.addWindowListener(new java.awt.event.WindowAdapter()
			{
				public void windowClosing(java.awt.event.WindowEvent windowEvent)
				{
					Employee.f.setEnabled(true);
				}
			});
		set.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(password.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f,"Please set your password","Warining",2);
				}else if(cpassword.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f,"Please confirm your password","Warining",2);
				}else if(password.getText().equals(cpassword.getText()))
				{
					int t=validate(password.getText());
					if(t==1)
					{
						try
						{
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","1234");
							Statement st=con.createStatement();
							st.executeUpdate("update employeelogin set password='"+password.getText()+"' where id="+EmployeeLogin.ep);
							JOptionPane.showMessageDialog(f,"Password changed","Sucessful",1);
							Employee.f.setEnabled(true);
							f.setVisible(false);
						}catch(Exception e){System.out.println(e);}
					}else
					{
						JOptionPane.showMessageDialog(f,"Password contain atleaset\nOne Capital Letter\nOne small Letter\nOne Digit\nOne special Symbol","Warining",2);
					}
					
				}else
				{
					JOptionPane.showMessageDialog(f,"Password does not match","Mismatch",0);
				}
			}
		});
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				Employee.f.setEnabled(true);
				f.setVisible(false);
			}
		});
		f.setVisible(true);
	}
	int validate(String s)	
	{	
		 int start=0;
         int end=s.length();
		 char ch[]=new char [end-start];
		 s.getChars(start,end,ch,0);
		 
		 a=b=c=d=e=0;
		 for(int i=0;i<end;i++)
		 {
			 if(ch[i]>=65&&ch[i]<=90)
			{
				//capital letter
				a=1;
			}
			if(ch[i]>=97&&ch[i]<=122)
			{
				//Small letter    
				b=1;
            }
			if(ch[i]>=48&&ch[i]<=57)
			{
				//digit
				c=1;
			}
			if(ch[i]==32)
			{
				//Space
				d=1;
            }
			if(ch[i]>32&&ch[i]<=38||ch[i]==64)
			{ 
            
				//Special Symbol
				e=1;
			}
         	 
		 }
		 if(a==1)
		 {
			 if(b==1)
			 {
				if(c==1)
				{
					if(e==1)
					{
						
						return 1;
						//System.out.println("Hello");
					}
				}
			 }
		 }
	
		return 0;
	}
}

class ResetAdminPassword
{
	
}

class rms
{
	public static void main(String arg[])
	{
		new AdminEmployee();
		//new AddEmployee();
		//new RemoveEmployee();
		//new Employee();
		//new Admin();
		//new AddProduct();
		//new RemoveProduct();
		//new Employee();
		//new ForgetEmployeeD();
		//new ResetPassword();
		//new EmployeeLogin();
		//new AdminLogin();
		//new editEmployee();
		//new editProduct();
		
	}
}