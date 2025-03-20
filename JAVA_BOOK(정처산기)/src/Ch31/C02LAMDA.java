package Ch31;

import java.util.Scanner;

interface Printer{
//	void print(String message);				// 추상메서드
//	String print(String message);				// 추상메서드
	String print();							// 추상메서드
}

public class C02LAMDA {

	public static void main(String[] args) {
		
		//01
//		Printer printer = (message)->{System.out.println(message);};		// 추상메서드는 하나만 해야 작동 됨
//		printer.print("HELLOWORLD");
		
		//02
//		Printer printer = (message)->{return message+"_HELLOWORLD;}; // 람다식
//		Printer printer = message->return message+"_HELLOWORLD; // 람다식 약식
//		String returnValue = printer.print("TEST");
//		System.out.println(returnValue);		// TEST_HELLOWORLD 출력
		
		//03 (키보드로 입력받아 String 반환)
		Printer printer = ()->{
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : " );
			String str = sc.nextLine();
			sc.close();
			return str; 
			};
			String returnValue = printer.print();
			System.out.println(returnValue);
	}
	
}
