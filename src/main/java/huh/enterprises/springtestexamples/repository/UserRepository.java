package huh.enterprises.springtestexamples.repository;

import huh.enterprises.springtestexamples.common.DomainRepository;
import huh.enterprises.springtestexamples.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

@DomainRepository
public interface UserRepository extends JpaRepository<User, Long> {
}
