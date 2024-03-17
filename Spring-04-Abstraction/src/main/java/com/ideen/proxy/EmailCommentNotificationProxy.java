package com.ideen.proxy;

import com.ideen.model.Comment;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment : " + comment.getText());
    }
}
