package JavaCamp_D5H1;

import JavaCamp_D5H1.entities.concretes.User;
import JavaCamp_D5H1.business.abstracts.UserService;
import JavaCamp_D5H1.business.concretes.UserManager;
import JavaCamp_D5H1.core.adapters.GMailLoginManagerAdapter;
import JavaCamp_D5H1.business.concretes.CheckManager;
import JavaCamp_D5H1.dataAccess.concretes.DatabaseUserDao;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new DatabaseUserDao(), new CheckManager(), new GMailLoginManagerAdapter());
		User newUser = new User();
		newUser.setId(0);
		newUser.setFirstName("Hasan");
		newUser.setLastName("TENK");
		newUser.seteMail("htenk@gmail.com");
		newUser.setPassword("dogru");
		userService.add(newUser);
		System.out.println("-----------------------------------------------------------------------------------");
		userService.login("htenk@gmail.com","dogru");
		userService.login("htenk@gmail.com","yanlis");
	}

}
