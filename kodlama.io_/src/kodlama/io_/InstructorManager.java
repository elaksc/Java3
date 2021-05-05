package kodlama.io_;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Eðitmen Baþarýyla Eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " Eðitmen Baþarýyla Silindi");
	}
	
	
}
