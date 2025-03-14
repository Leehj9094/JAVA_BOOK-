package Ch23;

abstract class Material{
	
}
class Powder extends Material{
	public void doPrinting() {
		System.out.println("Powder 재료로 출력");
	}
}
class Plastic extends Material{
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}
}
class Water extends Material{
	public void doPrinting() {
		System.out.println("Water 재료로 출력");
	}
}

// 3D Printer 클래스 <------------------ 사용 클래스(다른 클래스를 사용하는 설계도)
class ThreeDPrinter<T extends Material>{
	
	private T material;
	// getter and setter -------------------> private한 정보가 있음
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial() {
		return material;
	}
}
public class C02Prac {
	public static void main(String[] args) {
		ThreeDPrinter<Powder> print1 = new ThreeDPrinter<Powder>();	// 3d프린트의 제너릭 타입을 Powder로 저장
		//3d3프린트(Powder) 객체 생성
		print1.setMaterial(new Powder());	// powder객체 생성 후 주소를 3d프린트객체로 전달
		print1.getMaterial().doPrinting();	// 3d 프린트의 get함수로 meterial을 꺼내 doPrinting()
		
		ThreeDPrinter<Plastic> print2 = new ThreeDPrinter<Plastic>();
		print2.setMaterial(new Plastic());
		print2.getMaterial().doPrinting();
		
		// 문제 재료는 플라스틱과 파우더만 가능하게 extends 합니다
		ThreeDPrinter<Water> print3 = new ThreeDPrinter<Water>();
		print3.setMaterial(new Water());
		print3.getMaterial().doPrinting();
		
	}
}
