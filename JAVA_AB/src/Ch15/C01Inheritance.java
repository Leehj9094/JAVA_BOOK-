package Ch15;

class Animal{
	String name;
	
	public void sound() {
		System.out.println(name + "이 소리를 내다");
	}
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}

public class C01Inheritance {

	public static void main(String[] args) {
		
	Dog puppy = new Dog();
	Cat kitty = new Cat();
	
	puppy.name = "멍멍";
	kitty.name = "야옹";
	
	puppy.sound();
	kitty.sound();
		
	}
	
}
