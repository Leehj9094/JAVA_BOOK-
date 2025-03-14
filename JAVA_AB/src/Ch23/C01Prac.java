package Ch23;

class caramel{
	@Override
	public String toString() {
		return "카라멜";
	}
}
class onion{
	@Override
	public String toString() {
		return "어니언";
	}
}
class PopCorn<T>{
	// 재료 정보
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public void Fry() {
		System.out.println(material + " 맛 팝콘을 만듭니다.");
	}
}
public class C01Prac {

 public static void main(String[] args) {
	PopCorn<caramel> corn1 = new PopCorn<caramel>();
	corn1.setMaterial(new caramel());
	corn1.Fry(); 					// "caramel 맛 카라멜 팝콘을 만듭니다"
	
	PopCorn<onion> corn2 = new PopCorn<onion>();
	corn2.setMaterial(new onion());
	corn2.Fry(); 					// "onion 맛 카라멜 팝콘을 만듭니다"
}
	
}
