package com.ideen.bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IdeenApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        FullTimeEmployee fullTimeEmployee = context.getBean(FullTimeEmployee.class);
        fullTimeEmployee.createAccount();
        PartTimeEmployee partTimeEmployee = context.getBean(PartTimeEmployee.class);
        partTimeEmployee.createAccount();

    }
}
