package Ch36.Domain.Dao;

import java.sql.SQLException;
import java.util.List;

import Ch36.Domain.Dto.BookDto;
import Ch36.Domain.Dto.UserDto;

public interface BookDao {

	int insert(BookDto bookDto) throws Exception;

	int update(UserDto userDto) throws SQLException;

	int delete(UserDto userDto) throws SQLException;
	//단건조회

	UserDto select(UserDto userDto);
	//다건조회

	List<UserDto> selectAll();

}