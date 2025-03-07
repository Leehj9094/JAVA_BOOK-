package Ch09;



public class C04StringClass {

	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.printf("%X\n",System.identityHashCode(str1));
		System.out.printf("%X\n",System.identityHashCode(str2));
		System.out.printf("%X\n",System.identityHashCode(str3));
		System.out.printf("%X\n",System.identityHashCode(str4));
		
		System.out.println("----------------------------------");
		System.out.println("str1==str2 ? " + (str1==str2));
		System.out.println("str3==str4 ? " + (str3==str4));
		System.out.println("str1==str3 ? " + (str1==str3));
		System.out.println("str2==str4 ? " + (str2==str4));
		System.out.println("----------------------------------");
		System.out.println("str1==str2 ? " + (str1.equals(str2)));
		System.out.println("str3==str4 ? " + (str3.equals(str4)));
		System.out.println("str1==str3 ? " + (str1.equals(str3)));
		System.out.println("str2==str4 ? " + (str2.equals(str4)));
		
		// str1 =str2는 동일한 내용일 경우 true로 나오지만 str3 = str4처럼 new 연산자를 통해 String 객체 생성 시 각 객체마다 문자열이 새롭게 생성됨
		// (각 변수가 가리키고 있는 주소 값이 다르기 때문에 결과는 false)
		                       
	}
	
}
