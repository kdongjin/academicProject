package academicTest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDatabase {
	public static Connection makeConnection() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe"; 
		String user = "javauser";
		String pwd = "javauser"; 
		Connection con = null;  
		try {
			//1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OracleDriver 적재성공");
			//2. 오라클데이타베이스 연결
			con = DriverManager.getConnection(url, user, pwd); 
			System.out.println("오라클 접속 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클적재실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 접속실패");
		}
		return con;
	}

	public static void main(String[] args) {
		Connection con = makeConnection(); 
		System.out.println("The end");
	}
	

	
}

