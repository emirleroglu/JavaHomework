package commercialLogin.Business.concretes;

import java.util.regex.Pattern;

import commercialLogin.Business.abstracts.UserValidationService;
import commercialLogin.entities.concretes.User;

public class UserValidationManager implements UserValidationService {

	@Override

	public boolean firstNameValidation(User user) {
		return user.getFirstName().length() > 1;
	}

	public boolean lastNameValidation(User user) {
		return user.getLastName().length() > 1;
	}

	public boolean passwordValidation(User user) {
		return user.getPassword().length() > 5;
	}

	public boolean emailFormatValidation(User user) {

		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

		return Pattern.matches(regex, user.getEmail());
	}

}
