package com.ideen.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Comment {
    private String author;
    private String text;
}
