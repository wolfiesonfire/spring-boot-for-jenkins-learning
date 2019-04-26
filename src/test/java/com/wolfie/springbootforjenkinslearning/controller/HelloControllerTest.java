package com.wolfie.springbootforjenkinslearning.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

    @Test
    public void justSomeTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println("test" + i);
        }
    }

}