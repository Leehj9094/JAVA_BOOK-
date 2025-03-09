package ch12;
// 문제 1: 사각형 클래스 만들기


// 1. Rectangle 클래스를 작성하세요.
// 2. width와 height라는 두 개의 속성 (멤버 변수)을 가지도록 클래스를 구성하세요
// 3. 생성자르 통해 width와 height를 초기화하세요
// 4. getArea() 메소드를 구현하여 사각형의 넓이를 반환하세요
// 5. getPerimeter() 메소드를 구현하여 사각형의 둘레를 반환하세요

class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	// 넓이 메서드
	public int getArea() {
		int area = width * height;
		return area;
	}
	
	// 둘레 메서드
	public int getPerimeter() {
		int length = (width + height) * 2;
		return length;
	}
}


public class c05PracRectangle {
	// 객체 생성
	public static void main(String[] args) {
		Rectangle myRec = new Rectangle(10, 5);
		System.out.println("넓이 : " + myRec.getArea());
		System.out.println("길이 : " + myRec.getPerimeter());
	}

}
