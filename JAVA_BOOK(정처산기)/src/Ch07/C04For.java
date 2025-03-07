package Ch07;

public class C04For {

	public static void main(String[] args) {
		
//		int i = 0;			// 탈출용 변수 선언
//		while(i<10) {		// 탈출용 조건식
//			System.out.println("HELLO WORLD");
//			i++;			// 탈출용 연산식
//		}
//		for(int i=0; i<10; i++) {
//			System.out.println("HELLO WORLD");
//		}
		
		// 1-1-까지 합
		// 1-N 까지 합
		// N=M 까지 합(N<M)
		// 2단 구구단
		// N단 구구단(2<=N<=9)
		// 2-9 구구단
		// 2-N 구구단
		// N-M 구구단
		// 별찍기
		
//		int i = 0;
//		while(i<10) {
//			int j = 0;
//			while(j<i+1) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		for(int i=0;i<4;i++) {
//			System.out.print("*");
//		System.out.println();
//		}
		
		int i = 0;
		while(i<4) {
			//공백
			int j = 0;
			while(j<3-i) {
				System.out.print(" ");
				j++;
			}
			// 별
			int k = 0;
			while(k<=2*i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}
	
}
