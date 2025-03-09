package java_lesson;

//import java.util.Scanner;

public class ch07 {
	public static void main(String[] args) {
		// 00 분기문
		// 조건문과 반목문 중간에서 코드블럭을나눠서 처리하는 문법
		// 그 예로는 if문,  switch문, for문, while문 등이 있다
		
		// 01 if문
		// 조건문을 작성할 때 사용하는 구문,
		
		// 조건식이 참이라면 코드 블럭을 실행
		// 참과 거짓, 0과 1
		
		//02 if문의 형식
		
		// if ( 조건식 ) {
		//					//
		//					// 조건식이 참이라면 이 실행코드 실행
		//}
		
//		Scanner sc = new Scanner(System.in);
//		if (true) {
	//		System.out.println("조건식이 참이고 if문 진입");
	//	}
	//	System.out.println("if문 처리 이후 실행코드");
	//	System.out.println();
		
		//if 문제 01
		// 사용자로부터 점수 하나를 입력받고 3의 배수이면 3의 배수입니다가 출력되도록 코딩하세요.
		
		
//			System.out.println("정수하나를 입력해주세요 >>> ");
//			int num = sc.nextInt();
//			if (num % 3 == 0) {
//				System.out.println("3의 배수입니다.");
//			}
//			if (num % 3 == 1) {
//				System.out.println("3의 배수가 아닙니다.");
//			}
//			if (num % 3 == 2) {
//				System.out.println("3의 배수가 아닙니다.");
//			}
//			if(num % 3 == 0) {
//				// 3의 배수인 경우 처리
//			} else {
//				System.out.println("3의 배수가 아닙니다.");
//			}
		
		
			
			// 2-2) if문과 else문
			
			// if ( 조건식 ) {
			//					// 조건식이 참이라면 이 실행코드 실행
			// }
			// else {
			//					// 조건식이 거짓이라면 이 실행코드 실행
			// }
			
			//if else 문 문제 01
			// 사용자로부터 두 정수를 입력받는다.
			// 두 수의 합이 짝수면 "두 수의 합은 짝수 입니다."
			// 두 수의 합이 홀수면 " 두 수의 합은 홀수 입니다."
			// 위와 같이 결과값이 나오도록 코딩하세요.
			
//		System.out.println("두개의 정수를 입력해주세요 >>> ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int sum = num1 + num2;
		
//		if (sum % 2 == 0) {
//				System.out.println("두 수의 합은 짝수입니다.");				
	//		} else {
		//		System.out.println("두 수의 합은 홀수입니다.");
			// }
		
			
			
			
			
			// if else 문 문제 02
			// 사용자로부터 정수를 입력받는다.
			// 그 수가 num => 2 && num <= 20 이면
			// 조건식이 참이면 "2 ~ 20범위 안에 있습니다"
			// 조건식이 거짓이면 "범위를 벗어났습니다."
			// 위와 같은 결과값이 나오도록 코딩하세요.
			
//		System.out.println("사용자로부터 정수를 입력해주세요 >>> ");
//		int num3 = sc.nextInt();
		
		// 1. && 논리 연산을 떠올리지 못했다면
//		if (num3 >= 2) {
			// 2이상이랑면 if문 안에 진입
			// 20 초과가 되면 않됨
			// 20 이하일때만 문구 출력
//				System.out.println("2~20 범위 안에 있습니다.");				
//			} else {
//				System.out.println("범위를 벗어났습니다.");
//			}	
			
		// 2. && 논리 연산을 사용한 방법
//				if (num3 >= 2 && num3  <== 20) {
//						System.out.println("2~20 범위 안에 있습니다.");				
//					} else {
//						System.out.println("범위를 벗어났습니다.");
//					} 
				
//	} else {
					// num이 2미만이거나, num이 20 초과라면
//					System.out.println("범위를 벗어났습니다.");
//				}
					
			
			// 2-3) 중첩 if 문
	// if (조건식1) {
	//	// 조건식1이 참인 겨웅 실행되는 코드 블록
	
	//	// if(조건식2) {
	//		// 조건식1과 조건식2가 참일 때 실행되는 코드 블록
	//	// }
	
	// }
			
			
	
	// 05 else-if
	// 다중분기
//	Scanner sc = new Scanner(System.in);
//	System.out.println("나이 입력 >>> ");
//	int age = sc.nextInt();
	
//	if (age >= 20) {
//		System.out.println("성인입니다.");
//	} else if (age >= 8) {
//		System.out.println("취학 아동입니다.");
//	} else {
//		System.out.println("미취학 아동입니다.");
//	}
		
	
	
	// else - if 문제
	// 시험 점수를 입력받아 90 ~ 100점은 A,
	// 80~89점은 B, 70~79점은 C,
	// 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시요.
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("시험점수를 입력해주세요 >>> ");
//	int score = sc.nextInt();
	
//	if (score >= 90) {
//		System.out.println("A");
//	} else if (score >= 80) {
//		System.out.println("B");
//	} else if (score >= 70) {
//		System.out.println("C");
//	} else if (score >= 60) {
//		System.out.println("D");
//	} else {
//		System.out.println("F");
//	}
	
//	System.out.println("시험점수를 입력해주세요 >>> ");
	// char grade;
	// grade = 'A';
	
	
	
	
	
	
		
//		sc.close();
		
		}
	}


