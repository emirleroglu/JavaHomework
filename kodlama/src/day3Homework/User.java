package day3Homework;

public class User {
	private long id;
	private String email;
	public User(long id, String email) {
		
		this.id = id;
		this.email = email;
	}
	
	public User () {
			
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
