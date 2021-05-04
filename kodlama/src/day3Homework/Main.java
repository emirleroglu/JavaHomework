package day3Homework;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "example@gmail.com","Ayşe", "Yılmaz");
		Instructor instructor = new Instructor(2, "example2@hotmail.com","Ali", "Yılmaz","500");
		
		User user = new User(3,"example@yahoo.com");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addUser(user);
		studentManager.addStudent(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor);
		
		
	}

}
