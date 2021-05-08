package JavaCamp_D5H1.business.concretes;


import JavaCamp_D5H1.business.abstracts.CheckService;
import JavaCamp_D5H1.business.abstracts.UserService;
import JavaCamp_D5H1.core.abstracts.OutSourceLoginService;
import JavaCamp_D5H1.dataAccess.abstracts.UserDao;
import JavaCamp_D5H1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private CheckService checkService;
	private OutSourceLoginService outSourceLoginService;
	
	public UserManager(UserDao userDao ,CheckService checkService, OutSourceLoginService outSourceLoginService) {
		this.userDao = userDao;
		this.checkService = checkService;
		this.outSourceLoginService = outSourceLoginService;
	}
	
	public boolean existEmail(String email) {
		boolean check = true;
		for (User user : userDao.getUsers()) {
			if (user.geteMail() == email) {
				check = false;
				throw new ArithmeticException("E-Posta adresi zaten mevcut.");
			} 
		}
		return check;
	}
	
	@Override
	public void add(User user) {
		if(this.checkService.checkFirstName(user.getFirstName()))
		{
			if(this.checkService.checkLastname(user.getLastName()))
			{
				if(this.checkService.checkEmail(user.geteMail()) && existEmail(user.geteMail()))
				{
					if(this.checkService.checkPassword(user.getPassword()))
					{
						this.userDao.add(user);
					}
				}
			}
		}
	}
	
	@Override
	public void login(String email, String password) {
		for (User user : userDao.getUsers()) {
			if (email == user.geteMail() && password == user.getPassword()) {
				System.out.println(user.getFirstName() + " " + user.getLastName() + " Baþarýyla giriþ yaptýnýz.");
				return;
			}
		}
		throw new ArithmeticException("Hatalý eposta adresi veya parola girdiniz. Lütfen tekrar deneyin.");
	}

	@Override
	public void registerWithService() {
		outSourceLoginService.registerWith();
	}

	@Override
	public void loginWithService() {
		outSourceLoginService.loginWith();
	}
}
