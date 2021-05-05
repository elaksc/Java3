package kodlama.io_;

public class Instructor extends User {
	private String branch;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String password, String branch) {
		this.branch = branch;
	}
	
	public String getDescription() {
		return branch;
	}
	public void setDescription(String description) {
		this.branch = description;
	}
	
}
