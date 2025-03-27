package Ch36.Tests.Service;

import java.sql.SQLException;

import Ch36.Domain.Dao.UserDaoImpl;
import Ch36.Domain.Dto.UserDto;

public class UserServiceImpl {

	// 
	private UserDaoImpl userDao;
	
	// 싱글톤 패턴
	private static UserServiceImpl instance;
	private UserServiceImpl() throws ClassNotFoundException, SQLException {
		
		userDao = UserDaoImpl.getInstance();
		System.out.println("[SERVICE] UserServiceImpl init..");
				
	};
	public static UserServiceImpl getInstance() throws ClassNotFoundException, SQLException {
		if(instance==null)
			instance = new UserServiceImpl();
		return instance;
	}
	
	// 회원가입 (+TX처리필요)
	public boolean userJoin(UserDto userDto) throws SQLException{
		
		return userDao.insert(userDto)>0;
	};
	// 회원조회
	
	// 회원수정
	
	// 회원탈퇴
	
	// 로그인
	
	// 로그아웃
	
	
}
