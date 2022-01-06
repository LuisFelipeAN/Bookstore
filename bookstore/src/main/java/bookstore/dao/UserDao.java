package bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.domain.User;


public interface UserDao extends JpaRepository<User, String>{

}
