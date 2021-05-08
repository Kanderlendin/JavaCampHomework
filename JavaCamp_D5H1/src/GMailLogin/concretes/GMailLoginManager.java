package GMailLogin.concretes;

import GMailLogin.abstracts.GMailLoginService;

public class GMailLoginManager implements GMailLoginService {

	@Override
	public void register() {
		System.out.println("Google hesabýnýz ile kayýt oldunuz.");
	}

	@Override
	public void login() {
		System.out.println("Google hesabýnýz ile giriþ yaptýnýz. ");
	}

}
