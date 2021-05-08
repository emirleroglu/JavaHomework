package commercilLogin.dataAccess.concretes;

import java.util.List;

import commercialLogin.entities.concretes.User;
import commercilLogin.dataAccess.abstacts.UserDao;

public class HibernateDao implements UserDao {

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" added to database with Hibernate");
		
	}

	@Override
	public void updataUser(long id, User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" updated to database with Hibernate");
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" deleted to database with Hibernate");
		
	}

	@Override
	public User getUseerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
