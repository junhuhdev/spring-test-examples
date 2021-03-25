package huh.enterprises.springtestexamples.repository;

import huh.enterprises.springtestexamples.common.DomainRepository;
import huh.enterprises.springtestexamples.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

@DomainRepository
public interface GroupRepository extends JpaRepository<Group, Long> {

}
