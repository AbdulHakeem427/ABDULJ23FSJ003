package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {
	public static void main(String[] args)  throws Exception{
		
		/*
		 * 1. Load or register the driver - note - this should be done only once.
		 * 
		 * 2. Establish a connection
		 * 
		 * 3. Prepare and execute a statement
		 * 
		 * 4. Process the result
		 * 
		 */
		
		//Load or register the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish a connection
		//DriverManager.getConnection(url,userid,password)//url=protocol:database://ipaddress/dbname
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alma","root","root");
		
		System.out.println("Connection...:"+con);

		
	}
}


