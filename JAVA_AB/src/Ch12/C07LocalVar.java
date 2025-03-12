package Ch12;

// ### 지역변수(LocalVariable) ###
// 특정구역({}) 내에서 생성되어 그 구역에서만 사용 간으한 변수, 즉 함수 속에서 선언되어 함수 속에서만 사용 가능한 변수
// 함수나 {} 끄나게 되면 메모리에서 '' 소명 ''

// ### 전역변수 (Global Variable) ###
// 어느 위치에서든 호출하면 사용이 가능한 변수 즉, 함수 밖에서 선언하여 클래스 전체에서 사용 가능한 변수

// 1. 전역변수는 프로그램 전체에서 사용가능한 변수
// 프로그램 종료 시 메모리에서 제거

// 2. 전역변수는 사용 최소화하는게 좋음
class LocalVar {
	int num = 10;
	void Func1() {
		System.out.println("멤버변수 num = " + num);
		if (true) {
			// 지역변수
			int num = 100;
			System.out.println("if문 안의 지역변수 num = " + num);
			
		}
		System.out.println("멤버변수 num = " + num);
	}
}
public class C07LocalVar {
	int age = 22;
	LocalVar test = new LocalVar();
	
	public static void main(String[] args) {
	LocalVar test = new LocalVar();
	test.Func1();
	}

}
	
