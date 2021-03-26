package huh.enterprises.springtestexamples.api;

import huh.enterprises.springtestexamples.common.ApiController;
import huh.enterprises.springtestexamples.component.user.UserWriteQuery;
import huh.enterprises.springtestexamples.component.user.UserService;
import huh.enterprises.springtestexamples.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@ApiController(path = "/api/users")
public class UserController {

	private final UserService userService;

	@GetMapping
	public ResponseEntity<?> selectAll() {
		var users = userService.findAll();
		return ResponseEntity.ok(users);
	}

	@PostMapping
	public ResponseEntity<User> create(@RequestBody UserWriteQuery request) {
		var user = userService.createUser(request);
		return ResponseEntity.ok(user);
	}

}
