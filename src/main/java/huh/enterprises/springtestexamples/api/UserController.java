package huh.enterprises.springtestexamples.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserController {

	@GetMapping
	public ResponseEntity<?> selectAll() {
		return ResponseEntity.ok().build();
	}

}
