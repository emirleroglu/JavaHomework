package commercialLogin.core;

import commercialLogin.entities.concretes.User;
import googleExternal.GoogleService;

public class GoogleServiceAdapter implements GoogleServiceIn {
	GoogleService myService = new GoogleService();
	@Override
	public void addGoogleUser(User user) {
		myService.login(user.getEmail(), user.getPassword());
		
	}

	@Override
	public void registerWithGoogle(User user) {
		myService.register(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
		
	}

}
