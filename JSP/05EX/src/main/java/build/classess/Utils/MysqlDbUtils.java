package build.classess.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlDbUtils {

	private String url = "jdbc:mysql://localhost/bookDB";
	private String id = "root";
	private String pw = "1234";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static MysqlDbUtils instance;
	private MysqlDbUtils() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, id, pw);
	}
	
	public static MysqlDbUtils getInstance() throws Exception{
		if(instance==null)
			instance = new MysqlDbUtils();
		return instance;
	}
	
	
	
}
