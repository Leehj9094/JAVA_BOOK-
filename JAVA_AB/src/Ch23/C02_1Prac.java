package Ch23;

// 문제
// 1. Pair라는 제네릭 클래스를 작성하고 이 클래스는 두 개의 요소를 가짐
// 2. pair 클래스의 생성자는 두 요소를 받아서 객체를 초기화 함
// 3. getFirst 메소드는 첫 번째 요소를 반환
// 4. getSecond 메소는 두 번째 요소를 반환

class IntPair {
	int first;
	int second;

	public IntPair(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void showElement() {
		System.out.println("First Element : " + first);
		System.out.println("Second Element : " + second);
	}
}

class StringPair {
	String first;
	String second;

	public StringPair(String first, String second) {
		this.first = first;
		this.second = second;
	}
	public void showElement() {
		System.out.println("First Element : " + first);
		System.out.println("Second Element : " + second);
	}
}
class Pair<T, U> {
	T first;
	U second;
	
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	public void showElement() {
		System.out.println("First Element : " + first);
		System.out.println("Second Element : " + second);
	}
}

public class C02_1Prac {
	
	public static void main(String[] args) {
	
		// First Element : 10
		// Second Element : 20
		Pair<Integer, Integer> obj = new Pair<>(10,20);
		obj.showElement();
		
		// First Element : HELLO
		// Second Element : WORLD
		Pair<String, String> obj1 = new Pair<>("HELLO","WORLD");
		obj1.showElement();
	}
}
