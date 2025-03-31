package Domain;

import java.sql.SQLException;

import java.util.List;

import Domain.BookDTO;

public interface BookDAO {

	int insert(BookDTO bookDto) throws Exception;

	int update(BookDTO bookDto) throws Exception;

	int prev(BookDTO bookDto) throws Exception;

	BookDTO select(BookDTO bookDto);

	List<BookDTO> selectAll();

}