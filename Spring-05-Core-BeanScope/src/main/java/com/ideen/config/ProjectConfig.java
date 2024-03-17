package com.ideen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.ideen")
@ComponentScan(basePackages = {"com.ideen.proxy","com.ideen.service","com.ideen.repository"})
public class ProjectConfig {
}
