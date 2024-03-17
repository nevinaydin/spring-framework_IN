package com.ideen.repository;

import com.ideen.model.Comment;

public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment : "+ comment.getText());
    }
}
