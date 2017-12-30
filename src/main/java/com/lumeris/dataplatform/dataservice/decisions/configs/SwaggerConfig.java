package com.lumeris.dataplatform.dataservice.decisions.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Lists;
import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterSummary;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private String description = "Decisions Dataservice";
	private String title = "Decisions API";
	private String version = "v1";
	private Contact contact = new Contact("Divya Penmetsa", "link to wiki.......", "spenmetsa@lumeris.com");

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.lumeris.dataplatform.dataservice.decisions.controller"))
				.paths(PathSelectors.any()).build().directModelSubstitute(PatientRosterSummary.class, String.class)
				.apiInfo(new ApiInfo(title, description, version, null, contact, null, null))
				.securitySchemes(Lists.newArrayList(apiQueryKey(), apiHeaderKey()));
	}

	private ApiKey apiHeaderKey() {
		return new ApiKey("Authorization", "api_key", ApiKeyVehicle.HEADER.getValue());
	}

	private ApiKey apiQueryKey() {
		return new ApiKey("access_token", "api_key", ApiKeyVehicle.QUERY_PARAM.getValue());
	}
}