package Ch15;

//### 상속 In

class Parent {
	String name;
	int age;
	String address;
	
	public Parent(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
}

class Child extends Parent {
	
	String grade;
	String classes_no;
	String number;
	
	
	public Child (String name, String age, String address, String grade, String classes_no, String number) {
		super(name, age, address);
		this.grade = grade;
		this.classes_no = classes_no;
		this.number = number;
	}
}
public class ch15 {
	
	public static void PrintHello() {
		
		
	}
	

}
