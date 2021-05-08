package commercialLogin.Business.abstracts;

import commercialLogin.entities.concretes.User;

public interface UserService {
	User getUser(long id);
	void addUser(User user);
	void deleteUser(User user);
	void updateUser(long id, User user);
}
