package java_lesson;

import java.util.Scnner;

public class ch10 {
	
	public static void main(String[] args) {
		
		// 중첩 while문
		
			// 문제
			// 구구단 2단 출력
		// System.out.println("2 x 1 = 2");
			
		int dan = 2;
		int i = 1;
		while (i <= 9) {
		System.out.printf("2 X %d = %d|n", i, 2 * i);
		i++;
		}

		int dan = 2;
		while (i <= 9) {
		// dan이 2일 때 로직
		int i = 1;
		while (i <= 9) {
		System.out.printf("2 X %d = %d|n", i, 2 * i);
		i++;
		}
		dan++;
		System.out.println();
		}


		// 문제
		// 구구단 2단 출력
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		System.out.println("2 x 4 = 8");
		System.out.println("2 x 5 = 10");
		System.out.println("2 x 6 = 12");
		System.out.println("2 x 7 = 14");
		System.out.println("2 x 8 = 16");
		System.out.println("2 x 9 = 18");


		// 구구단 2단 출력 (역순출력)
		int dan = 2;
		int i = 9;
		while (i >= 1) {
		System.out.printf("%d X %d = %d|n", dan, i, dan * i);
		i--;
		}

		// 구구단 2단 출력 (입력받기)
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 하나 입력해 주세요 >>> ");
		int num = sc.nextInt();

		int dan = num;
		int i = 1;
		while (i <= 9) {
		System.out.printf("%d X %d = %d|n", dan, i, dan * i);
		i++;
		}


		// 구구단 N단 출력(입력받기, 역순출력) (별첨 ... 2<=N<=9)
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요 >>> ");
		int n = sc.nextInt();

		int dan = num;
		int i = 9;
		while (i >= 1) {
		System.out.printf("%d X %d = %d|n", dan, i, dan * i);
		i--;
		}


		// 전체 구구단 (2단 -9단) 출력하기
		int dan = 2;
		while (i <= 9) {
		// dan이 2일 때 로직
		int i = 1;
		while (i <= 9) {
		System.out.printf("2 X %d = %d|n", i, 2 * i);
		i++;
		}
		dan++;
		System.out.println();
		}


		// N부터 9단까지 전체 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요 >>> ");
		int num = sc.nextInt();	// 전체 구구단(2단9단) 출력하기

		int dan = num;
		while (dan <= 9) {
		// dan이 2일 때 로직
		int i = 1;
		while (i <= 9) {
		System.out.printf("%d X %d = %d|n", dan, i, dan * i);
		i++;
		}
		dan++;
		System.out.println();
		}

		// 전체 구구단(2단-9단) 출력하기 (단만 역순 출력)
		int dat

		int dan = 9;
		while (dan >= 2) {
		int i = 1;
		while (i <= 9) {
		System.out.printf("%d X %d = %d|n", dan, i, dan * i);
		i++;
		}
		dan++;
		System.out.println();
		}

		// 전체 구구단(2단-9단) 출력하기 (전체 역순 출력)

		int dan = 9;
		while (dan >= 2) {
		int i = 1;
		while (i <= 9) {
		System.out.printf("%d X %d = %d|n", dan, i, dan * i);
		i--;
		}
		dan--;
		System.out.println();
		}

		//1
		//*****
		//*****
		//*****
		//*****
		System.out.println("*****);
		System.out.println("*****);
		System.out.println("*****);
		System.out.println("*****);

		int i = 1;
		while(i <=4) {
		int j =1;
		while(j <= 5) {
		System.out.print("*");
		j++;
		}
		System.out.println();
		i++;
		}

		// 높이 : n
		// *****
		// *****
		// *****
		// *****
		Scanner sc = new Scanner(System.in);








		// 2
		//*
		//**
		//***
		//****

		int i = 1;
		while(i <= 4) {
		// i가 1일 때 별의 개수는 1개를 찍어야함.
		System.out.print("*");
		// i가 2일 때 별의 개수는 2개를 찍어야함.
		System.out.print("**");
		// i가 3일 때 별의 개수는 3개를 찍어야함.
		System.out.print("***");
		// i가 4일 때 별의 개수는 4개를 찍어야함.
		System.out.print("****");

		System.out.println();
		i++;
		}

		int i = 1;
		while (i <= 4) {
		int j = 1;
		while (j <= 1) {
		System.out.print("*");
		j++;
		}
		System.out.println();
		i++;
		}


		//높이 : 4
		//*
		//**
		//***
		//****

		Scanner sc = new Scanner(System.in);
		int 

		int i = 1;
		while (i <= height) {
		int j = 1;
		while (j <= 1) {
		System.out.print("*");
		j++;
		}
		System.out.println();
		i++;
		}

		//3
		//****
		//***
		//**
		//*

		int i = 1;
		while (i <= 4) {
		int j = 1;
		while (j <= 5-i) {
		System.out.print("*");
		j++;
		}
		System.out.println();
		i++;
		}

		// 높이 : 4
		//****
		//***
		//**
		//*
		Scanner sc = new Scanner(System.in);
		System.out.println("높이 입력 >>> ");
		int height = sc.nextInt();

		int i = 1;
		while (i <= height) {
		int j = 1;
		while (j <= height + 1 - i) {
		System.out.print("*");
		j++;
		}
		System.out.println();
		i++;
		}

		//4
		//   *
		//  ***
		// *****
		//*******

		//---*
		//--***
		//-*****
		//*******

		int i = 1;
		while(i = <= 4) {
		// i = 1일 때 공백을 3번 반복\
		// i = 2일 때 공백을 2번 반복
		int j = 1;
		while(j <= 4 - i) {
		System.our.print(" ");
		j++;
		}


		// i = 1일 때 별을 1번 반복
		// I = 2일 때 별을 3번 반복
		int k = 1;
		while(k <= 2 * i - 1) {
		System.out.print("*");
		k++;
		}

		System.out.println();
		i++;
		}
		
	}
	

}
