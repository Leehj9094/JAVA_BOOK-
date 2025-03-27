package Ch36.Domain.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Ch36.Domain.Dto.UserDto;

public class UserDaoImpl {
	// DB Attr
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String id="root";
	private String pw="1234";
	private String url="jdbc:mysql://localhost:3306/bookDB";
	// 싱글톤 패턴처리 (잘 사용하지 않지만 아직 사용중인 곳이 DBC?)
	private static UserDaoImpl instance;
	UserDaoImpl() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,id,pw);				// 발생된 예외는 throws해야 함 절대 catch no
		System.out.println("BookDaoImpl DB Connection Success");
		
	};
	public static UserDaoImpl getInstance() throws ClassNotFoundException, SQLException {
		if(instance==null)
			instance = new UserDaoImpl();
		return instance;
	}
	
	//CRUD 
	public int insert(UserDto userDto) throws SQLException {
		try {
			pstmt = conn.prepareStatement("insert into tbl_user values(?,?,?,?)");
			pstmt.setString(1, userDto.getUserid());
			pstmt.setString(2, userDto.getUsername());
			pstmt.setString(3, userDto.getPassword());
			pstmt.setString(4, "ROLE_USER");
			return pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("USERDAO's INSERT SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
		}
	}
	public int update(UserDto userDto) throws SQLException {
		try {
			pstmt = conn.prepareStatement("");
			
			return pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("USERDAO's UPDATE SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
		}
	}
	public int delete(UserDto userDto) throws SQLException {
		try {
			pstmt = conn.prepareStatement("");
			
			return pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("USERDAO's DELETE SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
		}

	}
	// 단건조회
	public UserDto select(UserDto userDto) {
		return null;
	}
	// 다건조회
	public List<UserDto> selectAll(){
		return null;
	}
}
