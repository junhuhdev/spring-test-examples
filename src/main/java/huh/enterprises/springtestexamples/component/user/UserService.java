package huh.enterprises.springtestexamples.component.user;

import huh.enterprises.springtestexamples.domain.User;

import java.util.List;

public interface UserService {

	User createUser(UserRequest request);

	List<User> findAll();

	User findByEmail(String email);

}
