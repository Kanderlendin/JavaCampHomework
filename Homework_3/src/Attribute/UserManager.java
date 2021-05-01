package Attribute;

import Fields.*;

public class UserManager {
	
	public void CreateNewUser(User user, int id, String fullName, String eMail, String password) {
		user.setId(id);
		user.setFullName(fullName);
		user.seteMail(eMail);
		user.setPassword(password);
	}
	
	public void ChangePassword(User user, String oldPassword, String newPassword) {
		if(oldPassword == user.getPassword()){
			user.setPassword(newPassword);
			System.out.println("Þifre deðiþtirildi.");
		}
	}
}

