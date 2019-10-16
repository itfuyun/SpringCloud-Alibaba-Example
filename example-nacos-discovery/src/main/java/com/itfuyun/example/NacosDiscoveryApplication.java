package com.itfuyun.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>Description: </p>
 * <p>Copyright (c) www.itfuyun.com Inc. All Rights Reserved.</p>
 *
 * @author itfuyun(itfuyun@gmail.com)
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryApplication.class,args);
    }
}
