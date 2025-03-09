package Ch15;

// 부모 클래스 : SmartPhone
class SmartPhone {
	private int inch;
	private int battery;
}

public SmartPhone(int inch, int battery) {
	this.inch = inch;
	this.battery = battery;
}

// 속성
// 인치(사이즈)
// 배터리 용량
//=====================================================================
//자식 클래스 : SmartPhoneWithCamera

class SmartPhoneWithCamera extends SmartPhone {
	public SmartPhoneWithCamera(int inch, int battery) {
		super(inch, battery);
		// TODO Auto-generated constructor stub
	}

	private int cameraResolution;
}

	public void SmartPhoneWithCamera(int inch, int battery, int cameraResolution) {
		super(inch, battery);
		this.cameraResolution = cameraResolution;
	}
	
	
//
//속성
//카메라 해상도(메가픽셀)
//
//기능
//printDtails()	: 스마트폰의 속성 정보 출력
	
	public void printDetails() {
		System.out.println();
	}

public class c02PracSamrtPhone {
	public static void main(String[] args) {
//		SmartPhoneWithCamera 객체 생성
//
		SmartPhoneWithCamera myPhone = new SmartPhoneWithCamera(6, 4000, 108);
		// 스마트폰 속성 출력
		myPhone.printDetails();
		//[결과값]
		//6인치
		//4000Ah
		//108MP
	}

}
