package com.socialone.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.socialone.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}
