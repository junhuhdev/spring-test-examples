package huh.enterprises.springtestexamples.repository;

import huh.enterprises.springtestexamples.common.DomainRepository;
import huh.enterprises.springtestexamples.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

@DomainRepository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = """
			SELECT *
			FROM (
			    SELECT *,
			           dense_rank() OVER (
			               ORDER BY "p.created_on", "p.id"
			           ) rank
			    FROM (
			        SELECT p.id AS "p.id",
			               p.created_on AS "p.created_on",
			               p.title AS "p.title",
			               pc.id as "pc.id",
			               pc.created_on AS "pc.created_on",
			               pc.review AS "pc.review",
			               pc.post_id AS "pc.post_id"
			        FROM post p
			        LEFT JOIN post_comment pc ON p.id = pc.post_id
			        WHERE p.title LIKE :titlePattern
			        ORDER BY p.created_on
			    ) p_pc
			) p_pc_r
			WHERE p_pc_r.rank <= :rank
			""", nativeQuery = true)
	Optional<User> textBlock();

}
