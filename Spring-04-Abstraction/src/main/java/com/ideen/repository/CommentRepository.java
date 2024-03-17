package com.ideen.repository;

import com.ideen.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
