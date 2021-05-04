package day3Homework;

public class Instructor  extends User{
	private String firstName;
	private String lastName;
	private String tax;
	public Instructor(long id, String email, String firstName, String lastName, String tax) {
		super(id, email);
		this.firstName = firstName;
		this.lastName = lastName;
		this.tax = tax;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	
	
}
