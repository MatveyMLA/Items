package com.mati.items.configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
public class WebfluxConfig implements WebFluxConfigurer {

	  @Override
	  public void addCorsMappings(CorsRegistry registry) {

		 registry.addMapping("/**")
	      .allowedOrigins("*")
	      .allowedMethods("*")
	      .allowedHeaders("*");
//	      .allowCredentials(true);
	  }
}