package Domain;

public class BookDTO {

	private String BookCode;
	private String Isbn;
	private String BookAuthor;
	private String BookName;
	private String Publisher;
	
	public BookDTO() {}

	public BookDTO(String bookCode, String isbn, String bookauthor, String bookName, String publisher) {
		super();
		this.BookCode = bookCode;
		Isbn = isbn;
		BookAuthor = bookauthor;
		BookName = bookName;
		Publisher = publisher;
	}

	public String getBookCode() {
		return BookCode;
	}

	public void setBookCode(String bookCode) {
		this.BookCode = bookCode;
	}

	public String getIsbn() {
		return Isbn;
	}

	public void setIsbn(String isbn) {
		Isbn = isbn;
	}

	public String getAuthor() {
		return BookAuthor;
	}

	public void setAuthor(String author) {
		BookAuthor = author;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	@Override
	public String toString() {
		return "BookDTO [BookCode=" + BookCode + ", Isbn=" + Isbn + ", BookAuthor=" + BookAuthor + ", BookName=" + BookName
				+ ", Publisher=" + Publisher + "]";
	}
	
	
}
