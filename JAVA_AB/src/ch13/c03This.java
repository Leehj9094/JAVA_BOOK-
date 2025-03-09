package ch13;

// ### 'this'  keyword ###
// 클래스 내에서 사용되는 예약어
// 생성되는 객체의 위치정보를 가져오는데 사용됨

// 멤버변수 vs 매개변수 구별
// this.name = name

// ## this() ##
// Overloading(오버로딩) 된 다른 생성자 호출 가능함.

class c03Simple {
	int x;
	int y;
	
	public c03Simple() {
//		x = 10;
//		y = 10;
//		this(10, 10);		// c03Simple(int x, int y) 매개변수 
		this(10);
	}
	public c03Simple(int x) {
//		this.x = x;
//		y = 10;
		this(x, 10);
	}
	public c03Simple(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
public class c03This {
	public static void main(String[]args) {
		c03Simple ob1 = new c03Simple();
		c03Simple ob2 = new c03Simple(100);
		c03Simple ob3 = new c03Simple(100, 200);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}
	

}
