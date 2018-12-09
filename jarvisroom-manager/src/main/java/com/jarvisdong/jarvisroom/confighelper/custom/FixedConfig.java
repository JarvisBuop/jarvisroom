package com.jarvisdong.jarvisroom.confighelper.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JarvisDong on 2018/12/8.
 * 在测试中获取spring容器中的该配置内容;
 */
@Configuration
public class FixedConfig {

    @Bean
    public String getFixedTitle() {
        return "fixed title";
    }
}
