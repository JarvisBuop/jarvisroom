package com.jarvisdong.jarvisroom.confighelper.custom;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by JarvisDong on 2018/12/8.
 */
public class FixedConfigTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testSpringContainerMsg() throws Exception {
        AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext(FixedConfig.class);
        Object getFixedTitle = aac.getBean("getFixedTitle");
        assertEquals(getFixedTitle, "fixed title");
    }

    @Test
    public void testSpringContainerAll() throws Exception {
        AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext();
        aac.scan("com.jarvisdong.jarvisroom.confighelper");
        aac.refresh();
        Object getFixedTitle = aac.getBean("getFixedTitle");
        assertEquals(getFixedTitle, "fixed title");
    }

}
