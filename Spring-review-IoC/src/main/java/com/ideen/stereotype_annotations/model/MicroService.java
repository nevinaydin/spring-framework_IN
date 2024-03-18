package com.ideen.stereotype_annotations.model;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
public class MicroService {
    public void getTotalHours(){
        System.out.println("Total hours "+ 20);
    }
}
