package com.jarvisdong.jarvisroom;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableSwagger2 // 开启 Swagger
@SpringBootApplication
//@EnableScheduling
@EntityScan(basePackages = {"com.jarvisdong.dao.entity"})
@EnableJpaRepositories(basePackages = {"com.jarvisdong.dao.repository"})
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}
}
