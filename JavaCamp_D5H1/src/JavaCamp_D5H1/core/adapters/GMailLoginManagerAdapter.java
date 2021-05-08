package JavaCamp_D5H1.core.adapters;

import GMailLogin.concretes.GMailLoginManager;
import JavaCamp_D5H1.core.abstracts.OutSourceLoginService;

public class GMailLoginManagerAdapter implements OutSourceLoginService {

	@Override
	public void registerWith() {
		GMailLoginManager gMailLoginManager = new GMailLoginManager();
		gMailLoginManager.register();
	}

	@Override
	public void loginWith() {
		GMailLoginManager gMailLoginManager = new GMailLoginManager();
		gMailLoginManager.login();
	}

}
