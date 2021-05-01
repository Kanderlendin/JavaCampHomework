package Attribute;

import Fields.*;

public class InstructorManager extends UserManager {
	public void CreateNewUser(Instructor instructor, int id, String fullName, String eMail, String password) {
		instructor.setId(id);
		instructor.setFullName(fullName);
		instructor.seteMail(eMail);
		instructor.setPassword(password);
		instructor.setNumberOfCoursesGiven(0);
	}
	
	public void OperACourse(Instructor instructor, String newCourse, int numberOfCoursesGiven) {
		instructor.setCoursesGiven(newCourse, numberOfCoursesGiven);
		instructor.setNumberOfCoursesGiven(numberOfCoursesGiven+1);
	}

	public void CourseList(Instructor instructor) {
		String[] courses = instructor.getCoursesGiven();

		System.out.println("Kurslarým\n------------------------------------");
		for (int index = 0; index<instructor.getNumberOfCoursesGiven();index++) {
			System.out.println(courses[index]);
		}
		System.out.println("------------------------------------");
	}
}