package java_lesson;

import java.util.Scanner;

public class ch06 {
	public static void main(String[] args) {
		
		// 06 삼항연산자
		// (조건식) ? 참인 경우 실행코드 : 거짓인 경우 실행코드;
		System.out.println("----------------- 삼항 연산자 예제-------------------");
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다."); 
		System.out.println();
		
		
		
		Scanner sc = new Scanner(System.in);
		// 01 홀수/짝수
		// 사용자로부터 정수를 하나 입력받고,
		System.out.println("정수를 하나 입력해주시면 짝/홀수 구분을 할게요 >>> ");
		int tmp_num = sc.nextInt();
		String result = (tmp_num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println("결과 : " + result);
		
		// 연산자를 이용해 짝수면 짝수입니다를 출력,
		System.out.println("");
		// 홀수면 홀수입니다를 출력\
		System.out.println("");
		// [결과값]
		// 정수를 입력해주세요 : 12
		System.out.println("");
		// 결과 : 짝수입니다.
		System.out.println("");
		
		
		
		// 02 배수 구하기
		
		// 세 정수를 받아서 세 수의 합이 5의 배수인 경우
		System.out.println("첫번째 정수를 입력해주세요 >>> ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력해주세요 >>> ");
		int num2 = sc.nextInt();
		
		System.out.println("세번째 정수를 입력해주세요 >>> ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		
		
		// 5의 배수입니다 를 출력
		System.out.println("5의 배수입니다.");
		
		// 아닌 경우 5의 배수가 아닙니다 를 출력
		System.out.println("5의 배수가 아닙니다.");
		
		System.out.println("결과" + result);
		
		sc.close();
		
	}

}
