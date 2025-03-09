package ch12;

// 프로그램은 sum 메소드를 통해 주어진 숫자들에 대한 홀수와 짝수의 합을 계산하고, 그 결과를 출력하는 간단한 프로그램
class PracticeOE {
	public int sum(int x, int y, int z, int w) {
		
		// 짝/홀수의 합을 누적해줄 누적합 변수
		int oddSum = 0;
		int evenSum = 0;
		// 만약 x가 짝수하면 = 짝수의 합
		// 만약 
		
		System.out.println("짝수의 합 : ");
		System.out.println("홀수의 합 : ");
		
		
		
		
		return x + y + z + w;
	}
}


public class c08PracOddEven {
	public static void main(String[] args) {
		PracticeOE test = new PracticeOE();
		
		// sum 메서드를 호출하여 인수로 20, 21, 12, 111, 을 전달하고 반환값을 변수에 저장 후 결과를 출력
		int result = test.sum(20, 21, 12, 111);
		
		System.out.println("result = " + result);
	}
	// 실행 예)
	// 짝수의 합 : 32
	// 홀수의 합 : 132
	// result = 162

}
