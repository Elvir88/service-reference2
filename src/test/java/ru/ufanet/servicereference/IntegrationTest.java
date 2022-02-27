package ru.ufanet.servicereference;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import ru.ufanet.servicereference.ServiceReference2App;
import ru.ufanet.servicereference.config.TestSecurityConfiguration;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ServiceReference2App.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
