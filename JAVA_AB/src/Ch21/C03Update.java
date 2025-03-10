package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C03Update {

	public static void main(String[] args) {
		// 연결관련 정보 저장용 변수
		String id = "root";
		String pwd = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";
		
		//DB연결객체 관련된 참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 데이터베이스 구문
		// 1. 데이터베이스 생성
		// CREATE SCHEMA testdb;
		
		// 2. 테이블 생성
//		CREATE TABLE testdb.tbl_customer(
//			indx INT UNSIGNED AUTO_INCREMET,
//			name VARCHAR(30) NOT NULL,
//			age TINYINT USIGNED NOT NULL,
//			address VARCHAR(30) NOT NULL,
//			COSNTRAINT PRIMARY KEY (idx)
//		);
		
		//3. 연결하기 및 데이터 수정
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("[SYSTEM] : Driver loading Success");
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("[SYSTEM]------------------DB Connection--------------------");
			// 주소 데이터 수정
			pstmt = conn.prepareStatement("UPDATE `testdb`.`tbl_customer` SET `address` = ? WHERE `idx` = ?");
			
		}catch() {
			
		}
	}

}
