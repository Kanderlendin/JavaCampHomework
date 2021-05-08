package JavaCamp_D5H1.dataAccess.concretes;

import java.util.ArrayList;
import JavaCamp_D5H1.dataAccess.abstracts.UserDao;
import JavaCamp_D5H1.entities.concretes.User;

public class DatabaseUserDao implements UserDao {

	public ArrayList<User> userDatabase;
	
	public DatabaseUserDao() {
		 this.userDatabase = new ArrayList<User>();
	}
	
	@Override
	public void add(User user) {
		this.userDatabase.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Veritabanýna Eklendi");
	}
	
	@Override
	public void delete(User user) {
		this.userDatabase.remove(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Veritabanýndan Kaldýrýldý");
	}

	@Override
	public User getUser(int id) {
		User returnUser = null;
		
		for (User user : userDatabase) {
			if(user.getId() == id) {
				returnUser = user;
			}
		}
		
		return returnUser;
	}

	@Override
	public ArrayList<User> getUsers() {
		return this.userDatabase;
	}
}
