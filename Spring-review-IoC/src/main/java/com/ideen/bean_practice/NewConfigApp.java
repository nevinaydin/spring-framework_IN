package com.ideen.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NewConfigApp {
    @Bean("Welcome")
    String string1(){
        return "Welcome to the club";
    }
    @Bean
//    @Primary
    String string2(){
        return "String Core Practice";
    }

}
