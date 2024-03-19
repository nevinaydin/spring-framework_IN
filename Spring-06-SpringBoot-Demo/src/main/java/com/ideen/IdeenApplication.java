package com.ideen;

import com.ideen.model.Comment;
import com.ideen.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IdeenApplication {

    public static void main(String[] args) {
        Comment comment=new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(IdeenApplication.class, args);
        CommentService cs = context.getBean(CommentService.class);
        cs.publishComment(comment);

    }

}
