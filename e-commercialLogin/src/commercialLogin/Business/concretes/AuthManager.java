package commercialLogin.Business.concretes;

import commercialLogin.Business.abstracts.AuthService;
import commercialLogin.Business.abstracts.UserService;
import commercialLogin.Business.abstracts.UserValidationService;
import commercialLogin.core.GoogleServiceIn;
import commercialLogin.entities.concretes.User;

public class AuthManager implements AuthService {
	private UserValidationService validationService;
	private GoogleServiceIn googleService;
	private UserService userService;

	

	public AuthManager(UserValidationService validationService, GoogleServiceIn googleService,
			UserService userService) {
		super();
		this.validationService = validationService;
		this.googleService = googleService;
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if ((validationService.firstNameValidation(user) || validationService.lastNameValidation(user))) {
			System.out.println("Ad ve soyad en az iki kaarakterden oluşmalıdır.");
			return;
		} else if (!validationService.emailFormatValidation(user)) {
			System.out.println("E-posta alanı e-posta formatında olmalıdır. ");
			return;
		} else if (!validationService.passwordValidation(user)) {
			System.out.println("Parola en az 6 karekterden oluşmalıdır.");
			return;
		}
		userService.addUser(user);
		

	}

	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub

	}

}
