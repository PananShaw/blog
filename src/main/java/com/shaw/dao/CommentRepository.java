package com.shaw.dao;

import com.shaw.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author shaw
 * @date 2017/10/22
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
