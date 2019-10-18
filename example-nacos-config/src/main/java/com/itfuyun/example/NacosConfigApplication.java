package com.itfuyun.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: </p>
 * <p>Copyright (c) www.itfuyun.com Inc. All Rights Reserved.</p>
 *
 * @author itfuyun(itfuyun@gmail.com)
 */
@SpringBootApplication
public class NacosConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class,args);
    }

    @RestController
    @RefreshScope
    static class NacosConfigController{
        @Value("${test.value}")
        private String testValue;

        @GetMapping("/getTestValue")
        public String getTestValue(){
            return testValue;
        }
    }
}
