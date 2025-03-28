package Ch36.Domain.Service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Ch36.Domain.Dto.BookDto;
import Ch36.Domain.Dto.UserDto;
import Ch36.Tests.Service.BookServiceImpl;
import Ch36.Tests.Service.UserServiceImpl;

class ServiceTests {

	@Test
	void test() throws Exception {
		UserServiceImpl userService=UserServiceImpl.getInstance();
		
		userService.userJoin(new UserDto("bbb","남길동","1234","ROLE_USER"));
	}
	@Test
	void tes_2t() throws Exception {
		BookServiceImpl bookService = BookServiceImpl.getInstance();
		bookService.bookRegistration(new BookDto("1010101","C언어기본","코리아미디어","1010-1010"));
	}

}
