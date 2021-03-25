package huh.enterprises.springtestexamples.repository;

import huh.enterprises.springtestexamples.common.DomainRepository;
import huh.enterprises.springtestexamples.domain.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

@DomainRepository
public interface MemberRepository extends JpaRepository<Asset, Long> {
}
