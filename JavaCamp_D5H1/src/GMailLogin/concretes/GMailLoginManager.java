package GMailLogin.concretes;

import GMailLogin.abstracts.GMailLoginService;

public class GMailLoginManager implements GMailLoginService {

	@Override
	public void register() {
		System.out.println("Google hesab�n�z ile kay�t oldunuz.");
	}

	@Override
	public void login() {
		System.out.println("Google hesab�n�z ile giri� yapt�n�z. ");
	}

}
