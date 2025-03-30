package Controller;

import java.util.HashMap;
import java.util.Map;

import Domain.BookDTO;
import Service.BookService;

public class BookController implements Controller{

	private BookService bookService;
	
	public BookController() {
		try {
			bookService = BookService.getInstance();
		}catch(Exception e) {
			exceptionHandler(e);
		}
	}
	Map<String, Object> response = new HashMap();
	
	@Override
	public Map<String, Object> execute(Map<String, Object> params){
		System.out.println(" ");
		
		Integer serviceNo = (Integer) params.get("serviceno");
		if(serviceNo == null) {
			response.put("status", false);
			response.put("message", "유효하지 않은 서비스 요청입니다 =(");
			return response;
		}
		switch(serviceNo) {
		case 1:	// C 도서등록
			System.out.println("[SB] 도서등록 요청 확인");
			
			String bookcode = (params.get("bookcode")!=null)?(String)params.get("bookcode"):null;
			String isbn = (params.get("isbn")!=null)?(String)params.get("isbn"):null;
			String bookauthor = (params.get("bookauthor")!=null)?(String)params.get("bookauthor"):null;
			String bookname = (params.get("bookname")!=null)?(String)params.get("bookname"):null;
			String publisher = (params.get("publisher")!=null)?(String)params.get("publisher"):null;
			BookDTO bookDto = new BookDTO(bookcode,isbn,bookauthor,bookname,publisher);
			
			boolean isOk=isValid(bookDto);
			System.out.println("[No-1 도서검색] : 유효성 검증 확인 : " + isOk);
			if(!isOk){
				response.put("status", false);
			}
			break;
		case 2:	// R 도서조회
			System.out.println("[SB] 도서조회 요청 확인");
			
			break;
		case 3:
			System.out.println("[SB] 도서수정 요청 확인");
			
			break;
		case 4:
			System.out.println("[SB] 도서삭제 요청 확인");
			
			break;
		default:
			System.out.println("[SB] 잘못된 서비스번호 요청 확인입니다.");
			response.put("status", false);
			response.put("message", "유효하지 않은 서비스 요청입니다");
		}
			return response;
		}
		public boolean isValid(BookDTO bookDto) {
			
			if(bookDto.getBookCode()==null||bookDto.getBookCode().length()!=8) {
				response.put("error","bookcode의 길이는 최대 8자이여야 합니다.");
				System.out.println("[INVALID] bookcode의 길이는 최대 8자이여야 합니다=)");
				return false;
			}
			if(bookDto.getBookName()==null||bookDto.getBookName().length()>=25) {			
				response.put("error","bookname의 길이는 최대 255자 이내여야 합니다");
				System.out.println("[INVALID] bookname의 길이는 최대 255자 이내여야 합니다");
				return false;
			}
			return true;	
	}
		public Map<String, Object> exceptionHandler(Exception e){
			if(response == null)
				response = new HashMap();
			response.put("status", false);
			response.put("message", e.getMessage());
			response.put("exception", e);
			return response;
		}
}
