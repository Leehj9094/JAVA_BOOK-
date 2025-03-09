package CH15;

class Exam {
	int num1;
	 
	
	public void write() {
		System.out.println("부모에서 쓰는 중");
	}
}
class Example extends Exam {
	int num2;
	public void write() {
		System.out.println("자식에서 쓰는 중");
	}
}
public class c04UpDownCastingInfo {
	public static void main(String[] args) {
		// NoCasting 상태 == No (안해) Casting (형을 변환하는 과정)
		// << 부모 >>
		Exam obj = new Exam();
		obj.num1 = 20;
		obj.write();
		
	}

}
