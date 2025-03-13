package Ch19;

import java.util.Scanner;

// ### throw keyword ###
// JAVA에서 예외를 명시적으로 발생시키기 위한 키워드
// throw 키워드를 사용하여 특정 예외를 강제로 발생시킬 수 있음

// ## 기본 구문 ##
// throw 예외객체;

// throw new ArrayIndexOutOfBoundsException();

// "예외객체"는 특정 예외 클래스의 인스턴스

// 예외처리는 주로 두 가지 방시긍로 나눌 수 있음
// 1. 예외의 직접적인 던지기 (direct throwing)	: 메소드 내에서 예외 조건을 발견했을 때, 해당 예외를 직접 던지는 방식
// 2. 메소드에게 예외를 떠넘기기 (rethrowing)		: 메소드에서 예외를 처리하지 않고, 해당 예외를 다시 호출한 메소드로 떠넘기는 방식
//											: 이는 주로 예외를 발생한 메소드가 예외를 해결할 수 없는 경우에 사용
//											: throws 키워드는 반드시 작성해야만 떠넘기기를 할 수 있는 건 아님

class CustomException extends Exception {
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}
}

public class C05Throws {
// 1. 직접 던지기 예
//	public static void main(String[] args) {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("양수를 입력해주세요");
//			int Value = sc.nextInt();
//			
//			if(value < 0) {
//				// 여기에서 throw문을 사용해 IllegalArgumentException을 명시적으로 던짐(예외 발생)
//				throw new IllegalArgumentException("음수는 허용되지 않습니다");
//			}
//			System.out.println("값 : " + value);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	//-----------------------------------------------------------------------------------
	
	// 2. 메서드에게 예외를 떠넘기기
	// 2-1. rethrowing 첫번째 예제
//	public static void someMethod() throws CustomException{
//		
//		try {
//			// 예외 발생 가능성 있는 코드
//			int result = 10 / 0; 		// ArithemeticEception 발생
//		} catch(ArithmeticException e) {
//			System.out.println("ArithemeticException Caught in someMethod : " + e.getMessage());
//			
//			// 예외를 다시 던짐(CustomException 예외 발생)
//			throw new CustomException("Custom Exception", e);
//		}
//	}
	// 2-2. rethrowing 두번째 예제
	public static void methodA() {
		try {
			methodB();
		}catch (ArithmeticException e) {
			throw e;
		}
	}
	public static void methodB() {
		int result = 10 / 0;
	}
	public static void main(String[]args) {
		methodA();
	}
}
