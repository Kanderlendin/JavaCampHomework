package JavaCamp_D5H1.dataAccess.abstracts;

import java.util.ArrayList;

import JavaCamp_D5H1.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	User getUser(int id);
	ArrayList<User> getUsers();
}
