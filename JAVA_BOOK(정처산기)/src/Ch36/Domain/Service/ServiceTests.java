package Ch36.Domain.Service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Ch36.Domain.Dto.UserDto;
import Ch36.Tests.Service.UserServiceImpl;

class ServiceTests {

	@Test
	void test() throws SQLException, ClassNotFoundException {
		UserServiceImpl userService=UserServiceImpl.getInstance();
		
		userService.userJoin(new UserDto("bbb","남길동","1234","ROLE_USER"));
	}

}
