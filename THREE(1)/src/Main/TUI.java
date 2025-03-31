package Main;

import java.util.Scanner;

import Controller.FrontController;

public class TUI {

//	private String userid;
//	private String username;
//	private String role;
	
	private Scanner sc = new Scanner(System.in);
	
	private FrontController controller;
	
	TUI() {
		controller = FrontController.getInstance();
	}
	
	public void MainMenu() {
		while(true) {
			System.out.println("--------------- MENU -------------");
//			System.out.println("MENU");
//			System.out.println("---------------------------------");
			System.out.println("1 Book_Tbl");
			System.out.println("2 Member_Tbl");
			System.out.println("3 Rental_Tbl");
			System.out.println("4 EXIT");
			System.out.println("--------------- MENU -------------");
			System.out.println(" 번호 : ");	
			int num = sc.nextInt();
			switch (num) {
			case 1:
				BookMenu();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				System.out.println(-1);
			}
		}
	}
	public void BookMenu() {
		System.out.println("--------- BOOK ----------");
		System.out.println("1 Insert");
		System.out.println("2 Update");
		System.out.println("3 Select");
		System.out.println("4 Prev");
		System.out.println("--------- BOOK ----------");
		System.out.println("번호 : ");
		
		System.out.println("코드 | 분류번호 | 저자 | 책제목 | 출판사 > ");
		String bookcode = sc.next();
		String isbn = sc.next();
		String bookauthor = sc.next();
		String bookname = sc.next();
		String publisher = sc.next();
		
		System.out.println("도서 등록 완료!");
	
		return;
	}
}
