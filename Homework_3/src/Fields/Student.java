package Fields;

public class Student extends User {
	private String[] coursesTaken  = new String[100];
	private int numberOfCoursesTaken;
	
	public String[] getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesTaken(String courseTaken, int numberOfCoursesTaken) {
		this.coursesTaken[numberOfCoursesTaken] = courseTaken;
	}
	
	public int getNumberOfCoursesTaken() {
		return numberOfCoursesTaken;
	}
	
	public void setNumberOfCoursesTaken(int numberOfCoursesTaken) {
		this.numberOfCoursesTaken = numberOfCoursesTaken;
	}
}