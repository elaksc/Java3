package kodlama.io_;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " ��renci Ba�ar�yla Eklendi");
	}
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " ��renci Ba�ar�yla Silindi");
	}
	
	public void addMultiple(Student[] students) {
		for (Student student : students) {
			add(student);
		}
	}
}
