package huh.enterprises.springtestexamples.annotation;

import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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
				"spring.jpa.hibernate.ddl-auto=create-drop",
		})
public @interface DataTest {
}
