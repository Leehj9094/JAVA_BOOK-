package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C01DBConn {

	public static void main(String[] args) {

		// DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";
		//			  고정 :      // 네트워크	 / DB 명

		// JDBC 참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			// 어떤 클래스를 쓸건지 명시
			System.out.println("Driver Loading Success...");	
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB CONNECTED...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
}
