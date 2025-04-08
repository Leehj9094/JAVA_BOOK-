package Utils;

public class MemberDto {

	private String C_no;
	private String C_name;
	private String phone;
	private String address;
	private String grade;
	
	// 모든 인자
	public MemberDto() {}
	public MemberDto(String c_no, String c_name, String phone, String address, String grade) {
		super();
		C_no = c_no;
		C_name = c_name;
		this.phone = phone;
		this.address = address;
		this.grade = grade;
	}
	// getter und setter
	public String getC_no() {
		return C_no;
	}
	public void setC_no(String c_no) {
		C_no = c_no;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	// toString
	@Override
	public String toString() {
		return "MemberDto [C_no=" + C_no + ", C_name=" + C_name + ", phone=" + phone + ", address=" + address
				+ ", grade=" + grade + "]";
	}
	
	
}
