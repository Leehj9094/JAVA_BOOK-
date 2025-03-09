package ch12;

//
// 1. Student 클래스를 생성하세요.
// 학생의 이름 (name)
// 학번 (StudentId)
// 학점 (grade)
// 2. 디폴드 생성자를 포함하여, 이름과 학번을 받는 매객변수 생성자를 작성하세요.
// 3. 학생의 학점을 계산하는 메서드 calculateGrade를 추가하세요. 학점은 다음과 같다.
// 90 이상 		 : A
// 80 이상 90 미만 : B
// 70 이상 80 미만 : C
// 60 이상 70 미만 : D
// 60 미만 		 : F

// 4. 학생의 정보를 보여주는 displayInfo 메서드를 추가하세요.

// 5. 객체를 생성한 후, 객체의 정보와 학점을 출력하는 테스트 코드를 작성하세요.
class c13PracStudent {
	private String name;
	private int studentId;
	private char grade;
	public c13PracStudent() {
		
	}
	public c13PracStudent(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	
	}
	public void calculateGrade(int score) {
		if (score >= 90) {
			grade = 'A';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
	}
	public void displayInfo() {
		System.out.println("학생 정보 출력");
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentId);
		System.out.println("학점 : " + grade);
		
	}
}

public class c10FinalPrac {
	public static void main(String[]args) {
		// 학생 객체 생성
		c13PracStudent student1 = new c13PracStudent("홍길동", 20210001);
		// 시험 점수 부여
		int examScore = 65;
		// 학점 계산
		student1.calculateGrade(examScore);
		// 정보 출력
		student1.displayInfo();
		
	}

}
