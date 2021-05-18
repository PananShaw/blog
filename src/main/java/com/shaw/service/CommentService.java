package com.shaw.service;

import com.shaw.po.Comment;

import java.util.List;

/**
 * @author shaw
 * @date 2017/10/22
 */
public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
