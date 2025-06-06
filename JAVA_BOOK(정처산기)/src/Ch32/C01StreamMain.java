package Ch32;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	public String name;				// protected
	public int age;
	// 생성자(디폴트. 모든인자)
	Person(){}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
class Employee extends Person{
	String company;
	String department;
	String role;
	// 모든 디폴트 생성자
	Employee(){}
	
	Employee(Person person){
		this.name = person.getName();
		this.age = person.getAge();
	}
	
	public Employee(String name, int age) {
		super(name,age);
	}
	
	public Employee(String company, String department, String role) {
		super();
		this.company = company;
		this.department = department;
		this.role = role;
	}
	// getter und setter
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	// toString
	@Override
	public String toString() {
		return "Employee [company=" + company + ", department=" + department + ", role=" + role + ", "
				+ "getName()="+ getName() + ", getAge()=" + getAge() + "]";
	}
}

public class C01StreamMain {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		
		// filter
		List<Integer> list2 =
		list.stream().filter((item)->{return item%2==0;})
					 .collect(Collectors.toList());
		System.out.println("짝수필터링 : " + list2);
		
		// MAP
		List<Integer> list3 =
		list.stream().filter((item)->{return item%2==0;})
					 .map((item)->{return item*item;})				// 아이템 값을 재구성함 
					 .collect(Collectors.toList());
		System.out.println("MAP적용 : " + list3);
		
		//
		
		List<Person> list4 = Arrays.asList(
				new Person("홍길동!!!!",35),
				new Person("남길동!!",45),
				new Person("서길동!!!!!!",25),
				new Person("동길동!",55)
				);
		
		List<Integer> list5 =
		list4.stream()
//					  .map((person)->{return person.getAge();})
//					  .map(person-> person.getAge())
					  .map(Person::getAge)							// 메서드 참조(::) 사용 가능함
					  .sorted((a,b)->{return b-a;})					// 내림차순
					  .collect(Collectors.toList());
		
		System.out.println(list5);
		
		// 문자열
		List<Integer> list6 =
		list4.stream()
					  .map(Person::getName)
					  .map(String::length)
					  .sorted((a,b)->b-a)
					  .collect(Collectors.toList());
		System.out.println(list6);
		
		
		// Employee
		List<Employee> list7 =
		list4.stream()
//					  .map((person)->{return new Employee(person.getName(),person.getAge());})
					  .map(Employee::new)
					  .collect(Collectors.toList());
//		System.out.println(list7);
		list7.forEach(System.out::println);
	}
	
}
