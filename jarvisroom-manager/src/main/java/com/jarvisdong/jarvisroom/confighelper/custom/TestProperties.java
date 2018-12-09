package com.jarvisdong.jarvisroom.confighelper.custom;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by JarvisDong on 2018/12/9.
 */
@Component
@ConfigurationProperties(prefix = "jarvisdong")
public class TestProperties {
    private String title;
    private String content;

    public TestProperties() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TestProperties{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
