
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "system";
	private String pw = "1234";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 싱글톤
	private static DBUtils instance;

	private DBUtils() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
	}

	public static DBUtils getInstance() throws Exception {
		if (instance == null)
			instance = new DBUtils();
		return instance;
	}

	// 강사테이블조회
	public List<TeacherDto> selectAllTeacher() throws Exception{
		String sql = "select * from TBL_TEACHER_202201";
		pstmt = conn.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		List<TeacherDto> list = new ArrayList();
		TeacherDto dto = null;
		if(rs!=null) {
			while(rs.next()) {
				// code 추가
				dto = new TeacherDto();
				dto.setTeacher_code(rs.getString(1));
				dto.setTeacher_name(rs.getString(2));
				dto.setClass_name(rs.getString(3));
				dto.setClass_price(rs.getInt(4));
				dto.setTeacher_regist_date(rs.getString(5));
				list.add(dto);
			}
		}
		pstmt.close();
		rs.close();
		return list;
	}

	// 강사테이블조회
		public List<MemberDto> selectAllMember() throws Exception{
			String sql = "select * from TBL_TEACHER_202201";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			List<MemberDto> list = new ArrayList();
			MemberDto dto = null;
			if(rs!=null) {
				while(rs.next()) {
					// code 추가
					dto = new TeacherDto();
					dto.setTeacher_code(rs.getString(1));
					dto.setTeacher_name(rs.getString(2));
					dto.setClass_name(rs.getString(3));
					dto.setClass_price(rs.getInt(4));
					dto.setTeacher_regist_date(rs.getString(5));
					list.add(dto);
				}
			}
			pstmt.close();
			rs.close();
			return list;
		}

}
