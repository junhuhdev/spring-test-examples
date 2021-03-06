package huh.enterprises.springtestexamples.component.user;

import huh.enterprises.springtestexamples.domain.User;
import huh.enterprises.springtestexamples.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public User createUser(UserWriteQuery request) {
		User user = new User();
		user.setEmail(request.getEmail());
		user.setName(request.getName());
		userRepository.save(user);
		return user;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElseThrow();
	}

}
