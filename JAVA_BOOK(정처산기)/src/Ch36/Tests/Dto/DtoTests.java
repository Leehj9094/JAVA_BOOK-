package Ch36.Tests.Dto;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Ch36.Domain.Dao.UserDtoImpl;
import Ch36.Domain.Dto.UserDto;

class DtoTests {

	@Test
	void tes1t() throws ClassNotFoundException, SQLException {
		UserDtoImpl userDtoImpl = UserDtoImpl.getInstance();
	}
	@Test
	void test2() throws Exception {
		UserDtoImpl userDtoImpl = UserDtoImpl.getInstance();
		userDtoImpl.insert(new UserDto("aaa","홍길동","1234",""));
	}

}
