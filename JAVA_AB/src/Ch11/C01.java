package Ch11;

public class C01 {
	public static void main(String[] args) {
		// 01 for문 구조
		
		// 반복 횟수를 미리 정해놓고 반복을 수행하는 구조
		
		// for( 초기식, 조건식, 증감식) {
		// 조건식이 참일 떄 수행할 코드 }
		
		// for문의 동작원리
		// 1. 초기식에는 변수 초기화가 일어남. 이때 초기화된 변수를 for문 블럭 {} 안에서 사용할 수 있음
		// 2. 조건식을 평가
		// 3. 조건이 참 일 경우 for문 실행함 (거짓일 때 for문 탈출)
		// 4. 증감식으로 회기하여 증감식 실행
		// 5. 다시 조건식 판별
		
		for (int i = 1; i<=10; i++) {
			System.out.println("HELLO WORLD");
		}
	}
}
