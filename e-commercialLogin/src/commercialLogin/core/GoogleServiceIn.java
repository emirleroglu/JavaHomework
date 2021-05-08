package commercialLogin.core;

import commercialLogin.entities.concretes.User;

public interface GoogleServiceIn {
	void addGoogleUser(User user);
	void registerWithGoogle(User user);
}
