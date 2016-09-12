package com.ldeng.backend;

import com.ldeng.backend.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

@SpringBootApplication
public class BackendApplication {

	// Añadimos el Filtro JWT a Spring para todas las URLS /rest/* como un bean
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();

		registrationBean.setFilter((Filter) new JwtFilter());
		registrationBean.addUrlPatterns("/rest/*");

		return registrationBean;
	}



	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
}
