package ch14;
class Controller {
	private MemberDto dto;	// 참조변수 member
	
	public void setMenberDto(MemberDto dto) {
		this.dto = dto;
	}
	
	public MemberDto getMemberDto() {
		return dto;
	}
}
class MemberDto {
	String name;
	int age;
	public MemberDto(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "MemberDto [name=" + name + ", age=" + age + "]";
	}
}
public class c01ClassMethod {
	public static void main(String[]args) {
		MemberDto obj = new MemberDto("홍길동", 120);
		
		Controller con = new Controller();
		
		con.setMenberDto(obj);
		
		MemberDto tmp = con.getMemberDto();
		
	}

}
