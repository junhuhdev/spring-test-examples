package huh.enterprises.springtestexamples.api;

import huh.enterprises.springtestexamples.common.ApiController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiController(path = "/api/users")
public class UserController {

	@GetMapping
	public ResponseEntity<?> selectAll() {
		return ResponseEntity.ok().build();
	}

}
