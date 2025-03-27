package Ch36.Tests.Dao;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Ch36.Domain.Dao.BookDaoImpl;
import Ch36.Domain.Dao.UserDaoImpl;
import Ch36.Domain.Dto.BookDto;
import Ch36.Domain.Dto.UserDto;

class DaoTests {

	@Test
//	@Disabled
	void test1() throws ClassNotFoundException, SQLException {
		UserDaoImpl userDaoImpl = UserDaoImpl.getInstance();
	}
	@Test
	void test2() throws Exception {
		UserDaoImpl userDaoImpl = UserDaoImpl.getInstance();
		userDaoImpl.insert(new UserDto("aaa","홍길동","1234",""));
	}
	@Test
	void test3() throws Exception{
		BookDaoImpl bookDaoImpl = BookDaoImpl.getInstance();
		bookDaoImpl.insert(new BookDto("1111","리눅스","한빛","111-111"));
	}
	

}
