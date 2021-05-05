package kodlama.io_;

public class Student extends User {
	String schoolName;
	String telNo;

	public Student() {
		
	}
	public Student(int id, String firstName, String lastName, String email, String password, String schoolName, String telNo) {
		this.schoolName = schoolName;
		this.telNo = telNo;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
}

