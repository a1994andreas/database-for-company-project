package baseis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;



import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


	public class graphics extends JFrame implements ActionListener {
	
		static Connection con ;
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost/tel33";
		// Database credentials
		static final String USER = "username";
		static final String PASS = "password";
		
		
		String tname,taddress,addressnum,tphone,tmail,tacnum,tcreditcard;
		String degree,language,ability,ijob;
		private JMenuBar menubar;
		
		private JMenu menu1,menu3;
		
		private        JMenuItem request1, request2, request3, request4, request5, request6,request7;
		private static JMenuItem help;
		private        JMenuItem manual = new JMenuItem("Manual");
		private        JMenuItem about = new JMenuItem("System Information");
		
		JButton ok2 = new JButton();
		 private JTextArea IDtext,inid;
		 private JMenuBar indbar;
		 private JMenu abmenu,lanmenu,titmenu;
		
	   JFrame matchf = new JFrame();
	   JTextArea job,emp;
		 
	
		
	   public graphics(Connection con){
	
			super("parathiri");
		   this.con = con;
			System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEE\n");
			setSize(1024, 768);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			ok2.setText("Ok");
			ok2.setBounds(170, 300, 50,50);
			
			JPanel p = new JPanel();
			JPanel p2 = new JPanel();
	
			JLabel label = new JLabel("asdasda");
			JTextArea tb = new JTextArea("aaaaa");
	
			p2.add(label);
			p2.add(tb);
			
			JPanel p3 = new JPanel( new GridBagLayout());
			
			JTextField textfield = new JTextField("text field");

			menubar=new JMenuBar();
	        menu1 = new JMenu("Requests");
	        menu1.addActionListener(this );
	        menubar.add(menu1);
	       
	        menu3 = new JMenu("Help");
	        menu3.addActionListener(this );
	        menubar.add(menu3);
	        
	        request1 = new JMenuItem(" Sign up");
	        request1.addActionListener(this );
	        menu1.add( request1);
	        
	        request2 = new JMenuItem(" offer job ");
	        request2.addActionListener(this );
	        menu1.add( request2);
	        
	        
	        request3 = new JMenuItem("  add request ");
	        request3.addActionListener(this );
	        menu1.add( request3);

	        request4 = new JMenuItem(" supply and demand");
	        request4.addActionListener(this );
	        menu1.add( request4);
	        
	        request5 = new JMenuItem(" Contact with companies");
	        request5.addActionListener(this );
	        menu1.add( request5);
	        
	        request6 = new JMenuItem(" pay");
	        request6.addActionListener(this );
	        menu1.add( request6);

	        request7 = new JMenuItem(" find job");
	        request7.addActionListener(this );
	        menu1.add( request7);
	       
	        about.addActionListener(this );
	        menu3.add(about);
		    setJMenuBar(menubar);
  
	        manual.addActionListener(this );
	        menu3.add(manual);
		    setJMenuBar(menubar);

		    text_area a = new text_area("");
		    add(a.GetJTextArea());
		    
		    IDtext=new JTextArea(" COMPLETE YOUR ID ");
		    IDtext.setBackground(Color.GRAY);
			IDtext.setBounds(10, 100, 500, 22);
			IDtext.setEditable(false);
	
			inid=new JTextArea();
		    inid.setBackground(Color.white);
			inid.setBounds(10, 122, 500, 22);
			inid.setEditable(true);
			
			 
		
	    	
	    	
	    	 matchf = new JFrame();
				matchf.setLayout(null);
			    matchf.setSize(1024,768);
				matchf.getContentPane().setLayout(null);
		   		matchf.setBackground(Color.white);
 			matchf.setVisible(false);
 		
 		
    		
 		 job = new JTextArea("     JOB-TADE      ");
 		 emp = new JTextArea ("EMPLOY1 \n EMPLOY2\n EMPLOYN \n");
 			
 			job.setBounds(10, 50, 500, 22);
				job.setEditable(false);
				job.setBackground(Color.GRAY);
				job.setVisible(true);
	    		
			
		 }
		
		
		 public void actionPerformed(ActionEvent E){
			 
			 
			 
			 if(E.getSource() ==  request1){
					
				 
					JFrame formWin = new JFrame();
					formWin.setLayout(null);
				    formWin.setSize(600,600);
					formWin.getContentPane().setLayout(null);
			   		formWin.setBackground(Color.white);
	    			formWin.setVisible(true);
	    			
	    			JTextArea name=new JTextArea();
	    			JTextArea address=new JTextArea();
	    			JTextArea phone=new JTextArea();
	    			JTextArea mail=new JTextArea();
	    			JTextArea accountNO=new JTextArea();
	    			JTextArea ccinfo = new JTextArea();
	    			JTextArea num=new JTextArea();
	    			
	    			JTextArea TAnum=new JTextArea("            ADDRESS NUMBER ");
	    			TAnum.setBackground(Color.lightGray);
	    			TAnum.setBounds(280, 89, 240, 35);
	    			TAnum.setEditable(false);
	    			
	    			num.setBackground(Color.white);
	    			num.setBounds(280,125, 240, 40);
	    			num.setEditable(true);
	    			
	    			JTextArea TAname=new JTextArea("                  NAME ");
	    			TAname.setBackground(Color.lightGray);
	    			TAname.setBounds(20, 14, 500, 35);
	    			TAname.setEditable(false);

	    			name.setBackground(Color.white);
	    			name.setBounds(20,49, 500, 40);
	    			name.setEditable(true);
	    			
	    			JTextArea TAaddress=new JTextArea("                 ADDRESS ");
	    			TAaddress.setBackground(Color.lightGray);
	    			TAaddress.setBounds(20, 89, 250, 35);
	    			TAaddress.setEditable(false);
	    			
	    			address.setBackground(Color.white);
	    			address.setBounds(20,125, 250, 40);
	    			address.setEditable(true);
	    			
	    			JTextArea TAphone=new JTextArea("                 PHONE ");
	    			TAphone.setBackground(Color.lightGray);
	    			TAphone.setBounds(20, 165, 500, 35);
	    			TAphone.setEditable(false);
	    			
	    			phone.setBackground(Color.white);
	    			phone.setBounds(20,200, 500, 40);
	    			phone.setEditable(true);
	    			
	    			
	    			JTextArea TAmail=new JTextArea("                E-MAIL ");
	    			TAmail.setBackground(Color.lightGray);
	    			TAmail.setBounds(20, 240, 500, 35);
	    			TAmail.setEditable(false);
	    			
	    			mail.setBackground(Color.white);
	    			mail.setBounds(20,275, 500, 40);
	    			mail.setEditable(true);
	    			
	    			JTextArea TAaccountNO=new JTextArea("                ACCOUNT NUMBER ");
	    			TAaccountNO.setBackground(Color.lightGray);
	    			TAaccountNO.setBounds(20, 315, 500, 35);
	    			TAaccountNO.setEditable(false);
	    			
	    			accountNO.setBackground(Color.white);
	    			accountNO.setBounds(20,350, 500, 40);
	    			accountNO.setEditable(true);
	    			
	    			JTextArea TAccinfo=new JTextArea("          CREDIT CARD LINE ");
	    			TAccinfo.setBackground(Color.lightGray);
	    			TAccinfo.setBounds(20, 390, 500, 35);
	    			TAccinfo.setEditable(false);
	    			
	    			ccinfo.setBackground(Color.white);
	    			ccinfo.setBounds(20,425, 500, 40);
	    			ccinfo.setEditable(true);
	    			
	    			
	    			
	    			formWin.add(TAmail);
	    			formWin.add(mail);
	    			formWin.add(accountNO);
	    			formWin.add(TAphone);
	    			formWin.add(phone);
	    			formWin.add(address);
	    			formWin.add(name);
	    			formWin.add(TAname);
	    			formWin.add(TAaddress);
	    			
	    			formWin.add(TAaccountNO);
	    			
	    			formWin.add(TAccinfo);
	    			formWin.add(ccinfo);
	    			
	    			formWin.add(TAnum);
	    			formWin.add(num);

	    			JButton excomp = new JButton();
	    			excomp.setText("   ADD STORE   ");
	    			excomp.setBackground(Color.CYAN);
	    			excomp.setBounds(190, 480, 180 , 60);
	    		
	    			excomp.addActionListener(new ActionListener(){
	    				
						@Override
						public void actionPerformed(ActionEvent arg0) {
							formWin.dispose();
							
							JFrame addWin = new JFrame();
							addWin.setLayout(null);
						    addWin.setSize(600,600);
							addWin.getContentPane().setLayout(null);
					   		addWin.setBackground(Color.white);
			    			addWin.setVisible(true);
			    			
			    			JTextArea city=new JTextArea("               CITY ");
			    			city.setBackground(Color.GRAY);
			    			city.setBounds(20, 325, 500, 35);
			    			city.setEditable(false);
			    			
			    			JTextArea TAcity=new JTextArea();
			    			TAcity.setBackground(Color.white);
			    			TAcity.setBounds(20, 360, 500, 35);
			    			TAcity.setEditable(true);
			    			
			    			IDtext.setBounds(20,20,500,30);
			    			inid.setBounds(20,50,500,35);
			    			//IDtext.setBounds(10,110,500,22);
			    			addWin.add(TAcity);
			    			addWin.add(city);
			    			addWin.add(inid);
			    			addWin.add(IDtext);
			    			addWin.add(address);
			    			addWin.add(TAaddress);
			    			addWin.add(num);
			    			addWin.add(TAmail);
			    			addWin.add(mail);
			    			addWin.add(TAphone);
			    			addWin.add(phone);
			    			addWin.add(TAnum);
			    			
			    			JButton storeb = new JButton();
			    			storeb.setText("ADD");
			    			storeb.setBounds(170, 450, 50,50);
			    			
			    			storeb.addActionListener(new ActionListener(){
			    				
								@Override
								public void actionPerformed(ActionEvent arg0) {
									// na ftiaksw tou ID ta bounds
									PreparedStatement create;
									String sql="INSERT INTO store(cid , city, c_addr_num, c_addr , c_phone, c_email) VALUES("+ Integer.parseInt(inid.getText())+",'"+TAcity.getText()+"',"
			    							+num.getText()+",'"+address.getText()+"',"+phone.getText()+",'"+mail.getText()+"')";

									try {
										JFrame pop = new JFrame();
								 		 
											
										create = con.prepareStatement(sql);
										create.executeUpdate();
								
									} catch (SQLException e) {
										// TODO Auto-generated catch block
										
										e.printStackTrace();
									}
									addWin.dispose();
								}
			    			});
								
			    			addWin.add(storeb);

						}
	    				
	    			});

	    			JButton Bcompany = new JButton();
	    			Bcompany.setText("   COMPANY   ");
	    			Bcompany.setBackground(Color.green);
	    			Bcompany.setBounds(10, 480, 180 , 60);
	    			Bcompany.addActionListener(new ActionListener(){
	
						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							// edw stelnoume ta stoixeia
							// kai na mn stelnei malakies
							formWin.dispose();				

							JFrame comWin = new JFrame();
							comWin.setLayout(null);
						    comWin.setSize(600,600);
							comWin.getContentPane().setLayout(null);
					   		comWin.setBackground(Color.white);
			    			comWin.setVisible(true);
			    			
			    			JTextArea city=new JTextArea("               CITY ");
			    			city.setBackground(Color.GRAY);
			    			city.setBounds(20, 15, 500, 35);
			    			city.setEditable(false);
			    			
			    			JTextArea TAcity=new JTextArea();
			    			TAcity.setBackground(Color.white);
			    			TAcity.setBounds(20, 50, 500, 35);
			    			TAcity.setEditable(true);

			    			JButton compb = new JButton();
			    			compb.setText("ADD");
			    			compb.setBounds(170, 300, 50,50);
			    			
			    			compb.addActionListener(new ActionListener(){
			    					public void actionPerformed(ActionEvent arg0) {
			    						try {
			    							 con = DriverManager.getConnection(DB_URL , USER , PASS);
			    							
			    						} catch (SQLException e) {
			    							// TODO Auto-generated catch block
			    							e.printStackTrace();
			    						}
			    						
			    						String sql1="INSERT INTO company(c_name,c_account_num,c_credit_info)"
				    							+ " VALUES('" +name.getText().toString()+"',"+Integer.parseInt(accountNO.getText())
				    							+",'"+ccinfo.getText().toString()+"')";
				    					
				    					PreparedStatement create;
										try {
											JFrame pop = new JFrame();
									 		   JTextArea TApop;
									 			 pop = new JFrame();
													pop.setLayout(null);
												    pop.setSize(300,300);
													pop.getContentPane().setLayout(null);
											   		pop.setBackground(Color.white);
												pop.setVisible(false);

												TApop = new JTextArea();
												TApop.setBounds(100, 100, 100, 30);
												
												TApop.setEditable(false);
												TApop.setBackground(Color.GRAY);
												TApop.setVisible(true);
												pop.add(TApop);
												
											create = con.prepareStatement(sql1);
											create.executeUpdate();
											String sql2="SELECT MAX(cid) FROM company";
											create = con.prepareStatement(sql2);
											ResultSet rs = create.executeQuery();
											rs.next();
											int aa = rs.getInt("MAX(cid)");
											System.out.println(aa);
											TApop.setText(" To id sou einai "+aa);
											pop.setVisible(true);
											
					    					String sql3="INSERT INTO store(cid , city, c_addr_num, c_addr , c_phone, c_email) VALUES("+aa+",'"+TAcity.getText()+"',"
					    							+num.getText()+",'"+address.getText()+"',"+phone.getText()+",'"+mail.getText()+"')";

											create = con.prepareStatement(sql3);
											create.executeUpdate();
										} catch (SQLException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								
		comWin.dispose();					
	}
	
});
			    			comWin.add(compb);
							comWin.add(city);
							comWin.add(TAcity);

							
						}
	    				
	    			});
	    			formWin.add(Bcompany); 
	    			
	    			JButton Bind = new JButton();
	    			Bind.setText(" INDIVIDUAL ");
	    			Bind.setBackground(Color.red);
	    			Bind.setBounds(370, 480, 200 , 60);
	    			
	    			  
	    			
	    			
	    			Bind.addActionListener(new ActionListener(){
	
						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							// edw stelnoume ta stoixeia
							// kai na mn stelnei malakies
							
		    				
							tname = name.getText();
			    			taddress = address.getText();
			    			addressnum = num.getText();
			    			tphone = phone.getText();
			    			tmail = mail.getText();
			    			tacnum =  accountNO.getText();
			    			tcreditcard = ccinfo.getText();
		
							formWin.dispose();	
	
							JFrame indWin = new JFrame();
							indWin.setLayout(null);
						    indWin.setSize(600,600);
							indWin.getContentPane().setLayout(null);
					   		indWin.setBackground(Color.white);
			    			indWin.setVisible(true);
			    			
			    			JFrame indWin2 = new JFrame();
							indWin2.setLayout(null);
						    indWin2.setSize(600,600);
							indWin2.getContentPane().setLayout(null);
					   		indWin2.setBackground(Color.white);
			    			indWin2.setVisible(false);
	
	
			    			JTextArea job = new JTextArea();
			    			JTextArea TAjob=new JTextArea("         ADD YOUR JOB ");
			    			TAjob.setBackground(Color.lightGray);
			    			TAjob.setBounds(20, 14, 500, 35);
			    			TAjob.setEditable(false);

			    			job.setBackground(Color.white);
			    			job.setBounds(20,49, 500, 40);
			    			job.setEditable(true);
	
			    		    JMenuItem tit1,tit2,tit3,tit4,tit5,tit6,tit7,tit8,tit9,tit10;
			    		    JMenuItem ab1,ab2,ab3,ab4,ab5,ab6,ab7,ab8,ab9,ab10;
			    		    JMenuItem lan1,lan2,lan3,lan4,lan5,lan6,lan7,lan8,lan9,lan10;
			    			 indbar = new JMenuBar();
			    			 abmenu = new JMenu();
			    			 lanmenu = new JMenu();
			    			 titmenu = new JMenu();
			    			 
			    			  ab1 = new JMenuItem("ABILITY1");
			        		 ab2 = new JMenuItem("ABILITY2");
			        		 ab3 = new JMenuItem("ABILITY3");
			        		 ab4 = new JMenuItem("ABILITY4");
			        		 ab5 = new JMenuItem("ABILITY5");
			        		 ab6 = new JMenuItem("ABILITY6");
			        		 ab7 = new JMenuItem("ABILITY7");
			        		 ab8 = new JMenuItem("ABILITY8");
			        		 ab9 = new JMenuItem("ABILITY9");
			        		 ab10 = new JMenuItem("ABILITY10");
			        		 
			        		  lan1 = new JMenuItem("LANGUAGE1");
			    	    	  lan2 = new JMenuItem("LANGUAGE2");
			    	    	  lan3 = new JMenuItem("LANGUAGE3");
			    	    	  lan4 = new JMenuItem("LANGUAGE4");
			    	    	  lan5 = new JMenuItem("LANGUAGE5");
			    	    	  lan6 = new JMenuItem("LANGUAGE6");
			    	    	  lan7 = new JMenuItem("LANGUAGE7");
			    	    	  lan8 = new JMenuItem("LANGUAGE8");
			    	    	  lan9 = new JMenuItem("LANGUAGE9");
			    	    	  lan10 = new JMenuItem("LANGUAGE10");
			        		 
			    	    	  	 tit1 = new JMenuItem("TITLE1");
			    	    		 tit2 = new JMenuItem("TITLE2");
			    	    		 tit3 = new JMenuItem("TITLE3");
			    	    		 tit4 = new JMenuItem("TITLE4");
			    	    		 tit5 = new JMenuItem("TITLE5");
			    	    		 tit6 = new JMenuItem("TITLE6");
			    	    		 tit7 = new JMenuItem("TITLE7");
			    	    		 tit8 = new JMenuItem("TITLE8");
			    	    		 tit9 = new JMenuItem("TITLE9");
			    	    		 tit10 = new JMenuItem("TITLE10");
			    	    		
			    	    		titmenu.add(tit1);
			    	    		titmenu.add(tit2);
			    	    		titmenu.add(tit3);
			    	    		titmenu.add(tit4);
			    	    		titmenu.add(tit5);
			    	    		titmenu.add(tit6);
			    	    		titmenu.add(tit7);
			    	    		titmenu.add(tit8);
			    	    		titmenu.add(tit9);
			    	    		titmenu.add(tit10);
			    	    		
			    	    		
			        		abmenu.add(ab1);
			    	    	abmenu.add(ab2);
			    	    	abmenu.add(ab3);
			    	    	abmenu.add(ab4);
			    	    	abmenu.add(ab5);
			    	    	abmenu.add(ab6);
			    	    	abmenu.add(ab7);
			    	    	abmenu.add(ab8);
			    	    	abmenu.add(ab9);
			    	    	abmenu.add(ab10);
			    	    	
			    	    	lanmenu.add(lan1);
			        		lanmenu.add(lan2);
			        		lanmenu.add(lan3);
			        		lanmenu.add(lan4);
			        		lanmenu.add(lan5);
			        		lanmenu.add(lan6);
			        		lanmenu.add(lan7);
			        		lanmenu.add(lan8);
			        		lanmenu.add(lan9);
			        		lanmenu.add(lan10);
			        		
			        		indbar.add(titmenu);
			        		indbar.add(lanmenu);
			    	    	indbar.add(abmenu);
			    	    	indbar.setVisible(true);
			    	    	
			    			abmenu.setText("ADD YOUR ABILITIES");
			   			 	lanmenu.setText("ADD YOUR LANGUAGES");
			   			 	titmenu.setText("ADD YOUR DEGREES");
					    		 
			   			//=============== ab listeners =========================================//		
				    		ab1.addActionListener(new ActionListener(){
				    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
										

									    String sql1="INSERT INTO skills(iid,skill)"
				    							+ " VALUES(" +aa+",'"+ab1.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(ab1.getText());
									ab1.setVisible(false);
								}
			    			});
				    		ab2.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    
									    String sql1="INSERT INTO skills(iid,skill)"
				    							+ " VALUES(" +aa+",'"+ab2.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(ab2.getText());
										ab2.setVisible(false);
								}
			    			});
				    		ab3.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO skills(iid,skill)"
				    							+ " VALUES(" +aa+",'"+ab3.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(ab3.getText());
										ab3.setVisible(false);
								}
			    			});
				    		ab4.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO skills(iid,skill)"
				    							+ " VALUES(" +aa+",'"+ab4.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(ab4.getText());
										ab4.setVisible(false);
								}
			    			});
				    		ab5.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO skills(iid,skill)"
				    							+ " VALUES(" +aa+",'"+ab5.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(ab5.getText());
										ab5.setVisible(false);
								}
			    			});
				    		ab6.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO skills(iid,skill)"
				    							+ " VALUES(" +aa+",'"+ab6.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(ab6.getText());
										ab6.setVisible(false);
								}
			    			});
				    		ab7.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO skills(iid,skill)"
				    							+ " VALUES(" +aa+",'"+ab7.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(ab7.getText());
										ab7.setVisible(false);
								}
			    			});
				    		ab8.addActionListener(new ActionListener(){
				    			
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO skills(iid,skill)"
				    							+ " VALUES(" +aa+",'"+ab8.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(ab8.getText());
										ab8.setVisible(false);
								}
			    			});
				    		ab9.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO skills(iid,skill)"
				    							+ " VALUES(" +aa+",'"+ab9.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(ab9.getText());
										ab9.setVisible(false);
								}
			    			});
				    		ab10.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO skills(iid,skill)"
				    							+ " VALUES(" +aa+",'"+ab10.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(ab10.getText());
										ab10.setVisible(false);
								}
			    			});
    			
									
				    //=========================================================================// 		
			  
				   //=============== lan listeners =========================================//		
				    		lan1.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO languages(iid,language)"
				    							+ " VALUES(" +aa+",'"+lan1.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(lan1.getText());
										lan1.setVisible(false);
								}
			    			});
				    		lan2.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO languages(iid,language)"
				    							+ " VALUES(" +aa+",'"+lan2.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(lan2.getText());
										lan2.setVisible(false);
								}
			    			});
				    		lan3.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO languages(iid,language)"
				    							+ " VALUES(" +aa+",'"+lan3.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(lan3.getText());
										lan3.setVisible(false);
								}
			    			});
				    		lan4.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO languages(iid,language)"
				    							+ " VALUES(" +aa+",'"+lan4.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(lan4.getText());
										lan4.setVisible(false);
								}
			    			});
				    		lan5.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO languages(iid,language)"
				    							+ " VALUES(" +aa+",'"+lan5.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(lan5.getText());
										lan5.setVisible(false);
								}
			    			});
				    		lan6.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO languages(iid,language)"
				    							+ " VALUES(" +aa+",'"+lan6.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(lan6.getText());
										lan6.setVisible(false);
								}
			    			});
				    		lan7.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO languages(iid,language)"
				    							+ " VALUES(" +aa+",'"+lan7.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(lan7.getText());
										lan7.setVisible(false);
								}
			    			});
				    		lan8.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO languages(iid,language)"
				    							+ " VALUES(" +aa+",'"+lan8.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(lan8.getText());
										lan8.setVisible(false);
								}
			    			});
				    		lan9.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO languages(iid,language)"
				    							+ " VALUES(" +aa+",'"+lan9.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(lan9.getText());
										lan9.setVisible(false);
								}
			    			});
				    		lan10.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO languages(iid,language)"
				    							+ " VALUES(" +aa+",'"+lan10.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(lan10.getText());
										lan10.setVisible(false);
								}
			    			});
    			
				   //=========================================================================// 	
				    		
				   //=============== tit listeners =========================================//		
				    		tit1.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO titles(iid,title)"
				    							+ " VALUES(" +aa+",'"+tit1.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(tit1.getText());
										tit1.setVisible(false);
								}
			    			});
				    		tit2.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO titles(iid,title)"
				    							+ " VALUES(" +aa+",'"+tit2.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(tit2.getText());
										tit2.setVisible(false);
								}
			    			});
				    		tit3.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO titles(iid,title)"
				    							+ " VALUES(" +aa+",'"+tit3.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(tit3.getText());
										tit3.setVisible(false);
								}
			    			});
				    		tit4.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO titles(iid,title)"
				    							+ " VALUES(" +aa+",'"+tit4.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(tit4.getText());
										tit4.setVisible(false);
								}
			    			});
				    		tit5.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO titles(iid,title)"
				    							+ " VALUES(" +aa+",'"+tit5.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(tit5.getText());
										tit5.setVisible(false);
								}
			    			});
				    		tit6.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {	
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO titles(iid,title)"
				    							+ " VALUES(" +aa+",'"+tit6.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(tit6.getText());
										tit6.setVisible(false);
								}
			    			});
				    		tit7.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO titles(iid,title)"
				    							+ " VALUES(" +aa+",'"+tit7.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(tit7.getText());
										tit7.setVisible(false);
								}
			    			});
				    		tit8.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO titles(iid,title)"
				    							+ " VALUES(" +aa+",'"+tit8.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(tit8.getText());
										tit8.setVisible(false);
								}
			    			});
				    		tit9.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO titles(iid,title)"
				    							+ " VALUES(" +aa+",'"+tit9.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(tit9.getText());
										tit9.setVisible(false);
								}
			    			});
				    		tit10.addActionListener(new ActionListener(){
					    		
								public void actionPerformed(ActionEvent arg0) {
									String sql21= "SELECT MAX(iid) FROM individuals";
					    			PreparedStatement create3,create31;
		                            
					    			try {
										create3 = con.prepareStatement(sql21);
										ResultSet rs = create3.executeQuery();
										rs.next();
									    int aa = rs.getInt("MAX(iid)");
									    String sql1="INSERT INTO titles(iid,title)"
				    							+ " VALUES(" +aa+",'"+tit10.getText()+"')";
										create31 = con.prepareStatement(sql1);
									    create31.executeUpdate();

									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println(tit10.getText());
										ab10.setVisible(false);
								}
			    			});
					    		JButton ok2 = new JButton();
								ok2.setText("Ok");
								ok2.setBounds(170, 300, 50,50);	
					    		ok2.addActionListener(new ActionListener(){
									public void actionPerformed(ActionEvent arg0) {
										
										
										PreparedStatement create;
										String sql="INSERT INTO individuals(i_name, i_phone,i_email, i_addr_num, i_addr, i_job, i_account_num, i_credit_info,available) "
												+ "VALUES('"+tname+"',"+Double.parseDouble(tphone)+",'"+tmail+"',"+Integer.parseInt(addressnum)+",'"+
												taddress+"','"+job.getText()+"',"+Double.parseDouble(tacnum)+",'"+tcreditcard+"','"+"0NOW"+"')";
				    							
										try {
											
											JFrame pop = new JFrame();
									 		   JTextArea TApop;
									 			 pop = new JFrame();
													pop.setLayout(null);
												    pop.setSize(300,300);
													pop.getContentPane().setLayout(null);
											   		pop.setBackground(Color.white);
												pop.setVisible(false);
												pop.setLocation(600,600);
												TApop = new JTextArea();
												TApop.setBounds(100, 100, 100, 30);
												
												TApop.setEditable(false);
												TApop.setBackground(Color.GRAY);
												TApop.setVisible(true);
												pop.add(TApop);
												
											create = con.prepareStatement(sql);
											create.executeUpdate();
											String sql2="SELECT MAX(iid) FROM individuals";
											create = con.prepareStatement(sql2);
											ResultSet rs = create.executeQuery();
											rs.next();
											int aa = rs.getInt("MAX(iid)");
											System.out.print(aa);
											TApop.setText(" To id sou einai "+aa);
											pop.setVisible(true);
											
										} catch (SQLException e) {
											// TODO Auto-generated catch block
											
											e.printStackTrace();
										}
										
										
										tname = null;
						    			taddress = null;
						    			addressnum = null;
						    			tphone = null;
						    			tmail = null;
						    			tacnum =  null;
						    			tcreditcard = null;
						    			indWin2.setVisible(true);
										indWin.dispose();
										
									}	
				    			});
					    		
					    		JButton ok = new JButton();
								ok.setText("Ok");
								ok.setBounds(170, 300, 50,50);
					//=========================================================================// 	
					    		ok.addActionListener(new ActionListener(){
									public void actionPerformed(ActionEvent arg0) {
										ab1.setVisible(true);
										ab2.setVisible(true);
										ab3.setVisible(true);
										ab4.setVisible(true);
										ab5.setVisible(true);
										ab6.setVisible(true);
										ab7.setVisible(true);
										ab8.setVisible(true);
										ab9.setVisible(true);
										ab10.setVisible(true);
										
										tit1.setVisible(true);
										tit2.setVisible(true);
										tit3.setVisible(true);
										tit4.setVisible(true);
										tit5.setVisible(true);
										tit6.setVisible(true);
										tit7.setVisible(true);
										tit8.setVisible(true);
										tit9.setVisible(true);
										tit10.setVisible(true);
									
										lan1.setVisible(true);
										lan2.setVisible(true);
										lan3.setVisible(true);
										lan4.setVisible(true);
										lan5.setVisible(true);
										lan6.setVisible(true);
										lan7.setVisible(true);
										lan8.setVisible(true);
										lan9.setVisible(true);
										lan10.setVisible(true);

										indWin2.dispose();					
									}
				    			});
					    		indWin.add(ok2);
					    		indWin2.add(ok);
					    		indWin.add(job);
					    		indWin.add(TAjob);
			    			    indWin2.setJMenuBar(indbar);
						}	
			    			});
			    			
			    		formWin.add(excomp);
	    			formWin.add(Bind); 
		        }
			 
			 
			 
			 //==== aithma idiwth gia douleia ====//
			 if(E.getSource() ==  request2){
			
				 

				 JFrame offerjob = new JFrame();
					offerjob.setLayout(null);
				    offerjob.setSize(600,600);
					offerjob.getContentPane().setLayout(null);
			   		offerjob.setBackground(Color.white);
	    			offerjob.setVisible(true);
	    			

					 JFrame adds = new JFrame();
						adds.setLayout(null);
					    adds.setSize(600,600);
						adds.getContentPane().setLayout(null);
				   		adds.setBackground(Color.white);
		    			adds.setVisible(false);
	    			
	    			JTextArea city=new JTextArea("               CITY ");
	    			city.setBackground(Color.GRAY);
	    			city.setBounds(10, 20, 500, 35);
	    			city.setEditable(false);
	    			
	    			JTextArea TAcity=new JTextArea();
	    			TAcity.setBackground(Color.white);
	    			TAcity.setBounds(10, 55, 500, 35);
	    			TAcity.setEditable(true);
	    			
	    			
	    			
	    			JTextArea TAtime=new JTextArea("               HOURS ");
	    			TAtime.setBackground(Color.GRAY);
	    			TAtime.setBounds(10, 90, 500, 22);
	    			TAtime.setEditable(false);
	    			
	    			JTextArea time = new JTextArea();
	    			time.setBackground(Color.white);
	    			time.setBounds(10, 112, 500, 22 );
	    			time.setEditable(true);
	    			
	    			JTextArea TAsalary=new JTextArea("               SALARY ");
	    			TAsalary.setBackground(Color.GRAY);
	    			TAsalary.setBounds(10, 134, 500, 22);
	    			TAsalary.setEditable(false);
	    			
	    			JTextArea salary = new JTextArea();
	    			salary.setBackground(Color.white);
	    			salary.setBounds(10, 156, 500, 22 );
	    			salary.setEditable(true);
	    			
	    			JTextArea TAdeadline=new JTextArea("               DEADLINE ");
	    			TAdeadline.setBackground(Color.GRAY);
	    			TAdeadline.setBounds(10, 178, 500, 22);
	    			TAdeadline.setEditable(false);
	    			
	    			JTextArea deadline = new JTextArea();
	    			deadline.setBackground(Color.white);
	    			deadline.setBounds(10, 200, 500, 22 );
	    			deadline.setEditable(true);
	    			
	    			JTextArea TAjob=new JTextArea("               WANTED JOB ");
	    			TAjob.setBackground(Color.GRAY);
	    			TAjob.setBounds(10, 222, 500, 22);
	    			TAjob.setEditable(false);
	    			
	    			JTextArea job = new JTextArea();
	    			job.setBackground(Color.white);
	    			job.setBounds(10, 244, 500, 22 );
	    			job.setEditable(true);
	    			
	    			IDtext.setBounds(10,266,500,22);
	    			inid.setBounds(10,288,500,22);
	    			
	    		    JMenuItem tit1,tit2,tit3,tit4,tit5,tit6,tit7,tit8,tit9,tit10;
	    		    JMenuItem ab1,ab2,ab3,ab4,ab5,ab6,ab7,ab8,ab9,ab10;
	    		    JMenuItem lan1,lan2,lan3,lan4,lan5,lan6,lan7,lan8,lan9,lan10;
	    			 indbar = new JMenuBar();
	    			 abmenu = new JMenu();
	    			 lanmenu = new JMenu();
	    			 titmenu = new JMenu();
	    			 
	    			  ab1 = new JMenuItem("ABILITY1");
	        		 ab2 = new JMenuItem("ABILITY2");
	        		 ab3 = new JMenuItem("ABILITY3");
	        		 ab4 = new JMenuItem("ABILITY4");
	        		 ab5 = new JMenuItem("ABILITY5");
	        		 ab6 = new JMenuItem("ABILITY6");
	        		 ab7 = new JMenuItem("ABILITY7");
	        		 ab8 = new JMenuItem("ABILITY8");
	        		 ab9 = new JMenuItem("ABILITY9");
	        		 ab10 = new JMenuItem("ABILITY10");
	        		 
	        		  lan1 = new JMenuItem("LANGUAGE1");
	    	    	  lan2 = new JMenuItem("LANGUAGE2");
	    	    	  lan3 = new JMenuItem("LANGUAGE3");
	    	    	  lan4 = new JMenuItem("LANGUAGE4");
	    	    	  lan5 = new JMenuItem("LANGUAGE5");
	    	    	  lan6 = new JMenuItem("LANGUAGE6");
	    	    	  lan7 = new JMenuItem("LANGUAGE7");
	    	    	  lan8 = new JMenuItem("LANGUAGE8");
	    	    	  lan9 = new JMenuItem("LANGUAGE9");
	    	    	  lan10 = new JMenuItem("LANGUAGE10");
	        		 
	    	    	  	 tit1 = new JMenuItem("TITLE1");
	    	    		 tit2 = new JMenuItem("TITLE2");
	    	    		 tit3 = new JMenuItem("TITLE3");
	    	    		 tit4 = new JMenuItem("TITLE4");
	    	    		 tit5 = new JMenuItem("TITLE5");
	    	    		 tit6 = new JMenuItem("TITLE6");
	    	    		 tit7 = new JMenuItem("TITLE7");
	    	    		 tit8 = new JMenuItem("TITLE8");
	    	    		 tit9 = new JMenuItem("TITLE9");
	    	    		 tit10 = new JMenuItem("TITLE10");
	    	    		
	    	    		titmenu.add(tit1);
	    	    		titmenu.add(tit2);
	    	    		titmenu.add(tit3);
	    	    		titmenu.add(tit4);
	    	    		titmenu.add(tit5);
	    	    		titmenu.add(tit6);
	    	    		titmenu.add(tit7);
	    	    		titmenu.add(tit8);
	    	    		titmenu.add(tit9);
	    	    		titmenu.add(tit10);
	    	    		  
	    	    		
	        		abmenu.add(ab1);
	    	    	abmenu.add(ab2);
	    	    	abmenu.add(ab3);
	    	    	abmenu.add(ab4);
	    	    	abmenu.add(ab5);
	    	    	abmenu.add(ab6);
	    	    	abmenu.add(ab7);
	    	    	abmenu.add(ab8);
	    	    	abmenu.add(ab9);
	    	    	abmenu.add(ab10);
	    	    	
	    	    	lanmenu.add(lan1);
	        		lanmenu.add(lan2);
	        		lanmenu.add(lan3);
	        		lanmenu.add(lan4);
	        		lanmenu.add(lan5);
	        		lanmenu.add(lan6);
	        		lanmenu.add(lan7);
	        		lanmenu.add(lan8);
	        		lanmenu.add(lan9);
	        		lanmenu.add(lan10);
	        		
	        		indbar.add(titmenu);
	        		indbar.add(lanmenu);
	    	    	indbar.add(abmenu);
	    	    	indbar.setVisible(true);
	    			
	    			abmenu.setText("ADD WANTED ABILITIES");
	   			 	lanmenu.setText("ADD WANTED LANGUAGES");
	   			 	titmenu.setText("ADD WANTED DEGREES");
	   			 	
	   		

		   			  //=============== ab listeners =========================================//		
			    		ab1.addActionListener(new ActionListener(){
			    				
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_skills(jid,skill)"
			    							+ " VALUES(" +aa+",'"+ab1.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								System.out.println( ab1.getText());
									ab1.setVisible(false);
							}
		    			});
			    		ab2.addActionListener(new ActionListener(){
			    			
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_skills(jid,skill)"
			    							+ " VALUES(" +aa+",'"+ab2.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
				    			
								System.out.println( ab2.getText());
									ab2.setVisible(false);
							}
		    			});
			    		ab3.addActionListener(new ActionListener(){
			    			
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_skills(jid,skill)"
			    							+ " VALUES(" +aa+",'"+ab3.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( ab3.getText());
									ab3.setVisible(false);
							}
		    			});
			    		ab4.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_skills(jid,skill)"
			    							+ " VALUES(" +aa+",'"+ab4.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( ab4.getText());
									ab4.setVisible(false);
							}
		    			});
			    		ab5.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_skills(jid,skill)"
			    							+ " VALUES(" +aa+",'"+ab5.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( ab5.getText());
									ab5.setVisible(false);
							}
		    			});
			    		ab6.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_skills(jid,skill)"
			    							+ " VALUES(" +aa+",'"+ab6.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( ab6.getText());
									ab6.setVisible(false);
							}
		    			});
			    		ab7.addActionListener(new ActionListener(){
			    			
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_skills(jid,skill)"
			    							+ " VALUES(" +aa+",'"+ab7.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( ab7.getText());
									ab7.setVisible(false);
							}
		    			});
			    		ab8.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_skills(jid,skill)"
			    							+ " VALUES(" +aa+",'"+ab8.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( ab8.getText());
									ab8.setVisible(false);
							}
		    			});
			    		ab9.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_skills(jid,skill)"
			    							+ " VALUES(" +aa+",'"+ab9.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( ab9.getText());
									ab9.setVisible(false);
							}
		    			});
			    		ab10.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_skills(jid,skill)"
			    							+ " VALUES(" +aa+",'"+ab10.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( ab10.getText());
									ab10.setVisible(false);
							}
		    			});
			
								
			    //=========================================================================// 		
		  
			   //=============== lan listeners =========================================//		
			    		lan1.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_languages(jid,language)"
			    							+ " VALUES(" +aa+",'"+lan1.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								System.out.println( lan1.getText());
									lan1.setVisible(false);
							}
		    			});
			    		lan2.addActionListener(new ActionListener(){
			    			
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_languages(jid,language)"
			    							+ " VALUES(" +aa+",'"+lan2.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( lan2.getText());
									lan2.setVisible(false);
							}
		    			});
			    		lan3.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_languages(jid,language)"
			    							+ " VALUES(" +aa+",'"+lan3.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( lan3.getText());
									lan3.setVisible(false);
							}
		    			});
			    		
			    		lan4.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_languages(jid,language)"
			    							+ " VALUES(" +aa+",'"+lan4.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( lan4.getText());
									lan4.setVisible(false);
							}
		    			});
			    		lan5.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_languages(jid,language)"
			    							+ " VALUES(" +aa+",'"+lan5.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( lan5.getText());
									lan5.setVisible(false);
							}
		    			});
			    		lan6.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_languages(jid,language)"
			    							+ " VALUES(" +aa+",'"+lan6.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( lan6.getText());
									lan6.setVisible(false);
							}
		    			});
			    		lan7.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_languages(jid,language)"
			    							+ " VALUES(" +aa+",'"+lan7.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( lan7.getText());
									lan7.setVisible(false);
							}
		    			});
			    		lan8.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_languages(jid,language)"
			    							+ " VALUES(" +aa+",'"+lan8.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( lan8.getText());
									lan8.setVisible(false);
							}
		    			});
			    		lan9.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_languages(jid,language)"
			    							+ " VALUES(" +aa+",'"+lan9.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( lan9.getText());
									lan9.setVisible(false);
							}
		    			});
			    		lan10.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_languages(jid,language)"
			    							+ " VALUES(" +aa+",'"+lan10.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( lan10.getText());
									lan10.setVisible(false);
							}
		    			});
			
			   //=========================================================================// 	
			    		
			   //=============== tit listeners =========================================//		
			    		tit1.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_titles(jid,title)"
			    							+ " VALUES(" +aa+",'"+tit1.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( tit1.getText());
									tit1.setVisible(false);
							}
		    			});
			    		tit2.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_titles(jid,title)"
			    							+ " VALUES(" +aa+",'"+tit2.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( tit2.getText());
									tit2.setVisible(false);
							}
		    			});
			    		tit3.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_titles(jid,title)"
			    							+ " VALUES(" +aa+",'"+tit3.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( tit3.getText());
									tit3.setVisible(false);
							}
		    			});
			    		tit4.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_titles(jid,title)"
			    							+ " VALUES(" +aa+",'"+tit4.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( tit4.getText());
									tit4.setVisible(false);
							}
		    			});
			    		tit5.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_titles(jid,title)"
			    							+ " VALUES(" +aa+",'"+tit5.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( tit5.getText());
									tit5.setVisible(false);
							}
		    			});
			    		tit6.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_titles(jid,title)"
			    							+ " VALUES(" +aa+",'"+tit6.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( tit6.getText());
									tit6.setVisible(false);
							}
		    			});
			    		tit7.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_titles(jid,title)"
			    							+ " VALUES(" +aa+",'"+tit7.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( tit7.getText());
									tit7.setVisible(false);
							}
		    			});
			    		tit8.addActionListener(new ActionListener(){
			    			
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_titles(jid,title)"
			    							+ " VALUES(" +aa+",'"+tit8.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( tit8.getText());
									tit8.setVisible(false);
							}
		    			});
			    		tit9.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_titles(jid,title)"
			    							+ " VALUES(" +aa+",'"+tit9.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( tit9.getText());
									tit9.setVisible(false);
							}
		    			});
			    		tit10.addActionListener(new ActionListener(){
				    		
							public void actionPerformed(ActionEvent arg0) {	
								String sql21= "SELECT MAX(jid) FROM jobs";
				    			PreparedStatement create3,create31;
	                            
				    			try {
									create3 = con.prepareStatement(sql21);
									ResultSet rs = create3.executeQuery();
									rs.next();
								    int aa = rs.getInt("MAX(jid)");
								    String sql1="INSERT INTO job_titles(jid,title)"
			    							+ " VALUES(" +aa+",'"+tit10.getText()+"')";
									create31 = con.prepareStatement(sql1);
								    create31.executeUpdate();

								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println( tit10.getText());
									tit10.setVisible(false);
									
							}
		    			});
			    		JButton ok = new JButton();
						ok.setText("Ok");
						ok.setBounds(170, 300, 50,50);
			//=========================================================================// 	
			    		ok.addActionListener(new ActionListener(){
			    			public void actionPerformed(ActionEvent arg0) {
			    				
			    				offerjob.dispose();
			    				adds.setVisible(true);
			    		
			    				PreparedStatement create; 
			    				System.out.println(TAcity.getText().toString()+"  "+inid.getText());
								String sql="INSERT INTO jobs(cid, city, work_hours , salary,j_work,deadline)"
											+ " VALUES("+ Integer.parseInt(inid.getText())+",'"+TAcity.getText().toString() + "','"
			    						+time.getText().toString() +"',"+ Integer.parseInt(salary.getText())+",'"+job.getText().toString()+"','"+deadline.getText().toString() + "')";
								System.out.println(sql);
								try {
									create = con.prepareStatement(sql);
									create.executeUpdate();
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
									
			    			}
			    			});
		    		
	    			ok2.addActionListener(new ActionListener(){
// ! edw stelnoume ola ta zeugh jid  - lan , jid - titles , jid - abs =========================//
						@Override
						public void actionPerformed(ActionEvent arg0) {
						
							adds.dispose();
							
							ab1.setVisible(true);
							ab2.setVisible(true);
							ab3.setVisible(true);
							ab4.setVisible(true);
							ab5.setVisible(true);
							ab6.setVisible(true);
							ab7.setVisible(true);
							ab8.setVisible(true);
							ab9.setVisible(true);
							ab10.setVisible(true);
							
							tit1.setVisible(true);
							tit2.setVisible(true);
							tit3.setVisible(true);
							tit4.setVisible(true);
							tit5.setVisible(true);
							tit6.setVisible(true);
							tit7.setVisible(true);
							tit8.setVisible(true);
							tit9.setVisible(true);
							tit10.setVisible(true);
						
							lan1.setVisible(true);
							lan2.setVisible(true);
							lan3.setVisible(true);
							lan4.setVisible(true);
							lan5.setVisible(true);
							lan6.setVisible(true);
							lan7.setVisible(true);
							lan8.setVisible(true);
							lan9.setVisible(true);
							lan10.setVisible(true);

						}
	    				
	    			});
	    			
	    			offerjob.add(TAtime);
	    			offerjob.add(time);
	    			offerjob.add(TAsalary);
	    			offerjob.add(salary);
	    			offerjob.add(TAjob);
	    			offerjob.add(job);
	    			offerjob.add(TAcity);
	    			offerjob.add(city);
	    			offerjob.add(TAdeadline);
	    			offerjob.add(deadline);
	    			offerjob.add(TAcity);
	    			offerjob.add(city);
	    			offerjob.add(inid);
	    			offerjob.add(IDtext);
	    			offerjob.add(ok);
	    			
	    			adds.setJMenuBar(indbar);
	    			adds.add(ok2);
			 
			 }
			 //========================erfverver=================================//
                 if(E.getSource() ==  request3){
				 
				 JFrame wantjob = new JFrame();
					wantjob.setLayout(null);
				    wantjob.setSize(600,600);
					wantjob.getContentPane().setLayout(null);
			   		wantjob.setBackground(Color.white);
	    			wantjob.setVisible(true);
	    			
	    			JTextArea atime = new JTextArea("AVALIABLE FROM");
	    			JTextArea iatime = new JTextArea();
	    			
	    			atime.setBackground(Color.GRAY);
	    			atime.setBounds(10, 144, 500, 22);
	    			atime.setEditable(false);
	    			
	    			iatime.setBackground(Color.white);
	    			iatime.setBounds(10, 166, 500, 22);
	    			iatime.setEditable(true);
	    			
	    			JButton ok = new JButton();
	    			ok.setText("Ok");
	    			ok.setBounds(170, 300, 50,50);
	    			ok.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							PreparedStatement create;
							String sql="UPDATE individuals SET available='"+iatime.getText()+"' WHERE (iid="+Integer.parseInt(inid.getText())+")";
							try {
								create = con.prepareStatement(sql);
								create.executeUpdate();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								
								e.printStackTrace();
			 			}
							ok.setBounds(170, 300, 50,50);
							wantjob.dispose();
							ok.setBounds(170, 300, 50,50);
							wantjob.dispose();					
						}

	    				
	    			});
	    			
	    			
	    			wantjob.add(atime);
	    			wantjob.add(iatime);
	    			wantjob.add(inid);
	    			wantjob.add(IDtext);
	    			wantjob.add(ok);
			 }
                 //============= contact with companies ============//
                 if(E.getSource() ==  request5){
    				 
    				 JFrame matchf = new JFrame();
    					matchf.setLayout(null);
    				    matchf.setSize(800,800);
    					matchf.getContentPane().setLayout(null);
    			   		matchf.setBackground(Color.white);
    	    			matchf.setVisible(true);
    	    			
    	    			 JFrame hire = new JFrame();
     					hire.setLayout(null);
     				    hire.setSize(300,300);
     					hire.getContentPane().setLayout(null);
     			   		hire.setBackground(Color.white);
     	    			hire.setVisible(true);
    	    			hire.setLocation(600, 150);
     	    			
    	    			JTextArea job = new JTextArea("     JOB-TABLE      ");
    	    		
    	    			JTextArea emp = new JTextArea ();
    	    			
    	    			JTextArea hjob = new JTextArea();
    	    			JTextArea hemp = new JTextArea ();
    	    			
    	    			JTextArea TAjob = new JTextArea("JOB ID");
    	    			JTextArea TAemp = new JTextArea ("EMPLOY ID");
    	    			
    	    			TAjob.setBounds(0, 0, 140, 30);
						TAjob.setEditable(false);
						TAjob.setBackground(Color.GRAY);
						TAjob.setVisible(true);
						
						TAemp.setBounds(150, 0 , 150  , 30);
						TAemp.setEditable(false);
						TAemp.setBackground(Color.GRAY);
						TAemp.setVisible(true);
    	    			
    	    			
    	    			
    	    			hjob.setBounds(0, 30, 140, 30);
						hjob.setEditable(true);
						hjob.setBackground(Color.white);
						hjob.setVisible(true);
						
						hemp.setBounds(150, 30, 150, 30);
						hemp.setEditable(true);
						hemp.setBackground(Color.white);
						hemp.setVisible(true);
    	    			
						
    	    			job.setBounds(0, 0, 800, 22);
						job.setEditable(false);
						job.setBackground(Color.GRAY);
						job.setVisible(true);
						
						emp.setBounds(0, 22, 800, 680);
						emp.setEditable(false);
						emp.setBackground(Color.lightGray);
						emp.setVisible(true);
						
    	    			 JButton go = new JButton (" HIRE! ");
    	    			go.setBackground(Color.green);
    	    			go.setBounds(100, 160, 90 , 60);
    	    			
    	    			go.addActionListener(new ActionListener(){

    	    				
    						@Override
    						public void actionPerformed(ActionEvent arg0) {
    							PreparedStatement create3;
    							String sql6="SELECT cid FROM jobs WHERE jid="+Integer.parseInt(hjob.getText());
    							String sql3="DELETE FROM jobs WHERE jid="+Integer.parseInt(hjob.getText());
    							String sql4="DELETE FROM individuals WHERE iid="+Integer.parseInt(hemp.getText());
    							
    						
									try {
										create3 = con.prepareStatement(sql6);
										ResultSet rs = create3.executeQuery();
										rs.next();
										int kk = rs.getInt("cid");
		    							
										String sql5="INSERT INTO history(cid,jid,iid) VALUES("+kk+","+Integer.parseInt(hjob.getText())+","+Integer.parseInt(hemp.getText())+")";
										create3 = con.prepareStatement(sql5);
										create3.executeUpdate();
										
										create3 = con.prepareStatement(sql3);
										create3.executeUpdate();
										create3 = con.prepareStatement(sql4);
										create3.executeUpdate();
										 JFrame done = new JFrame();
					     					done.setLayout(null);
					     				    done.setSize(170,170);
					     					done.getContentPane().setLayout(null);
					     			   		done.setBackground(Color.LIGHT_GRAY);
					     	    			done.setVisible(true);
					    	    			done.setLocation(600, 150);
					    	    			JTextArea done_t = new JTextArea ("DONE!!");
					    	    			done_t.setBounds(50, 50, 50, 20);
											done_t.setEditable(false);
											done_t.setBackground(Color.green);
											done_t.setVisible(true);
					    	    			
					    	    			done.add(done_t);
					    	    			
										
									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
    						
    						}
    	    			});
    	    			JButton ok = new JButton();
    	    			ok.setText("Show results");
    	    			ok.setBounds(300, 700, 200,50);
    	    			ok.addActionListener(new ActionListener(){

    						@Override
    						public void actionPerformed(ActionEvent arg0) {
    							
    							PreparedStatement create ,create2, create3;
								String sql="SELECT jid,iid FROM jobs INNER JOIN individuals ON j_work=i_job AND available<=deadline";

								try {
							 		 emp.setText("");								
									create = con.prepareStatement(sql);
									ResultSet rs =create.executeQuery();
									String sql2;
									ResultSet rs2, rs3;
									int counter=0;
									while(rs.next()){
									
									
										sql2="SELECT jid, iid, COUNT(iid) FROM titles INNER JOIN job_titles ON job_titles.title=titles.title AND job_titles.jid="
												+(Integer)rs.getInt("jid") +" AND titles.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
										create2 = con.prepareStatement(sql2);
										rs2 =create2.executeQuery();
										while(rs2.next()){
											System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
											String sql3="SELECT jid,COUNT(title) FROM job_titles WHERE jid="
												+rs2.getInt("jid")	+ " GROUP BY jid";
											create3 = con.prepareStatement(sql3);
											rs3 =create3.executeQuery();
											while(rs3.next())
											{
												if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(title)")){
													System.out.println("KANEI APO TITLOUS");
													counter++;
												}
											}
										}

										sql2="SELECT jid, iid, COUNT(iid) FROM skills INNER JOIN job_skills ON job_skills.skill=skills.skill AND job_skills.jid="
												+(Integer)rs.getInt("jid") +" AND skills.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
										create2 = con.prepareStatement(sql2);
										rs2 =create2.executeQuery();
										while(rs2.next()){
											System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
											String sql3="SELECT jid,COUNT(skill) FROM job_skills WHERE jid="
												+rs2.getInt("jid")	+ " GROUP BY jid";
											create3 = con.prepareStatement(sql3);
											rs3 =create3.executeQuery();
											while(rs3.next())
											{
												if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(skill)")){
													System.out.println("KANEI APO DE3IOTHTES");
													counter++;
												}
											}
										}
										
										sql2="SELECT jid, iid, COUNT(iid) FROM languages INNER JOIN job_languages ON job_languages.language=languages.language AND job_languages.jid="
												+(Integer)rs.getInt("jid") +" AND languages.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
										create2 = con.prepareStatement(sql2);
										rs2 =create2.executeQuery();
										while(rs2.next()){
											System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
											String sql3="SELECT jid,COUNT(language) FROM job_languages WHERE jid="
												+rs2.getInt("jid")	+ " GROUP BY jid";
											create3 = con.prepareStatement(sql3);
											rs3 =create3.executeQuery();
											while(rs3.next())
											{
												if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(language)")){
													System.out.println("KANEI APO GLWSSES");
													counter++;
												}
											}
										}
										if(counter==3){
											emp.setText(emp.getText()+"O iid="+rs.getInt("iid")+" kanei gia th douleia jid="+rs.getInt("jid")+"!!!\n");
											//System.out.println("O "+rs.getInt("iid")+" kanei gia th douleia "+rs.getInt("jid")+"!!!");
											
										}
										counter=0;
										System.out.println("--");

									}
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									
									e.printStackTrace();
								}
    												
    						}
    	    			});
    	    			hire.add(go);
    	    			matchf.add(job);
    	    			matchf.add(emp);
    	    			matchf.add(ok);
    	    			hire.add(TAjob);
    	    			hire.add(TAemp);
    	    			hire.add(hjob);
    	    			hire.add(hemp);
    	    			
                 }
                 
                 //============= supply and demand ============//
                 if(E.getSource() ==  request4){
                	 JButton ok = new JButton();
         			ok.setText("Show Results!");
         			ok.setBounds(400, 650, 200,50);
    				matchf.add(ok);
                	 matchf.setVisible(true);
                	 JTextArea sp=new JTextArea();
 	    			sp.setBackground(Color.WHITE);
 	    			sp.setBounds(0, 0, 1024, 768);
 	    			sp.setEditable(false);
    	    			matchf.add(sp);
    	    			ok.addActionListener(new ActionListener(){

    						@Override
    						public void actionPerformed(ActionEvent arg0) {
    							
    							PreparedStatement create ,create2, create3;
								String sql="SELECT jid,iid FROM jobs INNER JOIN individuals ON j_work=i_job AND available<=deadline";

								try {
							 		 		sp.setText("");								
									create = con.prepareStatement(sql);
									ResultSet rs =create.executeQuery();
									String sql2;
									ResultSet rs2, rs3;
									int counter=0;
									while(rs.next()){
										//System.out.println(rs.getInt("jid")+"  "+rs.getInt("iid"));
										//sql2="SELECT jid ,iid ,COUNT(iid) FROM job_titles INNER JOIN titles "
										//		+ "ON job_titles.title=titles.title AND job_titles.jid= "+rs.getInt("jid") +" AND titles.iid= "+rs.getInt("iid")
										//		+ " GROUP BY jid,iid";
										//String sql3="SELECT jid, iid, COUNT(iid) FROM job_titles WHERE job_titles.jid";
									
										sql2="SELECT jid, iid, COUNT(iid) FROM titles INNER JOIN job_titles ON job_titles.title=titles.title AND job_titles.jid="
												+(Integer)rs.getInt("jid") +" AND titles.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
										create2 = con.prepareStatement(sql2);
										rs2 =create2.executeQuery();
										while(rs2.next()){
											System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
											String sql3="SELECT jid,COUNT(title) FROM job_titles WHERE jid="
												+rs2.getInt("jid")	+ " GROUP BY jid";
											create3 = con.prepareStatement(sql3);
											rs3 =create3.executeQuery();
											while(rs3.next())
											{
												if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(title)")){
													System.out.println("KANEI APO TITLOUS");
													counter++;
												}
											}
										}

										sql2="SELECT jid, iid, COUNT(iid) FROM skills INNER JOIN job_skills ON job_skills.skill=skills.skill AND job_skills.jid="
												+(Integer)rs.getInt("jid") +" AND skills.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
										create2 = con.prepareStatement(sql2);
										rs2 =create2.executeQuery();
										while(rs2.next()){
											System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
											String sql3="SELECT jid,COUNT(skill) FROM job_skills WHERE jid="
												+rs2.getInt("jid")	+ " GROUP BY jid";
											create3 = con.prepareStatement(sql3);
											rs3 =create3.executeQuery();
											while(rs3.next())
											{
												if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(skill)")){
													System.out.println("KANEI APO DE3IOTHTES");
													counter++;
												}
											}
										}
										
										sql2="SELECT jid, iid, COUNT(iid) FROM languages INNER JOIN job_languages ON job_languages.language=languages.language AND job_languages.jid="
												+(Integer)rs.getInt("jid") +" AND languages.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
										create2 = con.prepareStatement(sql2);
										rs2 =create2.executeQuery();
										while(rs2.next()){
											System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
											String sql3="SELECT jid,COUNT(language) FROM job_languages WHERE jid="
												+rs2.getInt("jid")	+ " GROUP BY jid";
											create3 = con.prepareStatement(sql3);
											rs3 =create3.executeQuery();
											while(rs3.next())
											{
												if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(language)")){
													System.out.println("KANEI APO GLWSSES");
													counter++;
												}
											}
										}
										if(counter==3){
											sp.setText(sp.getText()+"O iid="+rs.getInt("iid")+" kanei gia th douleia jid="+rs.getInt("jid")+"!!!\n");
											//System.out.println("O "+rs.getInt("iid")+" kanei gia th douleia "+rs.getInt("jid")+"!!!");
											
										}
										counter=0;
										System.out.println("--");

									}
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									
									e.printStackTrace();
								}
    							
    							//matchf.dispose();					
    						}
    	    			});
    	    			
    	    			
                 }
               //=============  pay  ============//
                 if(E.getSource() ==  request6){
    				 
    				 JFrame payf = new JFrame();
    					payf.setLayout(null);
    				    payf.setSize(600,600);
    					payf.getContentPane().setLayout(null);
    			   		payf.setBackground(Color.white);
    	    			payf.setVisible(true);
    	    			
    	    			JButton Bind = new JButton();
    	    			Bind.setText(" INDIVIDUAL ");
    	    			Bind.setBackground(Color.red);
    	    			Bind.setBounds(240, 200, 200 , 60);
    	    			
    	    			
    	    			JButton Bcompany = new JButton();
    	    			Bcompany.setText("   COMPANY   ");
    	    			Bcompany.setBackground(Color.green);
    	    			Bcompany.setBounds(30, 200, 200 , 60);
    	    			
    	    			JButton ok = new JButton();
    	    			ok.setText("Ok");
    	    			ok.setBounds(170, 300, 50,50);
    	    			ok.setBounds(30, 500, 200 , 30); 
    	    			
    	    			 JFrame pop = new JFrame();
     					pop.setLayout(null);
     				    pop.setSize(300,300);
     					pop.getContentPane().setLayout(null);
     			   		pop.setBackground(Color.white);
     	    			pop.setVisible(false);
     	    			
    	    			Bcompany.addActionListener(new ActionListener(){

    						@Override
    						public void actionPerformed(ActionEvent arg0) {
    							
    							
    							PreparedStatement create, create2;
    							String sql="SELECT COUNT(jid) FROM jobs WHERE (cid="+Integer.parseInt(inid.getText())+")";
    							String sql2="SELECT COUNT(jid) FROM history WHERE cid="+Integer.parseInt(inid.getText());
    							String ekptwsh=null;
    							int aa =0 , bb=0 ,c=0;
    							try {
    								create = con.prepareStatement(sql);
	    							ResultSet rs = create.executeQuery();
	    							rs.next();
	    							create2 = con.prepareStatement(sql2);
	    							ResultSet rs2 = create2.executeQuery();
	    							rs2.next();
	    							aa = rs.getInt("COUNT(jid)");
	    							bb= rs2.getInt("COUNT(jid)");
	    							c=aa+bb;
									if(c==3 || c==4)
										ekptwsh="10%";
									else if(c>=5)
										ekptwsh ="20%";
									else
										ekptwsh ="0%";
    							} catch (SQLException e) {
    								// TODO Auto-generated catch block
    								
    								e.printStackTrace();
    			 			}
    							
    							payf.dispose();
    							Bcompany.setVisible(false);
    							pop.setVisible(true);
    							
    							JTextArea sale = new JTextArea(" H EKPTWSH SOU EINAI:"+ekptwsh
    									+"\nPOSO PLHRWMHS: "+aa+" * Antitimo");


    							sale.setBounds(10, 50, 240, 140);
    							sale.setEditable(false);
    							sale.setBackground(Color.GRAY);
    							sale.setVisible(true);
    							ok.setBounds(30, 200, 200 , 30);
    							
    							ok.addActionListener(new ActionListener(){

    	    						@Override
    	    						public void actionPerformed(ActionEvent arg0) {
    	    							
    	    							// edw stelnoume ta stoixeia
    	    							// kai na mn stelnei malakies
    	    							
    	    							pop.dispose();
    	    							
    	    						}
    	    	    			});
    							
    							pop.add(sale);
    							pop.add(ok);
    						}
    	    			});
    	    			Bind.addActionListener(new ActionListener(){

    						@Override
    						public void actionPerformed(ActionEvent arg0) {
    							payf.dispose();
    							Bcompany.setVisible(false);
    							pop.setVisible(true);
    							
    							JTextArea payed = new JTextArea(" YOU PAY US. THANKS!  ");
    							payed.setBounds(10, 50, 500, 22);
    							payed.setEditable(false);
    							payed.setBackground(Color.GRAY);
    							payed.setVisible(true);
    							ok.setBounds(30, 200, 200 , 30);
    							
    							ok.addActionListener(new ActionListener(){

    	    						@Override
    	    						public void actionPerformed(ActionEvent arg0) {
    	    				
    	    							
    	    							pop.dispose();
    	    							
    	    						}
    	    	    			});
    							
    							pop.add(payed);
    							pop.add(ok);
    						}
    	    			});
    	    			
    	    			
    	    			payf.add(Bcompany);
    	    			payf.add(Bind);
    	    			payf.add(IDtext);
    	    			payf.add(inid);
    	    			
                 }
                 

                 //============= find job ============//
                 if(E.getSource() ==  request7){
    				 
    				 JFrame jobf = new JFrame();
    					jobf.setLayout(null);
    				    jobf.setSize(600,600);
    					jobf.getContentPane().setLayout(null);
    					jobf.setBackground(Color.white);
    	    			jobf.setVisible(true);
    	    			
    	    			JFrame matchf = new JFrame();
    					matchf.setLayout(null);
    				    matchf.setSize(600,600);
    				    matchf.getContentPane().setLayout(null);
    					matchf.setBackground(Color.white);
    	    			matchf.setVisible(false);
    	    			
    	    			JTextArea sale = new JTextArea();
						sale.setBounds(0, 0, 600, 600);
						sale.setEditable(false);
						sale.setBackground(Color.GRAY);
						sale.setVisible(true);
						
    	    			matchf.add(sale);
    	    			JButton Bcompany = new JButton();
    	    			Bcompany.setText("   COMPANY   ");
    	    			Bcompany.setBackground(Color.green);
    	    			Bcompany.setBounds(30, 320, 200 , 60);
    	    			//FIND JOBS COMPANY
    	    			Bcompany.addActionListener(new ActionListener(){

    						public void actionPerformed(ActionEvent arg0) {
    							
    							PreparedStatement create ,create2, create3;
								String sql="SELECT jid,iid FROM jobs INNER JOIN individuals ON j_work=i_job AND available<=deadline AND jobs.cid="+Integer.parseInt(inid.getText());

								try {
							 		 										
									create = con.prepareStatement(sql);
									ResultSet rs =create.executeQuery();
									String sql2;
									ResultSet rs2, rs3;
									int counter=0;
									while(rs.next()){
										//System.out.println(rs.getInt("jid")+"  "+rs.getInt("iid"));
										//sql2="SELECT jid ,iid ,COUNT(iid) FROM job_titles INNER JOIN titles "
										//		+ "ON job_titles.title=titles.title AND job_titles.jid= "+rs.getInt("jid") +" AND titles.iid= "+rs.getInt("iid")
										//		+ " GROUP BY jid,iid";
										//String sql3="SELECT jid, iid, COUNT(iid) FROM job_titles WHERE job_titles.jid";
									
										sql2="SELECT jid, iid, COUNT(iid) FROM titles INNER JOIN job_titles ON job_titles.title=titles.title AND job_titles.jid="
												+(Integer)rs.getInt("jid") +" AND titles.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
										create2 = con.prepareStatement(sql2);
										rs2 =create2.executeQuery();
										while(rs2.next()){
											System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
											String sql3="SELECT jid,COUNT(title) FROM job_titles WHERE jid="
												+rs2.getInt("jid")	+ " GROUP BY jid";
											create3 = con.prepareStatement(sql3);
											rs3 =create3.executeQuery();
											while(rs3.next())
											{
												if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(title)")){
													System.out.println("KANEI APO TITLOUS");
													counter++;
												}
											}
										}

										sql2="SELECT jid, iid, COUNT(iid) FROM skills INNER JOIN job_skills ON job_skills.skill=skills.skill AND job_skills.jid="
												+(Integer)rs.getInt("jid") +" AND skills.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
										create2 = con.prepareStatement(sql2);
										rs2 =create2.executeQuery();
										while(rs2.next()){
											System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
											String sql3="SELECT jid,COUNT(skill) FROM job_skills WHERE jid="
												+rs2.getInt("jid")	+ " GROUP BY jid";
											create3 = con.prepareStatement(sql3);
											rs3 =create3.executeQuery();
											while(rs3.next())
											{
												if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(skill)")){
													System.out.println("KANEI APO DE3IOTHTES");
													counter++;
												}
											}
										}
										
										sql2="SELECT jid, iid, COUNT(iid) FROM languages INNER JOIN job_languages ON job_languages.language=languages.language AND job_languages.jid="
												+(Integer)rs.getInt("jid") +" AND languages.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
										create2 = con.prepareStatement(sql2);
										rs2 =create2.executeQuery();
										while(rs2.next()){
											System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
											String sql3="SELECT jid,COUNT(language) FROM job_languages WHERE jid="
												+rs2.getInt("jid")	+ " GROUP BY jid";
											create3 = con.prepareStatement(sql3);
											rs3 =create3.executeQuery();
											while(rs3.next())
											{
												if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(language)")){
													System.out.println("KANEI APO GLWSSES");
													counter++;
												}
											}
										}
										if(counter==3){
											sale.setText(sale.getText()+"O iid="+rs.getInt("iid")+" kanei gia th douleia jid="+rs.getInt("jid")+"!!!\n");
											//System.out.println("O "+rs.getInt("iid")+" kanei gia th douleia "+rs.getInt("jid")+"!!!");
											
										}
										counter=0;
										System.out.println("--");

									}
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									
									e.printStackTrace();
								}
    							
    							jobf.dispose();
    							matchf.setVisible(true);
    							
    						}
		    				
		    			});
    	    			
    	    			JButton Bind = new JButton();
    	    			Bind.setText(" INDIVIDUAL ");
    	    			Bind.setBackground(Color.red);
    	    			Bind.setBounds(240, 320, 200 , 60);
    	    			//FIND JOBS INDIVIDUALS
    	    			Bind.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent arg0) {
							PreparedStatement create ,create2, create3;
							String sql="SELECT jid,iid FROM jobs INNER JOIN individuals ON j_work=i_job AND available<=deadline AND individuals.iid="+Integer.parseInt(inid.getText());

							try {
						 		 										
								create = con.prepareStatement(sql);
								ResultSet rs =create.executeQuery();
								String sql2;
								ResultSet rs2, rs3;
								int counter=0;
								while(rs.next()){
									//System.out.println(rs.getInt("jid")+"  "+rs.getInt("iid"));
									//sql2="SELECT jid ,iid ,COUNT(iid) FROM job_titles INNER JOIN titles "
									//		+ "ON job_titles.title=titles.title AND job_titles.jid= "+rs.getInt("jid") +" AND titles.iid= "+rs.getInt("iid")
									//		+ " GROUP BY jid,iid";
									//String sql3="SELECT jid, iid, COUNT(iid) FROM job_titles WHERE job_titles.jid";
								
									sql2="SELECT jid, iid, COUNT(iid) FROM titles INNER JOIN job_titles ON job_titles.title=titles.title AND job_titles.jid="
											+(Integer)rs.getInt("jid") +" AND titles.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
									create2 = con.prepareStatement(sql2);
									rs2 =create2.executeQuery();
									while(rs2.next()){
										System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
										String sql3="SELECT jid,COUNT(title) FROM job_titles WHERE jid="
											+rs2.getInt("jid")	+ " GROUP BY jid";
										create3 = con.prepareStatement(sql3);
										rs3 =create3.executeQuery();
										while(rs3.next())
										{
											if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(title)")){
												System.out.println("KANEI APO TITLOUS");
												counter++;
											}
										}
									}

									sql2="SELECT jid, iid, COUNT(iid) FROM skills INNER JOIN job_skills ON job_skills.skill=skills.skill AND job_skills.jid="
											+(Integer)rs.getInt("jid") +" AND skills.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
									create2 = con.prepareStatement(sql2);
									rs2 =create2.executeQuery();
									while(rs2.next()){
										System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
										String sql3="SELECT jid,COUNT(skill) FROM job_skills WHERE jid="
											+rs2.getInt("jid")	+ " GROUP BY jid";
										create3 = con.prepareStatement(sql3);
										rs3 =create3.executeQuery();
										while(rs3.next())
										{
											if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(skill)")){
												System.out.println("KANEI APO DE3IOTHTES");
												counter++;
											}
										}
									}
									
									sql2="SELECT jid, iid, COUNT(iid) FROM languages INNER JOIN job_languages ON job_languages.language=languages.language AND job_languages.jid="
											+(Integer)rs.getInt("jid") +" AND languages.iid="+(Integer)rs.getInt("iid")+" GROUP BY jid,iid";
									create2 = con.prepareStatement(sql2);
									rs2 =create2.executeQuery();
									while(rs2.next()){
										System.out.println("jid:"+rs2.getInt("jid")+"  iid:"+rs2.getInt("iid")+"  Sunolo:"+rs2.getInt("COUNT(iid)") );
										String sql3="SELECT jid,COUNT(language) FROM job_languages WHERE jid="
											+rs2.getInt("jid")	+ " GROUP BY jid";
										create3 = con.prepareStatement(sql3);
										rs3 =create3.executeQuery();
										while(rs3.next())
										{
											if(rs2.getInt("COUNT(iid)") == rs3.getInt("COUNT(language)")){
												System.out.println("KANEI APO GLWSSES");
												counter++;
											}
										}
									}
									if(counter==3){
										sale.setText(sale.getText()+"O iid="+rs.getInt("iid")+" kanei gia th douleia jid="+rs.getInt("jid")+"!!!\n");
										//System.out.println("O "+rs.getInt("iid")+" kanei gia th douleia "+rs.getInt("jid")+"!!!");
										
									}
									counter=0;
									System.out.println("--");

								}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								
								e.printStackTrace();
							}
							
							jobf.dispose();
							matchf.setVisible(true);
						}
						
		    			});
    						
    	    			JButton ok = new JButton();
    	    			ok.setText("Ok");
    	    			ok.setBounds(170, 500, 100,50);
    	    			ok.addActionListener(new ActionListener(){

    						@Override
    						public void actionPerformed(ActionEvent arg0) {
    							
    							// edw stelnoume ta stoixeia
    							// kai na mn stelnei malakies
    							ok.setBounds(170, 300, 50,50);
    							jobf.dispose();					
    						}
    	    			});
    	    			jobf.add(Bcompany);
    	    			jobf.add(Bind);
    	    			jobf.add(inid);
    	    			jobf.add(IDtext);
    	    			
                 }
			 if(E.getSource() ==  manual){
				 JFrame manualWin = new JFrame();
					manual.setLayout(null);
				    manualWin.setSize(800,800);
					manualWin.getContentPane().setLayout(null);
			   		manualWin.setBackground(Color.white);
			   		manualWin.setVisible(true);
	 			
			   
			   		
	 			JTextArea manualTA=new JTextArea();
	 			String man =" 				\n			METHODOS LEITOURGIAS THS PLATFORMAS HeadHunters4U"+
	 					"\n"+
	 					"\n	Request"+

	 		"\n		1.Sign up: Eggrafh ws melos ths etairias"+
	 		"\n				Ta melh sumplhrwnoun ta stoixeia tous ( onoma, diefthinsh, thlefwno,"+
	 		"\n		email,arithmo logariasmou kai stoixeia pistwtikhs) ki epeita epilegoun th ka"+
	 		"\n		thgoria sthn opoia anhkoun (company, individuals or new store). Bash ths epi"+
	 		"\n		loghstou o xrhsths sumplhrwnei ta eidika gnwrismata ths kathe kathgorias (polh"+
	 		"\n		gia to company, to id, polh kai loipes leptomeries gia to neo katasthma kai"+
	 		"\n		epaggelma gia tous individuals. Kata to telos ths eggrafhs parexetai to anagnwri"+
	 		"\n		stiko gia to neo melos.	"+							
	 		"\n	\n	  	2.offer job: Anarthsh neas thesis"+
	 		"\n	 		          H endiaferomenh etairia sumplhrwnei to anagnwristiko pou ths dwthike ka"+
	 		"\n		ta thn eggrafh ths, th polh sthn opoia prosferei thn ergasia auth, to eidos ths"+
	 		"\n		ergasias kahws kai alles leptomeries opws o misthos, to wrario kai h prothesmia "+

	 		"\n	\n	  	3.add request: Aithma idiwth gia thesi ergasias"+
	 		"\n	 		          O idiwths sumplhrwnei to anagnwristiko pou elabe kata thn eggrafh kathws "+
	 		"\n		kai thn hmeromhnia apo thn opoia einai diathesimos. An to pedio den sumplhrwthei thewrei"+
	 		"\n		tai diathesimos apo th stigmh pou kanei thn aithsh"+

	 		"\n	\n	  	4.supply and demand: tairiasma prosforas kai zhthshs"+
	 		"\n	 		          Kata th leitourgia auth parousiazetai enas katalogos me tous katallhlous idi "+
	 		"\n		wtes gia kathe prosferomenh thesi ergasias."+

	 		"\n	\n	  	5.contact with companies: Epikoinwnia etairias me idiwtes"+
	 		"\n	 		         Arxika parexetai ena tairiasma metaksu prosforas kai zhthshs wste na broun poioi "+
	 		"\n		upalhloi tairiazoun stis douleies pou prosferoun. Epeita mporoun an proboun se proslhpseis ana"+
	 		"\n		grafontas to anagnwristiko tous kathws kai ekeino tou idiwth pou epithimoun"+

	 		"\n	\n	  	6.pay: Plhrwmh"+
	 		"\n	 		         O endiaferomenos sumplhrwnei to anagnwristiko tou kai sth sunexeia an einai idiwths  "+
	 		"\n		h etatiria. Sth periptwsh plhrwmhs apo etairia upologizetai kai h ektwsh ths"+

	 		"\n	\n	  	7.find job: Erwthseis"+
	 		"\n	 		         O endiaferomenos sumplhrwnei to anagnwristiko tou kai sth sunexeia an einai idiwths  "+
	 		"\n		h etatiria. Analoga me thn epilogh emfanizontsai oi katallhles douleies gia aithsh/proslhpsh."+
	 		"\n	Help"+
	 		"\n		  	1.Syatem Information"+
	 		"\n	 		         Sth leitourgia auth emfanizontai oles oi plhrofories gia douleies pou exoun kalufthei  "+
	 		"\n		h ekremmoun mesv ths HeadHunters. Epishs, emfanizontai ta pososta epituxeias."+

	 		"\n		  	2.Manual"+
	 		"\n	 		         To paron arxeio";
	 			manualTA.setText(man);
				manualTA.setBackground(Color.white);
				manualTA.setBounds(0, 0, 800, 800);
				manualTA.setEditable(false);
				
			
			manualWin.add(manualTA);
			 }
			 // history
			 if(E.getSource() ==  about){
				 JFrame history = new JFrame();
					history.setLayout(null);
				    history.setSize(600,600);
					history.getContentPane().setLayout(null);
			   		history.setBackground(Color.white);
			   		history.setVisible(true);
	 			
	 			JTextArea historyTA=new JTextArea("");
				historyTA.setBackground(Color.white);
				historyTA.setBounds(0, 0, 600, 600);
				historyTA.setEditable(false);
				
				history.add(historyTA);
			
				  String sql="SELECT * FROM history";
				   PreparedStatement create = null;
				try {
					create = con.prepareStatement(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   ResultSet rs = null;
				try {
					rs = create.executeQuery();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   historyTA.setText("8eseis pou exoun kaluf8ei: ");
				   try {
					while(rs.next()){
					   	historyTA.setText(historyTA.getText()+"\n"+"cid:"+rs.getInt("cid")+"  jid:"+rs.getInt("jid")+"  iid"+rs.getInt("iid"));
					   
					   }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   String sql2="SELECT * FROM jobs";
				   try {
					create =con.prepareStatement(sql2);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   ResultSet rs1 = null;
				try {
					rs1 = create.executeQuery();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				historyTA.setText(historyTA.getText()+"\n\n"+"8eseis pou einai ekkremh");
				   try {
					while(rs1.next()){
						historyTA.setText(historyTA.getText()+"\n"+"cid:"+rs1.getInt("cid")+"   jid"+rs1.getInt("jid")+"  job:"+rs1.getString("j_work"));
					   
					  }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  
				  String sql33="SELECT COUNT(jid) FROM history";
				  String sql44="SELECT COUNT(jid) FROM jobs";
				   
				   try {
					create=con.prepareStatement(sql33);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   ResultSet rs3 = null;
				try {
					rs3 = create.executeQuery();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   try {
					rs3.next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}int k = 0;
				try {
					k = rs3.getInt("COUNT(jid)");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   try {
					create=con.prepareStatement(sql44);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   ResultSet rs4 = null;
				try {
					rs4 = create.executeQuery();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  try {
					rs4.next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} int m = 0;
				try {
					m = rs4.getInt("COUNT(jid)");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  double  d=m+k;
				  historyTA.setText(historyTA.getText()+"\n\n"+"pososto thesewn pou exoun kalufthei: "+k/d*100+"%");
				  historyTA.setText(historyTA.getText()+"\n"+"pososto 8esewn pou ekkremoun : "+m/d*100+"%");

		 }
		 }
			 }
		
