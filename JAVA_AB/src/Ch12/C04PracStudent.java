package Ch12;
// 1. Student 클래스를 작성하세요.
// 2. name과 age라는 두 개의 속성을 가지도록 클래스를 구성하세요.
// 3. 두명의 학생 객체를 만들고 속성을 초기화하세요.
// 4. displayInfo() 메소드를 구현하여 학생의 정보를 출력하세요.

// 실행 ex)
// [SYSTEM] : 홍길동 학생의 정보를 출력합니다
// 이름 : 홍길동
// 나이 : 22

//[SYSTEM] : 이동하 학생의 정보를 출력합니다
//이름 : 이동하
//나이 : 12

class Student {
	String name;
	int age;
	
	public void dispalyInfo() {
		System.out.println("[SYSTEM : " + "학생의 정보를 출력합니다.");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
public class C04PracStudent {
	public static void mein(String[] args) {
		Student lee = new Student();
		Student li = new Student();
				
		lee.name = "홍길동";
		lee.age = 22;
				
		li.name = "이동하";
		li.age = 12;
	
		lee.dispalyInfo();
		li.dispalyInfo();	
	}

}

