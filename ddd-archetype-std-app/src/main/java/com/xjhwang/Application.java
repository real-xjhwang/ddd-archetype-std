package com.xjhwang;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author xjhwang on 2025/2/18 23:00
 */
@Slf4j
@EnableScheduling
@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        
        SpringApplication.run(Application.class, args);
    }
}

