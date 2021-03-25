package huh.enterprises.springtestexamples.annotation;

import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@DataJpaTest(
		properties = {
				"spring.flyway.enabled=false",
				"spring.test.database.replace=NONE",
				"spring.datasource.driver-class-name=com.p6spy.engine.spy.P6SpyDriver",
				"spring.jpa.show-sql=false",
				"spring.jpa.generate-ddl=false",
				"spring.jpa.hibernate.ddl-auto=create-drop",
		})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public @interface DataTest {
}
