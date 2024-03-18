package com.ideen.stereotype_annotations;


import com.ideen.stereotype_annotations.config.ConfigApp;
import com.ideen.stereotype_annotations.model.DataStructure;
import com.ideen.stereotype_annotations.model.ExtraHours;
import com.ideen.stereotype_annotations.model.MicroService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IdeenApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);
        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();
        MicroService microService = container.getBean(MicroService.class);
        microService.getTotalHours();
        ExtraHours extraHours=container.getBean(ExtraHours.class);
        System.out.println(extraHours.getHours());

    }
}
