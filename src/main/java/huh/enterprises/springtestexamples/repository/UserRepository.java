package huh.enterprises.springtestexamples.repository;

import huh.enterprises.springtestexamples.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
