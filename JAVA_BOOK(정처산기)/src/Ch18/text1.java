package Ch18;

public class text1 {

	public static void main(String[] args) {
		
		int i = 0;							// i는 현재 사용하고 있는 행을 나타내는 변수입니다.
		
		while (i < 6) {						// i가 6보다 작아질 때까지 반복 - 6행 출력합니다.(0-5까지 증가하여 각 행에 대한 별과 공백을 출력해줍니다)
			// 공백	
			int j = 0;						// j는 현재 행에서 출력할 공백의 수를 나타냅니다.		
			while (j <= 5 - i) {			// j는 행에서 출력할 공백의 개수를 추적합니다.
				System.out.print(" ");		// 공백을 나타내는 칸을 출력합니다.
				j++;						
			}
			// 별
			int x = 0;						// x는 현재 행에서 출력할 별의 개수를 나타냅니다.
			while (x <= 2 * i) {			// x는 행에서 출력할 별의 개수를 추적합니다.
				System.out.print("*");		// 별을 출력합니다.
				x++;
			}
			System.out.println();			// 한 행이 끝나면 다음 행으로 넘어가기 위한 줄바꿈을 합니다.
			i++;							// i를 증가시켜 다음 행을 준비합니다.
		}
	}
}



