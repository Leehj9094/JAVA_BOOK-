package java_lesson;

import java.util.Scanner;

public class ch09 {
	// 00 반복문
	// 반복적인 실행이 필요할 때 반목문을 사용함.

	// 01 While문의 구조
	// 조건식이 참인 경우 반복적으로 코드를 실행한다.

	// While (조건) {
	// 반복 실행 조건;	// 예) 조건이 참이면 코드 실행
			// 	     거짓이면 반복문 종료
	// }

	// 탈출용 변수
//int i = 1;

	// 탈출용 조건식
	while (i <= 10) {		// 1일때 조건식 만족
	// i가 1일때 실행할 코드
	System.out.println("HELLO WORLD");	// i = 1일 때, HELLO WORLD 출력
	i++		// 탈출을 위한 연산식 // I = 
	}

	int j = 1;
	while (j <= 10) {
	j--;
	}

	// 1부터 10까지의 합 구하기
	// 만약 반복문의 탈출용 변수를 1부터 10까지 증가시킨다면
	// 1부터 10까지의 모든 수의 형태를 탈출용 변수(i)가 가짐.
	//
	// i를 활용해보면 될 것 같음.

	int i = 1;
	// 임의의 공간 선언
	int sum = 0;
	while (i <= 10) {
	// i가 1일 때 가져야하는 로직

	System.out.println("i = " + i);
	sum += i;	//sum = sum + i;
	i++;		// 후치 연산
	}
	System.out.println("while 종료 후 i의 값 = " + i);
	System.out.println("1부터 10까지의 합 = " + sum);

	// N(입력한 수)는 사용자로부터 입력받아야하는 수 	// 12
	// 1부터 N(입력한 수)까지의 합 구하기

	Scanner sc = new Scanner(System.in);
	System.out.println("정수 하나를 입력해주세요 >>");
	int num = sc.nextInt();
	
	int i = 1;
	int sum = 0;
	while (i <= 10) {
		sum += i;
		i++;
	}
	System.out.println("1부터 " + num + "까지의 합 : " + sum);
	System.out.printf("1부터 %d까지의 합 : %d", num, sum);

	// 정수 두개를 입력 받아(n,m) n부터 m까지의 합을 구하세요
	// 이때 받는 수는 n이 m보다 작아야 합니다(제약조건)
	// ----------------------------------------------------------------
	// 위 두문제를 다 풀었다면, 아래 문제의 제약조건이 없을 때의 경우도 풀어보기
	// ( n = 5, m = 3을 넣어도 3부터 5까지의 합은 12)


	Scanner sc = new Scanner(System.in);
	System.out.println("첫번째 정수를 입력해주세요 >>> ");
	int n = sc.nextInt();
	// 탈출용 변수이자, 백업 변수
	int backup n = n;
	
	System.out.println("두번째 정수를 입력해주세요 >>> ");
	int m = sc.nextInt();
	
	
	// 예상 결과 : 3 + 4 + 5 = 12
	// 알 수 있는 것 : n의 탈출용 변수로 사용하면 됨.
	
	// 누적 합을 저장해 줄 변수
	int sum = 0;
	
	// 탈출용 조건식
	while (n <= m) {
		sum += n;
		n++;
	}
	System.out.printf("%d부터 %d까지의 합 : %d", n, m, sum);
	
	System.out.printf("%d부터 %d까지의 합 : %d", n, m, sum);
	
	// 02 while - 무한 루프 이용하기
	// 값을 사용자로부터 입력받아 모두 더하는 프로그램을 만들어보자!!
	// 값이 -1 이라면 프로그램 종료

	Scanner sc = new Scanner(System.in);

	int sum = 0;	// 값 누적용
	int num;		// 키보드 값 받기용

	while(true) {
	System.out.println("정수 입력 (종료 : -1) >>> ");
	num = sc.nextInt();

	if(num == -1) {
	break;
	}

	sum = sum + num;
	}
	System.out.println("누적된 총합 : " + sum);


	// 03 while - if문 삽입

	int i = 1;
	int sum = 0;
	int num = 0;

	while (i <= 10) {
	if (i % 3 == 0) {
	System.out.println("1의 값 : " + i);
	}
	i++;
	}


	// 문제 
	System.out.println("------------------ while - if 문 문제 01-----------------");
	// 입력한 1부터 입력 수중(x)에 3의 배수의 합을 출력
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 하나 입력해 주세요 >>> ");
	int x = sc.nextInt();	// 10
	int i =1;	//누적 합 저장 변수
	int backup x = x;
	int sum = 0;
	while (i <= x) {
	if (i % 3 == 0) {	//3의 배수라면 처리해줄 코드 == 합 로직
	sum += i;
	System.out.println("1부터 : " + x "사이의 수 중 3의 배수의 합 : " + sum);
	}
	}

	// 문제 
	System.out.println("------------------ while - if 문 문제 02-----------------");
	// -1을 입력하기전까지 계속 정수를 받습니다
	// 그리고 입력한 수중의 짝수의합과 홀수의 합을 따로 구해서 출력
	Scanner sc = new Scanner(System.in);
	// 홀/짝수의 누적 합
	int evenSum = 0;
	int oddSum = 0;
	while (true) {
	System.out.println("정수를 입력해주세요 >>> ");
	int num = sc.nextInt();

	if (num == -1) {
	break;
	} else if (num % 2 == 0) {
	//  짝수의 합을 저장해줄 변수에 + 연산
	evenSum += num;
	} else if (num % 3 == 0) {
	// 홀수의 합을 저장해줄 변수에 + 연산
	oddSum += num;
	} 
	System.out.println();





	// 문제 
	System.out.println("------------------ while - if 문 문제 03-----------------");
	// 1부터 100까지 수중에 3의 배수이면서 4의 배수를 출력합니다

	// 문제 
	System.out.println("------------------ while - if 문 문제 04-----------------");
	// 소수를 판별하는 코드를 만드세요
	// 소수 : 1과 자기자신으로만 나누어떨어지는 , % 연산자사용합니다)

	// 소수 : 1과 자기자신으로만 나누어 떨어진다 == 2번만 나누어 떨어짐
	// 가정 (10) : 1 2 5 10 ==> 1부터 10 사이의 수에서 2번만 나누어떨어져야 함.
//			결과 ==> 4번 나누어떨어짐. ==> 소수가 아니다.

	Scanner sc = new Scanner(System.in);
	System.out.println("소수를 판변해드릴게요, 수를 입력해보세요 >>> ");
	int sum = sc.nextInt();

	int i = 1;

	// if문 안에 들어온 횟수를 카운트해줄 변수
	int cnt = 0;
	while (i <= num) {
	if (num % i == 0) {
	// 해당 num의 약수로 나누어 떨어질 때마다 들어왔다는 표식
	}
	i++;
	}
	if (cnt == 2) {
	System.out.println(num + "은 소수입니다.");
	} else {
	System.out.println("num + "은/는 소수가 아닙니다.");
	}




	// 04 continue 예약어

	// 1부터 10까지의 수 중에 3의 배수를 제외하고 출력

	int i = 1;
	while (i % 3 == 0) {
	i++;
	continue;		// 반복문의 조건식으로 회기
	}

	System.out.println("i = " + i);
	i++;
	}
}
