package Ch23;
// ### 제네릭 (Generic)
//
//

class 
private T content;
	
	public Box(T content) {
		this.content = content;
	}
	public T getContent() {
		return content;
	}
	
public class C23 {
	public static void main(String[] args) {
		// 문자열을 담은 Box 생성
		Box<String> stringBox = new Box<>("Hello, Generic");
		String content = stringBox.getContent();
		System.out.println("String Box Content : " + content);
		
		// 정수를 담은 Box 생성
		Box<Integer> intBox = new Box<>(42);
		String intValue = intBox.getContent();
		System.out.println("Integer Box Content : " + intValue);
		
		// 불린 값을 담은 Box 생성
		Box<Boolean> booleanBox = new Box<>(true);
		boolean boolValue = booleanBox.getcontent();
		System.out.println("boolean Box Content : " + boolValue);
	}
	
		
		
	
	
}

