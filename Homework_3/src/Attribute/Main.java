package Attribute;

import Fields.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Student Operations\n------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		Student student = new Student();
		
		studentManager.CreateNewUser(student, 1, "Hasan TENK", "htenk@gmail.com", "pass123");
		studentManager.ChangePassword(student, "pass123", "pass456");
		studentManager.TakeTheCourse(student, "C# Kurs", student.getNumberOfCoursesTaken());
		studentManager.TakeTheCourse(student, "Java Kurs", student.getNumberOfCoursesTaken());
		studentManager.TakeTheCourse(student, "Python Kurs", student.getNumberOfCoursesTaken());
		studentManager.TakeTheCourse(student, "React Kurs", student.getNumberOfCoursesTaken());
		
		studentManager.CourseList(student);
		
		System.out.println("Instructor Operations\n------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor();
		
		instructorManager.CreateNewUser(instructor, 1, "Beyza SELİMOĞLU", "bselimog@gmail.com", "pass123");
		instructorManager.ChangePassword(instructor, "pass123", "pass456");

		instructorManager.OperACourse(instructor, "C# Kurs", instructor.getNumberOfCoursesGiven());
		instructorManager.OperACourse(instructor, "Java Kurs", instructor.getNumberOfCoursesGiven());
		instructorManager.OperACourse(instructor, "Python Kurs", instructor.getNumberOfCoursesGiven());
		instructorManager.OperACourse(instructor, "React Kurs", instructor.getNumberOfCoursesGiven());

		instructorManager.CourseList(instructor);
	}
}