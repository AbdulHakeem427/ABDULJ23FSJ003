package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	public DBUtility() {
		// TODO Auto-generated constructor stub
	}
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static ThreadLocal<Connection> tlocal=new ThreadLocal<Connection>();
	public static Connection getCon() {
		Connection con=tlocal.get();
		if(con==null) {
			try {
				 con=DriverManager.getConnection("jdbc:mysql://localhost/alma","root","root");
				tlocal.set(con);
				return con;
			}catch(Exception ee) {
				ee.printStackTrace();
				return null;
			}
		}else {
			return con;
		}
		
	}

}
