package kodlama.io_;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ela");
		student1.setLastName("Ka�c�o�lu");
		student1.setEmail("elakascioglu@gmail.com");
		student1.setPassword("12345");
		student1.setSchoolName("Okul Ad�");
		student1.setTelNo("05552226352");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Rumeysa");
		student2.setLastName("Yaz�c�");
		student2.setEmail("rumeyaz�c�@gmail.com");
		student2.setPassword("12345");
		student2.setSchoolName("Okul Ad�");
		student2.setTelNo("05552245352");
		
		StudentManager studentManager = new StudentManager();
		Student[] students = {student1, student2};
		studentManager.addMultiple(students);
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setPassword("114454");
		instructor.setDescription("Yaz�l�m Geli�tirici");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		
		UserManager userManager = new UserManager();
		User[] user = {student1, student2, instructor};
		userManager.addMultiple(user);
	}

}
