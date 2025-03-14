package Ch23;

abstract class 주재료 {
	String 재료;
	public 주재료(String 재료) {
		this.재료 = 재료;
	}
	@Override
	public String toString() {
		return "주재료 [재료=" + 재료 + "]";
	}
	
}
class 커피 extends 주재료 {
	public 커피(String 재료) {
		super(재료);
	}
}
class 차 extends 주재료{
	public 차(String 재료) {
		super(재료);
	}
}
class 주스 extends 주재료 {
	public 주스(String 재료) {
		super(재료);
	}
}

class 음료 <T extends 주재료> {
	
	private T 재료;
	음료 (T 재료) {
		this.재료 = 재료;
	}
	void ShowInfo() {
		System.out.println(재료.toString() + "으로 만든 음료!");
	}
}
public class C02Generic_Extend {
	public static void main(String[] args) {
		커피 obj = new 커피("커피 원두");
		음료<커피> 커피음료 = new 음료<>(obj);
		
		커피음료.ShowInfo();
		
		음료<차> 차음료 = new 음료<>(new 차("녹차 잎"));
		차음료.ShowInfo();
		
		음료<주스> 주스음료 = new 음료<>(new 주스("오렌지"));
		주스음료.ShowInfo();
	
	}
}
