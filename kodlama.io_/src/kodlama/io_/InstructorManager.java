package kodlama.io_;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " E�itmen Ba�ar�yla Eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " E�itmen Ba�ar�yla Silindi");
	}
	
	
}
