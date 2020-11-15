package com.socialone.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.socialone.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
