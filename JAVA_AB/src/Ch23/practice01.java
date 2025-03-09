package Ch23;
class caramel{
	
	@Overray
	
}
class onion{
	
}


class popcorn<T> {
	//재료정보
	private T material;
	
	public void setMeterial(T material) {
		this.material = material;
	}
	
	public void Fry() {
		System.out.println(material  + "카라멜맛 팝콘을 만듭니다.");
	}
}

public class practice01 {

	public static void main(String[] args) {
		PopCorn<caramel> corn1 = new PopCorn<caramel>();
		corn1.setMeterial(new caramel());
		corn1.Fry();		//"caramel 및 카라멜 팝콘을 만듭니다."
		
		PopCorn<onion> corn2 = new PopCorn<onion>();
		corn2.setMeterial(new onion());
		corn2.Fry();		//"onion 맛 카라멜 팝곤을 만듭니다"
	}
}
