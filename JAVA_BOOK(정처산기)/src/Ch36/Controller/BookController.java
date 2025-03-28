package Ch36.Controller;

import java.util.HashMap;
import java.util.Map;

import Ch36.Domain.Dto.BookDto;
import Ch36.Tests.Service.BookServiceImpl;

public class BookController implements SubController {

	private BookServiceImpl bookService;
	
	public BookController() {
		try {
		bookService = BookServiceImpl.getInstance();
		}catch(Exception e) {exceptionHandler(e);}
	}
	
	Map<String, Object> response = new HashMap();
	
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] UserController execute invoke...");
		// 00
		
		Integer serviceNo = (Integer) params.get("serviceNo1");
		if (serviceNo == null) {
			response.put("status", false);
			response.put("message", "유효하지 않은 서비스 요청입니다.");
			return response;
		}
		switch (serviceNo) {
		case 1: // C - 도서등록(ROLE - 사서)
			System.out.println("[SB] 도서등록 요청 확인");
			// 01 파라미터받기
			String bookcode = (params.get("bookcode")!=null)?(String)params.get("bookcode"):null;
			String bookname = (params.get("bookname")!=null)?(String)params.get("bookname"):null;
			String publisher = (params.get("publisher")!=null)?(String)params.get("publisher"):null;
			String isbn = (params.get("isbn")!=null)?(String)params.get("isbn"):null;
			BookDto bookDto = new BookDto(bookcode,bookname,publisher,isbn);
			
			// 02 유효성검사(Validation)
			boolean isOk=isValid(bookDto);
			System.out.println("[No-1 도서검색] : 유효성 검증 확인 : " + isOk);
			if(!isOk) {
			response.put("status", false);
			}
			// 03 관련 서비스 실행
			// 04 뷰로 이동(or 내용전달)
			
			break;
		case 2: // R - 도서조회(ROLE - 회원, 사서, 관리자)
			System.out.println("[SB] 도서조회 요청 확인");
			// 01 파라미터받기
						// 02 유효성검사(Validation)
						// 03 관련 서비스 실행
						// 04 뷰로 이동(or 내용전달)
			break;
		case 3: // U - 도서수정(ROLE - 사서, 관리자)
			System.out.println("[SB] 도서수정 요청 확인");
			// 01 파라미터받기
						// 02 유효성검사(Validation)
						// 03 관련 서비스 실행
						// 04 뷰로 이동(or 내용전달)
			break;
		case 4: // D - 도서삭제(ROLE - 사서, 관리자
			System.out.println("[SB] 도서삭제 요청 확인");
			// 01 파라미터받기
						// 02 유효성검사(Validation)
						// 03 관련 서비스 실행
						// 04 뷰로 이동(or 내용전달)
			break;
		default:
			System.out.println("[SB] 잘못된 서비스번호 요청 확인");
			response.put("status", false);
			response.put("message", "유효하지 않은 서비스 요청입니다.");
		}
		// 01 파라미터받기
		// 02 유효성검사(Validation)
		// 03 관련 서비스 실행
		// 04 뷰로 이동(or 내용전달)

		return response;
	}
	public boolean isValid(BookDto bookDto) {
		
		if(bookDto.getBookCode()==null||bookDto.getBookCode().length()!=8) {
			response.put("error","bookcode의 길이는 최대 8자이여야 합니다.");
			System.out.println("[INVALID] bookcode의 길이는 최대 8자이여야 합니다=)");
			return false;
		}
		if(bookDto.getBookName()==null||bookDto.getBookName().length()>=255) {			
			response.put("error","bookname의 길이는 최대 255자 이내여야 합니다");
			System.out.println("[INVALID] bookname의 길이는 최대 255자 이내여야 합니다");
			return false;
		}
		return true;	
	}
	
	// 예외처리함수
		public Map<String, Object> exceptionHandler(Exception e) {

			if (response == null)
				response = new HashMap();

			response.put("status", false);
			response.put("message", e.getMessage());
			response.put("exception", e);

			return response;
		}
}
