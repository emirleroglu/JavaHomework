package commercilLogin.dataAccess.abstacts;

import java.util.List;

import commercialLogin.entities.concretes.*;
public interface UserDao {
	List<User> getAll();
	User getUser(long id);
	void addUser(User user);
	void updataUser(long id,User user);
	void deleteUser(User user);
	User getUseerByEmail(String email);
	
}
