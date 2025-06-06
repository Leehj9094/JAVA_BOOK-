package Utils;

public class TeacherDto {

	private String teacher_code;
	private String teacher_name;
	private String class_name;
	private int Class_price;
	private String teacher_regist_date;

	//모든인자
	public TeacherDto() {}

	public TeacherDto(String teacher_code, String teacher_name, String class_name, int class_price,
			String teacher_regist_date) {
		super();
		this.teacher_code = teacher_code;
		this.teacher_name = teacher_name;
		this.class_name = class_name;
		Class_price = class_price;
		this.teacher_regist_date = teacher_regist_date;
	}
	// getter und setter

	public String getTeacher_code() {
		return teacher_code;
	}

	public void setTeacher_code(String teacher_code) {
		this.teacher_code = teacher_code;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public int getClass_price() {
		return Class_price;
	}

	public void setClass_price(int class_price) {
		Class_price = class_price;
	}

	public String getTeacher_regist_date() {
		return teacher_regist_date;
	}

	public void setTeacher_regist_date(String teacher_regist_date) {
		this.teacher_regist_date = teacher_regist_date;
	}
	//toString

	@Override
	public String toString() {
		return "TeacherDto [teacher_code=" + teacher_code + ", teacher_name=" + teacher_name + ", class_name="
				+ class_name + ", Class_price=" + Class_price + ", teacher_regist_date=" + teacher_regist_date + "]";
	}
	
}
