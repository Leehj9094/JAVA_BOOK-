package Service;

import Domain.BookDAO;
import Domain.BookDAOImpl;
import Domain.BookDTO;
import Service.BookService;

public class BookService {

	private BookDAO bookDao;

	private static BookService isntance;

	private BookService() throws Exception {
		bookDao = BookDAOImpl.getInstance();
		System.out.println("");
	};

	public static BookService getInstance() throws Exception {
		if (isntance == null)
			isntance = new BookService();
		return isntance;
	}

	public boolean bookRegistration(BookDTO bookDto) throws Exception {

		return bookDao.insert(bookDto) > 0;

	}
	
}
