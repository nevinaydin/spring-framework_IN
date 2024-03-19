package com.ideen.proxy;

import com.ideen.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
