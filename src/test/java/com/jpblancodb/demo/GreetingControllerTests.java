package com.jpblancodb.demo;

import com.jpblancodb.demo.controllers.GreetingController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingControllerTests {

    @Autowired
    private GreetingController greetingController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(greetingController).isNotNull();
    }

}
