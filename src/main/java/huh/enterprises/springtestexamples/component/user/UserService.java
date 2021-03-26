package huh.enterprises.springtestexamples.component.user;

import huh.enterprises.springtestexamples.domain.User;

public interface UserService {

	User createUser(UserRequest request);

	User findByEmail(String email);

}
