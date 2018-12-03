package com.jarvisdong.jarvisroom;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
//@EnableJpaRepositories(basePackages = "com.jarvisdong.jarvisroom.repository")
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
		new SpringApplicationBuilder(Application.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}


//	@Override
//	public void customize(ConfigurableEmbeddedServletContainer container) {
//		container.setPort(8082);
//	}
}
