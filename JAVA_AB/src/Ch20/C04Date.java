package Ch20;

import java.sql.Date;

### Date Class ###
	JAVA에서 날짜오 ㅏ시간을 나타내기 위한 클래스
	JAVA 8부터는 새로운 날짜 및 시간 API인 "java.time" 패키지의 LocalDate, LocalTime, LocalDateTime 등으로 대체됨
	
	### Calendar Class ###
	날짜와 시간을 다루기 위한 추상 클래스
	날짜 계산 및 조작을 위해서 자바에서 제공되는 클래스
	JAVA 8부터는 "java.time" 패키지의 날짜 및 시간 API로 대체됨
	
	==>하지만 Date 클래스는 여전히 많이 사용되고 있음
	
public class C04Date {
		public static void main(String[] args) {
			
			Date d1 = new Date();		// 현재 날짜와 시간을 나타냄
			System.out.println(d1);
			
			System.out.println(d1.getYear() + 1900 + "년"); 	// 현제 연도에서 1900을 뺸 값을 반환
			System.out.println(d1.);
				
		}

}
