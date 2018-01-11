package com.lumeris.dataplatform.dataservice.decisions.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-09T19:49:40.625Z")

@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Decisions API")
            .description("Decisions Dataservice")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("https://confluence.lumeris.com/display/PM/Decisions")
            .version("v1")
            .contact(new Contact("","", "spenmetsa@lumeris.com"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.lumeris.dataplatform.dataservice.decisions.api.api"))
                    .build()
//                .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
//                .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
