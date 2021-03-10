package test.q22;

public class StudentDTO {
	public int studentNum;
	public String name;
	
	public StudentDTO (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof StudentDTO)) return false;
		StudentDTO student = (StudentDTO) obj;
		if(studentNum != student.studentNum) return false;
		return true;
	}
}
