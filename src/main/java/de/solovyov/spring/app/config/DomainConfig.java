package de.solovyov.spring.app.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("de.solovyov.spring.app.domain")
@EnableJpaRepositories("de.solovyov.spring.app.repos")
@EnableTransactionManagement
public class DomainConfig {
}
