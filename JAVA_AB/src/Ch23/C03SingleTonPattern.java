package Ch23;

// 디자인 패턴

// 반복적으로 발생하는 설계 문제에 대한 해결책을 재사용 가능한 형태로 정리한 것
// 상품 제작 시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴

// 디자인 패턴은 제작자들 간의 의사소통 수단의 일종
// ex) 의류를 디자인 할 떄 일반적으로 알려진 패턴대로 재단을 한다(~소재는 미싱은 어떻게어떻게해야 ~ 잘 뜯어지지 않는다)
// ex) 그렇게 하지 않을 떄 품질에 이상발생 가능성 높음

// 프로그래밍언어의 디자인 패턴
// 프로그램 제작 시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴

// 싱글톤 패턴
// 하나의 객체를 생성하여 다수의 클라이언트가 접속하여 사용하는 형태
// 하나의 인스턴스를 공유하여 사용할 수 있음

// ex) DB Connection Pool 생성 시 사용

// 어떤 클래스가 최대 한번만 인스턴스화되야 하는 경우에 사용되는 디자인 패턴 중 하나
class SingleTon{
	// 멤버 변수
	int x;
	
	// pirvate 변수
	private static SingleTon instance = null;
	
	// 생성자를 봉인(사용하지 못하도록 막음) -> private 접근 제어자 활용
	private SingleTon() {
		x = 10;
	}
	
	// 객체를 만들어주는 메서드를 정의
	// = 생성자 대신 역할 (근데 생성 역할 X, 객체를 하나만 생성해놓고 그 객체를 반환 역할함)
	// Getter 메서드(method)
	public static SingleTon getInstance() {
		if(instance == null){
			instance = new SingleTon();
		}
		return instance;
	}
}

public class C03SingleTonPattern {

	public static void main(String[] args) {
		
		// 1. 방법 
//		SingleTon obj = new SingleTon();			// Error : 왜? 생성자가 private이여서
		
		// 2. 방법
		SingleTon obj = SingleTon.getInstance();	// Okay Possible
		System.out.println(System.identityHashCode(obj));
		
		SingleTon obj1 = SingleTon.getInstance();
		System.out.println(System.identityHashCode(obj1));
		
	}
	
}
