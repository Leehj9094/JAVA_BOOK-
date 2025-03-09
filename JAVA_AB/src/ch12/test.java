package ch12;

class PersonTest{
	String name;
	int age;
//	int age1;

	public PersonTest() {
		this.name = "User12345";
		this.age = 37;
//		int result = 12 + 20;
//		System.out.println(result);
//		dong.name = "이동하";
//		dong.age = 20;
		
	}
	public PersonTest(String name, int age) {
		this.name = name;				// this.name = 멤버변수 , name = 매개변수
		this.age = age;
	}
	
//	public int sum(int x, int y) {
//		int result = x + y;
//		return result;
//	}
}

public class test {

	public static void main(String[] args) {
		
		PersonTest dong = new PersonTest("이동하", 20);
		
//		PersonTest dong = new PersonTest();
//		dong.name = "이동하";
//		dong.age = 20;
//		dong.age1 = 30;
//		System.out.println(dong.name);
//		System.out.println(dong.age);
		
//		PersonTest hong = new PersonTest();
//		System.out.println(hong.name);
//		System.out.println(hong.age);
		
//		System.out.printf("%s님의 나이는 %d입니다", dong.name, dong.age);
		
	}
	
}
