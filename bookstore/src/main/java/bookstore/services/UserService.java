package bookstore.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.dao.UserDao;
import bookstore.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User addUser(User user) {
		try {
			userDao.save(user);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public User deleteUser(User user) {
		userDao.delete(user);
		return user;
	}
}
