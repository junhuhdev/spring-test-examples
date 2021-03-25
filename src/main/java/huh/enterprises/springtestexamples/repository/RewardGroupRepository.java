package huh.enterprises.springtestexamples.repository;

import huh.enterprises.springtestexamples.common.DomainRepository;
import huh.enterprises.springtestexamples.domain.RewardGroup;
import org.springframework.data.jpa.repository.JpaRepository;

@DomainRepository
public interface RewardGroupRepository extends JpaRepository<RewardGroup, Long> {

}
