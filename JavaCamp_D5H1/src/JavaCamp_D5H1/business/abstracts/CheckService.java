package JavaCamp_D5H1.business.abstracts;

public interface CheckService {
	boolean checkFirstName(String firstName);
	boolean checkLastname(String lastName);
	boolean checkPassword(String password);
	boolean checkEmail(String email);
}
