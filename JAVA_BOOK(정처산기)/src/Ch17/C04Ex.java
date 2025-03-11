package Ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C04Ex {

	public static void main(String[] args) {
		
		// 1) 1 ~ 45까지 숫자를 6개를 랜덤으로 받아(Random클래스를 이용) set에 저장 / 출력
		
//		int [] arr1 = new int[6];
//		Random random = new Random();
		
//		for(int i = 0;i<arr1.length;i++){
//			arr1[i] = random.nextInt(45) + 1;
//			arr1[i]= (int)(Math.random() * 45 + 1);
			// 중복번호 제거
//		for(int j =0;j<i;j++) {
//			if(arr1[i] ==arr1[j]) {
//				i--;
//				break;	
//			}
//		}
//	}
		Set<Integer> set = new HashSet();
		Random rnd = new Random();
		while(set.size()<7) {
			set.add(rnd.nextInt(45)+1);
		}
		for(Integer val : set)
			
			System.out.print(val + " ");
				
		// 2) [추가]저장된 set의 오름차순정렬을 해보세요(검색을 통해서 해결해 봅니다. - 스트림함수사용)
		
//		for(int i =0;i<arr1.length;i++) {
//			for(int j=i+1;j<arr1.length; j++) {
//				if(arr1[i]>arr1[j]) {
//					int temp = arr1[i];
//					arr1[i] = arr1[j];
//					arr1[j] = temp;
//				}	
//			}
//		}
//		System.out.println("로또번호 : " + Arrays.toString(arr1));
//		for(int i=0; i<arr1.length;i++) {
//			System.out.print(arr1[i] + " ");
//		}
		
		List<Integer> li = set.stream().sorted().collect(Collectors.toList());
//		li.forEach(System.out::println);
		for(Integer val : li)
			System.out.print(val + " ");
		System.out.println("-----------------");
		
		List<Integer> list = new ArrayList(set);
		Collections.sort(list);
		for(int num : list)
			System.out.print(num + " ");
	}	
}
