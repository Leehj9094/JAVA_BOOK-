package Ch15;

public class C04ExceptionMain {

	public static void main(String[] args) {
		
		String str = null;
		try {
		str.toString();						// NULL 예외 발생
		 
		int arr[] = {10,20,30};
		arr[5] = 100;						// Bound Exception 발생
		Integer.parseInt("a1234");			// parse Exception 발생
		
		Animal animal = new Dog();
		Cat yummi = (Cat)animal;			// Cast Exception;
		
		} //catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		} catch(ArrayIndexOutOfBoundsException e2) {
//			System.out.println(e2.getMessage());
//		} catch(NumberFormatException e3) {
//			System.out.println(e3.getMessage());
//		} catch(ClassCastException e4) {
//			System.out.println(e4.getMessage());
//		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
			// 자원정리 작업
			System.out.println("Finally Test..");
		}
				
		System.out.println("HELLO");
		
	}
}
