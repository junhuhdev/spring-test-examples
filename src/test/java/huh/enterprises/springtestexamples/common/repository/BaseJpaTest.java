package huh.enterprises.springtestexamples.common.repository;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;

@DataTest
public abstract class BaseJpaTest {
	// @formatter:off

	static final PostgreSQLContainer postgreSQLContainer;

	static {
		postgreSQLContainer = (PostgreSQLContainer) new PostgreSQLContainer("postgres:latest")
				.withDatabaseName("test")
				.withUsername("duke")
				.withPassword("s3cret")
				.withReuse(true);
		postgreSQLContainer.start();
	}

	@DynamicPropertySource
	static void datasourceConfig(DynamicPropertyRegistry registry) {
		registry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl);
		registry.add("spring.datasource.password", postgreSQLContainer::getPassword);
		registry.add("spring.datasource.username", postgreSQLContainer::getUsername);
	}

	// @formatter:on
}
