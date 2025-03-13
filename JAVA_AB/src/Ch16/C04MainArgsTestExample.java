package Ch16;

public class C04MainArgsTestExample {

	public static void main(String[] args) {
		
		System.out.println("Main Args's Array Length : " + args.length);
		
		// forEach(개선된 for문)
		for(String str : args) {
			System.out.println(str);
		}
	}
}
