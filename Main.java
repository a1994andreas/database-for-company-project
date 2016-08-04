package baseis;
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Main {

	static Connection con ;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/tel33";
	// Database credentials
	static final String USER = "username";
	static final String PASS = "password";
	
	public static void main(String arg[]) throws ClassNotFoundException, SQLException{
		//Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Creating statement...");
		try {
			 con = DriverManager.getConnection(DB_URL , USER , PASS);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block     
			e.printStackTrace();
		}
		System.out.println("Connected");
		String [] sql = new String[11];
		sql[0] = "CREATE TABLE individuals(iid integer NOT NULL AUTO_INCREMENT ,i_name char(20) NOT NULL ,i_phone BIGINT , i_email char(30) ,i_addr_num integer , i_addr char(20) NOT NULL , i_job char(20) NOT NULL , i_account_num BIGINT , i_credit_info char(20) NOT NULL ,available char(20) NOT NULL , PRIMARY KEY(iid) )";
		sql [1] ="CREATE TABLE titles (iid integer , title char(20) not null, FOREIGN KEY(iid) REFERENCES individuals(iid)  on DELETE CASCADE on UPDATE CASCADE)";
		sql[2] = "CREATE TABLE languages(iid integer , language char(20) not null, FOREIGN KEY(iid) REFERENCES individuals(iid) on DELETE CASCADE on UPDATE CASCADE)";
		sql[3] =  "CREATE TABLE company(cid integer NOT NULL AUTO_INCREMENT,c_name char(20) NOT NULL , c_account_num BIGINT, c_credit_info char(20) NOT NULL  , PRIMARY KEY (cid))";
		sql[4] = "CREATE TABLE skills(iid integer , skill char(20) not null,FOREIGN KEY(iid) REFERENCES individuals(iid) on DELETE CASCADE on UPDATE CASCADE)";
		sql[5] = " CREATE TABLE store(cid integer NOT NULL,city char(20) NOT NULL ,c_addr_num integer , c_addr char(20) NOT NULL ,c_phone BIGINT , c_email char(20), FOREIGN KEY(cid) REFERENCES company(cid) on DELETE CASCADE on UPDATE CASCADE , PRIMARY KEY(cid, city) )";
		sql[6] = "CREATE TABLE jobs(jid integer NOT NULL AUTO_INCREMENT ,cid integer NOT NULL , city char(20) NOT NULL , work_hours char(20) NOT NULL, salary integer NOT NULL,j_work char(20) NOT NULL ,deadline char(20) NOT NULL, FOREIGN KEY(cid , city) REFERENCES store(cid , city) on DELETE CASCADE on UPDATE CASCADE ,PRIMARY KEY(jid) )";
		sql[7] = "CREATE TABLE job_titles(jid integer NOT NULL , title char(20) NOT NULL, FOREIGN KEY(jid) REFERENCES jobs(jid) on DELETE CASCADE on UPDATE CASCADE )";
		sql[8] = " CREATE TABLE job_skills(jid integer NOT NULL , skill char(20) NOT NULL, FOREIGN KEY(jid) REFERENCES jobs(jid) on DELETE CASCADE on UPDATE CASCADE )";
		sql[9] = "CREATE TABLE job_languages(jid integer NOT NULL , language char(20) NOT NULL, FOREIGN KEY(jid) REFERENCES jobs(jid) on DELETE CASCADE on UPDATE CASCADE )";
		sql[10]= "CREATE TABLE history(cid integer NOT NULL , jid integer NOT NULL, iid integer NOT NULL)";
		
		
		for(int i=0; i<11; i++){
		PreparedStatement create = con.prepareStatement(sql[i]);
		create.executeUpdate();
		}
		
		
		String [][] company = new String[10][3];
		company[0][0]="cosmote";company[0][1]="1200000000";company[0][2]="credit_info_0";
		company[1][0]="vodafone";company[1][1]="1000000001";company[1][2]="credit_info_1";
		company[2][0]="wind";company[2][1]="2000000002";company[2][2]="credit_info_2";
		company[3][0]="HadHunters";company[3][1]="0000000000";company[3][2]="headhunters_3";
		company[4][0]="cyta";company[4][1]="4000000004";company[4][2]="credit_info_4";
		company[5][0]="forthnet";company[5][1]="5000000005";company[5][2]="credit_info_5";
		company[6][0]="germanos";company[6][1]="6000000006";company[6][2]="credit_info_6";
		company[7][0]="media-markt";company[7][1]="7000000007";company[7][2]="credit_info_7";
		company[8][0]="lg";company[8][1]="8000000008";company[8][2]="credit_info_8";
		company[9][0]="plaisio";company[9][1]="9000000009";company[9][2]="credit_info_9";

		String [][] store = new String[15][6];
		store[0][0]="hrakleio";store[0][1]="123";store[0][2]="address0";store[0][3]="6971916010";store[0][4]="csd3031@csd.uoc.gr";store[0][5]="1";
		store[1][0]="ierapetra";store[1][1]="44";store[1][2]="address1";store[1][3]="6971916020";store[1][4]="csd3131@csd.uoc.gr";store[1][5]="1";
		store[2][0]="mouxtaro";store[2][1]="76";store[2][2]="address2";store[2][3]="6971916030";store[2][4]="csd3231@csd.uoc.gr";store[2][5]="1";
		store[3][0]="hrakleio";store[3][1]="986";store[3][2]="address3";store[3][3]="6971916400";store[3][4]="csd3331@csd.uoc.gr";store[3][5]="2";
		store[4][0]="korinos";store[4][1]="342";store[4][2]="address4";store[4][3]="6971916050";store[4][4]="csd3431@csd.uoc.gr";store[4][5]="2";
		store[5][0]="hrakleio";store[5][1]="0098";store[5][2]="address5";store[5][3]="6971916060";store[5][4]="csd3531@csd.uoc.gr";store[5][5]="3";
		store[6][0]="xwrio";store[6][1]="676";store[6][2]="address6";store[6][3]="6971916070";store[6][4]="csd3631@csd.uoc.gr";store[6][5]="3";
		store[7][0]="hrakleio";store[7][1]="221";store[7][2]="address7";store[7][3]="6971916080";store[7][4]="csd3731@csd.uoc.gr";store[7][5]="4";
		store[8][0]="hrakleio";store[8][1]="8786";store[8][2]="address8";store[8][3]="6971916090";store[8][4]="csd3831@csd.uoc.gr";store[8][5]="5";
		store[9][0]="hrakleio";store[9][1]="765";store[9][2]="address9";store[9][3]="69719160100";store[9][4]="csd3931@csd.uoc.gr";store[9][5]="6";
		store[10][0]="hrakleio";store[10][1]="432";store[10][2]="address10";store[10][3]="6971916011";store[10][4]="csd3101@csd.uoc.gr";store[10][5]="7";
		store[11][0]="hrakleio";store[11][1]="1223";store[11][2]="address11";store[11][3]="6971916012";store[11][4]="csd3111@csd.uoc.gr";store[11][5]="8";
		store[12][0]="hrakleio";store[12][1]="999";store[12][2]="address12";store[12][3]="69719160113";store[12][4]="csd3121@csd.uoc.gr";store[12][5]="9";
		store[13][0]="hrakleio";store[13][1]="888";store[13][2]="address13";store[13][3]="69719160014";store[13][4]="csd3131@csd.uoc.gr";store[13][5]="10";
		store[14][0]="arkaloxwri";store[14][1]="980";store[14][2]="address14";store[14][3]="69719160015";store[14][4]="csd3141@csd.uoc.gr";store[14][5]="10";
		
		String [][] jobs = new String[10][6];
		jobs[0][0]="1";jobs[0][1]="hrakleio";jobs[0][2]="work_hours1";jobs[0][3]="2432";jobs[0][5]="2015/01/12";jobs[0][4]="psaras";
		jobs[1][0]="1";jobs[1][1]="hrakleio";jobs[1][2]="work_hours2";jobs[1][3]="6867";jobs[1][5]="2015/04/20";jobs[1][4]="psaras";
		jobs[2][0]="1";jobs[2][1]="ierapetra";jobs[2][2]="work_hours3";jobs[2][3]="56756";jobs[2][5]="2016/03/08";jobs[2][4]="agroths";
		jobs[3][0]="2";jobs[3][1]="hrakleio";jobs[3][2]="work_hours4";jobs[3][3]="5455";jobs[3][5]="2017/09/08";jobs[3][4]="job21";
		jobs[4][0]="2";jobs[4][1]="korinos";jobs[4][2]="work_hours5";jobs[4][3]="9988";jobs[4][5]="2017/05/07";jobs[4][4]="job26";
		jobs[5][0]="6";jobs[5][1]="hrakleio";jobs[5][2]="work_hours6";jobs[5][3]="7645";jobs[5][5]="2016/09/09";jobs[5][4]="job03";
		jobs[6][0]="10";jobs[6][1]="arkaloxwri";jobs[6][2]="work_hours7";jobs[6][3]="1211";jobs[6][5]="2018/06/06";jobs[6][4]="job93";
		jobs[7][0]="1";jobs[7][1]="hrakleio";jobs[7][2]="work_hours8";jobs[7][3]="87961";jobs[7][5]="2016/05/05";jobs[7][4]="job11";
		jobs[8][0]="1";jobs[8][1]="hrakleio";jobs[8][2]="work_hours8";jobs[8][3]="87961";jobs[8][5]="2222/05/05";jobs[8][4]="job";
		jobs[9][0]="1";jobs[9][1]="mouxtaro";jobs[9][2]="work_hours8";jobs[9][3]="87961";jobs[9][5]="2222/05/05";jobs[9][4]="pcdoc";

		
		String [][] ind = new String[10][9];
		ind[0][0]="andreas";ind[0][1]="6981212777";ind[0][2]="csd3031@csd.uoc.gr";ind[0][3]="22";ind[0][4]="address23";ind[0][5]="psaras";ind[0][6]="768676";ind[0][7]="credit_info12";ind[0][8]="2015/04/08";
		ind[1][0]="stelios";ind[1][1]="6982121777";ind[1][2]="csd3101@csd.uoc.gr";ind[1][3]="2";ind[1][4]="address003";ind[1][5]="agroths";ind[1][6]="2342423";ind[1][7]="credit_info26";ind[1][8]="2016/05/22";
		ind[2][0]="giwrgos";ind[2][1]="6981288777";ind[2][2]="csd1111@csd.uoc.gr";ind[2][3]="33";ind[2][4]="address883";ind[2][5]="job21";ind[2][6]="98774";ind[2][7]="credit_info43";ind[2][8]="2017/09/08";
		ind[3][0]="fwths";ind[3][1]="6981235727";ind[3][2]="csd3083@csd.uoc.gr";ind[3][3]="55";ind[3][4]="address343";ind[3][5]="psaras";ind[3][6]="45644523";ind[3][7]="credit_info81";ind[3][8]="2015/04/20";
		ind[4][0]="manos";ind[4][1]="6981234747";ind[4][2]="csd7894@csd.uoc.gr";ind[4][3]="77";ind[4][4]="address66";ind[4][5]="psaras";ind[4][6]="9876547";ind[4][7]="credit_info13";ind[4][8]="2015/01/10";
		ind[5][0]="massnos";ind[5][1]="61981234747";ind[5][2]="csde7894@csd.uoc.gr";ind[5][3]="77";ind[5][4]="address663";ind[5][5]="job";ind[5][6]="987632547";ind[5][7]="credit_info13";ind[5][8]="2015/01/02";
		ind[6][0]="massnos";ind[6][1]="68657470";ind[6][2]="csde7636@csd.uoc.gr";ind[6][3]="747";ind[6][4]="address663";ind[6][5]="job";ind[6][6]="987632547";ind[6][7]="credit_info13";ind[6][8]="2015/01/02";
		ind[7][0]="lampros";ind[7][1]="68657470";ind[7][2]="2121@csd.uoc.gr";ind[7][3]="747";ind[7][4]="address663";ind[7][5]="pcdoc";ind[7][6]="987632547";ind[7][7]="credit_info13";ind[7][8]="2010/01/02";
		ind[8][0]="makis";ind[8][1]="68657470";ind[8][2]="csd23446@csd.uoc.gr";ind[8][3]="747";ind[8][4]="address663";ind[8][5]="pcdoc";ind[8][6]="987632547";ind[8][7]="credit_info13";ind[8][8]="2010/01/02";
		ind[9][0]="paulos";ind[9][1]="281021212";ind[9][2]="csd23446@gmail.gr";ind[9][3]="747";ind[9][4]="address663";ind[9][5]="pcdoc";ind[9][6]="987632547";ind[9][7]="credit_info13";ind[9][8]="2010/01/01";

		String [][] job_languages = new String [9][2];					String [][] languages = new String[12][2]; 
		job_languages[0][0]="1";job_languages[0][1]="LANGUAGE1";			languages[0][0]="1"; languages[0][1]="LANGUAGE1";
		job_languages[1][0]="2";job_languages[1][1]="LANGUAGE2";			languages[1][0]="1"; languages[1][1]="LANGUAGE2";
		job_languages[2][0]="3";job_languages[2][1]="LANGUAGE4";			languages[2][0]="1"; languages[2][1]="LANGUAGE4";
		job_languages[3][0]="3";job_languages[3][1]="LANGUAGE1";			languages[3][0]="2"; languages[3][1]="LANGUAGE1";
		job_languages[4][0]="4";job_languages[4][1]="LANGUAGE7";			languages[4][0]="2"; languages[4][1]="LANGUAGE6";
		job_languages[5][0]="5";job_languages[5][1]="LANGUAGE6";			languages[5][0]="3"; languages[5][1]="LANGUAGE4";
		job_languages[6][0]="6";job_languages[6][1]="LANGUAGE4";			languages[6][0]="4"; languages[6][1]="LANGUAGE2";
		job_languages[7][0]="9";job_languages[7][1]="LANGUAGE4";			languages[7][0]="6"; languages[7][1]="LANGUAGE4";
																			languages[8][0]="7"; languages[8][1]="LANGUAGE4";
		job_languages[8][0]="10";job_languages[8][1]="LANGUAGE3";			languages[9][0]="8"; languages[9][1]="LANGUAGE3";
																			languages[10][0]="9"; languages[10][1]="LANGUAGE3";
																			languages[11][0]="10"; languages[11][1]="LANGUAGE3";


		
		String [][] job_skills = new String[12][2];						String [][] skills = new String[15][2];
		job_skills[0][0]="1";job_skills[0][1]="ABILITY1";						skills[0][0]="1";skills[0][1]="ABILITY1";
		job_skills[1][0]="1";job_skills[1][1]="ABILITY2";						skills[1][0]="1";skills[1][1]="ABILITY2";
		job_skills[2][0]="2";job_skills[2][1]="ABILITY1";						skills[2][0]="2";skills[2][1]="ABILITY4";
		job_skills[3][0]="3";job_skills[3][1]="ABILITY5";						skills[3][0]="2";skills[3][1]="ABILITY5";
		job_skills[4][0]="4";job_skills[4][1]="ABILITY6";						skills[4][0]="3";skills[4][1]="ABILITY6";
		job_skills[5][0]="5";job_skills[5][1]="ABILITY8";						skills[5][0]="4";skills[5][1]="ABILITY1";
		job_skills[6][0]="5";job_skills[6][1]="ABILITY10";					skills[6][0]="5";skills[6][1]="ABILITY9";
		job_skills[7][0]="6";job_skills[7][1]="ABILITY10";					skills[7][0]="2";skills[7][1]="ABILITY9";
		job_skills[8][0]="7";job_skills[8][1]="ABILITY10";					skills[8][0]="2";skills[8][1]="ABILITY9";
		job_skills[9][0]="8";job_skills[9][1]="ABILITY10";					skills[9][0]="3";skills[9][1]="ABILITY9";
		job_skills[10][0]="9";job_skills[10][1]="ABILITY4";					skills[10][0]="6";skills[10][1]="ABILITY4";
																			skills[11][0]="7";skills[11][1]="ABILITY4";
		job_skills[11][0]="10";job_skills[11][1]="ABILITY3";				skills[12][0]="8";skills[12][1]="ABILITY3";
																			skills[13][0]="9";skills[13][1]="ABILITY3";
																			skills[14][0]="10";skills[14][1]="ABILITY3";



		String [][] job_titles = new String[9][2];						String [][] titles = new String[12][2];
		job_titles[0][0]="1";job_titles[0][1]="TITLE1";						titles[0][0]="1";titles[0][1]="TITLE1";
		job_titles[1][0]="2";job_titles[1][1]="TITLE1";						titles[1][0]="1";titles[1][1]="TITLE2";
		job_titles[2][0]="3";job_titles[2][1]="TITLE1";						titles[2][0]="2";titles[2][1]="TITLE1";
		job_titles[3][0]="4";job_titles[3][1]="TITLE2";						titles[3][0]="2";titles[3][1]="TITLE2";
		job_titles[4][0]="5";job_titles[4][1]="TITLE2";						titles[4][0]="3";titles[4][1]="TITLE1";
		job_titles[5][0]="6";job_titles[5][1]="TITLE1";						titles[5][0]="4";titles[5][1]="TITLE1";
		job_titles[6][0]="7";job_titles[6][1]="TITLE1";						titles[6][0]="5";titles[6][1]="TITLE2";
		job_titles[7][0]="9";job_titles[7][1]="TITLE4";						titles[7][0]="6";titles[7][1]="TITLE4";
																			titles[8][0]="7";titles[8][1]="TITLE4";
		job_titles[8][0]="10";job_titles[8][1]="TITLE3";					titles[9][0]="8";titles[9][1]="TITLE3";
																			titles[10][0]="9";titles[10][1]="TITLE3";
																			titles[11][0]="10";titles[11][1]="TITLE3";
		
		
	
		

		PreparedStatement create;
		//Insert to company
		for(int i =0; i<10 ; i++){
			
			
			String sql1="INSERT INTO company(c_name,c_account_num,c_credit_info)"
					+ " VALUES('" +company[i][0]+"',"+Double.parseDouble(company[i][1])
					+",'"+company[i][2]+"')";
			create = con.prepareStatement(sql1);
			create.executeUpdate();
		}
		
		//Insert to store  
		for(int i=0 ; i<15 ; i++){
			
			String sql3="INSERT INTO store(cid , city, c_addr_num, c_addr , c_phone, c_email) VALUES("+Integer.parseInt(store[i][5])+",'"+
			store[i][0]+"',"+Integer.parseInt(store[i][1])+",'"+store[i][2]+"',"+Double.parseDouble(store[i][3])+",'"+store[i][4]+"')";

			create = con.prepareStatement(sql3);
			create.executeUpdate();
			
		}
		//Insert to jobs
		for(int i=0 ; i<10 ;i++){
			
			String sql1="INSERT INTO jobs(cid,city,work_hours,salary,j_work,deadline) VALUES("+Integer.parseInt(jobs[i][0])+",'"
					+jobs[i][1]+"','"+jobs[i][2]+"',"+Double.parseDouble(jobs[i][3])+",'"+jobs[i][4]+"','"+jobs[i][5]+"')";
			
			create = con.prepareStatement(sql1);
			create.executeUpdate();
			
		}
		//Insert to individuals
		for(int i=0 ; i<10; i++){
			
			String sql1="INSERT INTO individuals(i_name, i_phone,i_email, i_addr_num, i_addr, i_job, i_account_num, i_credit_info,available) "
					+ "VALUES('"+ind[i][0]+"',"+Double.parseDouble(ind[i][1])+",'"+ind[i][2]+"',"+Integer.parseInt(ind[i][3])+",'"+
					ind[i][4]+"','"+ind[i][5]+"',"+Double.parseDouble(ind[i][6])+",'"+ind[i][7]+"','"+ind[i][8]+"')";
			
			create = con.prepareStatement(sql1);
			create.executeUpdate();		
			
		}
		
		for(int i=0 ; i<9 ; i++){
			

			
			String sql1="INSERT INTO job_languages(jid, language) VALUES("+Integer.parseInt(job_languages[i][0])+",'"+job_languages[i][1]+"')";
			create = con.prepareStatement(sql1);
			create.executeUpdate();	
		
			
			
			String sql3="INSERT INTO job_titles(jid, title) VALUES("+Integer.parseInt(job_titles[i][0])+",'"+job_titles[i][1]+"')";
			create = con.prepareStatement(sql3);
			create.executeUpdate();	
			
		
		}
		
		
		for(int i=0; i<12; i++){
			String sql2="INSERT INTO job_skills(jid, skill) VALUES("+Integer.parseInt(job_skills[i][0])+",'"+job_skills[i][1]+"')";
			create = con.prepareStatement(sql2);
			create.executeUpdate();	
			
			String sql4="INSERT INTO languages(iid, language) VALUES("+Integer.parseInt(languages[i][0])+",'"+languages[i][1]+"')";
			create = con.prepareStatement(sql4);
			create.executeUpdate();	
		
			String sql6="INSERT INTO titles(iid, title) VALUES("+Integer.parseInt(titles[i][0])+",'"+titles[i][1]+"')";
			create = con.prepareStatement(sql6);
			create.executeUpdate();
		}
		
		
		for(int i=0; i<15; i++){
			String sql5="INSERT INTO skills(iid, skill) VALUES("+Integer.parseInt(skills[i][0])+",'"+skills[i][1]+"')";
			create = con.prepareStatement(sql5);
			create.executeUpdate();	
		}
	
		
		
		/* 
		 * String tname,taddress,addressnum,tphone,tmail,tacnum,tcreditcard;
					String degree,language,ability,job;
					
		 *0 CREATE TABLE individuals(iid integer NOT NULL AUTO_INCREMENT ,i_name char(20) NOT NULL ,i_phone integer , i_email char(30) ,i_addr_num integer , i_addr char(20) NOT NULL , i_job char(20) NOT NULL , i_account_num integer , i_credit_info char(20) NOT NULL ,available char(20) NOT NULL , PRIMARY KEY(iid) )
		 * 
		 *1 CREATE TABLE titles (iid integer , title char(20) not null, FOREIGN KEY(iid) REFERENCES individuals(iid)  on DELETE CASCADE on UPDATE CASCADE)
		 * 
		 *2 CREATE TABLE languages(iid integer , language char(20) not null, FOREIGN KEY(iid) REFERENCES individuals(iid) on DELETE CASCADE on UPDATE CASCADE)
		 * 
		 *3 CREATE TABLE skills(iid integer , skill char(20) not null,FOREIGN KEY(iid) REFERENCES individuals(iid) on DELETE CASCADE on UPDATE CASCADE)
		 * 
		 * --------------------------------------------------------------------------------------
		 * --------------------------------------------------------------------------------------
		 * 
		 * 4 CREATE TABLE company(cid integer NOT NULL AUTO_INCREMENT,c_name char(20) NOT NULL , c_account_num integer, c_credit_info char(20) NOT NULL ,deadline char(20) NOT NULL , PRIMARY KEY (cid))
		 * 
		 *5 CREATE TABLE store(cid integer NOT NULL,city char(20) NOT NULL ,c_addr_num integer , c_addr char(20) NOT NULL ,c_phone integer , c_email char(20), FOREIGN KEY(cid) REFERENCES company(cid) on DELETE CASCADE on UPDATE CASCADE , PRIMARY KEY(cid, city) )
		 * -------------------------------------------------------
		 * 1) me auth th morfh dhlwshs den se afhnei na valeis 
		 * stigmiotupo tou jobs pou den exei ta idia cid, city
		 * ston pinaka store!!!
		 * 2) to idio ginetai kai ston store den mporeis na valeis 
		 * stigmiotupo me cid pou den uparxei!!!
		 * 3) me to AUTO_INCREMENT den xreiazetai na asxolh8eis me ta id sthn 
		 * eisagwgh ta ftiaxnei mono tou
		 * 4)otan diagrafeis ena cid diagrafei ta panta pou sundeontai me auto
		 * to id apo olous tous pinakes
		 * -------------------------------------------------------
		 * 
		 * 
		 * 6 CREATE TABLE jobs(jid integer NOT NULL AUTO_INCREMENT ,cid integer NOT NULL , city char(20) NOT NULL , work_hours char(20) NOT NULL, salary integer NOT NULL,j_work char(20) NOT NULL , FOREIGN KEY(cid , city) REFERENCES store(cid , city) on DELETE CASCADE on UPDATE CASCADE ,PRIMARY KEY(jid) )
		 * 
		 * 7 CREATE TABLE job_titles(jid integer NOT NULL , title char(20) NOT NULL, FOREIGN KEY(jid) REFERENCES jobs(jid) on DELETE CASCADE on UPDATE CASCADE )
		 * 
		 * 8 CREATE TABLE job_skills(jid integer NOT NULL , skill char(20) NOT NULL, FOREIGN KEY(jid) REFERENCES jobs(jid) on DELETE CASCADE on UPDATE CASCADE )
		 * 
		 * 
		 * 9 CREATE TABLE job_languages(jid integer NOT NULL , language char(20) NOT NULL, FOREIGN KEY(jid) REFERENCES jobs(jid) on DELETE CASCADE on UPDATE CASCADE )
		 * 
		 * */
		
		

		graphics a =  new graphics( con);
		a.setVisible(true);
	}
	
	
		
		
		
//	}
}
