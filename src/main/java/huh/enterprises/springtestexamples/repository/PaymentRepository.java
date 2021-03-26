package huh.enterprises.springtestexamples.repository;

import huh.enterprises.springtestexamples.common.DomainRepository;
import huh.enterprises.springtestexamples.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

@DomainRepository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
