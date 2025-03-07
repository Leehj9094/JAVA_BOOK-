package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		
		// 2단 - 9단 출력
//		int dan = 2;
//		while(dan<10) {
//			
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			
//			dan++;
//		}
		// 2단 - 9단 출력(2x9,2x8,...9x9 , ...9x1)
//		int dan = 2;
//		while(dan<=9) {
//			
//			int i = 9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}
		
		//9단 - 2단(9x9 , 9x8 -2x1)
//		int dan = 9;
//		while(dan>=2) {
//			
//			int i = 9;
//			while(i>=9) {
//				System.out.printf("%d x %d = %d\n",dan, i ,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}
		
		// 2단 - N단(N<9)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단 수 입력 : ");
//		int n = sc.nextInt();
//		
//		while(n>9 || n<2) {
//			System.out.print("2 -9 사이의 값을 입력하세요. ");
//			System.out.print("단 수 입력 : ");
//			n = sc.nextInt();
//		}
//		
//		int dan = 2;
//		
//		while(dan<n+1) {
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		// N단 - M단 (N<M , N<9 , M<9)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단 수 입력(시작단수 끝단수) : ");

//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		while(n>9 || n<2 || m>9 || m<2) {
//			System.out.print("[!] 값범위[2-9]를 초과하였습니다. ");
//			System.out.print("단 수 입력(시작단수 끝단수) : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
		
//		while(n>9 || n<2) {
//			System.out.print("2 -9 사이의 값을 입력하세요. ");
//			System.out.print("단 수 입력(시작단수 끝단수) : ");
//			n = sc.nextInt();
//		}
//		while(m>9 || m<2) {
//			System.out.print("2 -9 사이의 값을 입력하세요. ");
//			System.out.print("단 수 입력(시작단수 끝단수) : ");
//			m = sc.nextInt();
//		}
		
//		while (n>m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		int dan = n;
//		while(dan<m+1) {
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		// i (개행) 	j(*)	h(높이)
//		
//		System.out.println();		//줄바꿈(개행)
//		System.out.print("*");		//별찍기
		
		// 별찍기(기본높이:4)
		
		// *****
		// *****
		// *****
		// *****

