package JavaCamp_D5H1.business.abstracts;

import JavaCamp_D5H1.entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(String email, String password);
	void registerWithService();
    void loginWithService();
}
