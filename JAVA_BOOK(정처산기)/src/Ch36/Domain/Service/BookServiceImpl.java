package Ch36.Domain.Service;

import java.sql.SQLException;


import Ch36.Domain.Dao.BookDao;
import Ch36.Domain.Dao.BookDaoImpl;
import Ch36.Domain.Dto.BookDto;

public class BookServiceImpl {

	// 컨트롤러 연결
	private BookDao bookDao;
	
	// 싱글톤 패턴
	private static BookServiceImpl instance;
	private BookServiceImpl() throws Exception {
		
		bookDao = BookDaoImpl.getInstance();
		System.out.println("");
	};
	public static BookServiceImpl getInstance() throws Exception {
		if(instance==null)
			instance = new BookServiceImpl();
		return instance;
	}	
	
	// TX 처리 + 비지니스 유효성검사
	public boolean bookRegistration(BookDto bookDto) throws Exception {
		
		return bookDao.insert(bookDto)>0;
		
	}
}

