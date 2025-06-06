package Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class BookDAOImpl implements BookDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private String id = "system";
	private String pw = "1234";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";

	private static BookDAOImpl instance;

	private BookDAOImpl() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("Driver Loading Success");
	};

	public static BookDAO getInstance() throws Exception {
		if (instance == null)
			instance = new BookDAOImpl();
		return instance;
	}

	@Override
	public int insert(BookDTO bookDto) throws Exception {
		try {
			pstmt = conn.prepareStatement("insert into BOOK values(?,?,?,?,?)");
			pstmt.setString(1, bookDto.getBookCode());
			pstmt.setString(2, bookDto.getIsbn());
			pstmt.setString(3, bookDto.getBookAuthor());
			pstmt.setString(4, bookDto.getBookName());
			pstmt.setString(5, bookDto.getPublisher());

			return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("BOOKDAO's INSERT EXCEPTION");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
			}
		}
	}

	@Override
	public int update(BookDTO bookDto) throws Exception {
		try {
			pstmt = conn.prepareStatement("");
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("BOOKDAO's UDATE EXCEPTION");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
			}
		}
	}

	@Override
	public int prev(BookDTO bookDto) throws Exception {
		try {
			pstmt = conn.prepareStatement("");
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("BOOKDAO's PREV EXCEPTION");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
			}
		}
	}

	@Override
	public BookDTO select(BookDTO bookDto) {
		return null;
	}

	@Override
	public List<BookDTO> selectAll() {
		return null;
	}

}