//		for (int i = 0; i < 4; i++) {
//			for (int j =0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
//		int i = 0;
//		while(i<4) {
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h+1) {
//			
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//*
		//**		
		//***
		//****
		
//		int i = 0;
//		while(i<4) {
//			
//			int j =0;
//			while(j<i+1) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h+1) {
//			
//			int j =0;
//			while(j<i+1) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("별 입력 : ");
//		int h = sc.nextInt();
//		
//		for (int i = 1; i < h; i++) {
//			for (int j =1; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		sc.close();
		
			
		//****
		//***
		//**
		//*
			
//		int i = 0;
//		while(i<4) {
//			
//			int j = 0;
//			while(j<4-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h) {
//			
//			int j = 0;
//			while(j<4-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("별 입력 : ");
//		int h = sc.nextInt();
//		
//		for(int i = h; i> 0; i--) {
//			for(int j = i; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
				
		//   *
		//  ***
		// *****
		//*******
			
//		int i = 0;
//		while(i<4) {
//			//공백
//			int k = 0;
//			while(k<=3-i) {
//				System.out.print(" ");
//				k++;
//			}
			// 별
//			int j = 0;
//			while(j<=2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<4) {
//			
//			int k = 0;
//			while(k <= (h-1)-i) {
//				System.out.print(" ");
//				k++;
//			}
//			int j = 0;
//			while(j<=2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc = new.Scanner(System.in);
		
//		for(int i = 1; i<8; i+=2){
//			for(int j = 7; j>i; j=-2;){
//				System.out.print(" ");
//		}
//		for(int i = 0; j< i; j++) {
//			System.out.println("*");
//		}
//		System.out.prnitln();
//	}
//		sc.close();
			
				
		//*******
		// *****
		//  ***
		//   *

		//i(행)		j(별)		k(공백)
		//i=0		j=0			k=0
		//i++		j++			k++
		//i<4		j<=6 -2*i	k<i
		
		
		
//		int i = 0;
//		
//		while(i<4) {
//			
//		int k = 0;
//		while(k < i) {
//			System.out.print(" ");
//			k++;
//		}
//		int j = 0;
//		while(j<=6-2*i) {
//			System.out.print("*");
//			j++;
//		}
//		System.out.println();
//		i++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h) {
//			
//		int k = 0;
//		while(k<i) {
//			System.out.print(" ");
//			k++;
//		}
//		int j = 0;
//		while(j<=((h-1)*2)-2*i) {
//			System.out.print("*");
//			j++;
//		}
//		System.out.println();
//		i++;
//		}
	
		
//		for(int i =1; i<8;i+=2) {
//			for(int j =1;j<i;j+=2) {
//				System.out.print(" ");
//			}
//			for(int j =8;j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
				
		//   *
		//  ***
		// *****		
		//*******
		// *****
		//  ***
		//   *

//		int i = 0;
//		while(i<4) {
//			
//			int k = 0;
//			while(k<=3-i) {
//				System.out.print(" ");
//				k++;
//			}
//			 
//			int j = 0;
//			while(j<=2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		while(i<3) {
//			
//			int k = 0;
//			while(k<i) {
//				System.out.print(" ");
//				k++;
//		}
//			int j = 0;
//			while(j<6-2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//
//		Scanner sc = new.Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h) {
//			
//			int k = 0;
//			while(k<i) {
//				System.out.print(" ");
//				k++;
//			}	 
//			int j = 0;
//			while(j<=2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		while(i<h) {
//			
//			int k = 0;
//			while(k<i) {
//				System.out.print(" ");
//				k++;
//		}
//			int j = 0;
//			while(j <=(h-1)*2)-2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		for(int i=0;i<8;i+=2) {
//			for(int j=7;j>i;j-=2) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 1; i<8;i+=2) {
//			for(int j =0;j<8;j+=2) {
//				System.out.print(" ");
//			}
//			for(int j=7; j<8;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		int i =0;
//		while(i<7) {
//			if(i<4) {						//i<=3	//i<=(h/2)
//				//공백()
//				int k =0;
//				while(k<3-i) {				// k<(h/2)-i
//					System.out.print(" ");
//					k++;
//				}
//				//별()
//				int j =0;
//				while(j<=2*i) {				//j<=2*i
//					System.out.print("*");
//					j++;
//				}
//			}else {
//				//공백()
//				int k=0;
//				while(k<i-5) {				//k<=i-(h/2+1)
//					System.out.print(" ");
//					k++;
//				}
//				//별()
//				int j=0;
//				while(j<=12-2*i) {			//j<=((h-1)*2)-2*i
//					System.out.print("*");
//					j++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
		

		
		
				
		//*******
		// *****
		//  ***
		//   *		
		//   *
		//  ***
		// *****		
		//*******
		
//		int i =0;
//		while(i<4) {			
//			int k = 0;
//			while(k<i) {
//				System.out.print(" ");
//				k++;
//			}			
//			int j =0;
//			while(j<=6 -2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		while(i<3) {
//			int k = 0;
//			while(k<i) {
//				System.out.print(" ");
//				k++;
//			}
//			int j =0;
//			while(j<=2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//		}
//		
//		Scanner sc = new.Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i =0;
//		while(i<h-1) {			
//			int k = 0;
//			while(k<i) {
//				System.out.print(" ");
//				k++;
//			}			
//			int j =0;
//			while((h-1)*2)-2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		while(i<h-3) {
//			int k = 0;
//			while(k<i) {
//				System.out.print(" ");
//				k++;
//			}
//			int j =0;
//			while(j<=2*i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//		}
//		
//		for(int i=0;i<8;i-=2) {
//			for(int j=0;j<i;j+=2) {
//				System.out.print(" ");
//			}
//		for(int j=7;j<8;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//		for(int i=0;i<8;i+=2) {
//			for(int j=0;j<i;j-=2) {
//				System.out.print(" ");
//			}
//		for(int j=7;j<8;j--) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
		
//		
//		int i=0;
//		while(i<7) {
//			if(i<=3) {
//				int k=0;
//				while(k<=i-3) {
//					System.out.print(" ");
//					k++;
//				}
//				int j=0;
//				while(j<=12-2*i) {
//					System.out.print("*");
//					j++;
//				}
//			}
//			else {
//				int k=0;
//				while(k<i) {
//					System.out.print(" ");
//					k++;
//				}
//				int j=0;
//				while(j<=2*i) {
//					System.out.print("*");
//					j++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
		
		
	}
	
}
