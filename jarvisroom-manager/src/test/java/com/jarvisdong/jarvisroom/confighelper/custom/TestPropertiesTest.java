package com.jarvisdong.jarvisroom.confighelper.custom;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by JarvisDong on 2018/12/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPropertiesTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestPropertiesTest.class);

    @Autowired
    TestProperties testProperties;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getProperties(){
        LOGGER.info("\n\n" + testProperties.toString() + "\n");
    }
}
