package Ch10;

import java.util.Scanner;

public class C06Ex {
	
	public static void main(String[] args) {
		
		// 5개의 정수값을 입력받아 int형 배열에 저장하고
		// 최대값, 최소값, 전체합을 출력합니다.
		Scanner sc = new Scanner(System.in);
//		int i =0;
//		for(i<0;i=<array;i++) {
//		System.out.println("5개의 정수를 입력하세요 : " + i);
//		i++;
//		}  
//		
//		max = n1;
//		min = n2;
//		sum = n1 + n2;
//		
//		System.out.println(sum);
		// max min sum 
	
//		int [] arr = new int[5];
//		System.out.println("5개의 값을 입력하세요");
//		arr[0]=sc.nextInt();
//		arr[1]=sc.nextInt();
//		arr[2]=sc.nextInt();
//		arr[3]=sc.nextInt();
//		arr[4]=sc.nextInt();
//		for(int i=0;i<arr.length;i++) {
//			System.out.println();
//		}
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int el : arr) {
//			if(max<el)
//				max=el;
//			if(min>el)
//				min=el;
//		}
		 
		

		
		
		
		
		// 5명의 학생에 국영수 점수를 입력받아 2차원배열 저장
		// 각 학생의 국여수 점수의 합/평균 구하고
		// 각 과목당 합 / 평균 구하기
		
		
		int score[][] = new int[5][3];
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d 번째 학생 국영수 입력 : " ,i+1);
			score[i][0] = sc.nextInt();	// i번째 학생의 국어점수입력
			score[i][1] = sc.nextInt();	// i번째 학생의 영어점수입력
			score[i][2] = sc.nextInt();	// i번째 학생의 수학점수입력
		}
		// 학생별 점수 총점 / 평균
		for(int i=0;i<score.length;i++) {
			int sum = score[i][0] + score[i][1] + score[i][2];
			double avg = (double)sum/3;
			System.out.printf("%d 번째 학생 총점 : %d 평균 : %f\n",i+1,sum,avg);
		}
		
		//과목별 점수 총점 / 평균
		int subject_sum[] = new int[3];
		for(int i=0;i<score[i].length;i++) {		// 국어, 영어, 수학
			
			int sum = 0;
			for(int j=0;j<score.length;j++) {
				
			subject_sum[i] += score[j][i];
			
			}
		}
		System.out.printf("국어 총점 : %d 국어 평균 : %f\n", subject_sum[0],(double)subject_sum[0]/score.length);
		System.out.printf("영어 총점 : %d 영어 평균 : %f\n", subject_sum[0],(double)subject_sum[0]/score.length);
		System.out.printf("수학 총점 : %d 수학 평균 : %f\n", subject_sum[0],(double)subject_sum[0]/score.length);
		
	}	
}
