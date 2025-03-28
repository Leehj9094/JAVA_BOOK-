package Ch36.Domain.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Ch36.Domain.Dto.BookDto;
import Ch36.Domain.Dto.UserDto;

public class BookDaoImpl extends Dao implements BookDao {

//	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
//
//	private String id = "root";
//	private String pw = "1234";
//	private String url = "jdbc:mysql://localhost:3306/bookDB";
	
//	private ConnectionItem connectionItem;
//	private ConnectionPool connectionPool;	
//	
	// 싱글톤
	private static BookDao instance;

	private BookDaoImpl() throws Exception {

//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn = DriverManager.getConnection(url, id, pw); // 발생된 예외는 throws해야 함 절대 catch no
//		connectionPool = ConnectionPool.getInstance();s
		System.out.println("BookDaoImpl DB Connection Success");
	};
	
	public static BookDao getInstance() throws Exception {
		if(instance==null)
			instance=new BookDaoImpl();
		return instance;
	}
	
	@Override
	public int insert(BookDto bookDto) throws Exception {
		try {
			
			connectionItem = connectionPool.getConnection();
			Connection conn = connectionItem.getConn();
			
			pstmt=conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
			pstmt.setString(1, bookDto.getBookCode());
			pstmt.setString(2, bookDto.getBookName());
			pstmt.setString(3, bookDto.getPublisher());
			pstmt.setString(4, bookDto.getIsbn());
			
			// co
			connectionPool.releaseConnection(connectionItem);
			
			return pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's INSERT SQL EXCEPTION!!");
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
//			throw new SQLException("BOOKDAO's UPDATE SQL EXCEPTION!!");
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
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//			throw new SQLException("BOOKDAO's DELETE SQL EXCEPTION!!");
//		}finally {
//			try {pstmt.close();}catch(Exception e2) {}
//		}
		return 0;
	}
	//단건조회
 
	@Override
	public UserDto select(UserDto userDto) {	
		return null;
	}
	//다건조회
 
	@Override
	public List<UserDto> selectAll() {	
		return null;
	}	

}