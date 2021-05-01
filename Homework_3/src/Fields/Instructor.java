package Fields;

public class Instructor extends User {
	private String[] coursesGiven = new String[100];
	private int numberOfCoursesGiven;
	
	public String[] getCoursesGiven() {
		return coursesGiven;
	}
	
	public void setCoursesGiven(String courseGiven, int numberOfCoursesGiven) {
		this.coursesGiven[numberOfCoursesGiven] = courseGiven;
	}
	
	public int getNumberOfCoursesGiven() {
		return numberOfCoursesGiven;
	}
	
	public void setNumberOfCoursesGiven(int numberOfCoursesGiven) {
		this.numberOfCoursesGiven = numberOfCoursesGiven;
	}
}
