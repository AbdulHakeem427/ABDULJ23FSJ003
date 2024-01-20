package jdbc;



import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class JDBCDemo2 {
	public static void main(String[] args)  throws Exception{
		Connection con=DBUtility.getCon();
		System.out.println("Connection...:"+con);
		
		Connection con2=DBUtility.getCon();
		System.out.println("Connection...:"+con2);
		
		Connection con3=DBUtility.getCon();
		System.out.println("Connection...:"+con3);
		
		Connection con4=DBUtility.getCon();
		System.out.println("Connection...:"+con4);
		
//		ExecutorService es=Executors.newFixedThreadPool(5);
//		es.execute(()->{
//			Connection con=DBUtility.getCon();
//			System.out.println("Connection...:"+con);
//		});
//		es.execute(()->{
//			Connection con2=DBUtility.getCon();
//			System.out.println("Connection...:"+con2);
//		});
//		es.execute(()->{
//			Connection con3=DBUtility.getCon();
//			System.out.println("Connection...:"+con3);
//			
//		});
//		es.execute(()->{
//			Connection con4=DBUtility.getCon();
//			System.out.println("Connection...:"+con4);
//		});
//		es.execute(()->{
//			Connection con5=DBUtility.getCon();
//			System.out.println("Connection...:"+con5);
//		});
//		
		
	}
}


