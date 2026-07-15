package com.example.xyproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XyProjectApplicationTests {

    @Test
    void contextLoads() {
        UserDaoTest test = new UserDaoTest();
        System.out.println("test");
        test.test();
    }

}
