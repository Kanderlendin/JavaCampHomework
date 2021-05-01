package Attribute;

import Fields.*;

public class StudentManager extends UserManager {
	public void CreateNewUser(Student student, int id, String fullName, String eMail, String password) {
		student.setId(id);
		student.setFullName(fullName);
		student.seteMail(eMail);
		student.setPassword(password);
		student.setNumberOfCoursesTaken(0);
	}
	
	public void TakeTheCourse(Student student, String newCourse, int numberOfCoursesTaken) {
		student.setCoursesTaken(newCourse, numberOfCoursesTaken);
		student.setNumberOfCoursesTaken(numberOfCoursesTaken+1);
	}
	
	public void CourseList(Student student) {
		String[] courses = student.getCoursesTaken();

		System.out.println("Kurslarım\n------------------------------------");
		for (int index = 0; index<student.getNumberOfCoursesTaken();index++) {
			System.out.println(courses[index]);
		}
		System.out.println("------------------------------------");
	}
}
