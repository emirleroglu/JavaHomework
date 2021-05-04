package day3Homework;

public class StudentManager extends UserManager{

	public void addStudent(Student student) {
		System.out.println(student.getFirstName()+ " öğrenci eklendi.");
	}
	
	public void deleteStudent(long id) {
		System.out.println(id+" ;'li öğrenci silindi. ");
	}
	
}
