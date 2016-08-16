package com.spring.config;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.spring.service" })
public class SpringRootConfig {
}