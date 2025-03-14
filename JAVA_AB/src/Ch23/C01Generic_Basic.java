package Ch23;

// ### 제네릭 (Generic) ###
// 타입(type)을 일반화하여 코드의 재사용성과 안정성을 향상시키는 기술
// 코드를 특정한 데이터 타입에 의존하지 않고 일반으로 작성할 수 있음

//class StringBox {
//	private String content;
//	
//	public StringBox(String content) {
//		this.content = content;
//	}
//	public String getContent() {
//		return content;
//	}
//}
//class IntBox{
//	private int content;
//	
//	public IntBox(int content) {
//		this.content = content;
//	}
//	public int getContent() {
//		return content;
//	}
//}
//class BooleanBox{
//	private boolean content;
//	
//	public BooleanBox(boolean content) {
//		this.content = content;
//	}
//	public boolean getContent() {
//		return content;
//	}
//}
//
//public class TEST{
//	public static void main(String[] args) {
//		StringBox test = new StringBox("이동하");
//		System.out.println(test.getContent());
//		
//		IntBox test1 = new IntBox(12);
//		System.out.println(test1.getContent());
//		
//		BooleanBox test2 = new BooleanBox(true);
//		System.out.println(test2.getContent());
//	}
//}


class Box<T>{
	private T content;
	
	public Box(T content) {
		this.content = content;
	}
	public T getContent() {
		return content;
	}
}

public class C01Generic_Basic {

	public static void main(String[] args) {
		
		// 문자열을 담은 Box 생성
		Box<String> stringBox = new Box<>("Hello, Generic");
		String content = stringBox.getContent();
		System.out.println("String Box Content : " + content);
		
		// 정수를 담은 Box 생성
		Box<Integer> intBox = new Box<>(42);
		int intValue = intBox.getContent();
		System.out.println("Integer Box Content : " + intValue);
		
		// 불린 값을 담은 Box 생성
		Box<Boolean> booleanBox = new Box<>(true);
		boolean boolValue = booleanBox.getContent();
		System.out.println("Boolean Box Content : " + boolValue);
	}
	
}
