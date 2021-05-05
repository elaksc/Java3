package kodlama.io_;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Eklendi " + user.getFirstName() + " " + user.getLastName());
	} 
	public void delete(User user) {
		System.out.println("Silindi " + user.getFirstName() + " " +user.getLastName());
	}
	public void addMultiple(User[] user) {
		for (User user2 : user) {
			add(user2);
		}
	}
}
