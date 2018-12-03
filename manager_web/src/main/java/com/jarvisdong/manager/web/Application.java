package com.jarvisdong.manager.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@EnableJpaRepositories(basePackages = "com.jarvisdong.manager.web.repository")
public class Application /*extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer*/ {
	
//	public Application() {
//        super();
//        setRegisterErrorPageFilter(false);
//    }
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Application.class);
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


//	@Override
//	public void customize(ConfigurableEmbeddedServletContainer container) {
//		container.setPort(8083);
//	}
}
