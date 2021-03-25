package huh.enterprises.springtestexamples.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping
	public ResponseEntity<?> selectAll() {
		return ResponseEntity.ok().build();
	}

}
