package com.jarvisdong.jarvisroom;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@EnableSwagger2 // 开启 Swagger
@SpringBootApplication
//@EnableScheduling
//@EnableJpaRepositories(basePackages = "com.jarvisdong.jarvisroom.repository")
public class Application {

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
//				.web(WebApplicationType.NONE)
				.run(args);
	}
}
