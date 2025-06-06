package Ch36.Domain.Dto;

public class BookDto {

	private String bookCode;
	private String bookName;
	private String publisher;
	private String isbn;
	// 생성자
	public BookDto(){}
	public BookDto(String bookCode, String bookName, String publisher, String isbn) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	// getter and setter
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	// toString
	@Override
	public String toString() {
		return "BookDto [bookCode=" + bookCode + ", bookName=" + bookName + ", isbn=" + isbn + "]";
	}
	
	// 1. BookDaoImpl 생성
	
	// 2. BookDaoImpl insert 작업 TEST
	// 3. table명 : tbl_book
	
}
