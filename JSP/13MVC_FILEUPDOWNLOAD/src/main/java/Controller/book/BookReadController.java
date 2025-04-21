package Controller.book;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.SubController;
import Domain.Dto.BookDto;
import Domain.Service.BookServiceImpl;

public class BookReadController implements SubController {

	private HttpServletRequest req;
	private HttpServletResponse resp;
	
	private BookServiceImpl bookService;
	
	public BookReadController() throws Exception {
		this.bookService = BookServiceImpl.getInstance();
	}
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		this.req = req;
		this.resp = resp;
		System.out.println("[sc] BookReadController excute");
		
		try {
			// parameter
			String bookCode = req.getParameter("bookCode");
			String pageno = req.getParameter("pageno");
			// isValid
			if(!isValid(bookCode)) {
				// req.setAttribute("message", "유효성 체크 오류!");
				//req.getRequestDispatcher("/WEB-INF/view/book/list.jsp?pageno=1").forward(req, resp);
				resp.sendRedirect(req.getContextPath()+"/book/list");
			}
			// service
			Map<String,Object> serviceResponse = bookService.getBook(bookCode);
			
			Boolean status = (Boolean)serviceResponse.get("status");
			if(status)
				req.setAttribute("bookDto", serviceResponse.get("bookDto"));
			
			req.setAttribute("pageno", pageno);
			
			// view
			req.getRequestDispatcher("/WEB-INF/view/book/read.jsp").forward(req, resp);
			
		} catch(Exception e) {
			exceptionHandler(e);
			try {
				req.getRequestDispatcher("/WEB-INF/view/book/error.jsp").forward(req, resp);
			}catch(Exception e2) {}
		}

	}

	private boolean isValid(String bookCode) {
		if(bookCode.isEmpty()) {
			req.setAttribute("bookCode", "BookCode 유효성 오류");
		}
		return true;
	}
	// 예외처리함수
	public void exceptionHandler(Exception e) {
		req.setAttribute("status", false);
		req.setAttribute("message", e.getMessage());
		req.setAttribute("exception", e);
	}
}
