package Ch36.Domain.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Ch36.Domain.Dao.ConnectionPool.ConnectionItem;
import Ch36.Domain.Dao.ConnectionPool.ConnectionPool;
import Ch36.Domain.Dto.UserDto;

public class UserDaoImpl extends Dao implements UserDao {
	// DB Attr
//	private Connection conn;
//	private PreparedStatement pstmt;
//	private ResultSet rs;
//	
//	private String id="root";
//	private String pw="1234";
//	private String url="jdbc:mysql://localhost:3306/bookDB";
	
	// CONNECTION POOL
//	private ConnectionPool connectionPool;
//	private ConnectionItem connectionItem;
	
	// 싱글톤 패턴처리 (잘 사용하지 않지만 아직 사용중인 곳이 DBC?)
	private static UserDao instance;
	UserDaoImpl() throws Exception {
		System.out.println("[DAO] UserDaoImpl init..");
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn = DriverManager.getConnection(url,id,pw);				// 발생된 예외는 throws해야 함 절대 catch no
//		System.out.println("BookDaoImpl DB Connection Success");
//		connectionPool = ConnectionPool.getInstance();
		
	};
	public static UserDao getInstance() throws Exception {
		if(instance==null)
			instance = new UserDaoImpl();
		return instance;
	}
	
	//CRUD 
	@Override
	public int insert(UserDto userDto) throws Exception {
		try {
			
			connectionItem = connectionPool.getConnection();
			Connection conn = connectionItem.getConn();
			
			pstmt = conn.prepareStatement("insert into tbl_user values(?,?,?,?)");
			pstmt.setString(1, userDto.getUserid());
			pstmt.setString(2, userDto.getUsername());
			pstmt.setString(3, userDto.getPassword());
			pstmt.setString(4, "ROLE_USER");
			
			// Connection release
			connectionPool.releaseConnection(connectionItem);
			
			return pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("USERDAO's INSERT SQL EXCEPTION!!");
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
		}
	}
	@Override
	public int update(UserDto userDto) throws SQLException {
//		try {
//			pstmt = conn.prepareStatement("");
//			
//			return pstmt.executeUpdate();
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//			throw new SQLException("USERDAO's UPDATE SQL EXCEPTION!!");
//		}finally {
//			try {pstmt.close();}catch(Exception e2) {}
//		}
		return 0;
	}
	@Override
	public int delete(UserDto userDto) throws SQLException {
//		try {
//			pstmt = conn.prepareStatement("");
//			
//			return pstmt.executeUpdate();
//		}catch(SQLException e) {
//			e.printStackTrace();
//			throw new SQLException("USERDAO's DELETE SQL EXCEPTION!!");
//		}finally {
//			try {pstmt.close();}catch(Exception e2) {}
//		}
		return 0;
	}
	// 단건조회
	@Override
	public UserDto select(UserDto userDto) {
		return null;
	}
	// 다건조회
	@Override
	public List<UserDto> selectAll(){
		return null;
	}
}
