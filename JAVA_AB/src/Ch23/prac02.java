package Ch23;

public class prac02 {
	public static void main(String[] args) {
		ThreeDPrinter<power> print1 = new ThreeDPrinter<power>();	// 3d프린트의 제너릭 타입을 Powder로 저장
		//3d3프린트(Powder) 객체 생성
		print1.setMeterial(new Powder());	// powder객체 생성 후 주소를 3d프린트객체로 전달
		pritn1.getMeterial().dopPrinting();	// 3d 프린트의 get함수로 meterial을 꺼내 doPrinting()
		
		ThreeDPrinter<Plastic> print2 = new ThreeDPrinter<plastic>;
		print2.setMeterial(new Plastic());
		print2.getMeterial().doPrinting();
		
		// 문제 재료는 플라스틱과 파우더만 가능하게 extends 합니다
		
	}
}
