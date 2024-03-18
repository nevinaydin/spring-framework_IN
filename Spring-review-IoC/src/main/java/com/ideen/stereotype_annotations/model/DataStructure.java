package com.ideen.stereotype_annotations.model;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
public class DataStructure {
    private final ExtraHours extraHours;

    public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }

    public void getTotalHours(){
        System.out.println("Total hours "+ (30+extraHours.getHours()));
    }
}
