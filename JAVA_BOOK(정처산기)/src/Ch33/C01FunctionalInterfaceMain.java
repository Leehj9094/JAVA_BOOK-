package Ch33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface // 함수형 인터페이스 라는 걸 알려주는 <선언 : Compiler에게 전달>
interface Func1 { // 무조건 추상메서드는 하나만 있어야 함
	void say(String message); // 추상메서드
}

@FunctionalInterface // 함수형 인터페이스 라는 걸 알려주는 <선언 : Compiler에게 전달>
interface Func2 { // 무조건 추상메서드는 하나만 있어야 함
	int sum(Integer... args); // 추상메서드
}
@FunctionalInterface // 함수형 인터페이스 라는 걸 알려주는 <선언 : Compiler에게 전달>
interface Func3 { // 무조건 추상메서드는 하나만 있어야 함
	List<Integer> createListDesc(int... args); // 추상메서드
}

public class C01FunctionalInterfaceMain {

	public static void main(String[] args) {

		// 01
		Func1 func1 = (message) -> {
			System.out.println(message + "_!");
		};
		func1.say("HELLO WORLD");

		Func1 func1_1 = System.out::println;
		func1_1.say("HELLO WORLD");

		// 02
		Func2 func2 = (items) -> {
			// {}에 모든 item을 더한 값을 리턴(반복문으로 items의 item을 누적해서 리턴)
			int sum = 0;
			for(Integer el : items) 
				sum+=el;
			return sum;
		};
		System.out.println(func2.sum(10, 20, 30, 40, 556, 6, 7, 8, 9));
		
		Func2 func2_2 = (items) -> {
			return Arrays.stream(items).reduce(0,(sum,el)->{return sum+el;});
		};
		System.out.println(func2_2.sum(10, 20, 30, 40, 556, 6, 7, 8, 9));
		
		// 원시타입 int[] 받기 -> 내림차순 -> int를 Integer로 boxing -> List<Integer변환>
		Func3 func3 = (items)->{
			return Arrays.stream(items)
				  .boxed()							// boxing 처리를 해야할 때 차순변경을 할 수 있게해줌!!
				  .sorted((a,b)->{return b-a;})		// 꼭 내림차순 하기전에 boxed 먼저 처리하고 하기!
				  .collect(Collectors.toList());
			};
			List<Integer> li = func3.createListDesc(10,100,24,1612,42,123,15,4,1);
			System.out.println(li);					
	}
}
