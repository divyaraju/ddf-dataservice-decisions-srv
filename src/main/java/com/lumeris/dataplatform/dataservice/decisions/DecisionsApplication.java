package com.lumeris.dataplatform.dataservice.decisions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@SpringBootApplication
@Configuration
@ComponentScan("com.lumeris.dataplatform.dataservice")
public class DecisionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecisionsApplication.class, args);
	}	
}
