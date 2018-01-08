package com.lumeris.dataplatform.dataservice.decisions.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin()
		.loginPage("/login")
		.permitAll()
		.and()
		.authorizeRequests()
		.antMatchers("/login")
		.permitAll()
		.and()
		.requestMatchers()
		.antMatchers("/", "/login", "/images")
		.and()
		.authorizeRequests()
		.anyRequest()
		.authenticated();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/patientRoster/patientDetails/*", "/v2/api-docs", "/configuration/ui", "/swagger-resources", "/configuration/security",
				"/swagger-ui.html", "/webjars/**", "/swagger-resources/configuration/ui", "/swagge‌​r-ui.html",
				"/swagger-resources/configuration/security");
	}
}
