package com.lumeris.dataplatform.dataservice.decisions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication
@Configuration
@ComponentScan("com.lumeris.dataplatform.dataservice")
@EntityScan(basePackages = { "com.lumeris.dataplatform.dataservice.decisions.models" })
@EnableJpaRepositories(basePackages = { "com.lumeris.dataplatform.dataservice.decisions.repository" })
public class DecisionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecisionsApplication.class, args);
	}	
}
