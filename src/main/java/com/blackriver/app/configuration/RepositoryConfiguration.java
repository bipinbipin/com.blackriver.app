package com.blackriver.app.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Bipin on 5/3/2016.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.blackriver.app.domain"})
@EnableJpaRepositories(basePackages = {"com.blackriver.app.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
