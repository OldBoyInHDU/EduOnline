package com.nyzs.eduonline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class EduonlineApplicationTests {

    @Test
    void contextLoads() {
        String testStr = " / ";
        System.out.println(Arrays.toString(testStr.split(" / ")));
    }

}
