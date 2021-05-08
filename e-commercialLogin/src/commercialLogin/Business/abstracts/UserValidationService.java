package commercialLogin.Business.abstracts;

import commercialLogin.entities.concretes.User;

public interface UserValidationService {
	

	boolean firstNameValidation(User user);

	boolean lastNameValidation(User user);

	boolean passwordValidation(User user);

	boolean emailFormatValidation(User user);
}
