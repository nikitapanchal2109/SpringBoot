package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;
import com.google.common.base.Predicate;
import springfox.documentation.builders.ApiInfoBuilder;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/posts.*"), regex("/puts.*") ,regex("/products.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Shopping Cart API")
				.description("Swagger API reference for developers")
				.termsOfServiceUrl("http://stackoverflow.com")
				.contact("nikita.panchal@atos.net")
				.license("Swagger2 License")
				.licenseUrl("https://creativecommons.org/choose/")
				.version("1.0").build();
	}
}
