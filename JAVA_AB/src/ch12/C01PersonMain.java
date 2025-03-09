package ch12;

public class C01PersonMain {
	public static void main(String[] args) {
		c01Person hong = new c01Person();
		hong.name = "홍길동";
		hong.age = 35;
		hong.address = "대구광역시 반월당 센트럴타워";
		
		hong.hello();
		
		System.out.printf("%s님의 나이는 %d이고 주소는 %s입니다.", hong.name, hong.age, hong.address);
		
		
//		c01Person dong = new c01Person();
//		dong.name = ;
		
	}

}
