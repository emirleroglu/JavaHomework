package commercialLogin.Business.concretes;

import commercialLogin.Business.abstracts.UserService;
import commercialLogin.Business.abstracts.UserValidationService;
import commercialLogin.core.GoogleServiceIn;
import commercialLogin.entities.concretes.User;
import commercilLogin.dataAccess.abstacts.UserDao;

public class UserManagaer implements UserService {
	private UserDao userdao;

	public UserManagaer(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {

		this.userdao.addUser(user);

	}

	@Override
	public void deleteUser(User user) {
		this.userdao.deleteUser(user);

	}

	@Override
	public void updateUser(long id, User user) {
		this.userdao.updataUser(id, user);

	}

}
