import commercialLogin.Business.abstracts.AuthService;
import commercialLogin.Business.abstracts.UserService;

import commercialLogin.Business.concretes.AuthManager;
import commercialLogin.Business.concretes.UserManagaer;
import commercialLogin.Business.concretes.UserValidationManager;
import commercialLogin.core.GoogleServiceAdapter;
import commercialLogin.entities.concretes.User;
import commercilLogin.dataAccess.concretes.HibernateDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserManagaer(new HibernateDao());
		AuthService authService = new AuthManager(new UserValidationManager(), new GoogleServiceAdapter(), userService);
		authService.register(new User(0, "Halil", "Emirleroglu", "xxx", "123456"));
			
			
	
	}
}
