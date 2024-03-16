package com.ideen.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }
@Bean
  PArtTimeMentor pArtTimeMentor(){
        return new PArtTimeMentor();
  }
}
