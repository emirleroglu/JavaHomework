package day3Homework;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getId()+" ıd'li user eklendi.");
	}
	
	public void updateEmail(long id, String email) {
		
		// if block kullanılır.
		System.out.println("Email güncellendi.");
	}

}
