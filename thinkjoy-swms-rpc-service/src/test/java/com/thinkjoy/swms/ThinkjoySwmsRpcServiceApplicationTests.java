package com.thinkjoy.swms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThinkjoySwmsRpcServiceApplicationTests {

    @Value("${profile.env}")
    private String appName;

    @Test
    public void contextLoads() {
        System.out.println(appName + "=================");
    }

}
