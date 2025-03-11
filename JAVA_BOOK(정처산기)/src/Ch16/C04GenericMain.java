package Ch16;

class Animal{
	String name;
}
class Panda extends Animal{						// 함수에 직접 넣을거임
	// 생성자
	public Panda(String name) {
		this.name = name;
	}
	// toString
	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}	
}
class Tiger extends Animal{
	// 생성자
	public Tiger(String name) {
		this.name = name;
	}
	//toString
	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
}

public class C04GenericMain {

	// GENERIC
	public static<T extends Animal> void printByGeneric(T [] arr) {
		for(T el : arr)
			System.out.println(el);
	}
	
	//OBJECT
	public static void PrintByObject(Object [] animal) {
		for(Object el : animal) {
			System.out.println(el);
		}
	}
	public static void main(String[] args) {
		
		Tiger arr1 [] = {new Tiger("시베리아호랑이"), new Tiger("백두산호랑이"), new Tiger("뱅갈")};
		printByGeneric(arr1);
		
		Panda arr2 [] = {new Panda("아이바오"), new Panda("푸바오"), new Panda("후이바오")};
		printByGeneric(arr2);
		
		Object arr3 [] = {new Tiger("티거"), new Panda("푸우")};
		PrintByObject(arr3);
	}	
}
